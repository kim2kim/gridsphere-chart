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
 * Class ChartDescriptor.
 * 
 * @version $Revision$ $Date$
 */
public class ChartDescriptor implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _fileInfo
     */
    private org.gridsphere.services.core.charts.FileInfo _fileInfo;

    /**
     * refresh [b] title[s] legend[b] type[s]
     */
    private org.gridsphere.services.core.charts.ChartInfo _chartInfo;


      //----------------/
     //- Constructors -/
    //----------------/

    public ChartDescriptor() {
        super();
    } //-- org.gridsphere.services.core.charts.ChartDescriptor()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'chartInfo'. The field
     * 'chartInfo' has the following description: refresh [b]
     * title[s] legend[b] type[s]
     * 
     * @return the value of field 'chartInfo'.
     */
    public org.gridsphere.services.core.charts.ChartInfo getChartInfo()
    {
        return this._chartInfo;
    } //-- org.gridsphere.services.core.charts.ChartInfo getChartInfo()

    /**
     * Returns the value of field 'fileInfo'.
     * 
     * @return the value of field 'fileInfo'.
     */
    public org.gridsphere.services.core.charts.FileInfo getFileInfo()
    {
        return this._fileInfo;
    } //-- org.gridsphere.services.core.charts.FileInfo getFileInfo()

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
     * Sets the value of field 'chartInfo'. The field 'chartInfo'
     * has the following description: refresh [b] title[s]
     * legend[b] type[s]
     * 
     * @param chartInfo the value of field 'chartInfo'.
     */
    public void setChartInfo(org.gridsphere.services.core.charts.ChartInfo chartInfo)
    {
        this._chartInfo = chartInfo;
    } //-- void setChartInfo(org.gridsphere.services.core.charts.ChartInfo)

    /**
     * Sets the value of field 'fileInfo'.
     * 
     * @param fileInfo the value of field 'fileInfo'.
     */
    public void setFileInfo(org.gridsphere.services.core.charts.FileInfo fileInfo)
    {
        this._fileInfo = fileInfo;
    } //-- void setFileInfo(org.gridsphere.services.core.charts.FileInfo)

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.gridsphere.services.core.charts.ChartDescriptor) Unmarshaller.unmarshal(org.gridsphere.services.core.charts.ChartDescriptor.class, reader);
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
