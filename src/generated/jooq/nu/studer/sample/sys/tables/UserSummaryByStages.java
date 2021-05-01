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
public class UserSummaryByStages extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.user_summary_by_stages</code>
     */
    public static final UserSummaryByStages USER_SUMMARY_BY_STAGES = new UserSummaryByStages();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>sys.user_summary_by_stages.user</code>.
     */
    public final TableField<Record, String> USER = createField(DSL.name("user"), SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>sys.user_summary_by_stages.event_name</code>.
     */
    public final TableField<Record, String> EVENT_NAME = createField(DSL.name("event_name"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>sys.user_summary_by_stages.total</code>.
     */
    public final TableField<Record, ULong> TOTAL = createField(DSL.name("total"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.user_summary_by_stages.total_latency</code>.
     */
    public final TableField<Record, String> TOTAL_LATENCY = createField(DSL.name("total_latency"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.user_summary_by_stages.avg_latency</code>.
     */
    public final TableField<Record, String> AVG_LATENCY = createField(DSL.name("avg_latency"), SQLDataType.CLOB, this, "");

    private UserSummaryByStages(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private UserSummaryByStages(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `user_summary_by_stages` as select if(isnull(`performance_schema`.`events_stages_summary_by_user_by_event_name`.`USER`),'background',`performance_schema`.`events_stages_summary_by_user_by_event_name`.`USER`) AS `user`,`performance_schema`.`events_stages_summary_by_user_by_event_name`.`EVENT_NAME` AS `event_name`,`performance_schema`.`events_stages_summary_by_user_by_event_name`.`COUNT_STAR` AS `total`,`sys`.`format_time`(`performance_schema`.`events_stages_summary_by_user_by_event_name`.`SUM_TIMER_WAIT`) AS `total_latency`,`sys`.`format_time`(`performance_schema`.`events_stages_summary_by_user_by_event_name`.`AVG_TIMER_WAIT`) AS `avg_latency` from `performance_schema`.`events_stages_summary_by_user_by_event_name` where (`performance_schema`.`events_stages_summary_by_user_by_event_name`.`SUM_TIMER_WAIT` <> 0) order by if(isnull(`performance_schema`.`events_stages_summary_by_user_by_event_name`.`USER`),'background',`performance_schema`.`events_stages_summary_by_user_by_event_name`.`USER`),`performance_schema`.`events_stages_summary_by_user_by_event_name`.`SUM_TIMER_WAIT` desc"));
    }

    /**
     * Create an aliased <code>sys.user_summary_by_stages</code> table reference
     */
    public UserSummaryByStages(String alias) {
        this(DSL.name(alias), USER_SUMMARY_BY_STAGES);
    }

    /**
     * Create an aliased <code>sys.user_summary_by_stages</code> table reference
     */
    public UserSummaryByStages(Name alias) {
        this(alias, USER_SUMMARY_BY_STAGES);
    }

    /**
     * Create a <code>sys.user_summary_by_stages</code> table reference
     */
    public UserSummaryByStages() {
        this(DSL.name("user_summary_by_stages"), null);
    }

    public <O extends Record> UserSummaryByStages(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, USER_SUMMARY_BY_STAGES);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public UserSummaryByStages as(String alias) {
        return new UserSummaryByStages(DSL.name(alias), this);
    }

    @Override
    public UserSummaryByStages as(Name alias) {
        return new UserSummaryByStages(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserSummaryByStages rename(String name) {
        return new UserSummaryByStages(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserSummaryByStages rename(Name name) {
        return new UserSummaryByStages(name, null);
    }
}
