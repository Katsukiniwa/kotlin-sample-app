/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.mysql.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum DbEventPriv implements EnumType {

    N("N"),

    Y("Y");

    private final String literal;

    private DbEventPriv(String literal) {
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
        return "db_Event_priv";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}
