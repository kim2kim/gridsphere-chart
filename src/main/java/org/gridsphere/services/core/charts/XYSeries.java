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
 * Class XYSeries.
 * 
 * @version $Revision$ $Date$
 */
public class XYSeries implements java.io.Serializable {


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
     * Field _maximumItemCount
     */
    private int _maximumItemCount;

    /**
     * keeps track of state for field: _maximumItemCount
     */
    private boolean _has_maximumItemCount;

    /**
     * Field _XYSeriesItemList
     */
    private java.util.Vector _XYSeriesItemList;


      //----------------/
     //- Constructors -/
    //----------------/

    public XYSeries() {
        super();
        _XYSeriesItemList = new Vector();
    } //-- org.gridsphere.services.core.charts.XYSeries()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addXYSeriesItem
     * 
     * @param vXYSeriesItem
     */
    public void addXYSeriesItem(org.gridsphere.services.core.charts.XYSeriesItem vXYSeriesItem)
        throws java.lang.IndexOutOfBoundsException
    {
        _XYSeriesItemList.addElement(vXYSeriesItem);
    } //-- void addXYSeriesItem(org.gridsphere.services.core.charts.XYSeriesItem)

    /**
     * Method addXYSeriesItem
     * 
     * @param index
     * @param vXYSeriesItem
     */
    public void addXYSeriesItem(int index, org.gridsphere.services.core.charts.XYSeriesItem vXYSeriesItem)
        throws java.lang.IndexOutOfBoundsException
    {
        _XYSeriesItemList.insertElementAt(vXYSeriesItem, index);
    } //-- void addXYSeriesItem(int, org.gridsphere.services.core.charts.XYSeriesItem)

    /**
     * Method deleteMaximumItemCount
     */
    public void deleteMaximumItemCount()
    {
        this._has_maximumItemCount= false;
    } //-- void deleteMaximumItemCount() 

    /**
     * Method enumerateXYSeriesItem
     */
    public java.util.Enumeration enumerateXYSeriesItem()
    {
        return _XYSeriesItemList.elements();
    } //-- java.util.Enumeration enumerateXYSeriesItem() 

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
     * Method getXYSeriesItem
     * 
     * @param index
     */
    public org.gridsphere.services.core.charts.XYSeriesItem getXYSeriesItem(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _XYSeriesItemList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (org.gridsphere.services.core.charts.XYSeriesItem) _XYSeriesItemList.elementAt(index);
    } //-- org.gridsphere.services.core.charts.XYSeriesItem getXYSeriesItem(int)

    /**
     * Method getXYSeriesItem
     */
    public org.gridsphere.services.core.charts.XYSeriesItem[] getXYSeriesItem()
    {
        int size = _XYSeriesItemList.size();
        org.gridsphere.services.core.charts.XYSeriesItem[] mArray = new org.gridsphere.services.core.charts.XYSeriesItem[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (org.gridsphere.services.core.charts.XYSeriesItem) _XYSeriesItemList.elementAt(index);
        }
        return mArray;
    } //-- org.gridsphere.services.core.charts.XYSeriesItem[] getXYSeriesItem()

    /**
     * Method getXYSeriesItemCount
     */
    public int getXYSeriesItemCount()
    {
        return _XYSeriesItemList.size();
    } //-- int getXYSeriesItemCount() 

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
     * Method removeAllXYSeriesItem
     */
    public void removeAllXYSeriesItem()
    {
        _XYSeriesItemList.removeAllElements();
    } //-- void removeAllXYSeriesItem() 

    /**
     * Method removeXYSeriesItem
     * 
     * @param index
     */
    public org.gridsphere.services.core.charts.XYSeriesItem removeXYSeriesItem(int index)
    {
        java.lang.Object obj = _XYSeriesItemList.elementAt(index);
        _XYSeriesItemList.removeElementAt(index);
        return (org.gridsphere.services.core.charts.XYSeriesItem) obj;
    } //-- org.gridsphere.services.core.charts.XYSeriesItem removeXYSeriesItem(int)

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
     * Method setXYSeriesItem
     * 
     * @param index
     * @param vXYSeriesItem
     */
    public void setXYSeriesItem(int index, org.gridsphere.services.core.charts.XYSeriesItem vXYSeriesItem)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _XYSeriesItemList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _XYSeriesItemList.setElementAt(vXYSeriesItem, index);
    } //-- void setXYSeriesItem(int, org.gridsphere.services.core.charts.XYSeriesItem)

    /**
     * Method setXYSeriesItem
     * 
     * @param XYSeriesItemArray
     */
    public void setXYSeriesItem(org.gridsphere.services.core.charts.XYSeriesItem[] XYSeriesItemArray)
    {
        //-- copy array
        _XYSeriesItemList.removeAllElements();
        for (int i = 0; i < XYSeriesItemArray.length; i++) {
            _XYSeriesItemList.addElement(XYSeriesItemArray[i]);
        }
    } //-- void setXYSeriesItem(org.gridsphere.services.core.charts.XYSeriesItem)

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.gridsphere.services.core.charts.XYSeries) Unmarshaller.unmarshal(org.gridsphere.services.core.charts.XYSeries.class, reader);
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
