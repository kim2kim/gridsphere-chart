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
 * Class TimeSeries.
 * 
 * @version $Revision$ $Date$
 */
public class TimeSeries implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name
     */
    private java.lang.String _name;

    /**
     * Field _description
     */
    private java.lang.String _description;

    /**
     * Field _domainDescription
     */
    private java.lang.String _domainDescription;

    /**
     * Field _rangeDescription
     */
    private java.lang.String _rangeDescription;

    /**
     * Field _historyCount
     */
    private int _historyCount;

    /**
     * keeps track of state for field: _historyCount
     */
    private boolean _has_historyCount;

    /**
     * Field _maximumItemCount
     */
    private int _maximumItemCount;

    /**
     * keeps track of state for field: _maximumItemCount
     */
    private boolean _has_maximumItemCount;

    /**
     * Field _timeSeriesItemList
     */
    private java.util.Vector _timeSeriesItemList;


      //----------------/
     //- Constructors -/
    //----------------/

    public TimeSeries() {
        super();
        _timeSeriesItemList = new Vector();
    } //-- org.gridsphere.services.core.charts.TimeSeries()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addTimeSeriesItem
     * 
     * @param vTimeSeriesItem
     */
    public void addTimeSeriesItem(org.gridsphere.services.core.charts.TimeSeriesItem vTimeSeriesItem)
        throws java.lang.IndexOutOfBoundsException
    {
        _timeSeriesItemList.addElement(vTimeSeriesItem);
    } //-- void addTimeSeriesItem(org.gridsphere.services.core.charts.TimeSeriesItem)

    /**
     * Method addTimeSeriesItem
     * 
     * @param index
     * @param vTimeSeriesItem
     */
    public void addTimeSeriesItem(int index, org.gridsphere.services.core.charts.TimeSeriesItem vTimeSeriesItem)
        throws java.lang.IndexOutOfBoundsException
    {
        _timeSeriesItemList.insertElementAt(vTimeSeriesItem, index);
    } //-- void addTimeSeriesItem(int, org.gridsphere.services.core.charts.TimeSeriesItem)

    /**
     * Method deleteHistoryCount
     */
    public void deleteHistoryCount()
    {
        this._has_historyCount= false;
    } //-- void deleteHistoryCount() 

    /**
     * Method deleteMaximumItemCount
     */
    public void deleteMaximumItemCount()
    {
        this._has_maximumItemCount= false;
    } //-- void deleteMaximumItemCount() 

    /**
     * Method enumerateTimeSeriesItem
     */
    public java.util.Enumeration enumerateTimeSeriesItem()
    {
        return _timeSeriesItemList.elements();
    } //-- java.util.Enumeration enumerateTimeSeriesItem() 

    /**
     * Returns the value of field 'description'.
     * 
     * @return the value of field 'description'.
     */
    public java.lang.String getDescription()
    {
        return this._description;
    } //-- java.lang.String getDescription() 

    /**
     * Returns the value of field 'domainDescription'.
     * 
     * @return the value of field 'domainDescription'.
     */
    public java.lang.String getDomainDescription()
    {
        return this._domainDescription;
    } //-- java.lang.String getDomainDescription() 

    /**
     * Returns the value of field 'historyCount'.
     * 
     * @return the value of field 'historyCount'.
     */
    public int getHistoryCount()
    {
        return this._historyCount;
    } //-- int getHistoryCount() 

    /**
     * Returns the value of field 'maximumItemCount'.
     * 
     * @return the value of field 'maximumItemCount'.
     */
    public int getMaximumItemCount()
    {
        return this._maximumItemCount;
    } //-- int getMaximumItemCount() 

    /**
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'name'.
     */
    public java.lang.String getName()
    {
        return this._name;
    } //-- java.lang.String getName() 

    /**
     * Returns the value of field 'rangeDescription'.
     * 
     * @return the value of field 'rangeDescription'.
     */
    public java.lang.String getRangeDescription()
    {
        return this._rangeDescription;
    } //-- java.lang.String getRangeDescription() 

    /**
     * Method getTimeSeriesItem
     * 
     * @param index
     */
    public org.gridsphere.services.core.charts.TimeSeriesItem getTimeSeriesItem(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _timeSeriesItemList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (org.gridsphere.services.core.charts.TimeSeriesItem) _timeSeriesItemList.elementAt(index);
    } //-- org.gridsphere.services.core.charts.TimeSeriesItem getTimeSeriesItem(int)

    /**
     * Method getTimeSeriesItem
     */
    public org.gridsphere.services.core.charts.TimeSeriesItem[] getTimeSeriesItem()
    {
        int size = _timeSeriesItemList.size();
        org.gridsphere.services.core.charts.TimeSeriesItem[] mArray = new org.gridsphere.services.core.charts.TimeSeriesItem[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (org.gridsphere.services.core.charts.TimeSeriesItem) _timeSeriesItemList.elementAt(index);
        }
        return mArray;
    } //-- org.gridsphere.services.core.charts.TimeSeriesItem[] getTimeSeriesItem()

    /**
     * Method getTimeSeriesItemCount
     */
    public int getTimeSeriesItemCount()
    {
        return _timeSeriesItemList.size();
    } //-- int getTimeSeriesItemCount() 

    /**
     * Method hasHistoryCount
     */
    public boolean hasHistoryCount()
    {
        return this._has_historyCount;
    } //-- boolean hasHistoryCount() 

    /**
     * Method hasMaximumItemCount
     */
    public boolean hasMaximumItemCount()
    {
        return this._has_maximumItemCount;
    } //-- boolean hasMaximumItemCount() 

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
     * Method removeAllTimeSeriesItem
     */
    public void removeAllTimeSeriesItem()
    {
        _timeSeriesItemList.removeAllElements();
    } //-- void removeAllTimeSeriesItem() 

    /**
     * Method removeTimeSeriesItem
     * 
     * @param index
     */
    public org.gridsphere.services.core.charts.TimeSeriesItem removeTimeSeriesItem(int index)
    {
        java.lang.Object obj = _timeSeriesItemList.elementAt(index);
        _timeSeriesItemList.removeElementAt(index);
        return (org.gridsphere.services.core.charts.TimeSeriesItem) obj;
    } //-- org.gridsphere.services.core.charts.TimeSeriesItem removeTimeSeriesItem(int)

    /**
     * Sets the value of field 'description'.
     * 
     * @param description the value of field 'description'.
     */
    public void setDescription(java.lang.String description)
    {
        this._description = description;
    } //-- void setDescription(java.lang.String) 

    /**
     * Sets the value of field 'domainDescription'.
     * 
     * @param domainDescription the value of field
     * 'domainDescription'.
     */
    public void setDomainDescription(java.lang.String domainDescription)
    {
        this._domainDescription = domainDescription;
    } //-- void setDomainDescription(java.lang.String) 

    /**
     * Sets the value of field 'historyCount'.
     * 
     * @param historyCount the value of field 'historyCount'.
     */
    public void setHistoryCount(int historyCount)
    {
        this._historyCount = historyCount;
        this._has_historyCount = true;
    } //-- void setHistoryCount(int) 

    /**
     * Sets the value of field 'maximumItemCount'.
     * 
     * @param maximumItemCount the value of field 'maximumItemCount'
     */
    public void setMaximumItemCount(int maximumItemCount)
    {
        this._maximumItemCount = maximumItemCount;
        this._has_maximumItemCount = true;
    } //-- void setMaximumItemCount(int) 

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(java.lang.String name)
    {
        this._name = name;
    } //-- void setName(java.lang.String) 

    /**
     * Sets the value of field 'rangeDescription'.
     * 
     * @param rangeDescription the value of field 'rangeDescription'
     */
    public void setRangeDescription(java.lang.String rangeDescription)
    {
        this._rangeDescription = rangeDescription;
    } //-- void setRangeDescription(java.lang.String) 

    /**
     * Method setTimeSeriesItem
     * 
     * @param index
     * @param vTimeSeriesItem
     */
    public void setTimeSeriesItem(int index, org.gridsphere.services.core.charts.TimeSeriesItem vTimeSeriesItem)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _timeSeriesItemList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _timeSeriesItemList.setElementAt(vTimeSeriesItem, index);
    } //-- void setTimeSeriesItem(int, org.gridsphere.services.core.charts.TimeSeriesItem)

    /**
     * Method setTimeSeriesItem
     * 
     * @param timeSeriesItemArray
     */
    public void setTimeSeriesItem(org.gridsphere.services.core.charts.TimeSeriesItem[] timeSeriesItemArray)
    {
        //-- copy array
        _timeSeriesItemList.removeAllElements();
        for (int i = 0; i < timeSeriesItemArray.length; i++) {
            _timeSeriesItemList.addElement(timeSeriesItemArray[i]);
        }
    } //-- void setTimeSeriesItem(org.gridsphere.services.core.charts.TimeSeriesItem)

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.gridsphere.services.core.charts.TimeSeries) Unmarshaller.unmarshal(org.gridsphere.services.core.charts.TimeSeries.class, reader);
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
