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
public class IoGlobalByWaitByBytes extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.io_global_by_wait_by_bytes</code>
     */
    public static final IoGlobalByWaitByBytes IO_GLOBAL_BY_WAIT_BY_BYTES = new IoGlobalByWaitByBytes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.event_name</code>.
     */
    public final TableField<Record, String> EVENT_NAME = createField(DSL.name("event_name"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.total</code>.
     */
    public final TableField<Record, ULong> TOTAL = createField(DSL.name("total"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.total_latency</code>.
     */
    public final TableField<Record, String> TOTAL_LATENCY = createField(DSL.name("total_latency"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.min_latency</code>.
     */
    public final TableField<Record, String> MIN_LATENCY = createField(DSL.name("min_latency"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.avg_latency</code>.
     */
    public final TableField<Record, String> AVG_LATENCY = createField(DSL.name("avg_latency"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.max_latency</code>.
     */
    public final TableField<Record, String> MAX_LATENCY = createField(DSL.name("max_latency"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.count_read</code>.
     */
    public final TableField<Record, ULong> COUNT_READ = createField(DSL.name("count_read"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.total_read</code>.
     */
    public final TableField<Record, String> TOTAL_READ = createField(DSL.name("total_read"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.avg_read</code>.
     */
    public final TableField<Record, String> AVG_READ = createField(DSL.name("avg_read"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.count_write</code>.
     */
    public final TableField<Record, ULong> COUNT_WRITE = createField(DSL.name("count_write"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.total_written</code>.
     */
    public final TableField<Record, String> TOTAL_WRITTEN = createField(DSL.name("total_written"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.avg_written</code>.
     */
    public final TableField<Record, String> AVG_WRITTEN = createField(DSL.name("avg_written"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.total_requested</code>.
     */
    public final TableField<Record, String> TOTAL_REQUESTED = createField(DSL.name("total_requested"), SQLDataType.CLOB, this, "");

    private IoGlobalByWaitByBytes(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private IoGlobalByWaitByBytes(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `io_global_by_wait_by_bytes` as select substring_index(`performance_schema`.`file_summary_by_event_name`.`EVENT_NAME`,'/',-(2)) AS `event_name`,`performance_schema`.`file_summary_by_event_name`.`COUNT_STAR` AS `total`,`sys`.`format_time`(`performance_schema`.`file_summary_by_event_name`.`SUM_TIMER_WAIT`) AS `total_latency`,`sys`.`format_time`(`performance_schema`.`file_summary_by_event_name`.`MIN_TIMER_WAIT`) AS `min_latency`,`sys`.`format_time`(`performance_schema`.`file_summary_by_event_name`.`AVG_TIMER_WAIT`) AS `avg_latency`,`sys`.`format_time`(`performance_schema`.`file_summary_by_event_name`.`MAX_TIMER_WAIT`) AS `max_latency`,`performance_schema`.`file_summary_by_event_name`.`COUNT_READ` AS `count_read`,`sys`.`format_bytes`(`performance_schema`.`file_summary_by_event_name`.`SUM_NUMBER_OF_BYTES_READ`) AS `total_read`,`sys`.`format_bytes`(ifnull((`performance_schema`.`file_summary_by_event_name`.`SUM_NUMBER_OF_BYTES_READ` / nullif(`performance_schema`.`file_summary_by_event_name`.`COUNT_READ`,0)),0)) AS `avg_read`,`performance_schema`.`file_summary_by_event_name`.`COUNT_WRITE` AS `count_write`,`sys`.`format_bytes`(`performance_schema`.`file_summary_by_event_name`.`SUM_NUMBER_OF_BYTES_WRITE`) AS `total_written`,`sys`.`format_bytes`(ifnull((`performance_schema`.`file_summary_by_event_name`.`SUM_NUMBER_OF_BYTES_WRITE` / nullif(`performance_schema`.`file_summary_by_event_name`.`COUNT_WRITE`,0)),0)) AS `avg_written`,`sys`.`format_bytes`((`performance_schema`.`file_summary_by_event_name`.`SUM_NUMBER_OF_BYTES_WRITE` + `performance_schema`.`file_summary_by_event_name`.`SUM_NUMBER_OF_BYTES_READ`)) AS `total_requested` from `performance_schema`.`file_summary_by_event_name` where ((`performance_schema`.`file_summary_by_event_name`.`EVENT_NAME` like 'wait/io/file/%') and (`performance_schema`.`file_summary_by_event_name`.`COUNT_STAR` > 0)) order by (`performance_schema`.`file_summary_by_event_name`.`SUM_NUMBER_OF_BYTES_WRITE` + `performance_schema`.`file_summary_by_event_name`.`SUM_NUMBER_OF_BYTES_READ`) desc"));
    }

    /**
     * Create an aliased <code>sys.io_global_by_wait_by_bytes</code> table reference
     */
    public IoGlobalByWaitByBytes(String alias) {
        this(DSL.name(alias), IO_GLOBAL_BY_WAIT_BY_BYTES);
    }

    /**
     * Create an aliased <code>sys.io_global_by_wait_by_bytes</code> table reference
     */
    public IoGlobalByWaitByBytes(Name alias) {
        this(alias, IO_GLOBAL_BY_WAIT_BY_BYTES);
    }

    /**
     * Create a <code>sys.io_global_by_wait_by_bytes</code> table reference
     */
    public IoGlobalByWaitByBytes() {
        this(DSL.name("io_global_by_wait_by_bytes"), null);
    }

    public <O extends Record> IoGlobalByWaitByBytes(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, IO_GLOBAL_BY_WAIT_BY_BYTES);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public IoGlobalByWaitByBytes as(String alias) {
        return new IoGlobalByWaitByBytes(DSL.name(alias), this);
    }

    @Override
    public IoGlobalByWaitByBytes as(Name alias) {
        return new IoGlobalByWaitByBytes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public IoGlobalByWaitByBytes rename(String name) {
        return new IoGlobalByWaitByBytes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IoGlobalByWaitByBytes rename(Name name) {
        return new IoGlobalByWaitByBytes(name, null);
    }
}
