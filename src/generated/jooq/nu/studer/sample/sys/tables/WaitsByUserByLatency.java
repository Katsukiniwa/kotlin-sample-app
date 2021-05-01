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
public class WaitsByUserByLatency extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.waits_by_user_by_latency</code>
     */
    public static final WaitsByUserByLatency WAITS_BY_USER_BY_LATENCY = new WaitsByUserByLatency();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>sys.waits_by_user_by_latency.user</code>.
     */
    public final TableField<Record, String> USER = createField(DSL.name("user"), SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>sys.waits_by_user_by_latency.event</code>.
     */
    public final TableField<Record, String> EVENT = createField(DSL.name("event"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>sys.waits_by_user_by_latency.total</code>.
     */
    public final TableField<Record, ULong> TOTAL = createField(DSL.name("total"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.waits_by_user_by_latency.total_latency</code>.
     */
    public final TableField<Record, String> TOTAL_LATENCY = createField(DSL.name("total_latency"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.waits_by_user_by_latency.avg_latency</code>.
     */
    public final TableField<Record, String> AVG_LATENCY = createField(DSL.name("avg_latency"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.waits_by_user_by_latency.max_latency</code>.
     */
    public final TableField<Record, String> MAX_LATENCY = createField(DSL.name("max_latency"), SQLDataType.CLOB, this, "");

    private WaitsByUserByLatency(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private WaitsByUserByLatency(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `waits_by_user_by_latency` as select if(isnull(`performance_schema`.`events_waits_summary_by_user_by_event_name`.`USER`),'background',`performance_schema`.`events_waits_summary_by_user_by_event_name`.`USER`) AS `user`,`performance_schema`.`events_waits_summary_by_user_by_event_name`.`EVENT_NAME` AS `event`,`performance_schema`.`events_waits_summary_by_user_by_event_name`.`COUNT_STAR` AS `total`,`sys`.`format_time`(`performance_schema`.`events_waits_summary_by_user_by_event_name`.`SUM_TIMER_WAIT`) AS `total_latency`,`sys`.`format_time`(`performance_schema`.`events_waits_summary_by_user_by_event_name`.`AVG_TIMER_WAIT`) AS `avg_latency`,`sys`.`format_time`(`performance_schema`.`events_waits_summary_by_user_by_event_name`.`MAX_TIMER_WAIT`) AS `max_latency` from `performance_schema`.`events_waits_summary_by_user_by_event_name` where ((`performance_schema`.`events_waits_summary_by_user_by_event_name`.`EVENT_NAME` <> 'idle') and (`performance_schema`.`events_waits_summary_by_user_by_event_name`.`USER` is not null) and (`performance_schema`.`events_waits_summary_by_user_by_event_name`.`SUM_TIMER_WAIT` > 0)) order by if(isnull(`performance_schema`.`events_waits_summary_by_user_by_event_name`.`USER`),'background',`performance_schema`.`events_waits_summary_by_user_by_event_name`.`USER`),`performance_schema`.`events_waits_summary_by_user_by_event_name`.`SUM_TIMER_WAIT` desc"));
    }

    /**
     * Create an aliased <code>sys.waits_by_user_by_latency</code> table reference
     */
    public WaitsByUserByLatency(String alias) {
        this(DSL.name(alias), WAITS_BY_USER_BY_LATENCY);
    }

    /**
     * Create an aliased <code>sys.waits_by_user_by_latency</code> table reference
     */
    public WaitsByUserByLatency(Name alias) {
        this(alias, WAITS_BY_USER_BY_LATENCY);
    }

    /**
     * Create a <code>sys.waits_by_user_by_latency</code> table reference
     */
    public WaitsByUserByLatency() {
        this(DSL.name("waits_by_user_by_latency"), null);
    }

    public <O extends Record> WaitsByUserByLatency(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, WAITS_BY_USER_BY_LATENCY);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public WaitsByUserByLatency as(String alias) {
        return new WaitsByUserByLatency(DSL.name(alias), this);
    }

    @Override
    public WaitsByUserByLatency as(Name alias) {
        return new WaitsByUserByLatency(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public WaitsByUserByLatency rename(String name) {
        return new WaitsByUserByLatency(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public WaitsByUserByLatency rename(Name name) {
        return new WaitsByUserByLatency(name, null);
    }
}
