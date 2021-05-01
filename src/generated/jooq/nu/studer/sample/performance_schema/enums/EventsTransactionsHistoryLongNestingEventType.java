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
public enum EventsTransactionsHistoryLongNestingEventType implements EnumType {

    TRANSACTION("TRANSACTION"),

    STATEMENT("STATEMENT"),

    STAGE("STAGE"),

    WAIT("WAIT");

    private final String literal;

    private EventsTransactionsHistoryLongNestingEventType(String literal) {
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
        return "events_transactions_history_long_NESTING_EVENT_TYPE";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}