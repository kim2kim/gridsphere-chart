/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.5.3</a>, using an XML
 * Schema.
 * $Id$
 */

package org.gridsphere.services.core.charts;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.util.Enumeration;
import java.util.Vector;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class Gradient.
 * 
 * @version $Revision$ $Date$
 */
public class Gradient implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * x [i] y [i]
     */
    private java.util.Vector _gradientPointList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Gradient() {
        super();
        _gradientPointList = new Vector();
    } //-- org.gridsphere.services.core.charts.Gradient()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addGradientPoint
     * 
     * @param vGradientPoint
     */
    public void addGradientPoint(org.gridsphere.services.core.charts.GradientPoint vGradientPoint)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_gradientPointList.size() < 2)) {
            throw new IndexOutOfBoundsException();
        }
        _gradientPointList.addElement(vGradientPoint);
    } //-- void addGradientPoint(org.gridsphere.services.core.charts.GradientPoint)

    /**
     * Method addGradientPoint
     * 
     * @param index
     * @param vGradientPoint
     */
    public void addGradientPoint(int index, org.gridsphere.services.core.charts.GradientPoint vGradientPoint)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_gradientPointList.size() < 2)) {
            throw new IndexOutOfBoundsException();
        }
        _gradientPointList.insertElementAt(vGradientPoint, index);
    } //-- void addGradientPoint(int, org.gridsphere.services.core.charts.GradientPoint)

    /**
     * Method enumerateGradientPoint
     */
    public java.util.Enumeration enumerateGradientPoint()
    {
        return _gradientPointList.elements();
    } //-- java.util.Enumeration enumerateGradientPoint() 

    /**
     * Method getGradientPoint
     * 
     * @param index
     */
    public org.gridsphere.services.core.charts.GradientPoint getGradientPoint(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _gradientPointList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (org.gridsphere.services.core.charts.GradientPoint) _gradientPointList.elementAt(index);
    } //-- org.gridsphere.services.core.charts.GradientPoint getGradientPoint(int)

    /**
     * Method getGradientPoint
     */
    public org.gridsphere.services.core.charts.GradientPoint[] getGradientPoint()
    {
        int size = _gradientPointList.size();
        org.gridsphere.services.core.charts.GradientPoint[] mArray = new org.gridsphere.services.core.charts.GradientPoint[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (org.gridsphere.services.core.charts.GradientPoint) _gradientPointList.elementAt(index);
        }
        return mArray;
    } //-- org.gridsphere.services.core.charts.GradientPoint[] getGradientPoint()

    /**
     * Method getGradientPointCount
     */
    public int getGradientPointCount()
    {
        return _gradientPointList.size();
    } //-- int getGradientPointCount() 

    /**
     * Method isValid
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Method removeAllGradientPoint
     */
    public void removeAllGradientPoint()
    {
        _gradientPointList.removeAllElements();
    } //-- void removeAllGradientPoint() 

    /**
     * Method removeGradientPoint
     * 
     * @param index
     */
    public org.gridsphere.services.core.charts.GradientPoint removeGradientPoint(int index)
    {
        java.lang.Object obj = _gradientPointList.elementAt(index);
        _gradientPointList.removeElementAt(index);
        return (org.gridsphere.services.core.charts.GradientPoint) obj;
    } //-- org.gridsphere.services.core.charts.GradientPoint removeGradientPoint(int)

    /**
     * Method setGradientPoint
     * 
     * @param index
     * @param vGradientPoint
     */
    public void setGradientPoint(int index, org.gridsphere.services.core.charts.GradientPoint vGradientPoint)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _gradientPointList.size())) {
            throw new IndexOutOfBoundsException();
        }
        if (!(index < 2)) {
            throw new IndexOutOfBoundsException();
        }
        _gradientPointList.setElementAt(vGradientPoint, index);
    } //-- void setGradientPoint(int, org.gridsphere.services.core.charts.GradientPoint)

    /**
     * Method setGradientPoint
     * 
     * @param gradientPointArray
     */
    public void setGradientPoint(org.gridsphere.services.core.charts.GradientPoint[] gradientPointArray)
    {
        //-- copy array
        _gradientPointList.removeAllElements();
        for (int i = 0; i < gradientPointArray.length; i++) {
            _gradientPointList.addElement(gradientPointArray[i]);
        }
    } //-- void setGradientPoint(org.gridsphere.services.core.charts.GradientPoint)

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.gridsphere.services.core.charts.Gradient) Unmarshaller.unmarshal(org.gridsphere.services.core.charts.Gradient.class, reader);
    } //-- java.lang.Object unmarshal(java.io.Reader) 

    /**
     * Method validate
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
