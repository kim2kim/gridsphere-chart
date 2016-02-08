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
 * Class FileType.
 * 
 * @version $Revision$ $Date$
 */
public class FileType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * (String)
     */
    private java.lang.String _filename;

    /**
     * (String)
     */
    private java.lang.String _appName;

    /**
     * (Long)
     */
    private long _timestamp;

    /**
     * keeps track of state for field: _timestamp
     */
    private boolean _has_timestamp;


      //----------------/
     //- Constructors -/
    //----------------/

    public FileType() {
        super();
    } //-- org.gridsphere.services.core.charts.FileType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteTimestamp
     */
    public void deleteTimestamp()
    {
        this._has_timestamp= false;
    } //-- void deleteTimestamp() 

    /**
     * Returns the value of field 'appName'. The field 'appName'
     * has the following description: (String)
     * 
     * @return the value of field 'appName'.
     */
    public java.lang.String getAppName()
    {
        return this._appName;
    } //-- java.lang.String getAppName() 

    /**
     * Returns the value of field 'filename'. The field 'filename'
     * has the following description: (String)
     * 
     * @return the value of field 'filename'.
     */
    public java.lang.String getFilename()
    {
        return this._filename;
    } //-- java.lang.String getFilename() 

    /**
     * Returns the value of field 'timestamp'. The field
     * 'timestamp' has the following description: (Long)
     * 
     * @return the value of field 'timestamp'.
     */
    public long getTimestamp()
    {
        return this._timestamp;
    } //-- long getTimestamp() 

    /**
     * Method hasTimestamp
     */
    public boolean hasTimestamp()
    {
        return this._has_timestamp;
    } //-- boolean hasTimestamp() 

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
     * Sets the value of field 'appName'. The field 'appName' has
     * the following description: (String)
     * 
     * @param appName the value of field 'appName'.
     */
    public void setAppName(java.lang.String appName)
    {
        this._appName = appName;
    } //-- void setAppName(java.lang.String) 

    /**
     * Sets the value of field 'filename'. The field 'filename' has
     * the following description: (String)
     * 
     * @param filename the value of field 'filename'.
     */
    public void setFilename(java.lang.String filename)
    {
        this._filename = filename;
    } //-- void setFilename(java.lang.String) 

    /**
     * Sets the value of field 'timestamp'. The field 'timestamp'
     * has the following description: (Long)
     * 
     * @param timestamp the value of field 'timestamp'.
     */
    public void setTimestamp(long timestamp)
    {
        this._timestamp = timestamp;
        this._has_timestamp = true;
    } //-- void setTimestamp(long) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.gridsphere.services.core.charts.FileType) Unmarshaller.unmarshal(org.gridsphere.services.core.charts.FileType.class, reader);
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
