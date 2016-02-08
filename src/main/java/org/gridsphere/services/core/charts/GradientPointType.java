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
 * Class GradientPointType.
 * 
 * @version $Revision$ $Date$
 */
public class GradientPointType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * red[i] green[i] blue[i]
     */
    private org.gridsphere.services.core.charts.Color _color;


      //----------------/
     //- Constructors -/
    //----------------/

    public GradientPointType() {
        super();
    } //-- org.gridsphere.services.core.charts.GradientPointType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'color'. The field 'color' has
     * the following description: red[i] green[i] blue[i]
     * 
     * @return the value of field 'color'.
     */
    public org.gridsphere.services.core.charts.Color getColor()
    {
        return this._color;
    } //-- org.gridsphere.services.core.charts.Color getColor()

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
     * following description: red[i] green[i] blue[i]
     * 
     * @param color the value of field 'color'.
     */
    public void setColor(org.gridsphere.services.core.charts.Color color)
    {
        this._color = color;
    } //-- void setColor(org.gridsphere.services.core.charts.Color)

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.gridsphere.services.core.charts.GradientPointType) Unmarshaller.unmarshal(org.gridsphere.services.core.charts.GradientPointType.class, reader);
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
