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
public class UserSummaryByFileIoType extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.user_summary_by_file_io_type</code>
     */
    public static final UserSummaryByFileIoType USER_SUMMARY_BY_FILE_IO_TYPE = new UserSummaryByFileIoType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>sys.user_summary_by_file_io_type.user</code>.
     */
    public final TableField<Record, String> USER = createField(DSL.name("user"), SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>sys.user_summary_by_file_io_type.event_name</code>.
     */
    public final TableField<Record, String> EVENT_NAME = createField(DSL.name("event_name"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>sys.user_summary_by_file_io_type.total</code>.
     */
    public final TableField<Record, ULong> TOTAL = createField(DSL.name("total"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.user_summary_by_file_io_type.latency</code>.
     */
    public final TableField<Record, String> LATENCY = createField(DSL.name("latency"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.user_summary_by_file_io_type.max_latency</code>.
     */
    public final TableField<Record, String> MAX_LATENCY = createField(DSL.name("max_latency"), SQLDataType.CLOB, this, "");

    private UserSummaryByFileIoType(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private UserSummaryByFileIoType(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `user_summary_by_file_io_type` as select if(isnull(`performance_schema`.`events_waits_summary_by_user_by_event_name`.`USER`),'background',`performance_schema`.`events_waits_summary_by_user_by_event_name`.`USER`) AS `user`,`performance_schema`.`events_waits_summary_by_user_by_event_name`.`EVENT_NAME` AS `event_name`,`performance_schema`.`events_waits_summary_by_user_by_event_name`.`COUNT_STAR` AS `total`,`sys`.`format_time`(`performance_schema`.`events_waits_summary_by_user_by_event_name`.`SUM_TIMER_WAIT`) AS `latency`,`sys`.`format_time`(`performance_schema`.`events_waits_summary_by_user_by_event_name`.`MAX_TIMER_WAIT`) AS `max_latency` from `performance_schema`.`events_waits_summary_by_user_by_event_name` where ((`performance_schema`.`events_waits_summary_by_user_by_event_name`.`EVENT_NAME` like 'wait/io/file%') and (`performance_schema`.`events_waits_summary_by_user_by_event_name`.`COUNT_STAR` > 0)) order by if(isnull(`performance_schema`.`events_waits_summary_by_user_by_event_name`.`USER`),'background',`performance_schema`.`events_waits_summary_by_user_by_event_name`.`USER`),`performance_schema`.`events_waits_summary_by_user_by_event_name`.`SUM_TIMER_WAIT` desc"));
    }

    /**
     * Create an aliased <code>sys.user_summary_by_file_io_type</code> table reference
     */
    public UserSummaryByFileIoType(String alias) {
        this(DSL.name(alias), USER_SUMMARY_BY_FILE_IO_TYPE);
    }

    /**
     * Create an aliased <code>sys.user_summary_by_file_io_type</code> table reference
     */
    public UserSummaryByFileIoType(Name alias) {
        this(alias, USER_SUMMARY_BY_FILE_IO_TYPE);
    }

    /**
     * Create a <code>sys.user_summary_by_file_io_type</code> table reference
     */
    public UserSummaryByFileIoType() {
        this(DSL.name("user_summary_by_file_io_type"), null);
    }

    public <O extends Record> UserSummaryByFileIoType(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, USER_SUMMARY_BY_FILE_IO_TYPE);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public UserSummaryByFileIoType as(String alias) {
        return new UserSummaryByFileIoType(DSL.name(alias), this);
    }

    @Override
    public UserSummaryByFileIoType as(Name alias) {
        return new UserSummaryByFileIoType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserSummaryByFileIoType rename(String name) {
        return new UserSummaryByFileIoType(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserSummaryByFileIoType rename(Name name) {
        return new UserSummaryByFileIoType(name, null);
    }
}
