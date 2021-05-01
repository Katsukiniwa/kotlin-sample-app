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
public class IoGlobalByWaitByLatency extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.io_global_by_wait_by_latency</code>
     */
    public static final IoGlobalByWaitByLatency IO_GLOBAL_BY_WAIT_BY_LATENCY = new IoGlobalByWaitByLatency();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>sys.io_global_by_wait_by_latency.event_name</code>.
     */
    public final TableField<Record, String> EVENT_NAME = createField(DSL.name("event_name"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_latency.total</code>.
     */
    public final TableField<Record, ULong> TOTAL = createField(DSL.name("total"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_latency.total_latency</code>.
     */
    public final TableField<Record, String> TOTAL_LATENCY = createField(DSL.name("total_latency"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_latency.avg_latency</code>.
     */
    public final TableField<Record, String> AVG_LATENCY = createField(DSL.name("avg_latency"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_latency.max_latency</code>.
     */
    public final TableField<Record, String> MAX_LATENCY = createField(DSL.name("max_latency"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_latency.read_latency</code>.
     */
    public final TableField<Record, String> READ_LATENCY = createField(DSL.name("read_latency"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_latency.write_latency</code>.
     */
    public final TableField<Record, String> WRITE_LATENCY = createField(DSL.name("write_latency"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_latency.misc_latency</code>.
     */
    public final TableField<Record, String> MISC_LATENCY = createField(DSL.name("misc_latency"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_latency.count_read</code>.
     */
    public final TableField<Record, ULong> COUNT_READ = createField(DSL.name("count_read"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_latency.total_read</code>.
     */
    public final TableField<Record, String> TOTAL_READ = createField(DSL.name("total_read"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_latency.avg_read</code>.
     */
    public final TableField<Record, String> AVG_READ = createField(DSL.name("avg_read"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_latency.count_write</code>.
     */
    public final TableField<Record, ULong> COUNT_WRITE = createField(DSL.name("count_write"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_latency.total_written</code>.
     */
    public final TableField<Record, String> TOTAL_WRITTEN = createField(DSL.name("total_written"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_latency.avg_written</code>.
     */
    public final TableField<Record, String> AVG_WRITTEN = createField(DSL.name("avg_written"), SQLDataType.CLOB, this, "");

    private IoGlobalByWaitByLatency(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private IoGlobalByWaitByLatency(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `io_global_by_wait_by_latency` as select substring_index(`performance_schema`.`file_summary_by_event_name`.`EVENT_NAME`,'/',-(2)) AS `event_name`,`performance_schema`.`file_summary_by_event_name`.`COUNT_STAR` AS `total`,`sys`.`format_time`(`performance_schema`.`file_summary_by_event_name`.`SUM_TIMER_WAIT`) AS `total_latency`,`sys`.`format_time`(`performance_schema`.`file_summary_by_event_name`.`AVG_TIMER_WAIT`) AS `avg_latency`,`sys`.`format_time`(`performance_schema`.`file_summary_by_event_name`.`MAX_TIMER_WAIT`) AS `max_latency`,`sys`.`format_time`(`performance_schema`.`file_summary_by_event_name`.`SUM_TIMER_READ`) AS `read_latency`,`sys`.`format_time`(`performance_schema`.`file_summary_by_event_name`.`SUM_TIMER_WRITE`) AS `write_latency`,`sys`.`format_time`(`performance_schema`.`file_summary_by_event_name`.`SUM_TIMER_MISC`) AS `misc_latency`,`performance_schema`.`file_summary_by_event_name`.`COUNT_READ` AS `count_read`,`sys`.`format_bytes`(`performance_schema`.`file_summary_by_event_name`.`SUM_NUMBER_OF_BYTES_READ`) AS `total_read`,`sys`.`format_bytes`(ifnull((`performance_schema`.`file_summary_by_event_name`.`SUM_NUMBER_OF_BYTES_READ` / nullif(`performance_schema`.`file_summary_by_event_name`.`COUNT_READ`,0)),0)) AS `avg_read`,`performance_schema`.`file_summary_by_event_name`.`COUNT_WRITE` AS `count_write`,`sys`.`format_bytes`(`performance_schema`.`file_summary_by_event_name`.`SUM_NUMBER_OF_BYTES_WRITE`) AS `total_written`,`sys`.`format_bytes`(ifnull((`performance_schema`.`file_summary_by_event_name`.`SUM_NUMBER_OF_BYTES_WRITE` / nullif(`performance_schema`.`file_summary_by_event_name`.`COUNT_WRITE`,0)),0)) AS `avg_written` from `performance_schema`.`file_summary_by_event_name` where ((`performance_schema`.`file_summary_by_event_name`.`EVENT_NAME` like 'wait/io/file/%') and (`performance_schema`.`file_summary_by_event_name`.`COUNT_STAR` > 0)) order by `performance_schema`.`file_summary_by_event_name`.`SUM_TIMER_WAIT` desc"));
    }

    /**
     * Create an aliased <code>sys.io_global_by_wait_by_latency</code> table reference
     */
    public IoGlobalByWaitByLatency(String alias) {
        this(DSL.name(alias), IO_GLOBAL_BY_WAIT_BY_LATENCY);
    }

    /**
     * Create an aliased <code>sys.io_global_by_wait_by_latency</code> table reference
     */
    public IoGlobalByWaitByLatency(Name alias) {
        this(alias, IO_GLOBAL_BY_WAIT_BY_LATENCY);
    }

    /**
     * Create a <code>sys.io_global_by_wait_by_latency</code> table reference
     */
    public IoGlobalByWaitByLatency() {
        this(DSL.name("io_global_by_wait_by_latency"), null);
    }

    public <O extends Record> IoGlobalByWaitByLatency(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, IO_GLOBAL_BY_WAIT_BY_LATENCY);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public IoGlobalByWaitByLatency as(String alias) {
        return new IoGlobalByWaitByLatency(DSL.name(alias), this);
    }

    @Override
    public IoGlobalByWaitByLatency as(Name alias) {
        return new IoGlobalByWaitByLatency(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public IoGlobalByWaitByLatency rename(String name) {
        return new IoGlobalByWaitByLatency(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IoGlobalByWaitByLatency rename(Name name) {
        return new IoGlobalByWaitByLatency(name, null);
    }
}
