/*
 * XML Type:  ST_StrokeLineStyle
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.STStrokeLineStyle
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ST_StrokeLineStyle(@urn:schemas-microsoft-com:vml).
 *
 * This is an atomic type that is a restriction of com.microsoft.schemas.vml.STStrokeLineStyle.
 */
public interface STStrokeLineStyle extends org.apache.xmlbeans.XmlString {
    SimpleTypeFactory<com.microsoft.schemas.vml.STStrokeLineStyle> Factory = new SimpleTypeFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ststrokelinestylea509type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum SINGLE = Enum.forString("single");
    Enum THIN_THIN = Enum.forString("thinThin");
    Enum THIN_THICK = Enum.forString("thinThick");
    Enum THICK_THIN = Enum.forString("thickThin");
    Enum THICK_BETWEEN_THIN = Enum.forString("thickBetweenThin");

    int INT_SINGLE = Enum.INT_SINGLE;
    int INT_THIN_THIN = Enum.INT_THIN_THIN;
    int INT_THIN_THICK = Enum.INT_THIN_THICK;
    int INT_THICK_THIN = Enum.INT_THICK_THIN;
    int INT_THICK_BETWEEN_THIN = Enum.INT_THICK_BETWEEN_THIN;

    /**
     * Enumeration value class for com.microsoft.schemas.vml.STStrokeLineStyle.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_SINGLE
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

        static final int INT_SINGLE = 1;
        static final int INT_THIN_THIN = 2;
        static final int INT_THIN_THICK = 3;
        static final int INT_THICK_THIN = 4;
        static final int INT_THICK_BETWEEN_THIN = 5;

        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
            new Enum("single", INT_SINGLE),
            new Enum("thinThin", INT_THIN_THIN),
            new Enum("thinThick", INT_THIN_THICK),
            new Enum("thickThin", INT_THICK_THIN),
            new Enum("thickBetweenThin", INT_THICK_BETWEEN_THIN),
        });
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }
}
