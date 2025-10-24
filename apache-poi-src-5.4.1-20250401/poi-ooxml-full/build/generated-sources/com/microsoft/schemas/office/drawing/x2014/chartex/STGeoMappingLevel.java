/*
 * XML Type:  ST_GeoMappingLevel
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.STGeoMappingLevel
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ST_GeoMappingLevel(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is an atomic type that is a restriction of com.microsoft.schemas.office.drawing.x2014.chartex.STGeoMappingLevel.
 */
public interface STGeoMappingLevel extends org.apache.xmlbeans.XmlString {
    SimpleTypeFactory<com.microsoft.schemas.office.drawing.x2014.chartex.STGeoMappingLevel> Factory = new SimpleTypeFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "stgeomappingleveld859type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum DATA_ONLY = Enum.forString("dataOnly");
    Enum POSTAL_CODE = Enum.forString("postalCode");
    Enum COUNTY = Enum.forString("county");
    Enum STATE = Enum.forString("state");
    Enum COUNTRY_REGION = Enum.forString("countryRegion");
    Enum COUNTRY_REGION_LIST = Enum.forString("countryRegionList");
    Enum WORLD = Enum.forString("world");

    int INT_DATA_ONLY = Enum.INT_DATA_ONLY;
    int INT_POSTAL_CODE = Enum.INT_POSTAL_CODE;
    int INT_COUNTY = Enum.INT_COUNTY;
    int INT_STATE = Enum.INT_STATE;
    int INT_COUNTRY_REGION = Enum.INT_COUNTRY_REGION;
    int INT_COUNTRY_REGION_LIST = Enum.INT_COUNTRY_REGION_LIST;
    int INT_WORLD = Enum.INT_WORLD;

    /**
     * Enumeration value class for com.microsoft.schemas.office.drawing.x2014.chartex.STGeoMappingLevel.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_DATA_ONLY
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

        static final int INT_DATA_ONLY = 1;
        static final int INT_POSTAL_CODE = 2;
        static final int INT_COUNTY = 3;
        static final int INT_STATE = 4;
        static final int INT_COUNTRY_REGION = 5;
        static final int INT_COUNTRY_REGION_LIST = 6;
        static final int INT_WORLD = 7;

        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
            new Enum("dataOnly", INT_DATA_ONLY),
            new Enum("postalCode", INT_POSTAL_CODE),
            new Enum("county", INT_COUNTY),
            new Enum("state", INT_STATE),
            new Enum("countryRegion", INT_COUNTRY_REGION),
            new Enum("countryRegionList", INT_COUNTRY_REGION_LIST),
            new Enum("world", INT_WORLD),
        });
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }
}
