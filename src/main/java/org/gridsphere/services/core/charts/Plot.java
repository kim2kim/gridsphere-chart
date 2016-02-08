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
 * Class Plot.
 * 
 * @version $Revision$ $Date$
 */
public class Plot implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _foregroundAlpha
     */
    private float _foregroundAlpha = 1.0f;

    /**
     * keeps track of state for field: _foregroundAlpha
     */
    private boolean _has_foregroundAlpha;

    /**
     * (PaintType)
     */
    private org.gridsphere.services.core.charts.BackgroundPaint _backgroundPaint;

    /**
     * Field _settings
     */
    private org.gridsphere.services.core.charts.Settings _settings;

    /**
     * (PaintType)
     */
    private java.util.Vector _seriesPaintList;

    /**
     * value [s]
     */
    private org.gridsphere.services.core.charts.NoDataMessage _noDataMessage;


      //----------------/
     //- Constructors -/
    //----------------/

    public Plot() {
        super();
        _seriesPaintList = new Vector();
    } //-- org.gridsphere.services.core.charts.Plot()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addSeriesPaint
     * 
     * @param vSeriesPaint
     */
    public void addSeriesPaint(org.gridsphere.services.core.charts.SeriesPaint vSeriesPaint)
        throws java.lang.IndexOutOfBoundsException
    {
        _seriesPaintList.addElement(vSeriesPaint);
    } //-- void addSeriesPaint(org.gridsphere.services.core.charts.SeriesPaint)

    /**
     * Method addSeriesPaint
     * 
     * @param index
     * @param vSeriesPaint
     */
    public void addSeriesPaint(int index, org.gridsphere.services.core.charts.SeriesPaint vSeriesPaint)
        throws java.lang.IndexOutOfBoundsException
    {
        _seriesPaintList.insertElementAt(vSeriesPaint, index);
    } //-- void addSeriesPaint(int, org.gridsphere.services.core.charts.SeriesPaint)

    /**
     * Method deleteForegroundAlpha
     */
    public void deleteForegroundAlpha()
    {
        this._has_foregroundAlpha= false;
    } //-- void deleteForegroundAlpha() 

    /**
     * Method enumerateSeriesPaint
     */
    public java.util.Enumeration enumerateSeriesPaint()
    {
        return _seriesPaintList.elements();
    } //-- java.util.Enumeration enumerateSeriesPaint() 

    /**
     * Returns the value of field 'backgroundPaint'. The field
     * 'backgroundPaint' has the following description: (PaintType)
     * 
     * @return the value of field 'backgroundPaint'.
     */
    public org.gridsphere.services.core.charts.BackgroundPaint getBackgroundPaint()
    {
        return this._backgroundPaint;
    } //-- org.gridsphere.services.core.charts.BackgroundPaint getBackgroundPaint()

    /**
     * Returns the value of field 'foregroundAlpha'.
     * 
     * @return the value of field 'foregroundAlpha'.
     */
    public float getForegroundAlpha()
    {
        return this._foregroundAlpha;
    } //-- float getForegroundAlpha() 

    /**
     * Returns the value of field 'noDataMessage'. The field
     * 'noDataMessage' has the following description: value [s]
     * 
     * @return the value of field 'noDataMessage'.
     */
    public org.gridsphere.services.core.charts.NoDataMessage getNoDataMessage()
    {
        return this._noDataMessage;
    } //-- org.gridsphere.services.core.charts.NoDataMessage getNoDataMessage()

    /**
     * Method getSeriesPaint
     * 
     * @param index
     */
    public org.gridsphere.services.core.charts.SeriesPaint getSeriesPaint(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _seriesPaintList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (org.gridsphere.services.core.charts.SeriesPaint) _seriesPaintList.elementAt(index);
    } //-- org.gridsphere.services.core.charts.SeriesPaint getSeriesPaint(int)

    /**
     * Method getSeriesPaint
     */
    public org.gridsphere.services.core.charts.SeriesPaint[] getSeriesPaint()
    {
        int size = _seriesPaintList.size();
        org.gridsphere.services.core.charts.SeriesPaint[] mArray = new org.gridsphere.services.core.charts.SeriesPaint[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (org.gridsphere.services.core.charts.SeriesPaint) _seriesPaintList.elementAt(index);
        }
        return mArray;
    } //-- org.gridsphere.services.core.charts.SeriesPaint[] getSeriesPaint()

    /**
     * Method getSeriesPaintCount
     */
    public int getSeriesPaintCount()
    {
        return _seriesPaintList.size();
    } //-- int getSeriesPaintCount() 

    /**
     * Returns the value of field 'settings'.
     * 
     * @return the value of field 'settings'.
     */
    public org.gridsphere.services.core.charts.Settings getSettings()
    {
        return this._settings;
    } //-- org.gridsphere.services.core.charts.Settings getSettings()

    /**
     * Method hasForegroundAlpha
     */
    public boolean hasForegroundAlpha()
    {
        return this._has_foregroundAlpha;
    } //-- boolean hasForegroundAlpha() 

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
     * Method removeAllSeriesPaint
     */
    public void removeAllSeriesPaint()
    {
        _seriesPaintList.removeAllElements();
    } //-- void removeAllSeriesPaint() 

    /**
     * Method removeSeriesPaint
     * 
     * @param index
     */
    public org.gridsphere.services.core.charts.SeriesPaint removeSeriesPaint(int index)
    {
        java.lang.Object obj = _seriesPaintList.elementAt(index);
        _seriesPaintList.removeElementAt(index);
        return (org.gridsphere.services.core.charts.SeriesPaint) obj;
    } //-- org.gridsphere.services.core.charts.SeriesPaint removeSeriesPaint(int)

    /**
     * Sets the value of field 'backgroundPaint'. The field
     * 'backgroundPaint' has the following description: (PaintType)
     * 
     * @param backgroundPaint the value of field 'backgroundPaint'.
     */
    public void setBackgroundPaint(org.gridsphere.services.core.charts.BackgroundPaint backgroundPaint)
    {
        this._backgroundPaint = backgroundPaint;
    } //-- void setBackgroundPaint(org.gridsphere.services.core.charts.BackgroundPaint)

    /**
     * Sets the value of field 'foregroundAlpha'.
     * 
     * @param foregroundAlpha the value of field 'foregroundAlpha'.
     */
    public void setForegroundAlpha(float foregroundAlpha)
    {
        this._foregroundAlpha = foregroundAlpha;
        this._has_foregroundAlpha = true;
    } //-- void setForegroundAlpha(float) 

    /**
     * Sets the value of field 'noDataMessage'. The field
     * 'noDataMessage' has the following description: value [s]
     * 
     * @param noDataMessage the value of field 'noDataMessage'.
     */
    public void setNoDataMessage(org.gridsphere.services.core.charts.NoDataMessage noDataMessage)
    {
        this._noDataMessage = noDataMessage;
    } //-- void setNoDataMessage(org.gridsphere.services.core.charts.NoDataMessage)

    /**
     * Method setSeriesPaint
     * 
     * @param index
     * @param vSeriesPaint
     */
    public void setSeriesPaint(int index, org.gridsphere.services.core.charts.SeriesPaint vSeriesPaint)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _seriesPaintList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _seriesPaintList.setElementAt(vSeriesPaint, index);
    } //-- void setSeriesPaint(int, org.gridsphere.services.core.charts.SeriesPaint)

    /**
     * Method setSeriesPaint
     * 
     * @param seriesPaintArray
     */
    public void setSeriesPaint(org.gridsphere.services.core.charts.SeriesPaint[] seriesPaintArray)
    {
        //-- copy array
        _seriesPaintList.removeAllElements();
        for (int i = 0; i < seriesPaintArray.length; i++) {
            _seriesPaintList.addElement(seriesPaintArray[i]);
        }
    } //-- void setSeriesPaint(org.gridsphere.services.core.charts.SeriesPaint)

    /**
     * Sets the value of field 'settings'.
     * 
     * @param settings the value of field 'settings'.
     */
    public void setSettings(org.gridsphere.services.core.charts.Settings settings)
    {
        this._settings = settings;
    } //-- void setSettings(org.gridsphere.services.core.charts.Settings)

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.gridsphere.services.core.charts.Plot) Unmarshaller.unmarshal(org.gridsphere.services.core.charts.Plot.class, reader);
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
