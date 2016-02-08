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
 * value [s]
 * 
 * @version $Revision$ $Date$
 */
public class NoDataMessage implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _value
     */
    private java.lang.String _value = "Invalid or missing  input data";

    /**
     * Field _font
     */
    private org.gridsphere.services.core.charts.Font _font;

    /**
     * (PaintType)
     */
    private org.gridsphere.services.core.charts.Paint _paint;


      //----------------/
     //- Constructors -/
    //----------------/

    public NoDataMessage() {
        super();
        setValue("Invalid or missing  input data");
    } //-- org.gridsphere.services.core.charts.NoDataMessage()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'font'.
     * 
     * @return the value of field 'font'.
     */
    public org.gridsphere.services.core.charts.Font getFont()
    {
        return this._font;
    } //-- org.gridsphere.services.core.charts.Font getFont()

    /**
     * Returns the value of field 'paint'. The field 'paint' has
     * the following description: (PaintType)
     * 
     * @return the value of field 'paint'.
     */
    public org.gridsphere.services.core.charts.Paint getPaint()
    {
        return this._paint;
    } //-- org.gridsphere.services.core.charts.Paint getPaint()

    /**
     * Returns the value of field 'value'.
     * 
     * @return the value of field 'value'.
     */
    public java.lang.String getValue()
    {
        return this._value;
    } //-- java.lang.String getValue() 

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
     * Sets the value of field 'font'.
     * 
     * @param font the value of field 'font'.
     */
    public void setFont(org.gridsphere.services.core.charts.Font font)
    {
        this._font = font;
    } //-- void setFont(org.gridsphere.services.core.charts.Font)

    /**
     * Sets the value of field 'paint'. The field 'paint' has the
     * following description: (PaintType)
     * 
     * @param paint the value of field 'paint'.
     */
    public void setPaint(org.gridsphere.services.core.charts.Paint paint)
    {
        this._paint = paint;
    } //-- void setPaint(org.gridsphere.services.core.charts.Paint)

    /**
     * Sets the value of field 'value'.
     * 
     * @param value the value of field 'value'.
     */
    public void setValue(java.lang.String value)
    {
        this._value = value;
    } //-- void setValue(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.gridsphere.services.core.charts.NoDataMessage) Unmarshaller.unmarshal(org.gridsphere.services.core.charts.NoDataMessage.class, reader);
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
