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
public class X$hostSummaryByFileIoType extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.x$host_summary_by_file_io_type</code>
     */
    public static final X$hostSummaryByFileIoType X$HOST_SUMMARY_BY_FILE_IO_TYPE = new X$hostSummaryByFileIoType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>sys.x$host_summary_by_file_io_type.host</code>.
     */
    public final TableField<Record, String> HOST = createField(DSL.name("host"), SQLDataType.VARCHAR(60), this, "");

    /**
     * The column <code>sys.x$host_summary_by_file_io_type.event_name</code>.
     */
    public final TableField<Record, String> EVENT_NAME = createField(DSL.name("event_name"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>sys.x$host_summary_by_file_io_type.total</code>.
     */
    public final TableField<Record, ULong> TOTAL = createField(DSL.name("total"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$host_summary_by_file_io_type.total_latency</code>.
     */
    public final TableField<Record, ULong> TOTAL_LATENCY = createField(DSL.name("total_latency"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$host_summary_by_file_io_type.max_latency</code>.
     */
    public final TableField<Record, ULong> MAX_LATENCY = createField(DSL.name("max_latency"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    private X$hostSummaryByFileIoType(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private X$hostSummaryByFileIoType(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `x$host_summary_by_file_io_type` as select if(isnull(`performance_schema`.`events_waits_summary_by_host_by_event_name`.`HOST`),'background',`performance_schema`.`events_waits_summary_by_host_by_event_name`.`HOST`) AS `host`,`performance_schema`.`events_waits_summary_by_host_by_event_name`.`EVENT_NAME` AS `event_name`,`performance_schema`.`events_waits_summary_by_host_by_event_name`.`COUNT_STAR` AS `total`,`performance_schema`.`events_waits_summary_by_host_by_event_name`.`SUM_TIMER_WAIT` AS `total_latency`,`performance_schema`.`events_waits_summary_by_host_by_event_name`.`MAX_TIMER_WAIT` AS `max_latency` from `performance_schema`.`events_waits_summary_by_host_by_event_name` where ((`performance_schema`.`events_waits_summary_by_host_by_event_name`.`EVENT_NAME` like 'wait/io/file%') and (`performance_schema`.`events_waits_summary_by_host_by_event_name`.`COUNT_STAR` > 0)) order by if(isnull(`performance_schema`.`events_waits_summary_by_host_by_event_name`.`HOST`),'background',`performance_schema`.`events_waits_summary_by_host_by_event_name`.`HOST`),`performance_schema`.`events_waits_summary_by_host_by_event_name`.`SUM_TIMER_WAIT` desc"));
    }

    /**
     * Create an aliased <code>sys.x$host_summary_by_file_io_type</code> table reference
     */
    public X$hostSummaryByFileIoType(String alias) {
        this(DSL.name(alias), X$HOST_SUMMARY_BY_FILE_IO_TYPE);
    }

    /**
     * Create an aliased <code>sys.x$host_summary_by_file_io_type</code> table reference
     */
    public X$hostSummaryByFileIoType(Name alias) {
        this(alias, X$HOST_SUMMARY_BY_FILE_IO_TYPE);
    }

    /**
     * Create a <code>sys.x$host_summary_by_file_io_type</code> table reference
     */
    public X$hostSummaryByFileIoType() {
        this(DSL.name("x$host_summary_by_file_io_type"), null);
    }

    public <O extends Record> X$hostSummaryByFileIoType(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, X$HOST_SUMMARY_BY_FILE_IO_TYPE);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public X$hostSummaryByFileIoType as(String alias) {
        return new X$hostSummaryByFileIoType(DSL.name(alias), this);
    }

    @Override
    public X$hostSummaryByFileIoType as(Name alias) {
        return new X$hostSummaryByFileIoType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$hostSummaryByFileIoType rename(String name) {
        return new X$hostSummaryByFileIoType(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public X$hostSummaryByFileIoType rename(Name name) {
        return new X$hostSummaryByFileIoType(name, null);
    }
}