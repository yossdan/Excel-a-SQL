/*
 * XML Type:  ST_WrapType
 * Namespace: urn:schemas-microsoft-com:office:word
 * Java type: com.microsoft.schemas.office.word.STWrapType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ST_WrapType(@urn:schemas-microsoft-com:office:word).
 *
 * This is an atomic type that is a restriction of com.microsoft.schemas.office.word.STWrapType.
 */
public interface STWrapType extends org.apache.xmlbeans.XmlString {
    SimpleTypeFactory<com.microsoft.schemas.office.word.STWrapType> Factory = new SimpleTypeFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "stwraptype9ca5type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum TOP_AND_BOTTOM = Enum.forString("topAndBottom");
    Enum SQUARE = Enum.forString("square");
    Enum NONE = Enum.forString("none");
    Enum TIGHT = Enum.forString("tight");
    Enum THROUGH = Enum.forString("through");

    int INT_TOP_AND_BOTTOM = Enum.INT_TOP_AND_BOTTOM;
    int INT_SQUARE = Enum.INT_SQUARE;
    int INT_NONE = Enum.INT_NONE;
    int INT_TIGHT = Enum.INT_TIGHT;
    int INT_THROUGH = Enum.INT_THROUGH;

    /**
     * Enumeration value class for com.microsoft.schemas.office.word.STWrapType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_TOP_AND_BOTTOM
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

        static final int INT_TOP_AND_BOTTOM = 1;
        static final int INT_SQUARE = 2;
        static final int INT_NONE = 3;
        static final int INT_TIGHT = 4;
        static final int INT_THROUGH = 5;

        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
            new Enum("topAndBottom", INT_TOP_AND_BOTTOM),
            new Enum("square", INT_SQUARE),
            new Enum("none", INT_NONE),
            new Enum("tight", INT_TIGHT),
            new Enum("through", INT_THROUGH),
        });
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }
}
