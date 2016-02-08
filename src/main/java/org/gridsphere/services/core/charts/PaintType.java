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
 * Class PaintType.
 * 
 * @version $Revision$ $Date$
 */
public class PaintType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * (ColorType)
     */
    private org.gridsphere.services.core.charts.Color _color;

    /**
     * Field _gradient
     */
    private org.gridsphere.services.core.charts.Gradient _gradient;


      //----------------/
     //- Constructors -/
    //----------------/

    public PaintType() {
        super();
    } //-- org.gridsphere.services.core.charts.PaintType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'color'. The field 'color' has
     * the following description: (ColorType)
     * 
     * @return the value of field 'color'.
     */
    public org.gridsphere.services.core.charts.Color getColor()
    {
        return this._color;
    } //-- org.gridsphere.services.core.charts.Color getColor()

    /**
     * Returns the value of field 'gradient'.
     * 
     * @return the value of field 'gradient'.
     */
    public org.gridsphere.services.core.charts.Gradient getGradient()
    {
        return this._gradient;
    } //-- org.gridsphere.services.core.charts.Gradient getGradient()

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
     * Sets the value of field 'color'. The field 'color' has the
     * following description: (ColorType)
     * 
     * @param color the value of field 'color'.
     */
    public void setColor(org.gridsphere.services.core.charts.Color color)
    {
        this._color = color;
    } //-- void setColor(org.gridsphere.services.core.charts.Color)

    /**
     * Sets the value of field 'gradient'.
     * 
     * @param gradient the value of field 'gradient'.
     */
    public void setGradient(org.gridsphere.services.core.charts.Gradient gradient)
    {
        this._gradient = gradient;
    } //-- void setGradient(org.gridsphere.services.core.charts.Gradient)

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.gridsphere.services.core.charts.PaintType) Unmarshaller.unmarshal(org.gridsphere.services.core.charts.PaintType.class, reader);
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
