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
public enum HostCacheHostValidated implements EnumType {

    YES("YES"),

    NO("NO");

    private final String literal;

    private HostCacheHostValidated(String literal) {
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
        return "host_cache_HOST_VALIDATED";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}
