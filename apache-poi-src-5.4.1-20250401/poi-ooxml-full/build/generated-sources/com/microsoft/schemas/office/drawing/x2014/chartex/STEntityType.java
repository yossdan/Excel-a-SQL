/*
 * XML Type:  ST_EntityType
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ST_EntityType(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is an atomic type that is a restriction of com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType.
 */
public interface STEntityType extends org.apache.xmlbeans.XmlString {
    SimpleTypeFactory<com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType> Factory = new SimpleTypeFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "stentitytype3719type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum ADDRESS = Enum.forString("Address");
    Enum ADMIN_DISTRICT = Enum.forString("AdminDistrict");
    Enum ADMIN_DISTRICT_2 = Enum.forString("AdminDistrict2");
    Enum ADMIN_DISTRICT_3 = Enum.forString("AdminDistrict3");
    Enum CONTINENT = Enum.forString("Continent");
    Enum COUNTRY_REGION = Enum.forString("CountryRegion");
    Enum LOCALITY = Enum.forString("Locality");
    Enum OCEAN = Enum.forString("Ocean");
    Enum PLANET = Enum.forString("Planet");
    Enum POSTAL_CODE = Enum.forString("PostalCode");
    Enum REGION = Enum.forString("Region");
    Enum UNSUPPORTED = Enum.forString("Unsupported");

    int INT_ADDRESS = Enum.INT_ADDRESS;
    int INT_ADMIN_DISTRICT = Enum.INT_ADMIN_DISTRICT;
    int INT_ADMIN_DISTRICT_2 = Enum.INT_ADMIN_DISTRICT_2;
    int INT_ADMIN_DISTRICT_3 = Enum.INT_ADMIN_DISTRICT_3;
    int INT_CONTINENT = Enum.INT_CONTINENT;
    int INT_COUNTRY_REGION = Enum.INT_COUNTRY_REGION;
    int INT_LOCALITY = Enum.INT_LOCALITY;
    int INT_OCEAN = Enum.INT_OCEAN;
    int INT_PLANET = Enum.INT_PLANET;
    int INT_POSTAL_CODE = Enum.INT_POSTAL_CODE;
    int INT_REGION = Enum.INT_REGION;
    int INT_UNSUPPORTED = Enum.INT_UNSUPPORTED;

    /**
     * Enumeration value class for com.microsoft.schemas.office.drawing.x2014.chartex.STEntityType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_ADDRESS
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

        static final int INT_ADDRESS = 1;
        static final int INT_ADMIN_DISTRICT = 2;
        static final int INT_ADMIN_DISTRICT_2 = 3;
        static final int INT_ADMIN_DISTRICT_3 = 4;
        static final int INT_CONTINENT = 5;
        static final int INT_COUNTRY_REGION = 6;
        static final int INT_LOCALITY = 7;
        static final int INT_OCEAN = 8;
        static final int INT_PLANET = 9;
        static final int INT_POSTAL_CODE = 10;
        static final int INT_REGION = 11;
        static final int INT_UNSUPPORTED = 12;

        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
            new Enum("Address", INT_ADDRESS),
            new Enum("AdminDistrict", INT_ADMIN_DISTRICT),
            new Enum("AdminDistrict2", INT_ADMIN_DISTRICT_2),
            new Enum("AdminDistrict3", INT_ADMIN_DISTRICT_3),
            new Enum("Continent", INT_CONTINENT),
            new Enum("CountryRegion", INT_COUNTRY_REGION),
            new Enum("Locality", INT_LOCALITY),
            new Enum("Ocean", INT_OCEAN),
            new Enum("Planet", INT_PLANET),
            new Enum("PostalCode", INT_POSTAL_CODE),
            new Enum("Region", INT_REGION),
            new Enum("Unsupported", INT_UNSUPPORTED),
        });
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }
}
