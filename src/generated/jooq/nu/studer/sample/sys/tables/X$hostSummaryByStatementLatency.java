/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.sys.tables;


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
public class X$hostSummaryByStatementLatency extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.x$host_summary_by_statement_latency</code>
     */
    public static final X$hostSummaryByStatementLatency X$HOST_SUMMARY_BY_STATEMENT_LATENCY = new X$hostSummaryByStatementLatency();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>sys.x$host_summary_by_statement_latency.host</code>.
     */
    public final TableField<Record, String> HOST = createField(DSL.name("host"), SQLDataType.VARCHAR(60), this, "");

    /**
     * The column <code>sys.x$host_summary_by_statement_latency.total</code>.
     */
    public final TableField<Record, BigInteger> TOTAL = createField(DSL.name("total"), SQLDataType.DECIMAL_INTEGER(42), this, "");

    /**
     * The column <code>sys.x$host_summary_by_statement_latency.total_latency</code>.
     */
    public final TableField<Record, BigInteger> TOTAL_LATENCY = createField(DSL.name("total_latency"), SQLDataType.DECIMAL_INTEGER(42), this, "");

    /**
     * The column <code>sys.x$host_summary_by_statement_latency.max_latency</code>.
     */
    public final TableField<Record, ULong> MAX_LATENCY = createField(DSL.name("max_latency"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.x$host_summary_by_statement_latency.lock_latency</code>.
     */
    public final TableField<Record, BigInteger> LOCK_LATENCY = createField(DSL.name("lock_latency"), SQLDataType.DECIMAL_INTEGER(42), this, "");

    /**
     * The column <code>sys.x$host_summary_by_statement_latency.rows_sent</code>.
     */
    public final TableField<Record, BigInteger> ROWS_SENT = createField(DSL.name("rows_sent"), SQLDataType.DECIMAL_INTEGER(42), this, "");

    /**
     * The column <code>sys.x$host_summary_by_statement_latency.rows_examined</code>.
     */
    public final TableField<Record, BigInteger> ROWS_EXAMINED = createField(DSL.name("rows_examined"), SQLDataType.DECIMAL_INTEGER(42), this, "");

    /**
     * The column <code>sys.x$host_summary_by_statement_latency.rows_affected</code>.
     */
    public final TableField<Record, BigInteger> ROWS_AFFECTED = createField(DSL.name("rows_affected"), SQLDataType.DECIMAL_INTEGER(42), this, "");

    /**
     * The column <code>sys.x$host_summary_by_statement_latency.full_scans</code>.
     */
    public final TableField<Record, BigInteger> FULL_SCANS = createField(DSL.name("full_scans"), SQLDataType.DECIMAL_INTEGER(43), this, "");

    private X$hostSummaryByStatementLatency(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private X$hostSummaryByStatementLatency(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `x$host_summary_by_statement_latency` as select if(isnull(`performance_schema`.`events_statements_summary_by_host_by_event_name`.`HOST`),'background',`performance_schema`.`events_statements_summary_by_host_by_event_name`.`HOST`) AS `host`,sum(`performance_schema`.`events_statements_summary_by_host_by_event_name`.`COUNT_STAR`) AS `total`,sum(`performance_schema`.`events_statements_summary_by_host_by_event_name`.`SUM_TIMER_WAIT`) AS `total_latency`,max(`performance_schema`.`events_statements_summary_by_host_by_event_name`.`MAX_TIMER_WAIT`) AS `max_latency`,sum(`performance_schema`.`events_statements_summary_by_host_by_event_name`.`SUM_LOCK_TIME`) AS `lock_latency`,sum(`performance_schema`.`events_statements_summary_by_host_by_event_name`.`SUM_ROWS_SENT`) AS `rows_sent`,sum(`performance_schema`.`events_statements_summary_by_host_by_event_name`.`SUM_ROWS_EXAMINED`) AS `rows_examined`,sum(`performance_schema`.`events_statements_summary_by_host_by_event_name`.`SUM_ROWS_AFFECTED`) AS `rows_affected`,(sum(`performance_schema`.`events_statements_summary_by_host_by_event_name`.`SUM_NO_INDEX_USED`) + sum(`performance_schema`.`events_statements_summary_by_host_by_event_name`.`SUM_NO_GOOD_INDEX_USED`)) AS `full_scans` from `performance_schema`.`events_statements_summary_by_host_by_event_name` group by if(isnull(`performance_schema`.`events_statements_summary_by_host_by_event_name`.`HOST`),'background',`performance_schema`.`events_statements_summary_by_host_by_event_name`.`HOST`) order by sum(`performance_schema`.`events_statements_summary_by_host_by_event_name`.`SUM_TIMER_WAIT`) desc"));
    }

    /**
     * Create an aliased <code>sys.x$host_summary_by_statement_latency</code> table reference
     */
    public X$hostSummaryByStatementLatency(String alias) {
        this(DSL.name(alias), X$HOST_SUMMARY_BY_STATEMENT_LATENCY);
    }

    /**
     * Create an aliased <code>sys.x$host_summary_by_statement_latency</code> table reference
     */
    public X$hostSummaryByStatementLatency(Name alias) {
        this(alias, X$HOST_SUMMARY_BY_STATEMENT_LATENCY);
    }

    /**
     * Create a <code>sys.x$host_summary_by_statement_latency</code> table reference
     */
    public X$hostSummaryByStatementLatency() {
        this(DSL.name("x$host_summary_by_statement_latency"), null);
    }

    public <O extends Record> X$hostSummaryByStatementLatency(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, X$HOST_SUMMARY_BY_STATEMENT_LATENCY);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public X$hostSummaryByStatementLatency as(String alias) {
        return new X$hostSummaryByStatementLatency(DSL.name(alias), this);
    }

    @Override
    public X$hostSummaryByStatementLatency as(Name alias) {
        return new X$hostSummaryByStatementLatency(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$hostSummaryByStatementLatency rename(String name) {
        return new X$hostSummaryByStatementLatency(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public X$hostSummaryByStatementLatency rename(Name name) {
        return new X$hostSummaryByStatementLatency(name, null);
    }
}
