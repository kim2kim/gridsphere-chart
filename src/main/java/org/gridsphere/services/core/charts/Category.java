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
 * domainAxisLabel [s] rangeAxisLabel [s] plotOrientation [s]
 * 
 * @version $Revision$ $Date$
 */
public class Category implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _domainAxisLabel
     */
    private java.lang.String _domainAxisLabel = "Domain";

    /**
     * Field _rangeAxisLabel
     */
    private java.lang.String _rangeAxisLabel = "Range";

    /**
     * Field _plotOrientation
     */
    private java.lang.String _plotOrientation = "PlotOrientation.VERTICAL";


      //----------------/
     //- Constructors -/
    //----------------/

    public Category() {
        super();
        setDomainAxisLabel("Domain");
        setRangeAxisLabel("Range");
        setPlotOrientation("PlotOrientation.VERTICAL");
    } //-- org.gridsphere.services.core.charts.Category()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'domainAxisLabel'.
     * 
     * @return the value of field 'domainAxisLabel'.
     */
    public java.lang.String getDomainAxisLabel()
    {
        return this._domainAxisLabel;
    } //-- java.lang.String getDomainAxisLabel() 

    /**
     * Returns the value of field 'plotOrientation'.
     * 
     * @return the value of field 'plotOrientation'.
     */
    public java.lang.String getPlotOrientation()
    {
        return this._plotOrientation;
    } //-- java.lang.String getPlotOrientation() 

    /**
     * Returns the value of field 'rangeAxisLabel'.
     * 
     * @return the value of field 'rangeAxisLabel'.
     */
    public java.lang.String getRangeAxisLabel()
    {
        return this._rangeAxisLabel;
    } //-- java.lang.String getRangeAxisLabel() 

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
     * Sets the value of field 'domainAxisLabel'.
     * 
     * @param domainAxisLabel the value of field 'domainAxisLabel'.
     */
    public void setDomainAxisLabel(java.lang.String domainAxisLabel)
    {
        this._domainAxisLabel = domainAxisLabel;
    } //-- void setDomainAxisLabel(java.lang.String) 

    /**
     * Sets the value of field 'plotOrientation'.
     * 
     * @param plotOrientation the value of field 'plotOrientation'.
     */
    public void setPlotOrientation(java.lang.String plotOrientation)
    {
        this._plotOrientation = plotOrientation;
    } //-- void setPlotOrientation(java.lang.String) 

    /**
     * Sets the value of field 'rangeAxisLabel'.
     * 
     * @param rangeAxisLabel the value of field 'rangeAxisLabel'.
     */
    public void setRangeAxisLabel(java.lang.String rangeAxisLabel)
    {
        this._rangeAxisLabel = rangeAxisLabel;
    } //-- void setRangeAxisLabel(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.gridsphere.services.core.charts.Category) Unmarshaller.unmarshal(org.gridsphere.services.core.charts.Category.class, reader);
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
