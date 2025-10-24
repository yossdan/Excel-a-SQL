/*
 * XML Type:  ST_BorderShadow
 * Namespace: urn:schemas-microsoft-com:office:word
 * Java type: com.microsoft.schemas.office.word.STBorderShadow
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ST_BorderShadow(@urn:schemas-microsoft-com:office:word).
 *
 * This is an atomic type that is a restriction of com.microsoft.schemas.office.word.STBorderShadow.
 */
public interface STBorderShadow extends org.apache.xmlbeans.XmlString {
    SimpleTypeFactory<com.microsoft.schemas.office.word.STBorderShadow> Factory = new SimpleTypeFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "stbordershadow2dedtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum T = Enum.forString("t");
    Enum TRUE = Enum.forString("true");
    Enum F = Enum.forString("f");
    Enum FALSE = Enum.forString("false");

    int INT_T = Enum.INT_T;
    int INT_TRUE = Enum.INT_TRUE;
    int INT_F = Enum.INT_F;
    int INT_FALSE = Enum.INT_FALSE;

    /**
     * Enumeration value class for com.microsoft.schemas.office.word.STBorderShadow.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_T
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

        static final int INT_T = 1;
        static final int INT_TRUE = 2;
        static final int INT_F = 3;
        static final int INT_FALSE = 4;

        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
            new Enum("t", INT_T),
            new Enum("true", INT_TRUE),
            new Enum("f", INT_F),
            new Enum("false", INT_FALSE),
        });
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }
}
