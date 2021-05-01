/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.performance_schema.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum SetupObjectsObjectType implements EnumType {

    EVENT("EVENT"),

    FUNCTION("FUNCTION"),

    PROCEDURE("PROCEDURE"),

    TABLE("TABLE"),

    TRIGGER("TRIGGER");

    private final String literal;

    private SetupObjectsObjectType(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return null;
    }

    @Override
    public Schema getSchema() {
        return null;
    }

    @Override
    public String getName() {
        return "setup_objects_OBJECT_TYPE";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}
