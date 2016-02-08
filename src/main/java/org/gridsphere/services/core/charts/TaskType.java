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
 * Class TaskType.
 * 
 * @version $Revision$ $Date$
 */
public class TaskType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _description
     */
    private java.lang.String _description;

    /**
     * Field _percentComplete
     */
    private double _percentComplete;

    /**
     * keeps track of state for field: _percentComplete
     */
    private boolean _has_percentComplete;

    /**
     * Field _duration
     */
    private org.gridsphere.services.core.charts.Duration _duration;

    /**
     * Field _subtaskList
     */
    private java.util.Vector _subtaskList;


      //----------------/
     //- Constructors -/
    //----------------/

    public TaskType() {
        super();
        _subtaskList = new Vector();
    } //-- org.gridsphere.services.core.charts.TaskType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addSubtask
     * 
     * @param vSubtask
     */
    public void addSubtask(org.gridsphere.services.core.charts.Subtask vSubtask)
        throws java.lang.IndexOutOfBoundsException
    {
        _subtaskList.addElement(vSubtask);
    } //-- void addSubtask(org.gridsphere.services.core.charts.Subtask)

    /**
     * Method addSubtask
     * 
     * @param index
     * @param vSubtask
     */
    public void addSubtask(int index, org.gridsphere.services.core.charts.Subtask vSubtask)
        throws java.lang.IndexOutOfBoundsException
    {
        _subtaskList.insertElementAt(vSubtask, index);
    } //-- void addSubtask(int, org.gridsphere.services.core.charts.Subtask)

    /**
     * Method deletePercentComplete
     */
    public void deletePercentComplete()
    {
        this._has_percentComplete= false;
    } //-- void deletePercentComplete() 

    /**
     * Method enumerateSubtask
     */
    public java.util.Enumeration enumerateSubtask()
    {
        return _subtaskList.elements();
    } //-- java.util.Enumeration enumerateSubtask() 

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
     * Returns the value of field 'duration'.
     * 
     * @return the value of field 'duration'.
     */
    public org.gridsphere.services.core.charts.Duration getDuration()
    {
        return this._duration;
    } //-- org.gridsphere.services.core.charts.Duration getDuration()

    /**
     * Returns the value of field 'percentComplete'.
     * 
     * @return the value of field 'percentComplete'.
     */
    public double getPercentComplete()
    {
        return this._percentComplete;
    } //-- double getPercentComplete() 

    /**
     * Method getSubtask
     * 
     * @param index
     */
    public org.gridsphere.services.core.charts.Subtask getSubtask(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _subtaskList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (org.gridsphere.services.core.charts.Subtask) _subtaskList.elementAt(index);
    } //-- org.gridsphere.services.core.charts.Subtask getSubtask(int)

    /**
     * Method getSubtask
     */
    public org.gridsphere.services.core.charts.Subtask[] getSubtask()
    {
        int size = _subtaskList.size();
        org.gridsphere.services.core.charts.Subtask[] mArray = new org.gridsphere.services.core.charts.Subtask[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (org.gridsphere.services.core.charts.Subtask) _subtaskList.elementAt(index);
        }
        return mArray;
    } //-- org.gridsphere.services.core.charts.Subtask[] getSubtask()

    /**
     * Method getSubtaskCount
     */
    public int getSubtaskCount()
    {
        return _subtaskList.size();
    } //-- int getSubtaskCount() 

    /**
     * Method hasPercentComplete
     */
    public boolean hasPercentComplete()
    {
        return this._has_percentComplete;
    } //-- boolean hasPercentComplete() 

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
     * Method removeAllSubtask
     */
    public void removeAllSubtask()
    {
        _subtaskList.removeAllElements();
    } //-- void removeAllSubtask() 

    /**
     * Method removeSubtask
     * 
     * @param index
     */
    public org.gridsphere.services.core.charts.Subtask removeSubtask(int index)
    {
        java.lang.Object obj = _subtaskList.elementAt(index);
        _subtaskList.removeElementAt(index);
        return (org.gridsphere.services.core.charts.Subtask) obj;
    } //-- org.gridsphere.services.core.charts.Subtask removeSubtask(int)

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
     * Sets the value of field 'duration'.
     * 
     * @param duration the value of field 'duration'.
     */
    public void setDuration(org.gridsphere.services.core.charts.Duration duration)
    {
        this._duration = duration;
    } //-- void setDuration(org.gridsphere.services.core.charts.Duration)

    /**
     * Sets the value of field 'percentComplete'.
     * 
     * @param percentComplete the value of field 'percentComplete'.
     */
    public void setPercentComplete(double percentComplete)
    {
        this._percentComplete = percentComplete;
        this._has_percentComplete = true;
    } //-- void setPercentComplete(double) 

    /**
     * Method setSubtask
     * 
     * @param index
     * @param vSubtask
     */
    public void setSubtask(int index, org.gridsphere.services.core.charts.Subtask vSubtask)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _subtaskList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _subtaskList.setElementAt(vSubtask, index);
    } //-- void setSubtask(int, org.gridsphere.services.core.charts.Subtask)

    /**
     * Method setSubtask
     * 
     * @param subtaskArray
     */
    public void setSubtask(org.gridsphere.services.core.charts.Subtask[] subtaskArray)
    {
        //-- copy array
        _subtaskList.removeAllElements();
        for (int i = 0; i < subtaskArray.length; i++) {
            _subtaskList.addElement(subtaskArray[i]);
        }
    } //-- void setSubtask(org.gridsphere.services.core.charts.Subtask)

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.gridsphere.services.core.charts.TaskType) Unmarshaller.unmarshal(org.gridsphere.services.core.charts.TaskType.class, reader);
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
