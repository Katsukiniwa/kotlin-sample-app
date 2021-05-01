/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.performance_schema.tables;


import nu.studer.sample.performance_schema.PerformanceSchema;

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
public class EventsStagesSummaryByThreadByEventName extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>performance_schema.events_stages_summary_by_thread_by_event_name</code>
     */
    public static final EventsStagesSummaryByThreadByEventName EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME = new EventsStagesSummaryByThreadByEventName();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>performance_schema.events_stages_summary_by_thread_by_event_name.THREAD_ID</code>.
     */
    public final TableField<Record, ULong> THREAD_ID = createField(DSL.name("THREAD_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_stages_summary_by_thread_by_event_name.EVENT_NAME</code>.
     */
    public final TableField<Record, String> EVENT_NAME = createField(DSL.name("EVENT_NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_stages_summary_by_thread_by_event_name.COUNT_STAR</code>.
     */
    public final TableField<Record, ULong> COUNT_STAR = createField(DSL.name("COUNT_STAR"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_stages_summary_by_thread_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public final TableField<Record, ULong> SUM_TIMER_WAIT = createField(DSL.name("SUM_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_stages_summary_by_thread_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public final TableField<Record, ULong> MIN_TIMER_WAIT = createField(DSL.name("MIN_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_stages_summary_by_thread_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public final TableField<Record, ULong> AVG_TIMER_WAIT = createField(DSL.name("AVG_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_stages_summary_by_thread_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public final TableField<Record, ULong> MAX_TIMER_WAIT = createField(DSL.name("MAX_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    private EventsStagesSummaryByThreadByEventName(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private EventsStagesSummaryByThreadByEventName(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>performance_schema.events_stages_summary_by_thread_by_event_name</code> table reference
     */
    public EventsStagesSummaryByThreadByEventName(String alias) {
        this(DSL.name(alias), EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME);
    }

    /**
     * Create an aliased <code>performance_schema.events_stages_summary_by_thread_by_event_name</code> table reference
     */
    public EventsStagesSummaryByThreadByEventName(Name alias) {
        this(alias, EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME);
    }

    /**
     * Create a <code>performance_schema.events_stages_summary_by_thread_by_event_name</code> table reference
     */
    public EventsStagesSummaryByThreadByEventName() {
        this(DSL.name("events_stages_summary_by_thread_by_event_name"), null);
    }

    public <O extends Record> EventsStagesSummaryByThreadByEventName(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME);
    }

    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public EventsStagesSummaryByThreadByEventName as(String alias) {
        return new EventsStagesSummaryByThreadByEventName(DSL.name(alias), this);
    }

    @Override
    public EventsStagesSummaryByThreadByEventName as(Name alias) {
        return new EventsStagesSummaryByThreadByEventName(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsStagesSummaryByThreadByEventName rename(String name) {
        return new EventsStagesSummaryByThreadByEventName(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsStagesSummaryByThreadByEventName rename(Name name) {
        return new EventsStagesSummaryByThreadByEventName(name, null);
    }
}
