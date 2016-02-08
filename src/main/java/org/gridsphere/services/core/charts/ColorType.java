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
 * Class ColorType.
 * 
 * @version $Revision$ $Date$
 */
public class ColorType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _red
     */
    private int _red = 0;

    /**
     * keeps track of state for field: _red
     */
    private boolean _has_red;

    /**
     * Field _green
     */
    private int _green = 0;

    /**
     * keeps track of state for field: _green
     */
    private boolean _has_green;

    /**
     * Field _blue
     */
    private int _blue = 0;

    /**
     * keeps track of state for field: _blue
     */
    private boolean _has_blue;


      //----------------/
     //- Constructors -/
    //----------------/

    public ColorType() {
        super();
    } //-- org.gridsphere.services.core.charts.ColorType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteBlue
     */
    public void deleteBlue()
    {
        this._has_blue= false;
    } //-- void deleteBlue() 

    /**
     * Method deleteGreen
     */
    public void deleteGreen()
    {
        this._has_green= false;
    } //-- void deleteGreen() 

    /**
     * Method deleteRed
     */
    public void deleteRed()
    {
        this._has_red= false;
    } //-- void deleteRed() 

    /**
     * Returns the value of field 'blue'.
     * 
     * @return the value of field 'blue'.
     */
    public int getBlue()
    {
        return this._blue;
    } //-- int getBlue() 

    /**
     * Returns the value of field 'green'.
     * 
     * @return the value of field 'green'.
     */
    public int getGreen()
    {
        return this._green;
    } //-- int getGreen() 

    /**
     * Returns the value of field 'red'.
     * 
     * @return the value of field 'red'.
     */
    public int getRed()
    {
        return this._red;
    } //-- int getRed() 

    /**
     * Method hasBlue
     */
    public boolean hasBlue()
    {
        return this._has_blue;
    } //-- boolean hasBlue() 

    /**
     * Method hasGreen
     */
    public boolean hasGreen()
    {
        return this._has_green;
    } //-- boolean hasGreen() 

    /**
     * Method hasRed
     */
    public boolean hasRed()
    {
        return this._has_red;
    } //-- boolean hasRed() 

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
     * Sets the value of field 'blue'.
     * 
     * @param blue the value of field 'blue'.
     */
    public void setBlue(int blue)
    {
        this._blue = blue;
        this._has_blue = true;
    } //-- void setBlue(int) 

    /**
     * Sets the value of field 'green'.
     * 
     * @param green the value of field 'green'.
     */
    public void setGreen(int green)
    {
        this._green = green;
        this._has_green = true;
    } //-- void setGreen(int) 

    /**
     * Sets the value of field 'red'.
     * 
     * @param red the value of field 'red'.
     */
    public void setRed(int red)
    {
        this._red = red;
        this._has_red = true;
    } //-- void setRed(int) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.gridsphere.services.core.charts.ColorType) Unmarshaller.unmarshal(org.gridsphere.services.core.charts.ColorType.class, reader);
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
