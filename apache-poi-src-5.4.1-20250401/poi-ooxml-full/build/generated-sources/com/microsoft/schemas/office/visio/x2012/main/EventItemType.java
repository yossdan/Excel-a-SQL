/*
 * XML Type:  EventItem_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.EventItemType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML EventItem_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface EventItemType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.EventItemType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "eventitemtype417etype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ID" attribute
     */
    long getID();

    /**
     * Gets (as xml) the "ID" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetID();

    /**
     * Sets the "ID" attribute
     */
    void setID(long id);

    /**
     * Sets (as xml) the "ID" attribute
     */
    void xsetID(org.apache.xmlbeans.XmlUnsignedInt id);

    /**
     * Gets the "Action" attribute
     */
    int getAction();

    /**
     * Gets (as xml) the "Action" attribute
     */
    org.apache.xmlbeans.XmlUnsignedShort xgetAction();

    /**
     * Sets the "Action" attribute
     */
    void setAction(int action);

    /**
     * Sets (as xml) the "Action" attribute
     */
    void xsetAction(org.apache.xmlbeans.XmlUnsignedShort action);

    /**
     * Gets the "EventCode" attribute
     */
    int getEventCode();

    /**
     * Gets (as xml) the "EventCode" attribute
     */
    org.apache.xmlbeans.XmlUnsignedShort xgetEventCode();

    /**
     * Sets the "EventCode" attribute
     */
    void setEventCode(int eventCode);

    /**
     * Sets (as xml) the "EventCode" attribute
     */
    void xsetEventCode(org.apache.xmlbeans.XmlUnsignedShort eventCode);

    /**
     * Gets the "Enabled" attribute
     */
    boolean getEnabled();

    /**
     * Gets (as xml) the "Enabled" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetEnabled();

    /**
     * True if has "Enabled" attribute
     */
    boolean isSetEnabled();

    /**
     * Sets the "Enabled" attribute
     */
    void setEnabled(boolean enabled);

    /**
     * Sets (as xml) the "Enabled" attribute
     */
    void xsetEnabled(org.apache.xmlbeans.XmlBoolean enabled);

    /**
     * Unsets the "Enabled" attribute
     */
    void unsetEnabled();

    /**
     * Gets the "Target" attribute
     */
    java.lang.String getTarget();

    /**
     * Gets (as xml) the "Target" attribute
     */
    org.apache.xmlbeans.XmlString xgetTarget();

    /**
     * Sets the "Target" attribute
     */
    void setTarget(java.lang.String target);

    /**
     * Sets (as xml) the "Target" attribute
     */
    void xsetTarget(org.apache.xmlbeans.XmlString target);

    /**
     * Gets the "TargetArgs" attribute
     */
    java.lang.String getTargetArgs();

    /**
     * Gets (as xml) the "TargetArgs" attribute
     */
    org.apache.xmlbeans.XmlString xgetTargetArgs();

    /**
     * Sets the "TargetArgs" attribute
     */
    void setTargetArgs(java.lang.String targetArgs);

    /**
     * Sets (as xml) the "TargetArgs" attribute
     */
    void xsetTargetArgs(org.apache.xmlbeans.XmlString targetArgs);
}
