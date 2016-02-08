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
 * family [s] style [i] size[i]
 * 
 * @version $Revision$ $Date$
 */
public class FontType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _family
     */
    private java.lang.String _family = "Serif";

    /**
     * Field _style
     */
    private int _style = 1;

    /**
     * keeps track of state for field: _style
     */
    private boolean _has_style;

    /**
     * Field _size
     */
    private int _size = 12;

    /**
     * keeps track of state for field: _size
     */
    private boolean _has_size;


      //----------------/
     //- Constructors -/
    //----------------/

    public FontType() {
        super();
        setFamily("Serif");
    } //-- org.gridsphere.services.core.charts.FontType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteSize
     */
    public void deleteSize()
    {
        this._has_size= false;
    } //-- void deleteSize() 

    /**
     * Method deleteStyle
     */
    public void deleteStyle()
    {
        this._has_style= false;
    } //-- void deleteStyle() 

    /**
     * Returns the value of field 'family'.
     * 
     * @return the value of field 'family'.
     */
    public java.lang.String getFamily()
    {
        return this._family;
    } //-- java.lang.String getFamily() 

    /**
     * Returns the value of field 'size'.
     * 
     * @return the value of field 'size'.
     */
    public int getSize()
    {
        return this._size;
    } //-- int getSize() 

    /**
     * Returns the value of field 'style'.
     * 
     * @return the value of field 'style'.
     */
    public int getStyle()
    {
        return this._style;
    } //-- int getStyle() 

    /**
     * Method hasSize
     */
    public boolean hasSize()
    {
        return this._has_size;
    } //-- boolean hasSize() 

    /**
     * Method hasStyle
     */
    public boolean hasStyle()
    {
        return this._has_style;
    } //-- boolean hasStyle() 

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
     * Sets the value of field 'family'.
     * 
     * @param family the value of field 'family'.
     */
    public void setFamily(java.lang.String family)
    {
        this._family = family;
    } //-- void setFamily(java.lang.String) 

    /**
     * Sets the value of field 'size'.
     * 
     * @param size the value of field 'size'.
     */
    public void setSize(int size)
    {
        this._size = size;
        this._has_size = true;
    } //-- void setSize(int) 

    /**
     * Sets the value of field 'style'.
     * 
     * @param style the value of field 'style'.
     */
    public void setStyle(int style)
    {
        this._style = style;
        this._has_style = true;
    } //-- void setStyle(int) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.gridsphere.services.core.charts.FontType) Unmarshaller.unmarshal(org.gridsphere.services.core.charts.FontType.class, reader);
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
