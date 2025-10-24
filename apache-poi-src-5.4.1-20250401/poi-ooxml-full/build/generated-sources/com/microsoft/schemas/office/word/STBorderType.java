/*
 * XML Type:  ST_BorderType
 * Namespace: urn:schemas-microsoft-com:office:word
 * Java type: com.microsoft.schemas.office.word.STBorderType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ST_BorderType(@urn:schemas-microsoft-com:office:word).
 *
 * This is an atomic type that is a restriction of com.microsoft.schemas.office.word.STBorderType.
 */
public interface STBorderType extends org.apache.xmlbeans.XmlString {
    SimpleTypeFactory<com.microsoft.schemas.office.word.STBorderType> Factory = new SimpleTypeFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "stbordertype7cc7type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum NONE = Enum.forString("none");
    Enum SINGLE = Enum.forString("single");
    Enum THICK = Enum.forString("thick");
    Enum DOUBLE = Enum.forString("double");
    Enum HAIRLINE = Enum.forString("hairline");
    Enum DOT = Enum.forString("dot");
    Enum DASH = Enum.forString("dash");
    Enum DOT_DASH = Enum.forString("dotDash");
    Enum DASH_DOT_DOT = Enum.forString("dashDotDot");
    Enum TRIPLE = Enum.forString("triple");
    Enum THIN_THICK_SMALL = Enum.forString("thinThickSmall");
    Enum THICK_THIN_SMALL = Enum.forString("thickThinSmall");
    Enum THICK_BETWEEN_THIN_SMALL = Enum.forString("thickBetweenThinSmall");
    Enum THIN_THICK = Enum.forString("thinThick");
    Enum THICK_THIN = Enum.forString("thickThin");
    Enum THICK_BETWEEN_THIN = Enum.forString("thickBetweenThin");
    Enum THIN_THICK_LARGE = Enum.forString("thinThickLarge");
    Enum THICK_THIN_LARGE = Enum.forString("thickThinLarge");
    Enum THICK_BETWEEN_THIN_LARGE = Enum.forString("thickBetweenThinLarge");
    Enum WAVE = Enum.forString("wave");
    Enum DOUBLE_WAVE = Enum.forString("doubleWave");
    Enum DASHED_SMALL = Enum.forString("dashedSmall");
    Enum DASH_DOT_STROKED = Enum.forString("dashDotStroked");
    Enum THREE_D_EMBOSS = Enum.forString("threeDEmboss");
    Enum THREE_D_ENGRAVE = Enum.forString("threeDEngrave");
    Enum HTML_OUTSET = Enum.forString("HTMLOutset");
    Enum HTML_INSET = Enum.forString("HTMLInset");

    int INT_NONE = Enum.INT_NONE;
    int INT_SINGLE = Enum.INT_SINGLE;
    int INT_THICK = Enum.INT_THICK;
    int INT_DOUBLE = Enum.INT_DOUBLE;
    int INT_HAIRLINE = Enum.INT_HAIRLINE;
    int INT_DOT = Enum.INT_DOT;
    int INT_DASH = Enum.INT_DASH;
    int INT_DOT_DASH = Enum.INT_DOT_DASH;
    int INT_DASH_DOT_DOT = Enum.INT_DASH_DOT_DOT;
    int INT_TRIPLE = Enum.INT_TRIPLE;
    int INT_THIN_THICK_SMALL = Enum.INT_THIN_THICK_SMALL;
    int INT_THICK_THIN_SMALL = Enum.INT_THICK_THIN_SMALL;
    int INT_THICK_BETWEEN_THIN_SMALL = Enum.INT_THICK_BETWEEN_THIN_SMALL;
    int INT_THIN_THICK = Enum.INT_THIN_THICK;
    int INT_THICK_THIN = Enum.INT_THICK_THIN;
    int INT_THICK_BETWEEN_THIN = Enum.INT_THICK_BETWEEN_THIN;
    int INT_THIN_THICK_LARGE = Enum.INT_THIN_THICK_LARGE;
    int INT_THICK_THIN_LARGE = Enum.INT_THICK_THIN_LARGE;
    int INT_THICK_BETWEEN_THIN_LARGE = Enum.INT_THICK_BETWEEN_THIN_LARGE;
    int INT_WAVE = Enum.INT_WAVE;
    int INT_DOUBLE_WAVE = Enum.INT_DOUBLE_WAVE;
    int INT_DASHED_SMALL = Enum.INT_DASHED_SMALL;
    int INT_DASH_DOT_STROKED = Enum.INT_DASH_DOT_STROKED;
    int INT_THREE_D_EMBOSS = Enum.INT_THREE_D_EMBOSS;
    int INT_THREE_D_ENGRAVE = Enum.INT_THREE_D_ENGRAVE;
    int INT_HTML_OUTSET = Enum.INT_HTML_OUTSET;
    int INT_HTML_INSET = Enum.INT_HTML_INSET;

    /**
     * Enumeration value class for com.microsoft.schemas.office.word.STBorderType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_NONE
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

        static final int INT_NONE = 1;
        static final int INT_SINGLE = 2;
        static final int INT_THICK = 3;
        static final int INT_DOUBLE = 4;
        static final int INT_HAIRLINE = 5;
        static final int INT_DOT = 6;
        static final int INT_DASH = 7;
        static final int INT_DOT_DASH = 8;
        static final int INT_DASH_DOT_DOT = 9;
        static final int INT_TRIPLE = 10;
        static final int INT_THIN_THICK_SMALL = 11;
        static final int INT_THICK_THIN_SMALL = 12;
        static final int INT_THICK_BETWEEN_THIN_SMALL = 13;
        static final int INT_THIN_THICK = 14;
        static final int INT_THICK_THIN = 15;
        static final int INT_THICK_BETWEEN_THIN = 16;
        static final int INT_THIN_THICK_LARGE = 17;
        static final int INT_THICK_THIN_LARGE = 18;
        static final int INT_THICK_BETWEEN_THIN_LARGE = 19;
        static final int INT_WAVE = 20;
        static final int INT_DOUBLE_WAVE = 21;
        static final int INT_DASHED_SMALL = 22;
        static final int INT_DASH_DOT_STROKED = 23;
        static final int INT_THREE_D_EMBOSS = 24;
        static final int INT_THREE_D_ENGRAVE = 25;
        static final int INT_HTML_OUTSET = 26;
        static final int INT_HTML_INSET = 27;

        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
            new Enum("none", INT_NONE),
            new Enum("single", INT_SINGLE),
            new Enum("thick", INT_THICK),
            new Enum("double", INT_DOUBLE),
            new Enum("hairline", INT_HAIRLINE),
            new Enum("dot", INT_DOT),
            new Enum("dash", INT_DASH),
            new Enum("dotDash", INT_DOT_DASH),
            new Enum("dashDotDot", INT_DASH_DOT_DOT),
            new Enum("triple", INT_TRIPLE),
            new Enum("thinThickSmall", INT_THIN_THICK_SMALL),
            new Enum("thickThinSmall", INT_THICK_THIN_SMALL),
            new Enum("thickBetweenThinSmall", INT_THICK_BETWEEN_THIN_SMALL),
            new Enum("thinThick", INT_THIN_THICK),
            new Enum("thickThin", INT_THICK_THIN),
            new Enum("thickBetweenThin", INT_THICK_BETWEEN_THIN),
            new Enum("thinThickLarge", INT_THIN_THICK_LARGE),
            new Enum("thickThinLarge", INT_THICK_THIN_LARGE),
            new Enum("thickBetweenThinLarge", INT_THICK_BETWEEN_THIN_LARGE),
            new Enum("wave", INT_WAVE),
            new Enum("doubleWave", INT_DOUBLE_WAVE),
            new Enum("dashedSmall", INT_DASHED_SMALL),
            new Enum("dashDotStroked", INT_DASH_DOT_STROKED),
            new Enum("threeDEmboss", INT_THREE_D_EMBOSS),
            new Enum("threeDEngrave", INT_THREE_D_ENGRAVE),
            new Enum("HTMLOutset", INT_HTML_OUTSET),
            new Enum("HTMLInset", INT_HTML_INSET),
        });
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }
}
