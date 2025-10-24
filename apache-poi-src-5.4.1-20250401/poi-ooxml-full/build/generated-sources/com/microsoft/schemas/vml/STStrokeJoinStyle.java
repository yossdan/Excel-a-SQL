/*
 * XML Type:  ST_StrokeJoinStyle
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.STStrokeJoinStyle
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ST_StrokeJoinStyle(@urn:schemas-microsoft-com:vml).
 *
 * This is an atomic type that is a restriction of com.microsoft.schemas.vml.STStrokeJoinStyle.
 */
public interface STStrokeJoinStyle extends org.apache.xmlbeans.XmlString {
    SimpleTypeFactory<com.microsoft.schemas.vml.STStrokeJoinStyle> Factory = new SimpleTypeFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ststrokejoinstyle3c13type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum ROUND = Enum.forString("round");
    Enum BEVEL = Enum.forString("bevel");
    Enum MITER = Enum.forString("miter");

    int INT_ROUND = Enum.INT_ROUND;
    int INT_BEVEL = Enum.INT_BEVEL;
    int INT_MITER = Enum.INT_MITER;

    /**
     * Enumeration value class for com.microsoft.schemas.vml.STStrokeJoinStyle.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_ROUND
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

        static final int INT_ROUND = 1;
        static final int INT_BEVEL = 2;
        static final int INT_MITER = 3;

        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
            new Enum("round", INT_ROUND),
            new Enum("bevel", INT_BEVEL),
            new Enum("miter", INT_MITER),
        });
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }
}
