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
 * Class Duration.
 * 
 * @version $Revision$ $Date$
 */
public class Duration implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _start
     */
    private long _start;

    /**
     * keeps track of state for field: _start
     */
    private boolean _has_start;

    /**
     * Field _end
     */
    private long _end;

    /**
     * keeps track of state for field: _end
     */
    private boolean _has_end;


      //----------------/
     //- Constructors -/
    //----------------/

    public Duration() {
        super();
    } //-- org.gridsphere.services.core.charts.Duration()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteEnd
     */
    public void deleteEnd()
    {
        this._has_end= false;
    } //-- void deleteEnd() 

    /**
     * Method deleteStart
     */
    public void deleteStart()
    {
        this._has_start= false;
    } //-- void deleteStart() 

    /**
     * Returns the value of field 'end'.
     * 
     * @return the value of field 'end'.
     */
    public long getEnd()
    {
        return this._end;
    } //-- long getEnd() 

    /**
     * Returns the value of field 'start'.
     * 
     * @return the value of field 'start'.
     */
    public long getStart()
    {
        return this._start;
    } //-- long getStart() 

    /**
     * Method hasEnd
     */
    public boolean hasEnd()
    {
        return this._has_end;
    } //-- boolean hasEnd() 

    /**
     * Method hasStart
     */
    public boolean hasStart()
    {
        return this._has_start;
    } //-- boolean hasStart() 

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
     * Sets the value of field 'end'.
     * 
     * @param end the value of field 'end'.
     */
    public void setEnd(long end)
    {
        this._end = end;
        this._has_end = true;
    } //-- void setEnd(long) 

    /**
     * Sets the value of field 'start'.
     * 
     * @param start the value of field 'start'.
     */
    public void setStart(long start)
    {
        this._start = start;
        this._has_start = true;
    } //-- void setStart(long) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.gridsphere.services.core.charts.Duration) Unmarshaller.unmarshal(org.gridsphere.services.core.charts.Duration.class, reader);
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
