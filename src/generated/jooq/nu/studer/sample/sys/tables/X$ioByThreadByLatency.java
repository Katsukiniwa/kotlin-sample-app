/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.sys.tables;


import java.math.BigDecimal;
import java.math.BigInteger;

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
public class X$ioByThreadByLatency extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.x$io_by_thread_by_latency</code>
     */
    public static final X$ioByThreadByLatency X$IO_BY_THREAD_BY_LATENCY = new X$ioByThreadByLatency();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>sys.x$io_by_thread_by_latency.user</code>.
     */
    public final TableField<Record, String> USER = createField(DSL.name("user"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>sys.x$io_by_thread_by_latency.total</code>.
     */
    public final TableField<Record, BigInteger> TOTAL = createField(DSL.name("total"), SQLDataType.DECIMAL_INTEGER(42), this, "");

    /**
     * The column <code>sys.x$io_by_thread_by_latency.total_latency</code>.
     */
    public final TableField<Record, BigInteger> TOTAL_LATENCY = createField(DSL.name("total_latency"), SQLDataType.DECIMAL_INTEGER(42), this, "");

    /**
     * The column <code>sys.x$io_by_thread_by_latency.min_latency</code>.
     */
    public final TableField<Record, ULong> MIN_LATENCY = createField(DSL.name("min_latency"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.x$io_by_thread_by_latency.avg_latency</code>.
     */
    public final TableField<Record, BigDecimal> AVG_LATENCY = createField(DSL.name("avg_latency"), SQLDataType.DECIMAL(24, 4), this, "");

    /**
     * The column <code>sys.x$io_by_thread_by_latency.max_latency</code>.
     */
    public final TableField<Record, ULong> MAX_LATENCY = createField(DSL.name("max_latency"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.x$io_by_thread_by_latency.thread_id</code>.
     */
    public final TableField<Record, ULong> THREAD_ID = createField(DSL.name("thread_id"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_by_thread_by_latency.processlist_id</code>.
     */
    public final TableField<Record, ULong> PROCESSLIST_ID = createField(DSL.name("processlist_id"), SQLDataType.BIGINTUNSIGNED, this, "");

    private X$ioByThreadByLatency(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private X$ioByThreadByLatency(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `x$io_by_thread_by_latency` as select if(isnull(`performance_schema`.`threads`.`PROCESSLIST_ID`),substring_index(`performance_schema`.`threads`.`NAME`,'/',-(1)),concat(`performance_schema`.`threads`.`PROCESSLIST_USER`,'@',`performance_schema`.`threads`.`PROCESSLIST_HOST`)) AS `user`,sum(`performance_schema`.`events_waits_summary_by_thread_by_event_name`.`COUNT_STAR`) AS `total`,sum(`performance_schema`.`events_waits_summary_by_thread_by_event_name`.`SUM_TIMER_WAIT`) AS `total_latency`,min(`performance_schema`.`events_waits_summary_by_thread_by_event_name`.`MIN_TIMER_WAIT`) AS `min_latency`,avg(`performance_schema`.`events_waits_summary_by_thread_by_event_name`.`AVG_TIMER_WAIT`) AS `avg_latency`,max(`performance_schema`.`events_waits_summary_by_thread_by_event_name`.`MAX_TIMER_WAIT`) AS `max_latency`,`performance_schema`.`events_waits_summary_by_thread_by_event_name`.`THREAD_ID` AS `thread_id`,`performance_schema`.`threads`.`PROCESSLIST_ID` AS `processlist_id` from (`performance_schema`.`events_waits_summary_by_thread_by_event_name` left join `performance_schema`.`threads` on((`performance_schema`.`events_waits_summary_by_thread_by_event_name`.`THREAD_ID` = `performance_schema`.`threads`.`THREAD_ID`))) where ((`performance_schema`.`events_waits_summary_by_thread_by_event_name`.`EVENT_NAME` like 'wait/io/file/%') and (`performance_schema`.`events_waits_summary_by_thread_by_event_name`.`SUM_TIMER_WAIT` > 0)) group by `performance_schema`.`events_waits_summary_by_thread_by_event_name`.`THREAD_ID`,`performance_schema`.`threads`.`PROCESSLIST_ID`,`user` order by sum(`performance_schema`.`events_waits_summary_by_thread_by_event_name`.`SUM_TIMER_WAIT`) desc"));
    }

    /**
     * Create an aliased <code>sys.x$io_by_thread_by_latency</code> table reference
     */
    public X$ioByThreadByLatency(String alias) {
        this(DSL.name(alias), X$IO_BY_THREAD_BY_LATENCY);
    }

    /**
     * Create an aliased <code>sys.x$io_by_thread_by_latency</code> table reference
     */
    public X$ioByThreadByLatency(Name alias) {
        this(alias, X$IO_BY_THREAD_BY_LATENCY);
    }

    /**
     * Create a <code>sys.x$io_by_thread_by_latency</code> table reference
     */
    public X$ioByThreadByLatency() {
        this(DSL.name("x$io_by_thread_by_latency"), null);
    }

    public <O extends Record> X$ioByThreadByLatency(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, X$IO_BY_THREAD_BY_LATENCY);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public X$ioByThreadByLatency as(String alias) {
        return new X$ioByThreadByLatency(DSL.name(alias), this);
    }

    @Override
    public X$ioByThreadByLatency as(Name alias) {
        return new X$ioByThreadByLatency(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$ioByThreadByLatency rename(String name) {
        return new X$ioByThreadByLatency(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public X$ioByThreadByLatency rename(Name name) {
        return new X$ioByThreadByLatency(name, null);
    }
}
