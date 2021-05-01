/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.sys.tables


import java.math.BigDecimal
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
open class `X$ioByThreadByLatency`(
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
    TableOptions.view("create view `x\$io_by_thread_by_latency` as select if(isnull(`performance_schema`.`threads`.`PROCESSLIST_ID`),substring_index(`performance_schema`.`threads`.`NAME`,'/',-(1)),concat(`performance_schema`.`threads`.`PROCESSLIST_USER`,'@',`performance_schema`.`threads`.`PROCESSLIST_HOST`)) AS `user`,sum(`performance_schema`.`events_waits_summary_by_thread_by_event_name`.`COUNT_STAR`) AS `total`,sum(`performance_schema`.`events_waits_summary_by_thread_by_event_name`.`SUM_TIMER_WAIT`) AS `total_latency`,min(`performance_schema`.`events_waits_summary_by_thread_by_event_name`.`MIN_TIMER_WAIT`) AS `min_latency`,avg(`performance_schema`.`events_waits_summary_by_thread_by_event_name`.`AVG_TIMER_WAIT`) AS `avg_latency`,max(`performance_schema`.`events_waits_summary_by_thread_by_event_name`.`MAX_TIMER_WAIT`) AS `max_latency`,`performance_schema`.`events_waits_summary_by_thread_by_event_name`.`THREAD_ID` AS `thread_id`,`performance_schema`.`threads`.`PROCESSLIST_ID` AS `processlist_id` from (`performance_schema`.`events_waits_summary_by_thread_by_event_name` left join `performance_schema`.`threads` on((`performance_schema`.`events_waits_summary_by_thread_by_event_name`.`THREAD_ID` = `performance_schema`.`threads`.`THREAD_ID`))) where ((`performance_schema`.`events_waits_summary_by_thread_by_event_name`.`EVENT_NAME` like 'wait/io/file/%') and (`performance_schema`.`events_waits_summary_by_thread_by_event_name`.`SUM_TIMER_WAIT` > 0)) group by `performance_schema`.`events_waits_summary_by_thread_by_event_name`.`THREAD_ID`,`performance_schema`.`threads`.`PROCESSLIST_ID`,`user` order by sum(`performance_schema`.`events_waits_summary_by_thread_by_event_name`.`SUM_TIMER_WAIT`) desc")
) {
    companion object {

        /**
         * The reference instance of <code>sys.x$io_by_thread_by_latency</code>
         */
        val `X$IO_BY_THREAD_BY_LATENCY` = `X$ioByThreadByLatency`()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>sys.x$io_by_thread_by_latency.user</code>.
     */
    val USER: TableField<Record, String?> = createField(DSL.name("user"), SQLDataType.VARCHAR(128), this, "")

    /**
     * The column <code>sys.x$io_by_thread_by_latency.total</code>.
     */
    val TOTAL: TableField<Record, BigInteger?> = createField(DSL.name("total"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    /**
     * The column <code>sys.x$io_by_thread_by_latency.total_latency</code>.
     */
    val TOTAL_LATENCY: TableField<Record, BigInteger?> = createField(DSL.name("total_latency"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    /**
     * The column <code>sys.x$io_by_thread_by_latency.min_latency</code>.
     */
    val MIN_LATENCY: TableField<Record, ULong?> = createField(DSL.name("min_latency"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>sys.x$io_by_thread_by_latency.avg_latency</code>.
     */
    val AVG_LATENCY: TableField<Record, BigDecimal?> = createField(DSL.name("avg_latency"), SQLDataType.DECIMAL(24, 4), this, "")

    /**
     * The column <code>sys.x$io_by_thread_by_latency.max_latency</code>.
     */
    val MAX_LATENCY: TableField<Record, ULong?> = createField(DSL.name("max_latency"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>sys.x$io_by_thread_by_latency.thread_id</code>.
     */
    val THREAD_ID: TableField<Record, ULong?> = createField(DSL.name("thread_id"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.x$io_by_thread_by_latency.processlist_id</code>.
     */
    val PROCESSLIST_ID: TableField<Record, ULong?> = createField(DSL.name("processlist_id"), SQLDataType.BIGINTUNSIGNED, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>sys.x$io_by_thread_by_latency</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sys.x$io_by_thread_by_latency</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sys.x$io_by_thread_by_latency</code> table reference
     */
    constructor(): this(DSL.name("x\$io_by_thread_by_latency"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, `X$IO_BY_THREAD_BY_LATENCY`, null)
    override fun getSchema(): Schema = Sys.SYS
    override fun `as`(alias: String): `X$ioByThreadByLatency` = `X$ioByThreadByLatency`(DSL.name(alias), this)
    override fun `as`(alias: Name): `X$ioByThreadByLatency` = `X$ioByThreadByLatency`(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): `X$ioByThreadByLatency` = `X$ioByThreadByLatency`(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): `X$ioByThreadByLatency` = `X$ioByThreadByLatency`(name, null)
}