/*
 * XML Type:  ST_SeriesLayout
 * Namespace: http://schemas.microsoft.com/office/drawing/2014/chartex
 * Java type: com.microsoft.schemas.office.drawing.x2014.chartex.STSeriesLayout
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2014.chartex;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ST_SeriesLayout(@http://schemas.microsoft.com/office/drawing/2014/chartex).
 *
 * This is an atomic type that is a restriction of com.microsoft.schemas.office.drawing.x2014.chartex.STSeriesLayout.
 */
public interface STSeriesLayout extends org.apache.xmlbeans.XmlString {
    SimpleTypeFactory<com.microsoft.schemas.office.drawing.x2014.chartex.STSeriesLayout> Factory = new SimpleTypeFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "stserieslayoutfa15type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum BOX_WHISKER = Enum.forString("boxWhisker");
    Enum CLUSTERED_COLUMN = Enum.forString("clusteredColumn");
    Enum FUNNEL = Enum.forString("funnel");
    Enum PARETO_LINE = Enum.forString("paretoLine");
    Enum REGION_MAP = Enum.forString("regionMap");
    Enum SUNBURST = Enum.forString("sunburst");
    Enum TREEMAP = Enum.forString("treemap");
    Enum WATERFALL = Enum.forString("waterfall");

    int INT_BOX_WHISKER = Enum.INT_BOX_WHISKER;
    int INT_CLUSTERED_COLUMN = Enum.INT_CLUSTERED_COLUMN;
    int INT_FUNNEL = Enum.INT_FUNNEL;
    int INT_PARETO_LINE = Enum.INT_PARETO_LINE;
    int INT_REGION_MAP = Enum.INT_REGION_MAP;
    int INT_SUNBURST = Enum.INT_SUNBURST;
    int INT_TREEMAP = Enum.INT_TREEMAP;
    int INT_WATERFALL = Enum.INT_WATERFALL;

    /**
     * Enumeration value class for com.microsoft.schemas.office.drawing.x2014.chartex.STSeriesLayout.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_BOX_WHISKER
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

        static final int INT_BOX_WHISKER = 1;
        static final int INT_CLUSTERED_COLUMN = 2;
        static final int INT_FUNNEL = 3;
        static final int INT_PARETO_LINE = 4;
        static final int INT_REGION_MAP = 5;
        static final int INT_SUNBURST = 6;
        static final int INT_TREEMAP = 7;
        static final int INT_WATERFALL = 8;

        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
            new Enum("boxWhisker", INT_BOX_WHISKER),
            new Enum("clusteredColumn", INT_CLUSTERED_COLUMN),
            new Enum("funnel", INT_FUNNEL),
            new Enum("paretoLine", INT_PARETO_LINE),
            new Enum("regionMap", INT_REGION_MAP),
            new Enum("sunburst", INT_SUNBURST),
            new Enum("treemap", INT_TREEMAP),
            new Enum("waterfall", INT_WATERFALL),
        });
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }
}
