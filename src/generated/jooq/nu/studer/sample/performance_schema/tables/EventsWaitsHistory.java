/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.performance_schema.tables;


import nu.studer.sample.performance_schema.PerformanceSchema;
import nu.studer.sample.performance_schema.enums.EventsWaitsHistoryNestingEventType;

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
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EventsWaitsHistory extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>performance_schema.events_waits_history</code>
     */
    public static final EventsWaitsHistory EVENTS_WAITS_HISTORY = new EventsWaitsHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>performance_schema.events_waits_history.THREAD_ID</code>.
     */
    public final TableField<Record, ULong> THREAD_ID = createField(DSL.name("THREAD_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_history.EVENT_ID</code>.
     */
    public final TableField<Record, ULong> EVENT_ID = createField(DSL.name("EVENT_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_history.END_EVENT_ID</code>.
     */
    public final TableField<Record, ULong> END_EVENT_ID = createField(DSL.name("END_EVENT_ID"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_waits_history.EVENT_NAME</code>.
     */
    public final TableField<Record, String> EVENT_NAME = createField(DSL.name("EVENT_NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_history.SOURCE</code>.
     */
    public final TableField<Record, String> SOURCE = createField(DSL.name("SOURCE"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_waits_history.TIMER_START</code>.
     */
    public final TableField<Record, ULong> TIMER_START = createField(DSL.name("TIMER_START"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_waits_history.TIMER_END</code>.
     */
    public final TableField<Record, ULong> TIMER_END = createField(DSL.name("TIMER_END"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_waits_history.TIMER_WAIT</code>.
     */
    public final TableField<Record, ULong> TIMER_WAIT = createField(DSL.name("TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_waits_history.SPINS</code>.
     */
    public final TableField<Record, UInteger> SPINS = createField(DSL.name("SPINS"), SQLDataType.INTEGERUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_waits_history.OBJECT_SCHEMA</code>.
     */
    public final TableField<Record, String> OBJECT_SCHEMA = createField(DSL.name("OBJECT_SCHEMA"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_waits_history.OBJECT_NAME</code>.
     */
    public final TableField<Record, String> OBJECT_NAME = createField(DSL.name("OBJECT_NAME"), SQLDataType.VARCHAR(512), this, "");

    /**
     * The column <code>performance_schema.events_waits_history.INDEX_NAME</code>.
     */
    public final TableField<Record, String> INDEX_NAME = createField(DSL.name("INDEX_NAME"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_waits_history.OBJECT_TYPE</code>.
     */
    public final TableField<Record, String> OBJECT_TYPE = createField(DSL.name("OBJECT_TYPE"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_waits_history.OBJECT_INSTANCE_BEGIN</code>.
     */
    public final TableField<Record, ULong> OBJECT_INSTANCE_BEGIN = createField(DSL.name("OBJECT_INSTANCE_BEGIN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_history.NESTING_EVENT_ID</code>.
     */
    public final TableField<Record, ULong> NESTING_EVENT_ID = createField(DSL.name("NESTING_EVENT_ID"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_waits_history.NESTING_EVENT_TYPE</code>.
     */
    public final TableField<Record, EventsWaitsHistoryNestingEventType> NESTING_EVENT_TYPE = createField(DSL.name("NESTING_EVENT_TYPE"), SQLDataType.VARCHAR(11).asEnumDataType(nu.studer.sample.performance_schema.enums.EventsWaitsHistoryNestingEventType.class), this, "");

    /**
     * The column <code>performance_schema.events_waits_history.OPERATION</code>.
     */
    public final TableField<Record, String> OPERATION = createField(DSL.name("OPERATION"), SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_history.NUMBER_OF_BYTES</code>.
     */
    public final TableField<Record, Long> NUMBER_OF_BYTES = createField(DSL.name("NUMBER_OF_BYTES"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>performance_schema.events_waits_history.FLAGS</code>.
     */
    public final TableField<Record, UInteger> FLAGS = createField(DSL.name("FLAGS"), SQLDataType.INTEGERUNSIGNED, this, "");

    private EventsWaitsHistory(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private EventsWaitsHistory(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>performance_schema.events_waits_history</code> table reference
     */
    public EventsWaitsHistory(String alias) {
        this(DSL.name(alias), EVENTS_WAITS_HISTORY);
    }

    /**
     * Create an aliased <code>performance_schema.events_waits_history</code> table reference
     */
    public EventsWaitsHistory(Name alias) {
        this(alias, EVENTS_WAITS_HISTORY);
    }

    /**
     * Create a <code>performance_schema.events_waits_history</code> table reference
     */
    public EventsWaitsHistory() {
        this(DSL.name("events_waits_history"), null);
    }

    public <O extends Record> EventsWaitsHistory(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, EVENTS_WAITS_HISTORY);
    }

    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public EventsWaitsHistory as(String alias) {
        return new EventsWaitsHistory(DSL.name(alias), this);
    }

    @Override
    public EventsWaitsHistory as(Name alias) {
        return new EventsWaitsHistory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsWaitsHistory rename(String name) {
        return new EventsWaitsHistory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsWaitsHistory rename(Name name) {
        return new EventsWaitsHistory(name, null);
    }
}