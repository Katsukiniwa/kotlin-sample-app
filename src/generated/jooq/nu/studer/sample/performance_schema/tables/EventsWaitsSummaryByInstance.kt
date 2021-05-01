/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.performance_schema.tables


import nu.studer.sample.performance_schema.PerformanceSchema

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
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class EventsWaitsSummaryByInstance(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, Record>?,
    aliased: Table<Record>?,
    parameters: Array<Field<*>?>?
): TableImpl<Record>(
    alias,
    PerformanceSchema.PERFORMANCE_SCHEMA,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>performance_schema.events_waits_summary_by_instance</code>
         */
        val EVENTS_WAITS_SUMMARY_BY_INSTANCE = EventsWaitsSummaryByInstance()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>performance_schema.events_waits_summary_by_instance.EVENT_NAME</code>.
     */
    val EVENT_NAME: TableField<Record, String?> = createField(DSL.name("EVENT_NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_waits_summary_by_instance.OBJECT_INSTANCE_BEGIN</code>.
     */
    val OBJECT_INSTANCE_BEGIN: TableField<Record, ULong?> = createField(DSL.name("OBJECT_INSTANCE_BEGIN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_waits_summary_by_instance.COUNT_STAR</code>.
     */
    val COUNT_STAR: TableField<Record, ULong?> = createField(DSL.name("COUNT_STAR"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_waits_summary_by_instance.SUM_TIMER_WAIT</code>.
     */
    val SUM_TIMER_WAIT: TableField<Record, ULong?> = createField(DSL.name("SUM_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_waits_summary_by_instance.MIN_TIMER_WAIT</code>.
     */
    val MIN_TIMER_WAIT: TableField<Record, ULong?> = createField(DSL.name("MIN_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_waits_summary_by_instance.AVG_TIMER_WAIT</code>.
     */
    val AVG_TIMER_WAIT: TableField<Record, ULong?> = createField(DSL.name("AVG_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_waits_summary_by_instance.MAX_TIMER_WAIT</code>.
     */
    val MAX_TIMER_WAIT: TableField<Record, ULong?> = createField(DSL.name("MAX_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>performance_schema.events_waits_summary_by_instance</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>performance_schema.events_waits_summary_by_instance</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>performance_schema.events_waits_summary_by_instance</code> table reference
     */
    constructor(): this(DSL.name("events_waits_summary_by_instance"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, EVENTS_WAITS_SUMMARY_BY_INSTANCE, null)
    override fun getSchema(): Schema = PerformanceSchema.PERFORMANCE_SCHEMA
    override fun `as`(alias: String): EventsWaitsSummaryByInstance = EventsWaitsSummaryByInstance(DSL.name(alias), this)
    override fun `as`(alias: Name): EventsWaitsSummaryByInstance = EventsWaitsSummaryByInstance(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): EventsWaitsSummaryByInstance = EventsWaitsSummaryByInstance(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): EventsWaitsSummaryByInstance = EventsWaitsSummaryByInstance(name, null)
}