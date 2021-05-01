/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.sys.tables;


import nu.studer.sample.sys.Sys;

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
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WaitsGlobalByLatency extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.waits_global_by_latency</code>
     */
    public static final WaitsGlobalByLatency WAITS_GLOBAL_BY_LATENCY = new WaitsGlobalByLatency();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>sys.waits_global_by_latency.events</code>.
     */
    public final TableField<Record, String> EVENTS = createField(DSL.name("events"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>sys.waits_global_by_latency.total</code>.
     */
    public final TableField<Record, ULong> TOTAL = createField(DSL.name("total"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.waits_global_by_latency.total_latency</code>.
     */
    public final TableField<Record, String> TOTAL_LATENCY = createField(DSL.name("total_latency"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.waits_global_by_latency.avg_latency</code>.
     */
    public final TableField<Record, String> AVG_LATENCY = createField(DSL.name("avg_latency"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.waits_global_by_latency.max_latency</code>.
     */
    public final TableField<Record, String> MAX_LATENCY = createField(DSL.name("max_latency"), SQLDataType.CLOB, this, "");

    private WaitsGlobalByLatency(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private WaitsGlobalByLatency(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `waits_global_by_latency` as select `performance_schema`.`events_waits_summary_global_by_event_name`.`EVENT_NAME` AS `events`,`performance_schema`.`events_waits_summary_global_by_event_name`.`COUNT_STAR` AS `total`,`sys`.`format_time`(`performance_schema`.`events_waits_summary_global_by_event_name`.`SUM_TIMER_WAIT`) AS `total_latency`,`sys`.`format_time`(`performance_schema`.`events_waits_summary_global_by_event_name`.`AVG_TIMER_WAIT`) AS `avg_latency`,`sys`.`format_time`(`performance_schema`.`events_waits_summary_global_by_event_name`.`MAX_TIMER_WAIT`) AS `max_latency` from `performance_schema`.`events_waits_summary_global_by_event_name` where ((`performance_schema`.`events_waits_summary_global_by_event_name`.`EVENT_NAME` <> 'idle') and (`performance_schema`.`events_waits_summary_global_by_event_name`.`SUM_TIMER_WAIT` > 0)) order by `performance_schema`.`events_waits_summary_global_by_event_name`.`SUM_TIMER_WAIT` desc"));
    }

    /**
     * Create an aliased <code>sys.waits_global_by_latency</code> table reference
     */
    public WaitsGlobalByLatency(String alias) {
        this(DSL.name(alias), WAITS_GLOBAL_BY_LATENCY);
    }

    /**
     * Create an aliased <code>sys.waits_global_by_latency</code> table reference
     */
    public WaitsGlobalByLatency(Name alias) {
        this(alias, WAITS_GLOBAL_BY_LATENCY);
    }

    /**
     * Create a <code>sys.waits_global_by_latency</code> table reference
     */
    public WaitsGlobalByLatency() {
        this(DSL.name("waits_global_by_latency"), null);
    }

    public <O extends Record> WaitsGlobalByLatency(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, WAITS_GLOBAL_BY_LATENCY);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public WaitsGlobalByLatency as(String alias) {
        return new WaitsGlobalByLatency(DSL.name(alias), this);
    }

    @Override
    public WaitsGlobalByLatency as(Name alias) {
        return new WaitsGlobalByLatency(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public WaitsGlobalByLatency rename(String name) {
        return new WaitsGlobalByLatency(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public WaitsGlobalByLatency rename(Name name) {
        return new WaitsGlobalByLatency(name, null);
    }
}
