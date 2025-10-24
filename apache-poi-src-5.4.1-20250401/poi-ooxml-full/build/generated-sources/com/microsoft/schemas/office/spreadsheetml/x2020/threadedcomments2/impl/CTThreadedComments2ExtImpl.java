/*
 * XML Type:  CT_ThreadedComments2Ext
 * Namespace: http://schemas.microsoft.com/office/spreadsheetml/2020/threadedcomments2
 * Java type: com.microsoft.schemas.office.spreadsheetml.x2020.threadedcomments2.CTThreadedComments2Ext
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.spreadsheetml.x2020.threadedcomments2.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_ThreadedComments2Ext(@http://schemas.microsoft.com/office/spreadsheetml/2020/threadedcomments2).
 *
 * This is a complex type.
 */
public class CTThreadedComments2ExtImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.spreadsheetml.x2020.threadedcomments2.CTThreadedComments2Ext {
    private static final long serialVersionUID = 1L;

    public CTThreadedComments2ExtImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/spreadsheetml/2020/threadedcomments2", "checksum"),
        new QName("http://schemas.microsoft.com/office/spreadsheetml/2020/threadedcomments2", "hyperlink"),
    };


    /**
     * Gets the "checksum" element
     */
    @Override
    public long getChecksum() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "checksum" element
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetChecksum() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * Sets the "checksum" element
     */
    @Override
    public void setChecksum(long checksum) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setLongValue(checksum);
        }
    }

    /**
     * Sets (as xml) the "checksum" element
     */
    @Override
    public void xsetChecksum(org.apache.xmlbeans.XmlUnsignedInt checksum) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(checksum);
        }
    }

    /**
     * Gets a List of "hyperlink" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.spreadsheetml.x2020.threadedcomments2.CTCommentHyperlink> getHyperlinkList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getHyperlinkArray,
                this::setHyperlinkArray,
                this::insertNewHyperlink,
                this::removeHyperlink,
                this::sizeOfHyperlinkArray
            );
        }
    }

    /**
     * Gets array of all "hyperlink" elements
     */
    @Override
    public com.microsoft.schemas.office.spreadsheetml.x2020.threadedcomments2.CTCommentHyperlink[] getHyperlinkArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new com.microsoft.schemas.office.spreadsheetml.x2020.threadedcomments2.CTCommentHyperlink[0]);
    }

    /**
     * Gets ith "hyperlink" element
     */
    @Override
    public com.microsoft.schemas.office.spreadsheetml.x2020.threadedcomments2.CTCommentHyperlink getHyperlinkArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.spreadsheetml.x2020.threadedcomments2.CTCommentHyperlink target = null;
            target = (com.microsoft.schemas.office.spreadsheetml.x2020.threadedcomments2.CTCommentHyperlink)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "hyperlink" element
     */
    @Override
    public int sizeOfHyperlinkArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "hyperlink" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setHyperlinkArray(com.microsoft.schemas.office.spreadsheetml.x2020.threadedcomments2.CTCommentHyperlink[] hyperlinkArray) {
        check_orphaned();
        arraySetterHelper(hyperlinkArray, PROPERTY_QNAME[1]);
    }

    /**
     * Sets ith "hyperlink" element
     */
    @Override
    public void setHyperlinkArray(int i, com.microsoft.schemas.office.spreadsheetml.x2020.threadedcomments2.CTCommentHyperlink hyperlink) {
        generatedSetterHelperImpl(hyperlink, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "hyperlink" element
     */
    @Override
    public com.microsoft.schemas.office.spreadsheetml.x2020.threadedcomments2.CTCommentHyperlink insertNewHyperlink(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.spreadsheetml.x2020.threadedcomments2.CTCommentHyperlink target = null;
            target = (com.microsoft.schemas.office.spreadsheetml.x2020.threadedcomments2.CTCommentHyperlink)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "hyperlink" element
     */
    @Override
    public com.microsoft.schemas.office.spreadsheetml.x2020.threadedcomments2.CTCommentHyperlink addNewHyperlink() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.spreadsheetml.x2020.threadedcomments2.CTCommentHyperlink target = null;
            target = (com.microsoft.schemas.office.spreadsheetml.x2020.threadedcomments2.CTCommentHyperlink)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "hyperlink" element
     */
    @Override
    public void removeHyperlink(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }
}
