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
public class X$userSummaryByStatementType extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.x$user_summary_by_statement_type</code>
     */
    public static final X$userSummaryByStatementType X$USER_SUMMARY_BY_STATEMENT_TYPE = new X$userSummaryByStatementType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>sys.x$user_summary_by_statement_type.user</code>.
     */
    public final TableField<Record, String> USER = createField(DSL.name("user"), SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>sys.x$user_summary_by_statement_type.statement</code>.
     */
    public final TableField<Record, String> STATEMENT = createField(DSL.name("statement"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>sys.x$user_summary_by_statement_type.total</code>.
     */
    public final TableField<Record, ULong> TOTAL = createField(DSL.name("total"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$user_summary_by_statement_type.total_latency</code>.
     */
    public final TableField<Record, ULong> TOTAL_LATENCY = createField(DSL.name("total_latency"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$user_summary_by_statement_type.max_latency</code>.
     */
    public final TableField<Record, ULong> MAX_LATENCY = createField(DSL.name("max_latency"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$user_summary_by_statement_type.lock_latency</code>.
     */
    public final TableField<Record, ULong> LOCK_LATENCY = createField(DSL.name("lock_latency"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$user_summary_by_statement_type.rows_sent</code>.
     */
    public final TableField<Record, ULong> ROWS_SENT = createField(DSL.name("rows_sent"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$user_summary_by_statement_type.rows_examined</code>.
     */
    public final TableField<Record, ULong> ROWS_EXAMINED = createField(DSL.name("rows_examined"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$user_summary_by_statement_type.rows_affected</code>.
     */
    public final TableField<Record, ULong> ROWS_AFFECTED = createField(DSL.name("rows_affected"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$user_summary_by_statement_type.full_scans</code>.
     */
    public final TableField<Record, ULong> FULL_SCANS = createField(DSL.name("full_scans"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    private X$userSummaryByStatementType(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private X$userSummaryByStatementType(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `x$user_summary_by_statement_type` as select if(isnull(`performance_schema`.`events_statements_summary_by_user_by_event_name`.`USER`),'background',`performance_schema`.`events_statements_summary_by_user_by_event_name`.`USER`) AS `user`,substring_index(`performance_schema`.`events_statements_summary_by_user_by_event_name`.`EVENT_NAME`,'/',-(1)) AS `statement`,`performance_schema`.`events_statements_summary_by_user_by_event_name`.`COUNT_STAR` AS `total`,`performance_schema`.`events_statements_summary_by_user_by_event_name`.`SUM_TIMER_WAIT` AS `total_latency`,`performance_schema`.`events_statements_summary_by_user_by_event_name`.`MAX_TIMER_WAIT` AS `max_latency`,`performance_schema`.`events_statements_summary_by_user_by_event_name`.`SUM_LOCK_TIME` AS `lock_latency`,`performance_schema`.`events_statements_summary_by_user_by_event_name`.`SUM_ROWS_SENT` AS `rows_sent`,`performance_schema`.`events_statements_summary_by_user_by_event_name`.`SUM_ROWS_EXAMINED` AS `rows_examined`,`performance_schema`.`events_statements_summary_by_user_by_event_name`.`SUM_ROWS_AFFECTED` AS `rows_affected`,(`performance_schema`.`events_statements_summary_by_user_by_event_name`.`SUM_NO_INDEX_USED` + `performance_schema`.`events_statements_summary_by_user_by_event_name`.`SUM_NO_GOOD_INDEX_USED`) AS `full_scans` from `performance_schema`.`events_statements_summary_by_user_by_event_name` where (`performance_schema`.`events_statements_summary_by_user_by_event_name`.`SUM_TIMER_WAIT` <> 0) order by if(isnull(`performance_schema`.`events_statements_summary_by_user_by_event_name`.`USER`),'background',`performance_schema`.`events_statements_summary_by_user_by_event_name`.`USER`),`performance_schema`.`events_statements_summary_by_user_by_event_name`.`SUM_TIMER_WAIT` desc"));
    }

    /**
     * Create an aliased <code>sys.x$user_summary_by_statement_type</code> table reference
     */
    public X$userSummaryByStatementType(String alias) {
        this(DSL.name(alias), X$USER_SUMMARY_BY_STATEMENT_TYPE);
    }

    /**
     * Create an aliased <code>sys.x$user_summary_by_statement_type</code> table reference
     */
    public X$userSummaryByStatementType(Name alias) {
        this(alias, X$USER_SUMMARY_BY_STATEMENT_TYPE);
    }

    /**
     * Create a <code>sys.x$user_summary_by_statement_type</code> table reference
     */
    public X$userSummaryByStatementType() {
        this(DSL.name("x$user_summary_by_statement_type"), null);
    }

    public <O extends Record> X$userSummaryByStatementType(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, X$USER_SUMMARY_BY_STATEMENT_TYPE);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public X$userSummaryByStatementType as(String alias) {
        return new X$userSummaryByStatementType(DSL.name(alias), this);
    }

    @Override
    public X$userSummaryByStatementType as(Name alias) {
        return new X$userSummaryByStatementType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$userSummaryByStatementType rename(String name) {
        return new X$userSummaryByStatementType(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public X$userSummaryByStatementType rename(Name name) {
        return new X$userSummaryByStatementType(name, null);
    }
}
