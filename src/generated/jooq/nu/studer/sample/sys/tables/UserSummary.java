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


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserSummary extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.user_summary</code>
     */
    public static final UserSummary USER_SUMMARY = new UserSummary();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>sys.user_summary.user</code>.
     */
    public final TableField<Record, String> USER = createField(DSL.name("user"), SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>sys.user_summary.statements</code>.
     */
    public final TableField<Record, BigInteger> STATEMENTS = createField(DSL.name("statements"), SQLDataType.DECIMAL_INTEGER(64), this, "");

    /**
     * The column <code>sys.user_summary.statement_latency</code>.
     */
    public final TableField<Record, String> STATEMENT_LATENCY = createField(DSL.name("statement_latency"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.user_summary.statement_avg_latency</code>.
     */
    public final TableField<Record, String> STATEMENT_AVG_LATENCY = createField(DSL.name("statement_avg_latency"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.user_summary.table_scans</code>.
     */
    public final TableField<Record, BigInteger> TABLE_SCANS = createField(DSL.name("table_scans"), SQLDataType.DECIMAL_INTEGER(65), this, "");

    /**
     * The column <code>sys.user_summary.file_ios</code>.
     */
    public final TableField<Record, BigInteger> FILE_IOS = createField(DSL.name("file_ios"), SQLDataType.DECIMAL_INTEGER(64), this, "");

    /**
     * The column <code>sys.user_summary.file_io_latency</code>.
     */
    public final TableField<Record, String> FILE_IO_LATENCY = createField(DSL.name("file_io_latency"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.user_summary.current_connections</code>.
     */
    public final TableField<Record, BigInteger> CURRENT_CONNECTIONS = createField(DSL.name("current_connections"), SQLDataType.DECIMAL_INTEGER(41), this, "");

    /**
     * The column <code>sys.user_summary.total_connections</code>.
     */
    public final TableField<Record, BigInteger> TOTAL_CONNECTIONS = createField(DSL.name("total_connections"), SQLDataType.DECIMAL_INTEGER(41), this, "");

    /**
     * The column <code>sys.user_summary.unique_hosts</code>.
     */
    public final TableField<Record, Long> UNIQUE_HOSTS = createField(DSL.name("unique_hosts"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>sys.user_summary.current_memory</code>.
     */
    public final TableField<Record, String> CURRENT_MEMORY = createField(DSL.name("current_memory"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.user_summary.total_memory_allocated</code>.
     */
    public final TableField<Record, String> TOTAL_MEMORY_ALLOCATED = createField(DSL.name("total_memory_allocated"), SQLDataType.CLOB, this, "");

    private UserSummary(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private UserSummary(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `user_summary` as select if(isnull(`performance_schema`.`accounts`.`USER`),'background',`performance_schema`.`accounts`.`USER`) AS `user`,sum(`stmt`.`total`) AS `statements`,`sys`.`format_time`(sum(`stmt`.`total_latency`)) AS `statement_latency`,`sys`.`format_time`(ifnull((sum(`stmt`.`total_latency`) / nullif(sum(`stmt`.`total`),0)),0)) AS `statement_avg_latency`,sum(`stmt`.`full_scans`) AS `table_scans`,sum(`io`.`ios`) AS `file_ios`,`sys`.`format_time`(sum(`io`.`io_latency`)) AS `file_io_latency`,sum(`performance_schema`.`accounts`.`CURRENT_CONNECTIONS`) AS `current_connections`,sum(`performance_schema`.`accounts`.`TOTAL_CONNECTIONS`) AS `total_connections`,count(distinct `performance_schema`.`accounts`.`HOST`) AS `unique_hosts`,`sys`.`format_bytes`(sum(`mem`.`current_allocated`)) AS `current_memory`,`sys`.`format_bytes`(sum(`mem`.`total_allocated`)) AS `total_memory_allocated` from (((`performance_schema`.`accounts` left join `sys`.`x$user_summary_by_statement_latency` `stmt` on((if(isnull(`performance_schema`.`accounts`.`USER`),'background',`performance_schema`.`accounts`.`USER`) = `stmt`.`user`))) left join `sys`.`x$user_summary_by_file_io` `io` on((if(isnull(`performance_schema`.`accounts`.`USER`),'background',`performance_schema`.`accounts`.`USER`) = `io`.`user`))) left join `sys`.`x$memory_by_user_by_current_bytes` `mem` on((if(isnull(`performance_schema`.`accounts`.`USER`),'background',`performance_schema`.`accounts`.`USER`) = `mem`.`user`))) group by if(isnull(`performance_schema`.`accounts`.`USER`),'background',`performance_schema`.`accounts`.`USER`) order by sum(`stmt`.`total_latency`) desc"));
    }

    /**
     * Create an aliased <code>sys.user_summary</code> table reference
     */
    public UserSummary(String alias) {
        this(DSL.name(alias), USER_SUMMARY);
    }

    /**
     * Create an aliased <code>sys.user_summary</code> table reference
     */
    public UserSummary(Name alias) {
        this(alias, USER_SUMMARY);
    }

    /**
     * Create a <code>sys.user_summary</code> table reference
     */
    public UserSummary() {
        this(DSL.name("user_summary"), null);
    }

    public <O extends Record> UserSummary(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, USER_SUMMARY);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public UserSummary as(String alias) {
        return new UserSummary(DSL.name(alias), this);
    }

    @Override
    public UserSummary as(Name alias) {
        return new UserSummary(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserSummary rename(String name) {
        return new UserSummary(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserSummary rename(Name name) {
        return new UserSummary(name, null);
    }
}
