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
open class `X$waitClassesGlobalByAvgLatency`(
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
    TableOptions.view("create view `x\$wait_classes_global_by_avg_latency` as select substring_index(`performance_schema`.`events_waits_summary_global_by_event_name`.`EVENT_NAME`,'/',3) AS `event_class`,sum(`performance_schema`.`events_waits_summary_global_by_event_name`.`COUNT_STAR`) AS `total`,sum(`performance_schema`.`events_waits_summary_global_by_event_name`.`SUM_TIMER_WAIT`) AS `total_latency`,min(`performance_schema`.`events_waits_summary_global_by_event_name`.`MIN_TIMER_WAIT`) AS `min_latency`,ifnull((sum(`performance_schema`.`events_waits_summary_global_by_event_name`.`SUM_TIMER_WAIT`) / nullif(sum(`performance_schema`.`events_waits_summary_global_by_event_name`.`COUNT_STAR`),0)),0) AS `avg_latency`,max(`performance_schema`.`events_waits_summary_global_by_event_name`.`MAX_TIMER_WAIT`) AS `max_latency` from `performance_schema`.`events_waits_summary_global_by_event_name` where ((`performance_schema`.`events_waits_summary_global_by_event_name`.`SUM_TIMER_WAIT` > 0) and (`performance_schema`.`events_waits_summary_global_by_event_name`.`EVENT_NAME` <> 'idle')) group by `event_class` order by ifnull((sum(`performance_schema`.`events_waits_summary_global_by_event_name`.`SUM_TIMER_WAIT`) / nullif(sum(`performance_schema`.`events_waits_summary_global_by_event_name`.`COUNT_STAR`),0)),0) desc")
) {
    companion object {

        /**
         * The reference instance of <code>sys.x$wait_classes_global_by_avg_latency</code>
         */
        val `X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY` = `X$waitClassesGlobalByAvgLatency`()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>sys.x$wait_classes_global_by_avg_latency.event_class</code>.
     */
    val EVENT_CLASS: TableField<Record, String?> = createField(DSL.name("event_class"), SQLDataType.VARCHAR(128), this, "")

    /**
     * The column <code>sys.x$wait_classes_global_by_avg_latency.total</code>.
     */
    val TOTAL: TableField<Record, BigInteger?> = createField(DSL.name("total"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    /**
     * The column <code>sys.x$wait_classes_global_by_avg_latency.total_latency</code>.
     */
    val TOTAL_LATENCY: TableField<Record, BigInteger?> = createField(DSL.name("total_latency"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    /**
     * The column <code>sys.x$wait_classes_global_by_avg_latency.min_latency</code>.
     */
    val MIN_LATENCY: TableField<Record, ULong?> = createField(DSL.name("min_latency"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>sys.x$wait_classes_global_by_avg_latency.avg_latency</code>.
     */
    val AVG_LATENCY: TableField<Record, BigDecimal?> = createField(DSL.name("avg_latency"), SQLDataType.DECIMAL(46, 4).nullable(false).defaultValue(DSL.inline("0.0000", SQLDataType.DECIMAL)), this, "")

    /**
     * The column <code>sys.x$wait_classes_global_by_avg_latency.max_latency</code>.
     */
    val MAX_LATENCY: TableField<Record, ULong?> = createField(DSL.name("max_latency"), SQLDataType.BIGINTUNSIGNED, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>sys.x$wait_classes_global_by_avg_latency</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sys.x$wait_classes_global_by_avg_latency</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sys.x$wait_classes_global_by_avg_latency</code> table reference
     */
    constructor(): this(DSL.name("x\$wait_classes_global_by_avg_latency"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, `X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY`, null)
    override fun getSchema(): Schema = Sys.SYS
    override fun `as`(alias: String): `X$waitClassesGlobalByAvgLatency` = `X$waitClassesGlobalByAvgLatency`(DSL.name(alias), this)
    override fun `as`(alias: Name): `X$waitClassesGlobalByAvgLatency` = `X$waitClassesGlobalByAvgLatency`(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): `X$waitClassesGlobalByAvgLatency` = `X$waitClassesGlobalByAvgLatency`(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): `X$waitClassesGlobalByAvgLatency` = `X$waitClassesGlobalByAvgLatency`(name, null)
}
