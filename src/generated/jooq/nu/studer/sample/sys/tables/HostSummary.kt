/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.sys.tables


import java.math.BigInteger

import nu.studer.sample.sys.Sys

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * VIEW
 */
@Suppress("UNCHECKED_CAST")
open class HostSummary(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, Record>?,
    aliased: Table<Record>?,
    parameters: Array<Field<*>?>?
): TableImpl<Record>(
    alias,
    Sys.SYS,
    child,
    path,
    aliased,
    parameters,
    DSL.comment("VIEW"),
    TableOptions.view("create view `host_summary` as select if(isnull(`performance_schema`.`accounts`.`HOST`),'background',`performance_schema`.`accounts`.`HOST`) AS `host`,sum(`stmt`.`total`) AS `statements`,`sys`.`format_time`(sum(`stmt`.`total_latency`)) AS `statement_latency`,`sys`.`format_time`(ifnull((sum(`stmt`.`total_latency`) / nullif(sum(`stmt`.`total`),0)),0)) AS `statement_avg_latency`,sum(`stmt`.`full_scans`) AS `table_scans`,sum(`io`.`ios`) AS `file_ios`,`sys`.`format_time`(sum(`io`.`io_latency`)) AS `file_io_latency`,sum(`performance_schema`.`accounts`.`CURRENT_CONNECTIONS`) AS `current_connections`,sum(`performance_schema`.`accounts`.`TOTAL_CONNECTIONS`) AS `total_connections`,count(distinct `performance_schema`.`accounts`.`USER`) AS `unique_users`,`sys`.`format_bytes`(sum(`mem`.`current_allocated`)) AS `current_memory`,`sys`.`format_bytes`(sum(`mem`.`total_allocated`)) AS `total_memory_allocated` from (((`performance_schema`.`accounts` join `sys`.`x\$host_summary_by_statement_latency` `stmt` on((`performance_schema`.`accounts`.`HOST` = `stmt`.`host`))) join `sys`.`x\$host_summary_by_file_io` `io` on((`performance_schema`.`accounts`.`HOST` = `io`.`host`))) join `sys`.`x\$memory_by_host_by_current_bytes` `mem` on((`performance_schema`.`accounts`.`HOST` = `mem`.`host`))) group by if(isnull(`performance_schema`.`accounts`.`HOST`),'background',`performance_schema`.`accounts`.`HOST`)")
) {
    companion object {

        /**
         * The reference instance of <code>sys.host_summary</code>
         */
        val HOST_SUMMARY = HostSummary()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>sys.host_summary.host</code>.
     */
    val HOST: TableField<Record, String?> = createField(DSL.name("host"), SQLDataType.VARCHAR(60), this, "")

    /**
     * The column <code>sys.host_summary.statements</code>.
     */
    val STATEMENTS: TableField<Record, BigInteger?> = createField(DSL.name("statements"), SQLDataType.DECIMAL_INTEGER(64), this, "")

    /**
     * The column <code>sys.host_summary.statement_latency</code>.
     */
    val STATEMENT_LATENCY: TableField<Record, String?> = createField(DSL.name("statement_latency"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>sys.host_summary.statement_avg_latency</code>.
     */
    val STATEMENT_AVG_LATENCY: TableField<Record, String?> = createField(DSL.name("statement_avg_latency"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>sys.host_summary.table_scans</code>.
     */
    val TABLE_SCANS: TableField<Record, BigInteger?> = createField(DSL.name("table_scans"), SQLDataType.DECIMAL_INTEGER(65), this, "")

    /**
     * The column <code>sys.host_summary.file_ios</code>.
     */
    val FILE_IOS: TableField<Record, BigInteger?> = createField(DSL.name("file_ios"), SQLDataType.DECIMAL_INTEGER(64), this, "")

    /**
     * The column <code>sys.host_summary.file_io_latency</code>.
     */
    val FILE_IO_LATENCY: TableField<Record, String?> = createField(DSL.name("file_io_latency"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>sys.host_summary.current_connections</code>.
     */
    val CURRENT_CONNECTIONS: TableField<Record, BigInteger?> = createField(DSL.name("current_connections"), SQLDataType.DECIMAL_INTEGER(41), this, "")

    /**
     * The column <code>sys.host_summary.total_connections</code>.
     */
    val TOTAL_CONNECTIONS: TableField<Record, BigInteger?> = createField(DSL.name("total_connections"), SQLDataType.DECIMAL_INTEGER(41), this, "")

    /**
     * The column <code>sys.host_summary.unique_users</code>.
     */
    val UNIQUE_USERS: TableField<Record, Long?> = createField(DSL.name("unique_users"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "")

    /**
     * The column <code>sys.host_summary.current_memory</code>.
     */
    val CURRENT_MEMORY: TableField<Record, String?> = createField(DSL.name("current_memory"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>sys.host_summary.total_memory_allocated</code>.
     */
    val TOTAL_MEMORY_ALLOCATED: TableField<Record, String?> = createField(DSL.name("total_memory_allocated"), SQLDataType.CLOB, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>sys.host_summary</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sys.host_summary</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sys.host_summary</code> table reference
     */
    constructor(): this(DSL.name("host_summary"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, HOST_SUMMARY, null)
    override fun getSchema(): Schema = Sys.SYS
    override fun `as`(alias: String): HostSummary = HostSummary(DSL.name(alias), this)
    override fun `as`(alias: Name): HostSummary = HostSummary(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): HostSummary = HostSummary(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): HostSummary = HostSummary(name, null)
}