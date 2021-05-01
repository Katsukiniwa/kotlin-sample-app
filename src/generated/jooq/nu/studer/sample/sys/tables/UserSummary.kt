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
open class UserSummary(
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
    TableOptions.view("create view `user_summary` as select if(isnull(`performance_schema`.`accounts`.`USER`),'background',`performance_schema`.`accounts`.`USER`) AS `user`,sum(`stmt`.`total`) AS `statements`,`sys`.`format_time`(sum(`stmt`.`total_latency`)) AS `statement_latency`,`sys`.`format_time`(ifnull((sum(`stmt`.`total_latency`) / nullif(sum(`stmt`.`total`),0)),0)) AS `statement_avg_latency`,sum(`stmt`.`full_scans`) AS `table_scans`,sum(`io`.`ios`) AS `file_ios`,`sys`.`format_time`(sum(`io`.`io_latency`)) AS `file_io_latency`,sum(`performance_schema`.`accounts`.`CURRENT_CONNECTIONS`) AS `current_connections`,sum(`performance_schema`.`accounts`.`TOTAL_CONNECTIONS`) AS `total_connections`,count(distinct `performance_schema`.`accounts`.`HOST`) AS `unique_hosts`,`sys`.`format_bytes`(sum(`mem`.`current_allocated`)) AS `current_memory`,`sys`.`format_bytes`(sum(`mem`.`total_allocated`)) AS `total_memory_allocated` from (((`performance_schema`.`accounts` left join `sys`.`x\$user_summary_by_statement_latency` `stmt` on((if(isnull(`performance_schema`.`accounts`.`USER`),'background',`performance_schema`.`accounts`.`USER`) = `stmt`.`user`))) left join `sys`.`x\$user_summary_by_file_io` `io` on((if(isnull(`performance_schema`.`accounts`.`USER`),'background',`performance_schema`.`accounts`.`USER`) = `io`.`user`))) left join `sys`.`x\$memory_by_user_by_current_bytes` `mem` on((if(isnull(`performance_schema`.`accounts`.`USER`),'background',`performance_schema`.`accounts`.`USER`) = `mem`.`user`))) group by if(isnull(`performance_schema`.`accounts`.`USER`),'background',`performance_schema`.`accounts`.`USER`) order by sum(`stmt`.`total_latency`) desc")
) {
    companion object {

        /**
         * The reference instance of <code>sys.user_summary</code>
         */
        val USER_SUMMARY = UserSummary()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>sys.user_summary.user</code>.
     */
    val USER: TableField<Record, String?> = createField(DSL.name("user"), SQLDataType.VARCHAR(32), this, "")

    /**
     * The column <code>sys.user_summary.statements</code>.
     */
    val STATEMENTS: TableField<Record, BigInteger?> = createField(DSL.name("statements"), SQLDataType.DECIMAL_INTEGER(64), this, "")

    /**
     * The column <code>sys.user_summary.statement_latency</code>.
     */
    val STATEMENT_LATENCY: TableField<Record, String?> = createField(DSL.name("statement_latency"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>sys.user_summary.statement_avg_latency</code>.
     */
    val STATEMENT_AVG_LATENCY: TableField<Record, String?> = createField(DSL.name("statement_avg_latency"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>sys.user_summary.table_scans</code>.
     */
    val TABLE_SCANS: TableField<Record, BigInteger?> = createField(DSL.name("table_scans"), SQLDataType.DECIMAL_INTEGER(65), this, "")

    /**
     * The column <code>sys.user_summary.file_ios</code>.
     */
    val FILE_IOS: TableField<Record, BigInteger?> = createField(DSL.name("file_ios"), SQLDataType.DECIMAL_INTEGER(64), this, "")

    /**
     * The column <code>sys.user_summary.file_io_latency</code>.
     */
    val FILE_IO_LATENCY: TableField<Record, String?> = createField(DSL.name("file_io_latency"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>sys.user_summary.current_connections</code>.
     */
    val CURRENT_CONNECTIONS: TableField<Record, BigInteger?> = createField(DSL.name("current_connections"), SQLDataType.DECIMAL_INTEGER(41), this, "")

    /**
     * The column <code>sys.user_summary.total_connections</code>.
     */
    val TOTAL_CONNECTIONS: TableField<Record, BigInteger?> = createField(DSL.name("total_connections"), SQLDataType.DECIMAL_INTEGER(41), this, "")

    /**
     * The column <code>sys.user_summary.unique_hosts</code>.
     */
    val UNIQUE_HOSTS: TableField<Record, Long?> = createField(DSL.name("unique_hosts"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "")

    /**
     * The column <code>sys.user_summary.current_memory</code>.
     */
    val CURRENT_MEMORY: TableField<Record, String?> = createField(DSL.name("current_memory"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>sys.user_summary.total_memory_allocated</code>.
     */
    val TOTAL_MEMORY_ALLOCATED: TableField<Record, String?> = createField(DSL.name("total_memory_allocated"), SQLDataType.CLOB, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>sys.user_summary</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sys.user_summary</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sys.user_summary</code> table reference
     */
    constructor(): this(DSL.name("user_summary"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, USER_SUMMARY, null)
    override fun getSchema(): Schema = Sys.SYS
    override fun `as`(alias: String): UserSummary = UserSummary(DSL.name(alias), this)
    override fun `as`(alias: Name): UserSummary = UserSummary(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): UserSummary = UserSummary(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): UserSummary = UserSummary(name, null)
}
