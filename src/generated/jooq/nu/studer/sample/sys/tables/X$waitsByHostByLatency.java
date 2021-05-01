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
public class X$waitsByHostByLatency extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.x$waits_by_host_by_latency</code>
     */
    public static final X$waitsByHostByLatency X$WAITS_BY_HOST_BY_LATENCY = new X$waitsByHostByLatency();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>sys.x$waits_by_host_by_latency.host</code>.
     */
    public final TableField<Record, String> HOST = createField(DSL.name("host"), SQLDataType.VARCHAR(60), this, "");

    /**
     * The column <code>sys.x$waits_by_host_by_latency.event</code>.
     */
    public final TableField<Record, String> EVENT = createField(DSL.name("event"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>sys.x$waits_by_host_by_latency.total</code>.
     */
    public final TableField<Record, ULong> TOTAL = createField(DSL.name("total"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$waits_by_host_by_latency.total_latency</code>.
     */
    public final TableField<Record, ULong> TOTAL_LATENCY = createField(DSL.name("total_latency"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$waits_by_host_by_latency.avg_latency</code>.
     */
    public final TableField<Record, ULong> AVG_LATENCY = createField(DSL.name("avg_latency"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$waits_by_host_by_latency.max_latency</code>.
     */
    public final TableField<Record, ULong> MAX_LATENCY = createField(DSL.name("max_latency"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    private X$waitsByHostByLatency(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private X$waitsByHostByLatency(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `x$waits_by_host_by_latency` as select if(isnull(`performance_schema`.`events_waits_summary_by_host_by_event_name`.`HOST`),'background',`performance_schema`.`events_waits_summary_by_host_by_event_name`.`HOST`) AS `host`,`performance_schema`.`events_waits_summary_by_host_by_event_name`.`EVENT_NAME` AS `event`,`performance_schema`.`events_waits_summary_by_host_by_event_name`.`COUNT_STAR` AS `total`,`performance_schema`.`events_waits_summary_by_host_by_event_name`.`SUM_TIMER_WAIT` AS `total_latency`,`performance_schema`.`events_waits_summary_by_host_by_event_name`.`AVG_TIMER_WAIT` AS `avg_latency`,`performance_schema`.`events_waits_summary_by_host_by_event_name`.`MAX_TIMER_WAIT` AS `max_latency` from `performance_schema`.`events_waits_summary_by_host_by_event_name` where ((`performance_schema`.`events_waits_summary_by_host_by_event_name`.`EVENT_NAME` <> 'idle') and (`performance_schema`.`events_waits_summary_by_host_by_event_name`.`SUM_TIMER_WAIT` > 0)) order by if(isnull(`performance_schema`.`events_waits_summary_by_host_by_event_name`.`HOST`),'background',`performance_schema`.`events_waits_summary_by_host_by_event_name`.`HOST`),`performance_schema`.`events_waits_summary_by_host_by_event_name`.`SUM_TIMER_WAIT` desc"));
    }

    /**
     * Create an aliased <code>sys.x$waits_by_host_by_latency</code> table reference
     */
    public X$waitsByHostByLatency(String alias) {
        this(DSL.name(alias), X$WAITS_BY_HOST_BY_LATENCY);
    }

    /**
     * Create an aliased <code>sys.x$waits_by_host_by_latency</code> table reference
     */
    public X$waitsByHostByLatency(Name alias) {
        this(alias, X$WAITS_BY_HOST_BY_LATENCY);
    }

    /**
     * Create a <code>sys.x$waits_by_host_by_latency</code> table reference
     */
    public X$waitsByHostByLatency() {
        this(DSL.name("x$waits_by_host_by_latency"), null);
    }

    public <O extends Record> X$waitsByHostByLatency(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, X$WAITS_BY_HOST_BY_LATENCY);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public X$waitsByHostByLatency as(String alias) {
        return new X$waitsByHostByLatency(DSL.name(alias), this);
    }

    @Override
    public X$waitsByHostByLatency as(Name alias) {
        return new X$waitsByHostByLatency(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$waitsByHostByLatency rename(String name) {
        return new X$waitsByHostByLatency(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public X$waitsByHostByLatency rename(Name name) {
        return new X$waitsByHostByLatency(name, null);
    }
}