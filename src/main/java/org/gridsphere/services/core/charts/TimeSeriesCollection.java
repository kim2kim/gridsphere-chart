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
import java.util.Enumeration;
import java.util.Vector;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class TimeSeriesCollection.
 * 
 * @version $Revision$ $Date$
 */
public class TimeSeriesCollection implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _domainIsPointsInTime
     */
    private boolean _domainIsPointsInTime;

    /**
     * keeps track of state for field: _domainIsPointsInTime
     */
    private boolean _has_domainIsPointsInTime;

    /**
     * Field _xPosition
     */
    private java.lang.String _xPosition;

    /**
     * Field _timeSeriesList
     */
    private java.util.Vector _timeSeriesList;


      //----------------/
     //- Constructors -/
    //----------------/

    public TimeSeriesCollection() {
        super();
        _timeSeriesList = new Vector();
    } //-- org.gridsphere.services.core.charts.TimeSeriesCollection()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addTimeSeries
     * 
     * @param vTimeSeries
     */
    public void addTimeSeries(org.gridsphere.services.core.charts.TimeSeries vTimeSeries)
        throws java.lang.IndexOutOfBoundsException
    {
        _timeSeriesList.addElement(vTimeSeries);
    } //-- void addTimeSeries(org.gridsphere.services.core.charts.TimeSeries)

    /**
     * Method addTimeSeries
     * 
     * @param index
     * @param vTimeSeries
     */
    public void addTimeSeries(int index, org.gridsphere.services.core.charts.TimeSeries vTimeSeries)
        throws java.lang.IndexOutOfBoundsException
    {
        _timeSeriesList.insertElementAt(vTimeSeries, index);
    } //-- void addTimeSeries(int, org.gridsphere.services.core.charts.TimeSeries)

    /**
     * Method deleteDomainIsPointsInTime
     */
    public void deleteDomainIsPointsInTime()
    {
        this._has_domainIsPointsInTime= false;
    } //-- void deleteDomainIsPointsInTime() 

    /**
     * Method enumerateTimeSeries
     */
    public java.util.Enumeration enumerateTimeSeries()
    {
        return _timeSeriesList.elements();
    } //-- java.util.Enumeration enumerateTimeSeries() 

    /**
     * Returns the value of field 'domainIsPointsInTime'.
     * 
     * @return the value of field 'domainIsPointsInTime'.
     */
    public boolean getDomainIsPointsInTime()
    {
        return this._domainIsPointsInTime;
    } //-- boolean getDomainIsPointsInTime() 

    /**
     * Method getTimeSeries
     * 
     * @param index
     */
    public org.gridsphere.services.core.charts.TimeSeries getTimeSeries(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _timeSeriesList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (org.gridsphere.services.core.charts.TimeSeries) _timeSeriesList.elementAt(index);
    } //-- org.gridsphere.services.core.charts.TimeSeries getTimeSeries(int)

    /**
     * Method getTimeSeries
     */
    public org.gridsphere.services.core.charts.TimeSeries[] getTimeSeries()
    {
        int size = _timeSeriesList.size();
        org.gridsphere.services.core.charts.TimeSeries[] mArray = new org.gridsphere.services.core.charts.TimeSeries[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (org.gridsphere.services.core.charts.TimeSeries) _timeSeriesList.elementAt(index);
        }
        return mArray;
    } //-- org.gridsphere.services.core.charts.TimeSeries[] getTimeSeries()

    /**
     * Method getTimeSeriesCount
     */
    public int getTimeSeriesCount()
    {
        return _timeSeriesList.size();
    } //-- int getTimeSeriesCount() 

    /**
     * Returns the value of field 'xPosition'.
     * 
     * @return the value of field 'xPosition'.
     */
    public java.lang.String getXPosition()
    {
        return this._xPosition;
    } //-- java.lang.String getXPosition() 

    /**
     * Method hasDomainIsPointsInTime
     */
    public boolean hasDomainIsPointsInTime()
    {
        return this._has_domainIsPointsInTime;
    } //-- boolean hasDomainIsPointsInTime() 

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
     * Method removeAllTimeSeries
     */
    public void removeAllTimeSeries()
    {
        _timeSeriesList.removeAllElements();
    } //-- void removeAllTimeSeries() 

    /**
     * Method removeTimeSeries
     * 
     * @param index
     */
    public org.gridsphere.services.core.charts.TimeSeries removeTimeSeries(int index)
    {
        java.lang.Object obj = _timeSeriesList.elementAt(index);
        _timeSeriesList.removeElementAt(index);
        return (org.gridsphere.services.core.charts.TimeSeries) obj;
    } //-- org.gridsphere.services.core.charts.TimeSeries removeTimeSeries(int)

    /**
     * Sets the value of field 'domainIsPointsInTime'.
     * 
     * @param domainIsPointsInTime the value of field
     * 'domainIsPointsInTime'.
     */
    public void setDomainIsPointsInTime(boolean domainIsPointsInTime)
    {
        this._domainIsPointsInTime = domainIsPointsInTime;
        this._has_domainIsPointsInTime = true;
    } //-- void setDomainIsPointsInTime(boolean) 

    /**
     * Method setTimeSeries
     * 
     * @param index
     * @param vTimeSeries
     */
    public void setTimeSeries(int index, org.gridsphere.services.core.charts.TimeSeries vTimeSeries)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _timeSeriesList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _timeSeriesList.setElementAt(vTimeSeries, index);
    } //-- void setTimeSeries(int, org.gridsphere.services.core.charts.TimeSeries)

    /**
     * Method setTimeSeries
     * 
     * @param timeSeriesArray
     */
    public void setTimeSeries(org.gridsphere.services.core.charts.TimeSeries[] timeSeriesArray)
    {
        //-- copy array
        _timeSeriesList.removeAllElements();
        for (int i = 0; i < timeSeriesArray.length; i++) {
            _timeSeriesList.addElement(timeSeriesArray[i]);
        }
    } //-- void setTimeSeries(org.gridsphere.services.core.charts.TimeSeries)

    /**
     * Sets the value of field 'xPosition'.
     * 
     * @param xPosition the value of field 'xPosition'.
     */
    public void setXPosition(java.lang.String xPosition)
    {
        this._xPosition = xPosition;
    } //-- void setXPosition(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.gridsphere.services.core.charts.TimeSeriesCollection) Unmarshaller.unmarshal(org.gridsphere.services.core.charts.TimeSeriesCollection.class, reader);
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
