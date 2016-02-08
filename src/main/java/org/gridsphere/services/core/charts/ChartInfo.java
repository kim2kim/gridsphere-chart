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
 * refresh [b] title[s] legend[b] type[s]
 * 
 * @version $Revision$ $Date$
 */
public class ChartInfo implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _type
     */
    private java.lang.String _type;

    /**
     * Field _title
     */
    private java.lang.String _title = "Title";

    /**
     * Field _legend
     */
    private boolean _legend = true;

    /**
     * keeps track of state for field: _legend
     */
    private boolean _has_legend;

    /**
     * Field _refresh
     */
    private boolean _refresh = true;

    /**
     * keeps track of state for field: _refresh
     */
    private boolean _has_refresh;

    /**
     * text [s]
     */
    private org.gridsphere.services.core.charts.Subtitle _subtitle;

    /**
     * Field _backgroundPaint
     */
    private org.gridsphere.services.core.charts.BackgroundPaint _backgroundPaint;

    /**
     * Field _plot
     */
    private org.gridsphere.services.core.charts.Plot _plot;


      //----------------/
     //- Constructors -/
    //----------------/

    public ChartInfo() {
        super();
        setTitle("Title");
    } //-- org.gridsphere.services.core.charts.ChartInfo()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteLegend
     */
    public void deleteLegend()
    {
        this._has_legend= false;
    } //-- void deleteLegend() 

    /**
     * Method deleteRefresh
     */
    public void deleteRefresh()
    {
        this._has_refresh= false;
    } //-- void deleteRefresh() 

    /**
     * Returns the value of field 'backgroundPaint'.
     * 
     * @return the value of field 'backgroundPaint'.
     */
    public org.gridsphere.services.core.charts.BackgroundPaint getBackgroundPaint()
    {
        return this._backgroundPaint;
    } //-- org.gridsphere.services.core.charts.BackgroundPaint getBackgroundPaint()

    /**
     * Returns the value of field 'legend'.
     * 
     * @return the value of field 'legend'.
     */
    public boolean getLegend()
    {
        return this._legend;
    } //-- boolean getLegend() 

    /**
     * Returns the value of field 'plot'.
     * 
     * @return the value of field 'plot'.
     */
    public org.gridsphere.services.core.charts.Plot getPlot()
    {
        return this._plot;
    } //-- org.gridsphere.services.core.charts.Plot getPlot()

    /**
     * Returns the value of field 'refresh'.
     * 
     * @return the value of field 'refresh'.
     */
    public boolean getRefresh()
    {
        return this._refresh;
    } //-- boolean getRefresh() 

    /**
     * Returns the value of field 'subtitle'. The field 'subtitle'
     * has the following description: text [s]
     * 
     * @return the value of field 'subtitle'.
     */
    public org.gridsphere.services.core.charts.Subtitle getSubtitle()
    {
        return this._subtitle;
    } //-- org.gridsphere.services.core.charts.Subtitle getSubtitle()

    /**
     * Returns the value of field 'title'.
     * 
     * @return the value of field 'title'.
     */
    public java.lang.String getTitle()
    {
        return this._title;
    } //-- java.lang.String getTitle() 

    /**
     * Returns the value of field 'type'.
     * 
     * @return the value of field 'type'.
     */
    public java.lang.String getType()
    {
        return this._type;
    } //-- java.lang.String getType() 

    /**
     * Method hasLegend
     */
    public boolean hasLegend()
    {
        return this._has_legend;
    } //-- boolean hasLegend() 

    /**
     * Method hasRefresh
     */
    public boolean hasRefresh()
    {
        return this._has_refresh;
    } //-- boolean hasRefresh() 

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
     * Sets the value of field 'backgroundPaint'.
     * 
     * @param backgroundPaint the value of field 'backgroundPaint'.
     */
    public void setBackgroundPaint(org.gridsphere.services.core.charts.BackgroundPaint backgroundPaint)
    {
        this._backgroundPaint = backgroundPaint;
    } //-- void setBackgroundPaint(org.gridsphere.services.core.charts.BackgroundPaint)

    /**
     * Sets the value of field 'legend'.
     * 
     * @param legend the value of field 'legend'.
     */
    public void setLegend(boolean legend)
    {
        this._legend = legend;
        this._has_legend = true;
    } //-- void setLegend(boolean) 

    /**
     * Sets the value of field 'plot'.
     * 
     * @param plot the value of field 'plot'.
     */
    public void setPlot(org.gridsphere.services.core.charts.Plot plot)
    {
        this._plot = plot;
    } //-- void setPlot(org.gridsphere.services.core.charts.Plot)

    /**
     * Sets the value of field 'refresh'.
     * 
     * @param refresh the value of field 'refresh'.
     */
    public void setRefresh(boolean refresh)
    {
        this._refresh = refresh;
        this._has_refresh = true;
    } //-- void setRefresh(boolean) 

    /**
     * Sets the value of field 'subtitle'. The field 'subtitle' has
     * the following description: text [s]
     * 
     * @param subtitle the value of field 'subtitle'.
     */
    public void setSubtitle(org.gridsphere.services.core.charts.Subtitle subtitle)
    {
        this._subtitle = subtitle;
    } //-- void setSubtitle(org.gridsphere.services.core.charts.Subtitle)

    /**
     * Sets the value of field 'title'.
     * 
     * @param title the value of field 'title'.
     */
    public void setTitle(java.lang.String title)
    {
        this._title = title;
    } //-- void setTitle(java.lang.String) 

    /**
     * Sets the value of field 'type'.
     * 
     * @param type the value of field 'type'.
     */
    public void setType(java.lang.String type)
    {
        this._type = type;
    } //-- void setType(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.gridsphere.services.core.charts.ChartInfo) Unmarshaller.unmarshal(org.gridsphere.services.core.charts.ChartInfo.class, reader);
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
