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
public enum EventsTransactionsHistoryLongState implements EnumType {

    ACTIVE("ACTIVE"),

    COMMITTED("COMMITTED"),

    ROLLED_BACK("ROLLED BACK");

    private final String literal;

    private EventsTransactionsHistoryLongState(String literal) {
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
        return "events_transactions_history_long_STATE";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}