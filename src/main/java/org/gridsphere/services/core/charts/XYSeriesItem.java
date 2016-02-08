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
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class XYSeriesItem.
 * 
 * @version $Revision$ $Date$
 */
public class XYSeriesItem implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _XValue
     */
    private double _XValue;

    /**
     * keeps track of state for field: _XValue
     */
    private boolean _has_XValue;

    /**
     * Field _YValue
     */
    private double _YValue;

    /**
     * keeps track of state for field: _YValue
     */
    private boolean _has_YValue;


      //----------------/
     //- Constructors -/
    //----------------/

    public XYSeriesItem() {
        super();
    } //-- org.gridsphere.services.core.charts.XYSeriesItem()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteXValue
     */
    public void deleteXValue()
    {
        this._has_XValue= false;
    } //-- void deleteXValue() 

    /**
     * Method deleteYValue
     */
    public void deleteYValue()
    {
        this._has_YValue= false;
    } //-- void deleteYValue() 

    /**
     * Returns the value of field 'XValue'.
     * 
     * @return the value of field 'XValue'.
     */
    public double getXValue()
    {
        return this._XValue;
    } //-- double getXValue() 

    /**
     * Returns the value of field 'YValue'.
     * 
     * @return the value of field 'YValue'.
     */
    public double getYValue()
    {
        return this._YValue;
    } //-- double getYValue() 

    /**
     * Method hasXValue
     */
    public boolean hasXValue()
    {
        return this._has_XValue;
    } //-- boolean hasXValue() 

    /**
     * Method hasYValue
     */
    public boolean hasYValue()
    {
        return this._has_YValue;
    } //-- boolean hasYValue() 

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
     * Sets the value of field 'XValue'.
     * 
     * @param XValue the value of field 'XValue'.
     */
    public void setXValue(double XValue)
    {
        this._XValue = XValue;
        this._has_XValue = true;
    } //-- void setXValue(double) 

    /**
     * Sets the value of field 'YValue'.
     * 
     * @param YValue the value of field 'YValue'.
     */
    public void setYValue(double YValue)
    {
        this._YValue = YValue;
        this._has_YValue = true;
    } //-- void setYValue(double) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.gridsphere.services.core.charts.XYSeriesItem) Unmarshaller.unmarshal(org.gridsphere.services.core.charts.XYSeriesItem.class, reader);
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
