/*
 * XML Type:  ST_AxisUnit
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.STAxisUnit
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ST_AxisUnit(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is an atomic type that is a restriction of com.microsoft.schemas.office.drawing.x2014.chartex.STAxisUnit.
 */
public interface STAxisUnit extends org.apache.xmlbeans.XmlString {
    SimpleTypeFactory<com.microsoft.schemas.office.drawing.x2014.chartex.STAxisUnit> Factory = new SimpleTypeFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "staxisunitbfd1type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum HUNDREDS = Enum.forString("hundreds");
    Enum THOUSANDS = Enum.forString("thousands");
    Enum TEN_THOUSANDS = Enum.forString("tenThousands");
    Enum HUNDRED_THOUSANDS = Enum.forString("hundredThousands");
    Enum MILLIONS = Enum.forString("millions");
    Enum TEN_MILLIONS = Enum.forString("tenMillions");
    Enum HUNDRED_MILLIONS = Enum.forString("hundredMillions");
    Enum BILLIONS = Enum.forString("billions");
    Enum TRILLIONS = Enum.forString("trillions");
    Enum PERCENTAGE = Enum.forString("percentage");

    int INT_HUNDREDS = Enum.INT_HUNDREDS;
    int INT_THOUSANDS = Enum.INT_THOUSANDS;
    int INT_TEN_THOUSANDS = Enum.INT_TEN_THOUSANDS;
    int INT_HUNDRED_THOUSANDS = Enum.INT_HUNDRED_THOUSANDS;
    int INT_MILLIONS = Enum.INT_MILLIONS;
    int INT_TEN_MILLIONS = Enum.INT_TEN_MILLIONS;
    int INT_HUNDRED_MILLIONS = Enum.INT_HUNDRED_MILLIONS;
    int INT_BILLIONS = Enum.INT_BILLIONS;
    int INT_TRILLIONS = Enum.INT_TRILLIONS;
    int INT_PERCENTAGE = Enum.INT_PERCENTAGE;

    /**
     * Enumeration value class for com.microsoft.schemas.office.drawing.x2014.chartex.STAxisUnit.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_HUNDREDS
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

        static final int INT_HUNDREDS = 1;
        static final int INT_THOUSANDS = 2;
        static final int INT_TEN_THOUSANDS = 3;
        static final int INT_HUNDRED_THOUSANDS = 4;
        static final int INT_MILLIONS = 5;
        static final int INT_TEN_MILLIONS = 6;
        static final int INT_HUNDRED_MILLIONS = 7;
        static final int INT_BILLIONS = 8;
        static final int INT_TRILLIONS = 9;
        static final int INT_PERCENTAGE = 10;

        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
            new Enum("hundreds", INT_HUNDREDS),
            new Enum("thousands", INT_THOUSANDS),
            new Enum("tenThousands", INT_TEN_THOUSANDS),
            new Enum("hundredThousands", INT_HUNDRED_THOUSANDS),
            new Enum("millions", INT_MILLIONS),
            new Enum("tenMillions", INT_TEN_MILLIONS),
            new Enum("hundredMillions", INT_HUNDRED_MILLIONS),
            new Enum("billions", INT_BILLIONS),
            new Enum("trillions", INT_TRILLIONS),
            new Enum("percentage", INT_PERCENTAGE),
        });
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }
}
