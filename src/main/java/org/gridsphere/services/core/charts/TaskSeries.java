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
 * Class TaskSeries.
 * 
 * @version $Revision$ $Date$
 */
public class TaskSeries implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name
     */
    private java.lang.String _name;

    /**
     * Field _taskList
     */
    private java.util.Vector _taskList;


      //----------------/
     //- Constructors -/
    //----------------/

    public TaskSeries() {
        super();
        _taskList = new Vector();
    } //-- org.gridsphere.services.core.charts.TaskSeries()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addTask
     * 
     * @param vTask
     */
    public void addTask(org.gridsphere.services.core.charts.Task vTask)
        throws java.lang.IndexOutOfBoundsException
    {
        _taskList.addElement(vTask);
    } //-- void addTask(org.gridsphere.services.core.charts.Task)

    /**
     * Method addTask
     * 
     * @param index
     * @param vTask
     */
    public void addTask(int index, org.gridsphere.services.core.charts.Task vTask)
        throws java.lang.IndexOutOfBoundsException
    {
        _taskList.insertElementAt(vTask, index);
    } //-- void addTask(int, org.gridsphere.services.core.charts.Task)

    /**
     * Method enumerateTask
     */
    public java.util.Enumeration enumerateTask()
    {
        return _taskList.elements();
    } //-- java.util.Enumeration enumerateTask() 

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
     * Method getTask
     * 
     * @param index
     */
    public org.gridsphere.services.core.charts.Task getTask(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _taskList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (org.gridsphere.services.core.charts.Task) _taskList.elementAt(index);
    } //-- org.gridsphere.services.core.charts.Task getTask(int)

    /**
     * Method getTask
     */
    public org.gridsphere.services.core.charts.Task[] getTask()
    {
        int size = _taskList.size();
        org.gridsphere.services.core.charts.Task[] mArray = new org.gridsphere.services.core.charts.Task[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (org.gridsphere.services.core.charts.Task) _taskList.elementAt(index);
        }
        return mArray;
    } //-- org.gridsphere.services.core.charts.Task[] getTask()

    /**
     * Method getTaskCount
     */
    public int getTaskCount()
    {
        return _taskList.size();
    } //-- int getTaskCount() 

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
     * Method removeAllTask
     */
    public void removeAllTask()
    {
        _taskList.removeAllElements();
    } //-- void removeAllTask() 

    /**
     * Method removeTask
     * 
     * @param index
     */
    public org.gridsphere.services.core.charts.Task removeTask(int index)
    {
        java.lang.Object obj = _taskList.elementAt(index);
        _taskList.removeElementAt(index);
        return (org.gridsphere.services.core.charts.Task) obj;
    } //-- org.gridsphere.services.core.charts.Task removeTask(int)

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
     * Method setTask
     * 
     * @param index
     * @param vTask
     */
    public void setTask(int index, org.gridsphere.services.core.charts.Task vTask)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _taskList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _taskList.setElementAt(vTask, index);
    } //-- void setTask(int, org.gridsphere.services.core.charts.Task)

    /**
     * Method setTask
     * 
     * @param taskArray
     */
    public void setTask(org.gridsphere.services.core.charts.Task[] taskArray)
    {
        //-- copy array
        _taskList.removeAllElements();
        for (int i = 0; i < taskArray.length; i++) {
            _taskList.addElement(taskArray[i]);
        }
    } //-- void setTask(org.gridsphere.services.core.charts.Task)

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.gridsphere.services.core.charts.TaskSeries) Unmarshaller.unmarshal(org.gridsphere.services.core.charts.TaskSeries.class, reader);
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
