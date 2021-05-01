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


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class X$userSummary extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.x$user_summary</code>
     */
    public static final X$userSummary X$USER_SUMMARY = new X$userSummary();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>sys.x$user_summary.user</code>.
     */
    public final TableField<Record, String> USER = createField(DSL.name("user"), SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>sys.x$user_summary.statements</code>.
     */
    public final TableField<Record, BigInteger> STATEMENTS = createField(DSL.name("statements"), SQLDataType.DECIMAL_INTEGER(64), this, "");

    /**
     * The column <code>sys.x$user_summary.statement_latency</code>.
     */
    public final TableField<Record, BigInteger> STATEMENT_LATENCY = createField(DSL.name("statement_latency"), SQLDataType.DECIMAL_INTEGER(64), this, "");

    /**
     * The column <code>sys.x$user_summary.statement_avg_latency</code>.
     */
    public final TableField<Record, BigDecimal> STATEMENT_AVG_LATENCY = createField(DSL.name("statement_avg_latency"), SQLDataType.DECIMAL(65, 4).nullable(false).defaultValue(DSL.inline("0.0000", SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>sys.x$user_summary.table_scans</code>.
     */
    public final TableField<Record, BigInteger> TABLE_SCANS = createField(DSL.name("table_scans"), SQLDataType.DECIMAL_INTEGER(65), this, "");

    /**
     * The column <code>sys.x$user_summary.file_ios</code>.
     */
    public final TableField<Record, BigInteger> FILE_IOS = createField(DSL.name("file_ios"), SQLDataType.DECIMAL_INTEGER(64), this, "");

    /**
     * The column <code>sys.x$user_summary.file_io_latency</code>.
     */
    public final TableField<Record, BigInteger> FILE_IO_LATENCY = createField(DSL.name("file_io_latency"), SQLDataType.DECIMAL_INTEGER(64), this, "");

    /**
     * The column <code>sys.x$user_summary.current_connections</code>.
     */
    public final TableField<Record, BigInteger> CURRENT_CONNECTIONS = createField(DSL.name("current_connections"), SQLDataType.DECIMAL_INTEGER(41), this, "");

    /**
     * The column <code>sys.x$user_summary.total_connections</code>.
     */
    public final TableField<Record, BigInteger> TOTAL_CONNECTIONS = createField(DSL.name("total_connections"), SQLDataType.DECIMAL_INTEGER(41), this, "");

    /**
     * The column <code>sys.x$user_summary.unique_hosts</code>.
     */
    public final TableField<Record, Long> UNIQUE_HOSTS = createField(DSL.name("unique_hosts"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>sys.x$user_summary.current_memory</code>.
     */
    public final TableField<Record, BigInteger> CURRENT_MEMORY = createField(DSL.name("current_memory"), SQLDataType.DECIMAL_INTEGER(63), this, "");

    /**
     * The column <code>sys.x$user_summary.total_memory_allocated</code>.
     */
    public final TableField<Record, BigInteger> TOTAL_MEMORY_ALLOCATED = createField(DSL.name("total_memory_allocated"), SQLDataType.DECIMAL_INTEGER(64), this, "");

    private X$userSummary(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private X$userSummary(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `x$user_summary` as select if(isnull(`performance_schema`.`accounts`.`USER`),'background',`performance_schema`.`accounts`.`USER`) AS `user`,sum(`stmt`.`total`) AS `statements`,sum(`stmt`.`total_latency`) AS `statement_latency`,ifnull((sum(`stmt`.`total_latency`) / nullif(sum(`stmt`.`total`),0)),0) AS `statement_avg_latency`,sum(`stmt`.`full_scans`) AS `table_scans`,sum(`io`.`ios`) AS `file_ios`,sum(`io`.`io_latency`) AS `file_io_latency`,sum(`performance_schema`.`accounts`.`CURRENT_CONNECTIONS`) AS `current_connections`,sum(`performance_schema`.`accounts`.`TOTAL_CONNECTIONS`) AS `total_connections`,count(distinct `performance_schema`.`accounts`.`HOST`) AS `unique_hosts`,sum(`mem`.`current_allocated`) AS `current_memory`,sum(`mem`.`total_allocated`) AS `total_memory_allocated` from (((`performance_schema`.`accounts` left join `sys`.`x$user_summary_by_statement_latency` `stmt` on((if(isnull(`performance_schema`.`accounts`.`USER`),'background',`performance_schema`.`accounts`.`USER`) = `stmt`.`user`))) left join `sys`.`x$user_summary_by_file_io` `io` on((if(isnull(`performance_schema`.`accounts`.`USER`),'background',`performance_schema`.`accounts`.`USER`) = `io`.`user`))) left join `sys`.`x$memory_by_user_by_current_bytes` `mem` on((if(isnull(`performance_schema`.`accounts`.`USER`),'background',`performance_schema`.`accounts`.`USER`) = `mem`.`user`))) group by if(isnull(`performance_schema`.`accounts`.`USER`),'background',`performance_schema`.`accounts`.`USER`) order by sum(`stmt`.`total_latency`) desc"));
    }

    /**
     * Create an aliased <code>sys.x$user_summary</code> table reference
     */
    public X$userSummary(String alias) {
        this(DSL.name(alias), X$USER_SUMMARY);
    }

    /**
     * Create an aliased <code>sys.x$user_summary</code> table reference
     */
    public X$userSummary(Name alias) {
        this(alias, X$USER_SUMMARY);
    }

    /**
     * Create a <code>sys.x$user_summary</code> table reference
     */
    public X$userSummary() {
        this(DSL.name("x$user_summary"), null);
    }

    public <O extends Record> X$userSummary(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, X$USER_SUMMARY);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public X$userSummary as(String alias) {
        return new X$userSummary(DSL.name(alias), this);
    }

    @Override
    public X$userSummary as(Name alias) {
        return new X$userSummary(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$userSummary rename(String name) {
        return new X$userSummary(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public X$userSummary rename(Name name) {
        return new X$userSummary(name, null);
    }
}