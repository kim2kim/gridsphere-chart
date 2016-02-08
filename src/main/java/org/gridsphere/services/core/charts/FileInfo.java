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
 * Class FileInfo.
 * 
 * @version $Revision$ $Date$
 */
public class FileInfo implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * type[s] width[i] height[i] quality [f]
     */
    private org.gridsphere.services.core.charts.Image _image;

    /**
     * type[s] (FileType)
     */
    private org.gridsphere.services.core.charts.Dataset _dataset;


      //----------------/
     //- Constructors -/
    //----------------/

    public FileInfo() {
        super();
    } //-- org.gridsphere.services.core.charts.FileInfo()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'dataset'. The field 'dataset'
     * has the following description: type[s] (FileType)
     * 
     * @return the value of field 'dataset'.
     */
    public org.gridsphere.services.core.charts.Dataset getDataset()
    {
        return this._dataset;
    } //-- org.gridsphere.services.core.charts.Dataset getDataset()

    /**
     * Returns the value of field 'image'. The field 'image' has
     * the following description: type[s] width[i] height[i]
     * quality [f]
     * 
     * @return the value of field 'image'.
     */
    public org.gridsphere.services.core.charts.Image getImage()
    {
        return this._image;
    } //-- org.gridsphere.services.core.charts.Image getImage()

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
     * Sets the value of field 'dataset'. The field 'dataset' has
     * the following description: type[s] (FileType)
     * 
     * @param dataset the value of field 'dataset'.
     */
    public void setDataset(org.gridsphere.services.core.charts.Dataset dataset)
    {
        this._dataset = dataset;
    } //-- void setDataset(org.gridsphere.services.core.charts.Dataset)

    /**
     * Sets the value of field 'image'. The field 'image' has the
     * following description: type[s] width[i] height[i] quality
     * [f]
     * 
     * @param image the value of field 'image'.
     */
    public void setImage(org.gridsphere.services.core.charts.Image image)
    {
        this._image = image;
    } //-- void setImage(org.gridsphere.services.core.charts.Image)

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.gridsphere.services.core.charts.FileInfo) Unmarshaller.unmarshal(org.gridsphere.services.core.charts.FileInfo.class, reader);
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
