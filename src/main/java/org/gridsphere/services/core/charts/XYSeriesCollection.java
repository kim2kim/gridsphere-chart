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
 * Class XYSeriesCollection.
 * 
 * @version $Revision$ $Date$
 */
public class XYSeriesCollection implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _intervalPositionFactor
     */
    private double _intervalPositionFactor;

    /**
     * keeps track of state for field: _intervalPositionFactor
     */
    private boolean _has_intervalPositionFactor;

    /**
     * Field _intervalWidth
     */
    private double _intervalWidth;

    /**
     * keeps track of state for field: _intervalWidth
     */
    private boolean _has_intervalWidth;

    /**
     * Field _autoWidth
     */
    private boolean _autoWidth;

    /**
     * keeps track of state for field: _autoWidth
     */
    private boolean _has_autoWidth;

    /**
     * Field _XYSeriesList
     */
    private java.util.Vector _XYSeriesList;


      //----------------/
     //- Constructors -/
    //----------------/

    public XYSeriesCollection() {
        super();
        _XYSeriesList = new Vector();
    } //-- org.gridsphere.services.core.charts.XYSeriesCollection()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addXYSeries
     * 
     * @param vXYSeries
     */
    public void addXYSeries(org.gridsphere.services.core.charts.XYSeries vXYSeries)
        throws java.lang.IndexOutOfBoundsException
    {
        _XYSeriesList.addElement(vXYSeries);
    } //-- void addXYSeries(org.gridsphere.services.core.charts.XYSeries)

    /**
     * Method addXYSeries
     * 
     * @param index
     * @param vXYSeries
     */
    public void addXYSeries(int index, org.gridsphere.services.core.charts.XYSeries vXYSeries)
        throws java.lang.IndexOutOfBoundsException
    {
        _XYSeriesList.insertElementAt(vXYSeries, index);
    } //-- void addXYSeries(int, org.gridsphere.services.core.charts.XYSeries)

    /**
     * Method deleteAutoWidth
     */
    public void deleteAutoWidth()
    {
        this._has_autoWidth= false;
    } //-- void deleteAutoWidth() 

    /**
     * Method deleteIntervalPositionFactor
     */
    public void deleteIntervalPositionFactor()
    {
        this._has_intervalPositionFactor= false;
    } //-- void deleteIntervalPositionFactor() 

    /**
     * Method deleteIntervalWidth
     */
    public void deleteIntervalWidth()
    {
        this._has_intervalWidth= false;
    } //-- void deleteIntervalWidth() 

    /**
     * Method enumerateXYSeries
     */
    public java.util.Enumeration enumerateXYSeries()
    {
        return _XYSeriesList.elements();
    } //-- java.util.Enumeration enumerateXYSeries() 

    /**
     * Returns the value of field 'autoWidth'.
     * 
     * @return the value of field 'autoWidth'.
     */
    public boolean getAutoWidth()
    {
        return this._autoWidth;
    } //-- boolean getAutoWidth() 

    /**
     * Returns the value of field 'intervalPositionFactor'.
     * 
     * @return the value of field 'intervalPositionFactor'.
     */
    public double getIntervalPositionFactor()
    {
        return this._intervalPositionFactor;
    } //-- double getIntervalPositionFactor() 

    /**
     * Returns the value of field 'intervalWidth'.
     * 
     * @return the value of field 'intervalWidth'.
     */
    public double getIntervalWidth()
    {
        return this._intervalWidth;
    } //-- double getIntervalWidth() 

    /**
     * Method getXYSeries
     * 
     * @param index
     */
    public org.gridsphere.services.core.charts.XYSeries getXYSeries(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _XYSeriesList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (org.gridsphere.services.core.charts.XYSeries) _XYSeriesList.elementAt(index);
    } //-- org.gridsphere.services.core.charts.XYSeries getXYSeries(int)

    /**
     * Method getXYSeries
     */
    public org.gridsphere.services.core.charts.XYSeries[] getXYSeries()
    {
        int size = _XYSeriesList.size();
        org.gridsphere.services.core.charts.XYSeries[] mArray = new org.gridsphere.services.core.charts.XYSeries[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (org.gridsphere.services.core.charts.XYSeries) _XYSeriesList.elementAt(index);
        }
        return mArray;
    } //-- org.gridsphere.services.core.charts.XYSeries[] getXYSeries()

    /**
     * Method getXYSeriesCount
     */
    public int getXYSeriesCount()
    {
        return _XYSeriesList.size();
    } //-- int getXYSeriesCount() 

    /**
     * Method hasAutoWidth
     */
    public boolean hasAutoWidth()
    {
        return this._has_autoWidth;
    } //-- boolean hasAutoWidth() 

    /**
     * Method hasIntervalPositionFactor
     */
    public boolean hasIntervalPositionFactor()
    {
        return this._has_intervalPositionFactor;
    } //-- boolean hasIntervalPositionFactor() 

    /**
     * Method hasIntervalWidth
     */
    public boolean hasIntervalWidth()
    {
        return this._has_intervalWidth;
    } //-- boolean hasIntervalWidth() 

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
     * Method removeAllXYSeries
     */
    public void removeAllXYSeries()
    {
        _XYSeriesList.removeAllElements();
    } //-- void removeAllXYSeries() 

    /**
     * Method removeXYSeries
     * 
     * @param index
     */
    public org.gridsphere.services.core.charts.XYSeries removeXYSeries(int index)
    {
        java.lang.Object obj = _XYSeriesList.elementAt(index);
        _XYSeriesList.removeElementAt(index);
        return (org.gridsphere.services.core.charts.XYSeries) obj;
    } //-- org.gridsphere.services.core.charts.XYSeries removeXYSeries(int)

    /**
     * Sets the value of field 'autoWidth'.
     * 
     * @param autoWidth the value of field 'autoWidth'.
     */
    public void setAutoWidth(boolean autoWidth)
    {
        this._autoWidth = autoWidth;
        this._has_autoWidth = true;
    } //-- void setAutoWidth(boolean) 

    /**
     * Sets the value of field 'intervalPositionFactor'.
     * 
     * @param intervalPositionFactor the value of field
     * 'intervalPositionFactor'.
     */
    public void setIntervalPositionFactor(double intervalPositionFactor)
    {
        this._intervalPositionFactor = intervalPositionFactor;
        this._has_intervalPositionFactor = true;
    } //-- void setIntervalPositionFactor(double) 

    /**
     * Sets the value of field 'intervalWidth'.
     * 
     * @param intervalWidth the value of field 'intervalWidth'.
     */
    public void setIntervalWidth(double intervalWidth)
    {
        this._intervalWidth = intervalWidth;
        this._has_intervalWidth = true;
    } //-- void setIntervalWidth(double) 

    /**
     * Method setXYSeries
     * 
     * @param index
     * @param vXYSeries
     */
    public void setXYSeries(int index, org.gridsphere.services.core.charts.XYSeries vXYSeries)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _XYSeriesList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _XYSeriesList.setElementAt(vXYSeries, index);
    } //-- void setXYSeries(int, org.gridsphere.services.core.charts.XYSeries)

    /**
     * Method setXYSeries
     * 
     * @param XYSeriesArray
     */
    public void setXYSeries(org.gridsphere.services.core.charts.XYSeries[] XYSeriesArray)
    {
        //-- copy array
        _XYSeriesList.removeAllElements();
        for (int i = 0; i < XYSeriesArray.length; i++) {
            _XYSeriesList.addElement(XYSeriesArray[i]);
        }
    } //-- void setXYSeries(org.gridsphere.services.core.charts.XYSeries)

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.gridsphere.services.core.charts.XYSeriesCollection) Unmarshaller.unmarshal(org.gridsphere.services.core.charts.XYSeriesCollection.class, reader);
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
