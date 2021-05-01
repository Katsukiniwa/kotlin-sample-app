/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.performance_schema.tables;


import nu.studer.sample.performance_schema.PerformanceSchema;
import nu.studer.sample.performance_schema.enums.EventsTransactionsHistoryAccessMode;
import nu.studer.sample.performance_schema.enums.EventsTransactionsHistoryAutocommit;
import nu.studer.sample.performance_schema.enums.EventsTransactionsHistoryNestingEventType;
import nu.studer.sample.performance_schema.enums.EventsTransactionsHistoryState;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EventsTransactionsHistory extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>performance_schema.events_transactions_history</code>
     */
    public static final EventsTransactionsHistory EVENTS_TRANSACTIONS_HISTORY = new EventsTransactionsHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>performance_schema.events_transactions_history.THREAD_ID</code>.
     */
    public final TableField<Record, ULong> THREAD_ID = createField(DSL.name("THREAD_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.EVENT_ID</code>.
     */
    public final TableField<Record, ULong> EVENT_ID = createField(DSL.name("EVENT_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.END_EVENT_ID</code>.
     */
    public final TableField<Record, ULong> END_EVENT_ID = createField(DSL.name("END_EVENT_ID"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.EVENT_NAME</code>.
     */
    public final TableField<Record, String> EVENT_NAME = createField(DSL.name("EVENT_NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.STATE</code>.
     */
    public final TableField<Record, EventsTransactionsHistoryState> STATE = createField(DSL.name("STATE"), SQLDataType.VARCHAR(11).asEnumDataType(nu.studer.sample.performance_schema.enums.EventsTransactionsHistoryState.class), this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.TRX_ID</code>.
     */
    public final TableField<Record, ULong> TRX_ID = createField(DSL.name("TRX_ID"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.GTID</code>.
     */
    public final TableField<Record, String> GTID = createField(DSL.name("GTID"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.XID_FORMAT_ID</code>.
     */
    public final TableField<Record, Integer> XID_FORMAT_ID = createField(DSL.name("XID_FORMAT_ID"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.XID_GTRID</code>.
     */
    public final TableField<Record, String> XID_GTRID = createField(DSL.name("XID_GTRID"), SQLDataType.VARCHAR(130), this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.XID_BQUAL</code>.
     */
    public final TableField<Record, String> XID_BQUAL = createField(DSL.name("XID_BQUAL"), SQLDataType.VARCHAR(130), this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.XA_STATE</code>.
     */
    public final TableField<Record, String> XA_STATE = createField(DSL.name("XA_STATE"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.SOURCE</code>.
     */
    public final TableField<Record, String> SOURCE = createField(DSL.name("SOURCE"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.TIMER_START</code>.
     */
    public final TableField<Record, ULong> TIMER_START = createField(DSL.name("TIMER_START"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.TIMER_END</code>.
     */
    public final TableField<Record, ULong> TIMER_END = createField(DSL.name("TIMER_END"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.TIMER_WAIT</code>.
     */
    public final TableField<Record, ULong> TIMER_WAIT = createField(DSL.name("TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.ACCESS_MODE</code>.
     */
    public final TableField<Record, EventsTransactionsHistoryAccessMode> ACCESS_MODE = createField(DSL.name("ACCESS_MODE"), SQLDataType.VARCHAR(10).asEnumDataType(nu.studer.sample.performance_schema.enums.EventsTransactionsHistoryAccessMode.class), this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.ISOLATION_LEVEL</code>.
     */
    public final TableField<Record, String> ISOLATION_LEVEL = createField(DSL.name("ISOLATION_LEVEL"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.AUTOCOMMIT</code>.
     */
    public final TableField<Record, EventsTransactionsHistoryAutocommit> AUTOCOMMIT = createField(DSL.name("AUTOCOMMIT"), SQLDataType.VARCHAR(3).nullable(false).asEnumDataType(nu.studer.sample.performance_schema.enums.EventsTransactionsHistoryAutocommit.class), this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.NUMBER_OF_SAVEPOINTS</code>.
     */
    public final TableField<Record, ULong> NUMBER_OF_SAVEPOINTS = createField(DSL.name("NUMBER_OF_SAVEPOINTS"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.NUMBER_OF_ROLLBACK_TO_SAVEPOINT</code>.
     */
    public final TableField<Record, ULong> NUMBER_OF_ROLLBACK_TO_SAVEPOINT = createField(DSL.name("NUMBER_OF_ROLLBACK_TO_SAVEPOINT"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.NUMBER_OF_RELEASE_SAVEPOINT</code>.
     */
    public final TableField<Record, ULong> NUMBER_OF_RELEASE_SAVEPOINT = createField(DSL.name("NUMBER_OF_RELEASE_SAVEPOINT"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.OBJECT_INSTANCE_BEGIN</code>.
     */
    public final TableField<Record, ULong> OBJECT_INSTANCE_BEGIN = createField(DSL.name("OBJECT_INSTANCE_BEGIN"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.NESTING_EVENT_ID</code>.
     */
    public final TableField<Record, ULong> NESTING_EVENT_ID = createField(DSL.name("NESTING_EVENT_ID"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.NESTING_EVENT_TYPE</code>.
     */
    public final TableField<Record, EventsTransactionsHistoryNestingEventType> NESTING_EVENT_TYPE = createField(DSL.name("NESTING_EVENT_TYPE"), SQLDataType.VARCHAR(11).asEnumDataType(nu.studer.sample.performance_schema.enums.EventsTransactionsHistoryNestingEventType.class), this, "");

    private EventsTransactionsHistory(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private EventsTransactionsHistory(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>performance_schema.events_transactions_history</code> table reference
     */
    public EventsTransactionsHistory(String alias) {
        this(DSL.name(alias), EVENTS_TRANSACTIONS_HISTORY);
    }

    /**
     * Create an aliased <code>performance_schema.events_transactions_history</code> table reference
     */
    public EventsTransactionsHistory(Name alias) {
        this(alias, EVENTS_TRANSACTIONS_HISTORY);
    }

    /**
     * Create a <code>performance_schema.events_transactions_history</code> table reference
     */
    public EventsTransactionsHistory() {
        this(DSL.name("events_transactions_history"), null);
    }

    public <O extends Record> EventsTransactionsHistory(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, EVENTS_TRANSACTIONS_HISTORY);
    }

    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public EventsTransactionsHistory as(String alias) {
        return new EventsTransactionsHistory(DSL.name(alias), this);
    }

    @Override
    public EventsTransactionsHistory as(Name alias) {
        return new EventsTransactionsHistory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsTransactionsHistory rename(String name) {
        return new EventsTransactionsHistory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsTransactionsHistory rename(Name name) {
        return new EventsTransactionsHistory(name, null);
    }
}
