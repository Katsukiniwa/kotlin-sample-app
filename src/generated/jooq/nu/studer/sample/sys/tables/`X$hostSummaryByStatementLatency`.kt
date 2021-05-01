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
import org.jooq.types.ULong


/**
 * VIEW
 */
@Suppress("UNCHECKED_CAST")
open class `X$hostSummaryByStatementLatency`(
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
    TableOptions.view("create view `x\$host_summary_by_statement_latency` as select if(isnull(`performance_schema`.`events_statements_summary_by_host_by_event_name`.`HOST`),'background',`performance_schema`.`events_statements_summary_by_host_by_event_name`.`HOST`) AS `host`,sum(`performance_schema`.`events_statements_summary_by_host_by_event_name`.`COUNT_STAR`) AS `total`,sum(`performance_schema`.`events_statements_summary_by_host_by_event_name`.`SUM_TIMER_WAIT`) AS `total_latency`,max(`performance_schema`.`events_statements_summary_by_host_by_event_name`.`MAX_TIMER_WAIT`) AS `max_latency`,sum(`performance_schema`.`events_statements_summary_by_host_by_event_name`.`SUM_LOCK_TIME`) AS `lock_latency`,sum(`performance_schema`.`events_statements_summary_by_host_by_event_name`.`SUM_ROWS_SENT`) AS `rows_sent`,sum(`performance_schema`.`events_statements_summary_by_host_by_event_name`.`SUM_ROWS_EXAMINED`) AS `rows_examined`,sum(`performance_schema`.`events_statements_summary_by_host_by_event_name`.`SUM_ROWS_AFFECTED`) AS `rows_affected`,(sum(`performance_schema`.`events_statements_summary_by_host_by_event_name`.`SUM_NO_INDEX_USED`) + sum(`performance_schema`.`events_statements_summary_by_host_by_event_name`.`SUM_NO_GOOD_INDEX_USED`)) AS `full_scans` from `performance_schema`.`events_statements_summary_by_host_by_event_name` group by if(isnull(`performance_schema`.`events_statements_summary_by_host_by_event_name`.`HOST`),'background',`performance_schema`.`events_statements_summary_by_host_by_event_name`.`HOST`) order by sum(`performance_schema`.`events_statements_summary_by_host_by_event_name`.`SUM_TIMER_WAIT`) desc")
) {
    companion object {

        /**
         * The reference instance of <code>sys.x$host_summary_by_statement_latency</code>
         */
        val `X$HOST_SUMMARY_BY_STATEMENT_LATENCY` = `X$hostSummaryByStatementLatency`()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>sys.x$host_summary_by_statement_latency.host</code>.
     */
    val HOST: TableField<Record, String?> = createField(DSL.name("host"), SQLDataType.VARCHAR(60), this, "")

    /**
     * The column <code>sys.x$host_summary_by_statement_latency.total</code>.
     */
    val TOTAL: TableField<Record, BigInteger?> = createField(DSL.name("total"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    /**
     * The column <code>sys.x$host_summary_by_statement_latency.total_latency</code>.
     */
    val TOTAL_LATENCY: TableField<Record, BigInteger?> = createField(DSL.name("total_latency"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    /**
     * The column <code>sys.x$host_summary_by_statement_latency.max_latency</code>.
     */
    val MAX_LATENCY: TableField<Record, ULong?> = createField(DSL.name("max_latency"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>sys.x$host_summary_by_statement_latency.lock_latency</code>.
     */
    val LOCK_LATENCY: TableField<Record, BigInteger?> = createField(DSL.name("lock_latency"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    /**
     * The column <code>sys.x$host_summary_by_statement_latency.rows_sent</code>.
     */
    val ROWS_SENT: TableField<Record, BigInteger?> = createField(DSL.name("rows_sent"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    /**
     * The column <code>sys.x$host_summary_by_statement_latency.rows_examined</code>.
     */
    val ROWS_EXAMINED: TableField<Record, BigInteger?> = createField(DSL.name("rows_examined"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    /**
     * The column <code>sys.x$host_summary_by_statement_latency.rows_affected</code>.
     */
    val ROWS_AFFECTED: TableField<Record, BigInteger?> = createField(DSL.name("rows_affected"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    /**
     * The column <code>sys.x$host_summary_by_statement_latency.full_scans</code>.
     */
    val FULL_SCANS: TableField<Record, BigInteger?> = createField(DSL.name("full_scans"), SQLDataType.DECIMAL_INTEGER(43), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>sys.x$host_summary_by_statement_latency</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sys.x$host_summary_by_statement_latency</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sys.x$host_summary_by_statement_latency</code> table reference
     */
    constructor(): this(DSL.name("x\$host_summary_by_statement_latency"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, `X$HOST_SUMMARY_BY_STATEMENT_LATENCY`, null)
    override fun getSchema(): Schema = Sys.SYS
    override fun `as`(alias: String): `X$hostSummaryByStatementLatency` = `X$hostSummaryByStatementLatency`(DSL.name(alias), this)
    override fun `as`(alias: Name): `X$hostSummaryByStatementLatency` = `X$hostSummaryByStatementLatency`(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): `X$hostSummaryByStatementLatency` = `X$hostSummaryByStatementLatency`(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): `X$hostSummaryByStatementLatency` = `X$hostSummaryByStatementLatency`(name, null)
}
