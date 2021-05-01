/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.performance_schema.tables


import nu.studer.sample.performance_schema.PerformanceSchema
import nu.studer.sample.performance_schema.enums.EventsStagesHistoryLongNestingEventType

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
open class EventsStagesHistoryLong(
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
         * The reference instance of <code>performance_schema.events_stages_history_long</code>
         */
        val EVENTS_STAGES_HISTORY_LONG = EventsStagesHistoryLong()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>performance_schema.events_stages_history_long.THREAD_ID</code>.
     */
    val THREAD_ID: TableField<Record, ULong?> = createField(DSL.name("THREAD_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_stages_history_long.EVENT_ID</code>.
     */
    val EVENT_ID: TableField<Record, ULong?> = createField(DSL.name("EVENT_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_stages_history_long.END_EVENT_ID</code>.
     */
    val END_EVENT_ID: TableField<Record, ULong?> = createField(DSL.name("END_EVENT_ID"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>performance_schema.events_stages_history_long.EVENT_NAME</code>.
     */
    val EVENT_NAME: TableField<Record, String?> = createField(DSL.name("EVENT_NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_stages_history_long.SOURCE</code>.
     */
    val SOURCE: TableField<Record, String?> = createField(DSL.name("SOURCE"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>performance_schema.events_stages_history_long.TIMER_START</code>.
     */
    val TIMER_START: TableField<Record, ULong?> = createField(DSL.name("TIMER_START"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>performance_schema.events_stages_history_long.TIMER_END</code>.
     */
    val TIMER_END: TableField<Record, ULong?> = createField(DSL.name("TIMER_END"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>performance_schema.events_stages_history_long.TIMER_WAIT</code>.
     */
    val TIMER_WAIT: TableField<Record, ULong?> = createField(DSL.name("TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>performance_schema.events_stages_history_long.WORK_COMPLETED</code>.
     */
    val WORK_COMPLETED: TableField<Record, ULong?> = createField(DSL.name("WORK_COMPLETED"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>performance_schema.events_stages_history_long.WORK_ESTIMATED</code>.
     */
    val WORK_ESTIMATED: TableField<Record, ULong?> = createField(DSL.name("WORK_ESTIMATED"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>performance_schema.events_stages_history_long.NESTING_EVENT_ID</code>.
     */
    val NESTING_EVENT_ID: TableField<Record, ULong?> = createField(DSL.name("NESTING_EVENT_ID"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>performance_schema.events_stages_history_long.NESTING_EVENT_TYPE</code>.
     */
    val NESTING_EVENT_TYPE: TableField<Record, EventsStagesHistoryLongNestingEventType?> = createField(DSL.name("NESTING_EVENT_TYPE"), SQLDataType.VARCHAR(11).asEnumDataType(nu.studer.sample.performance_schema.enums.EventsStagesHistoryLongNestingEventType::class.java), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>performance_schema.events_stages_history_long</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>performance_schema.events_stages_history_long</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>performance_schema.events_stages_history_long</code> table reference
     */
    constructor(): this(DSL.name("events_stages_history_long"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, EVENTS_STAGES_HISTORY_LONG, null)
    override fun getSchema(): Schema = PerformanceSchema.PERFORMANCE_SCHEMA
    override fun `as`(alias: String): EventsStagesHistoryLong = EventsStagesHistoryLong(DSL.name(alias), this)
    override fun `as`(alias: Name): EventsStagesHistoryLong = EventsStagesHistoryLong(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): EventsStagesHistoryLong = EventsStagesHistoryLong(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): EventsStagesHistoryLong = EventsStagesHistoryLong(name, null)
}