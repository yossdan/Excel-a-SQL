/*
 * XML Type:  ST_Ligatures
 * Namespace: http://schemas.microsoft.com/office/word/2010/wordml
 * Java type: com.microsoft.schemas.office.word.x2010.wordml.STLigatures
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.x2010.wordml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ST_Ligatures(@http://schemas.microsoft.com/office/word/2010/wordml).
 *
 * This is an atomic type that is a restriction of com.microsoft.schemas.office.word.x2010.wordml.STLigatures.
 */
public interface STLigatures extends org.apache.xmlbeans.XmlString {
    SimpleTypeFactory<com.microsoft.schemas.office.word.x2010.wordml.STLigatures> Factory = new SimpleTypeFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "stligatures109atype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum NONE = Enum.forString("none");
    Enum STANDARD = Enum.forString("standard");
    Enum CONTEXTUAL = Enum.forString("contextual");
    Enum HISTORICAL = Enum.forString("historical");
    Enum DISCRETIONAL = Enum.forString("discretional");
    Enum STANDARD_CONTEXTUAL = Enum.forString("standardContextual");
    Enum STANDARD_HISTORICAL = Enum.forString("standardHistorical");
    Enum CONTEXTUAL_HISTORICAL = Enum.forString("contextualHistorical");
    Enum STANDARD_DISCRETIONAL = Enum.forString("standardDiscretional");
    Enum CONTEXTUAL_DISCRETIONAL = Enum.forString("contextualDiscretional");
    Enum HISTORICAL_DISCRETIONAL = Enum.forString("historicalDiscretional");
    Enum STANDARD_CONTEXTUAL_HISTORICAL = Enum.forString("standardContextualHistorical");
    Enum STANDARD_CONTEXTUAL_DISCRETIONAL = Enum.forString("standardContextualDiscretional");
    Enum STANDARD_HISTORICAL_DISCRETIONAL = Enum.forString("standardHistoricalDiscretional");
    Enum CONTEXTUAL_HISTORICAL_DISCRETIONAL = Enum.forString("contextualHistoricalDiscretional");
    Enum ALL = Enum.forString("all");

    int INT_NONE = Enum.INT_NONE;
    int INT_STANDARD = Enum.INT_STANDARD;
    int INT_CONTEXTUAL = Enum.INT_CONTEXTUAL;
    int INT_HISTORICAL = Enum.INT_HISTORICAL;
    int INT_DISCRETIONAL = Enum.INT_DISCRETIONAL;
    int INT_STANDARD_CONTEXTUAL = Enum.INT_STANDARD_CONTEXTUAL;
    int INT_STANDARD_HISTORICAL = Enum.INT_STANDARD_HISTORICAL;
    int INT_CONTEXTUAL_HISTORICAL = Enum.INT_CONTEXTUAL_HISTORICAL;
    int INT_STANDARD_DISCRETIONAL = Enum.INT_STANDARD_DISCRETIONAL;
    int INT_CONTEXTUAL_DISCRETIONAL = Enum.INT_CONTEXTUAL_DISCRETIONAL;
    int INT_HISTORICAL_DISCRETIONAL = Enum.INT_HISTORICAL_DISCRETIONAL;
    int INT_STANDARD_CONTEXTUAL_HISTORICAL = Enum.INT_STANDARD_CONTEXTUAL_HISTORICAL;
    int INT_STANDARD_CONTEXTUAL_DISCRETIONAL = Enum.INT_STANDARD_CONTEXTUAL_DISCRETIONAL;
    int INT_STANDARD_HISTORICAL_DISCRETIONAL = Enum.INT_STANDARD_HISTORICAL_DISCRETIONAL;
    int INT_CONTEXTUAL_HISTORICAL_DISCRETIONAL = Enum.INT_CONTEXTUAL_HISTORICAL_DISCRETIONAL;
    int INT_ALL = Enum.INT_ALL;

    /**
     * Enumeration value class for com.microsoft.schemas.office.word.x2010.wordml.STLigatures.
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
        static final int INT_STANDARD = 2;
        static final int INT_CONTEXTUAL = 3;
        static final int INT_HISTORICAL = 4;
        static final int INT_DISCRETIONAL = 5;
        static final int INT_STANDARD_CONTEXTUAL = 6;
        static final int INT_STANDARD_HISTORICAL = 7;
        static final int INT_CONTEXTUAL_HISTORICAL = 8;
        static final int INT_STANDARD_DISCRETIONAL = 9;
        static final int INT_CONTEXTUAL_DISCRETIONAL = 10;
        static final int INT_HISTORICAL_DISCRETIONAL = 11;
        static final int INT_STANDARD_CONTEXTUAL_HISTORICAL = 12;
        static final int INT_STANDARD_CONTEXTUAL_DISCRETIONAL = 13;
        static final int INT_STANDARD_HISTORICAL_DISCRETIONAL = 14;
        static final int INT_CONTEXTUAL_HISTORICAL_DISCRETIONAL = 15;
        static final int INT_ALL = 16;

        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
            new Enum("none", INT_NONE),
            new Enum("standard", INT_STANDARD),
            new Enum("contextual", INT_CONTEXTUAL),
            new Enum("historical", INT_HISTORICAL),
            new Enum("discretional", INT_DISCRETIONAL),
            new Enum("standardContextual", INT_STANDARD_CONTEXTUAL),
            new Enum("standardHistorical", INT_STANDARD_HISTORICAL),
            new Enum("contextualHistorical", INT_CONTEXTUAL_HISTORICAL),
            new Enum("standardDiscretional", INT_STANDARD_DISCRETIONAL),
            new Enum("contextualDiscretional", INT_CONTEXTUAL_DISCRETIONAL),
            new Enum("historicalDiscretional", INT_HISTORICAL_DISCRETIONAL),
            new Enum("standardContextualHistorical", INT_STANDARD_CONTEXTUAL_HISTORICAL),
            new Enum("standardContextualDiscretional", INT_STANDARD_CONTEXTUAL_DISCRETIONAL),
            new Enum("standardHistoricalDiscretional", INT_STANDARD_HISTORICAL_DISCRETIONAL),
            new Enum("contextualHistoricalDiscretional", INT_CONTEXTUAL_HISTORICAL_DISCRETIONAL),
            new Enum("all", INT_ALL),
        });
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }
}
