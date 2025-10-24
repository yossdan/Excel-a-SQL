/*
 * XML Type:  ST_GeoProjectionType
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.STGeoProjectionType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ST_GeoProjectionType(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is an atomic type that is a restriction of com.microsoft.schemas.office.drawing.x2014.chartex.STGeoProjectionType.
 */
public interface STGeoProjectionType extends org.apache.xmlbeans.XmlString {
    SimpleTypeFactory<com.microsoft.schemas.office.drawing.x2014.chartex.STGeoProjectionType> Factory = new SimpleTypeFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "stgeoprojectiontype33e6type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum MERCATOR = Enum.forString("mercator");
    Enum MILLER = Enum.forString("miller");
    Enum ROBINSON = Enum.forString("robinson");
    Enum ALBERS = Enum.forString("albers");

    int INT_MERCATOR = Enum.INT_MERCATOR;
    int INT_MILLER = Enum.INT_MILLER;
    int INT_ROBINSON = Enum.INT_ROBINSON;
    int INT_ALBERS = Enum.INT_ALBERS;

    /**
     * Enumeration value class for com.microsoft.schemas.office.drawing.x2014.chartex.STGeoProjectionType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_MERCATOR
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s) {
            return (Enum)table.forString(s);
        }

        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i) {
            return (Enum)table.forInt(i);
        }

        private Enum(java.lang.String s, int i) {
            super(s, i);
        }

        static final int INT_MERCATOR = 1;
        static final int INT_MILLER = 2;
        static final int INT_ROBINSON = 3;
        static final int INT_ALBERS = 4;

        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
            new Enum("mercator", INT_MERCATOR),
            new Enum("miller", INT_MILLER),
            new Enum("robinson", INT_ROBINSON),
            new Enum("albers", INT_ALBERS),
        });
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }
}
