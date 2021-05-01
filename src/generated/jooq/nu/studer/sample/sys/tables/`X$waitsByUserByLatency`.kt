/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.sys.tables


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
open class `X$waitsByUserByLatency`(
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
    TableOptions.view("create view `x\$waits_by_user_by_latency` as select if(isnull(`performance_schema`.`events_waits_summary_by_user_by_event_name`.`USER`),'background',`performance_schema`.`events_waits_summary_by_user_by_event_name`.`USER`) AS `user`,`performance_schema`.`events_waits_summary_by_user_by_event_name`.`EVENT_NAME` AS `event`,`performance_schema`.`events_waits_summary_by_user_by_event_name`.`COUNT_STAR` AS `total`,`performance_schema`.`events_waits_summary_by_user_by_event_name`.`SUM_TIMER_WAIT` AS `total_latency`,`performance_schema`.`events_waits_summary_by_user_by_event_name`.`AVG_TIMER_WAIT` AS `avg_latency`,`performance_schema`.`events_waits_summary_by_user_by_event_name`.`MAX_TIMER_WAIT` AS `max_latency` from `performance_schema`.`events_waits_summary_by_user_by_event_name` where ((`performance_schema`.`events_waits_summary_by_user_by_event_name`.`EVENT_NAME` <> 'idle') and (`performance_schema`.`events_waits_summary_by_user_by_event_name`.`USER` is not null) and (`performance_schema`.`events_waits_summary_by_user_by_event_name`.`SUM_TIMER_WAIT` > 0)) order by if(isnull(`performance_schema`.`events_waits_summary_by_user_by_event_name`.`USER`),'background',`performance_schema`.`events_waits_summary_by_user_by_event_name`.`USER`),`performance_schema`.`events_waits_summary_by_user_by_event_name`.`SUM_TIMER_WAIT` desc")
) {
    companion object {

        /**
         * The reference instance of <code>sys.x$waits_by_user_by_latency</code>
         */
        val `X$WAITS_BY_USER_BY_LATENCY` = `X$waitsByUserByLatency`()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>sys.x$waits_by_user_by_latency.user</code>.
     */
    val USER: TableField<Record, String?> = createField(DSL.name("user"), SQLDataType.VARCHAR(32), this, "")

    /**
     * The column <code>sys.x$waits_by_user_by_latency.event</code>.
     */
    val EVENT: TableField<Record, String?> = createField(DSL.name("event"), SQLDataType.VARCHAR(128).nullable(false), this, "")

    /**
     * The column <code>sys.x$waits_by_user_by_latency.total</code>.
     */
    val TOTAL: TableField<Record, ULong?> = createField(DSL.name("total"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.x$waits_by_user_by_latency.total_latency</code>.
     */
    val TOTAL_LATENCY: TableField<Record, ULong?> = createField(DSL.name("total_latency"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.x$waits_by_user_by_latency.avg_latency</code>.
     */
    val AVG_LATENCY: TableField<Record, ULong?> = createField(DSL.name("avg_latency"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.x$waits_by_user_by_latency.max_latency</code>.
     */
    val MAX_LATENCY: TableField<Record, ULong?> = createField(DSL.name("max_latency"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>sys.x$waits_by_user_by_latency</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sys.x$waits_by_user_by_latency</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sys.x$waits_by_user_by_latency</code> table reference
     */
    constructor(): this(DSL.name("x\$waits_by_user_by_latency"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, `X$WAITS_BY_USER_BY_LATENCY`, null)
    override fun getSchema(): Schema = Sys.SYS
    override fun `as`(alias: String): `X$waitsByUserByLatency` = `X$waitsByUserByLatency`(DSL.name(alias), this)
    override fun `as`(alias: Name): `X$waitsByUserByLatency` = `X$waitsByUserByLatency`(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): `X$waitsByUserByLatency` = `X$waitsByUserByLatency`(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): `X$waitsByUserByLatency` = `X$waitsByUserByLatency`(name, null)
}
