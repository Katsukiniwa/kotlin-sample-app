/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.sys.tables;


import java.math.BigInteger;
import java.time.LocalDateTime;

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
public class StatementsWithRuntimesIn_95thPercentile extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.statements_with_runtimes_in_95th_percentile</code>
     */
    public static final StatementsWithRuntimesIn_95thPercentile STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE = new StatementsWithRuntimesIn_95thPercentile();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>sys.statements_with_runtimes_in_95th_percentile.query</code>.
     */
    public final TableField<Record, String> QUERY = createField(DSL.name("query"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.statements_with_runtimes_in_95th_percentile.db</code>.
     */
    public final TableField<Record, String> DB = createField(DSL.name("db"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.statements_with_runtimes_in_95th_percentile.full_scan</code>.
     */
    public final TableField<Record, String> FULL_SCAN = createField(DSL.name("full_scan"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sys.statements_with_runtimes_in_95th_percentile.exec_count</code>.
     */
    public final TableField<Record, ULong> EXEC_COUNT = createField(DSL.name("exec_count"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.statements_with_runtimes_in_95th_percentile.err_count</code>.
     */
    public final TableField<Record, ULong> ERR_COUNT = createField(DSL.name("err_count"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.statements_with_runtimes_in_95th_percentile.warn_count</code>.
     */
    public final TableField<Record, ULong> WARN_COUNT = createField(DSL.name("warn_count"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.statements_with_runtimes_in_95th_percentile.total_latency</code>.
     */
    public final TableField<Record, String> TOTAL_LATENCY = createField(DSL.name("total_latency"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.statements_with_runtimes_in_95th_percentile.max_latency</code>.
     */
    public final TableField<Record, String> MAX_LATENCY = createField(DSL.name("max_latency"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.statements_with_runtimes_in_95th_percentile.avg_latency</code>.
     */
    public final TableField<Record, String> AVG_LATENCY = createField(DSL.name("avg_latency"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.statements_with_runtimes_in_95th_percentile.rows_sent</code>.
     */
    public final TableField<Record, ULong> ROWS_SENT = createField(DSL.name("rows_sent"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.statements_with_runtimes_in_95th_percentile.rows_sent_avg</code>.
     */
    public final TableField<Record, BigInteger> ROWS_SENT_AVG = createField(DSL.name("rows_sent_avg"), SQLDataType.DECIMAL_INTEGER(21).nullable(false).defaultValue(DSL.inline("0", SQLDataType.DECIMAL_INTEGER)), this, "");

    /**
     * The column <code>sys.statements_with_runtimes_in_95th_percentile.rows_examined</code>.
     */
    public final TableField<Record, ULong> ROWS_EXAMINED = createField(DSL.name("rows_examined"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.statements_with_runtimes_in_95th_percentile.rows_examined_avg</code>.
     */
    public final TableField<Record, BigInteger> ROWS_EXAMINED_AVG = createField(DSL.name("rows_examined_avg"), SQLDataType.DECIMAL_INTEGER(21).nullable(false).defaultValue(DSL.inline("0", SQLDataType.DECIMAL_INTEGER)), this, "");

    /**
     * The column <code>sys.statements_with_runtimes_in_95th_percentile.first_seen</code>.
     */
    public final TableField<Record, LocalDateTime> FIRST_SEEN = createField(DSL.name("first_seen"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.inline("0000-00-00 00:00:00", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>sys.statements_with_runtimes_in_95th_percentile.last_seen</code>.
     */
    public final TableField<Record, LocalDateTime> LAST_SEEN = createField(DSL.name("last_seen"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.inline("0000-00-00 00:00:00", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>sys.statements_with_runtimes_in_95th_percentile.digest</code>.
     */
    public final TableField<Record, String> DIGEST = createField(DSL.name("digest"), SQLDataType.VARCHAR(32), this, "");

    private StatementsWithRuntimesIn_95thPercentile(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private StatementsWithRuntimesIn_95thPercentile(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `statements_with_runtimes_in_95th_percentile` as select `sys`.`format_statement`(`stmts`.`DIGEST_TEXT`) AS `query`,`stmts`.`SCHEMA_NAME` AS `db`,if(((`stmts`.`SUM_NO_GOOD_INDEX_USED` > 0) or (`stmts`.`SUM_NO_INDEX_USED` > 0)),'*','') AS `full_scan`,`stmts`.`COUNT_STAR` AS `exec_count`,`stmts`.`SUM_ERRORS` AS `err_count`,`stmts`.`SUM_WARNINGS` AS `warn_count`,`sys`.`format_time`(`stmts`.`SUM_TIMER_WAIT`) AS `total_latency`,`sys`.`format_time`(`stmts`.`MAX_TIMER_WAIT`) AS `max_latency`,`sys`.`format_time`(`stmts`.`AVG_TIMER_WAIT`) AS `avg_latency`,`stmts`.`SUM_ROWS_SENT` AS `rows_sent`,round(ifnull((`stmts`.`SUM_ROWS_SENT` / nullif(`stmts`.`COUNT_STAR`,0)),0),0) AS `rows_sent_avg`,`stmts`.`SUM_ROWS_EXAMINED` AS `rows_examined`,round(ifnull((`stmts`.`SUM_ROWS_EXAMINED` / nullif(`stmts`.`COUNT_STAR`,0)),0),0) AS `rows_examined_avg`,`stmts`.`FIRST_SEEN` AS `first_seen`,`stmts`.`LAST_SEEN` AS `last_seen`,`stmts`.`DIGEST` AS `digest` from (`performance_schema`.`events_statements_summary_by_digest` `stmts` join `sys`.`x$ps_digest_95th_percentile_by_avg_us` `top_percentile` on((round((`stmts`.`AVG_TIMER_WAIT` / 1000000),0) >= `top_percentile`.`avg_us`))) order by `stmts`.`AVG_TIMER_WAIT` desc"));
    }

    /**
     * Create an aliased <code>sys.statements_with_runtimes_in_95th_percentile</code> table reference
     */
    public StatementsWithRuntimesIn_95thPercentile(String alias) {
        this(DSL.name(alias), STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE);
    }

    /**
     * Create an aliased <code>sys.statements_with_runtimes_in_95th_percentile</code> table reference
     */
    public StatementsWithRuntimesIn_95thPercentile(Name alias) {
        this(alias, STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE);
    }

    /**
     * Create a <code>sys.statements_with_runtimes_in_95th_percentile</code> table reference
     */
    public StatementsWithRuntimesIn_95thPercentile() {
        this(DSL.name("statements_with_runtimes_in_95th_percentile"), null);
    }

    public <O extends Record> StatementsWithRuntimesIn_95thPercentile(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public StatementsWithRuntimesIn_95thPercentile as(String alias) {
        return new StatementsWithRuntimesIn_95thPercentile(DSL.name(alias), this);
    }

    @Override
    public StatementsWithRuntimesIn_95thPercentile as(Name alias) {
        return new StatementsWithRuntimesIn_95thPercentile(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public StatementsWithRuntimesIn_95thPercentile rename(String name) {
        return new StatementsWithRuntimesIn_95thPercentile(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public StatementsWithRuntimesIn_95thPercentile rename(Name name) {
        return new StatementsWithRuntimesIn_95thPercentile(name, null);
    }
}
