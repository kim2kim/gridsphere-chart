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
 * Class Settings.
 * 
 * @version $Revision$ $Date$
 */
public class Settings implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * labelGenerator [s]
     */
    private org.gridsphere.services.core.charts.Pie _pie;

    /**
     * domainAxisLabel [s] rangeAxisLabel [s] plotOrientation [s]
     */
    private org.gridsphere.services.core.charts.Category _category;


      //----------------/
     //- Constructors -/
    //----------------/

    public Settings() {
        super();
    } //-- org.gridsphere.services.core.charts.Settings()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'category'. The field 'category'
     * has the following description: domainAxisLabel [s]
     * rangeAxisLabel [s] plotOrientation [s]
     * 
     * @return the value of field 'category'.
     */
    public org.gridsphere.services.core.charts.Category getCategory()
    {
        return this._category;
    } //-- org.gridsphere.services.core.charts.Category getCategory()

    /**
     * Returns the value of field 'pie'. The field 'pie' has the
     * following description: labelGenerator [s]
     * 
     * @return the value of field 'pie'.
     */
    public org.gridsphere.services.core.charts.Pie getPie()
    {
        return this._pie;
    } //-- org.gridsphere.services.core.charts.Pie getPie()

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
     * Sets the value of field 'category'. The field 'category' has
     * the following description: domainAxisLabel [s]
     * rangeAxisLabel [s] plotOrientation [s]
     * 
     * @param category the value of field 'category'.
     */
    public void setCategory(org.gridsphere.services.core.charts.Category category)
    {
        this._category = category;
    } //-- void setCategory(org.gridsphere.services.core.charts.Category)

    /**
     * Sets the value of field 'pie'. The field 'pie' has the
     * following description: labelGenerator [s]
     * 
     * @param pie the value of field 'pie'.
     */
    public void setPie(org.gridsphere.services.core.charts.Pie pie)
    {
        this._pie = pie;
    } //-- void setPie(org.gridsphere.services.core.charts.Pie)

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.gridsphere.services.core.charts.Settings) Unmarshaller.unmarshal(org.gridsphere.services.core.charts.Settings.class, reader);
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
