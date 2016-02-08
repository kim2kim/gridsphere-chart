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
 * Class TaskSeriesCollection.
 * 
 * @version $Revision$ $Date$
 */
public class TaskSeriesCollection implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _taskSeriesList
     */
    private java.util.Vector _taskSeriesList;


      //----------------/
     //- Constructors -/
    //----------------/

    public TaskSeriesCollection() {
        super();
        _taskSeriesList = new Vector();
    } //-- org.gridsphere.services.core.charts.TaskSeriesCollection()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addTaskSeries
     * 
     * @param vTaskSeries
     */
    public void addTaskSeries(org.gridsphere.services.core.charts.TaskSeries vTaskSeries)
        throws java.lang.IndexOutOfBoundsException
    {
        _taskSeriesList.addElement(vTaskSeries);
    } //-- void addTaskSeries(org.gridsphere.services.core.charts.TaskSeries)

    /**
     * Method addTaskSeries
     * 
     * @param index
     * @param vTaskSeries
     */
    public void addTaskSeries(int index, org.gridsphere.services.core.charts.TaskSeries vTaskSeries)
        throws java.lang.IndexOutOfBoundsException
    {
        _taskSeriesList.insertElementAt(vTaskSeries, index);
    } //-- void addTaskSeries(int, org.gridsphere.services.core.charts.TaskSeries)

    /**
     * Method enumerateTaskSeries
     */
    public java.util.Enumeration enumerateTaskSeries()
    {
        return _taskSeriesList.elements();
    } //-- java.util.Enumeration enumerateTaskSeries() 

    /**
     * Method getTaskSeries
     * 
     * @param index
     */
    public org.gridsphere.services.core.charts.TaskSeries getTaskSeries(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _taskSeriesList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (org.gridsphere.services.core.charts.TaskSeries) _taskSeriesList.elementAt(index);
    } //-- org.gridsphere.services.core.charts.TaskSeries getTaskSeries(int)

    /**
     * Method getTaskSeries
     */
    public org.gridsphere.services.core.charts.TaskSeries[] getTaskSeries()
    {
        int size = _taskSeriesList.size();
        org.gridsphere.services.core.charts.TaskSeries[] mArray = new org.gridsphere.services.core.charts.TaskSeries[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (org.gridsphere.services.core.charts.TaskSeries) _taskSeriesList.elementAt(index);
        }
        return mArray;
    } //-- org.gridsphere.services.core.charts.TaskSeries[] getTaskSeries()

    /**
     * Method getTaskSeriesCount
     */
    public int getTaskSeriesCount()
    {
        return _taskSeriesList.size();
    } //-- int getTaskSeriesCount() 

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
     * Method removeAllTaskSeries
     */
    public void removeAllTaskSeries()
    {
        _taskSeriesList.removeAllElements();
    } //-- void removeAllTaskSeries() 

    /**
     * Method removeTaskSeries
     * 
     * @param index
     */
    public org.gridsphere.services.core.charts.TaskSeries removeTaskSeries(int index)
    {
        java.lang.Object obj = _taskSeriesList.elementAt(index);
        _taskSeriesList.removeElementAt(index);
        return (org.gridsphere.services.core.charts.TaskSeries) obj;
    } //-- org.gridsphere.services.core.charts.TaskSeries removeTaskSeries(int)

    /**
     * Method setTaskSeries
     * 
     * @param index
     * @param vTaskSeries
     */
    public void setTaskSeries(int index, org.gridsphere.services.core.charts.TaskSeries vTaskSeries)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _taskSeriesList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _taskSeriesList.setElementAt(vTaskSeries, index);
    } //-- void setTaskSeries(int, org.gridsphere.services.core.charts.TaskSeries)

    /**
     * Method setTaskSeries
     * 
     * @param taskSeriesArray
     */
    public void setTaskSeries(org.gridsphere.services.core.charts.TaskSeries[] taskSeriesArray)
    {
        //-- copy array
        _taskSeriesList.removeAllElements();
        for (int i = 0; i < taskSeriesArray.length; i++) {
            _taskSeriesList.addElement(taskSeriesArray[i]);
        }
    } //-- void setTaskSeries(org.gridsphere.services.core.charts.TaskSeries)

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.gridsphere.services.core.charts.TaskSeriesCollection) Unmarshaller.unmarshal(org.gridsphere.services.core.charts.TaskSeriesCollection.class, reader);
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
