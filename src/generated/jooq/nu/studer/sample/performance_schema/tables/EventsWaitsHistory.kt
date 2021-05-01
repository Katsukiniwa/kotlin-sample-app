/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.performance_schema.tables


import nu.studer.sample.performance_schema.PerformanceSchema
import nu.studer.sample.performance_schema.enums.EventsWaitsHistoryNestingEventType

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
import org.jooq.types.UInteger
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class EventsWaitsHistory(
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
         * The reference instance of <code>performance_schema.events_waits_history</code>
         */
        val EVENTS_WAITS_HISTORY = EventsWaitsHistory()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>performance_schema.events_waits_history.THREAD_ID</code>.
     */
    val THREAD_ID: TableField<Record, ULong?> = createField(DSL.name("THREAD_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_waits_history.EVENT_ID</code>.
     */
    val EVENT_ID: TableField<Record, ULong?> = createField(DSL.name("EVENT_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_waits_history.END_EVENT_ID</code>.
     */
    val END_EVENT_ID: TableField<Record, ULong?> = createField(DSL.name("END_EVENT_ID"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>performance_schema.events_waits_history.EVENT_NAME</code>.
     */
    val EVENT_NAME: TableField<Record, String?> = createField(DSL.name("EVENT_NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_waits_history.SOURCE</code>.
     */
    val SOURCE: TableField<Record, String?> = createField(DSL.name("SOURCE"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>performance_schema.events_waits_history.TIMER_START</code>.
     */
    val TIMER_START: TableField<Record, ULong?> = createField(DSL.name("TIMER_START"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>performance_schema.events_waits_history.TIMER_END</code>.
     */
    val TIMER_END: TableField<Record, ULong?> = createField(DSL.name("TIMER_END"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>performance_schema.events_waits_history.TIMER_WAIT</code>.
     */
    val TIMER_WAIT: TableField<Record, ULong?> = createField(DSL.name("TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>performance_schema.events_waits_history.SPINS</code>.
     */
    val SPINS: TableField<Record, UInteger?> = createField(DSL.name("SPINS"), SQLDataType.INTEGERUNSIGNED, this, "")

    /**
     * The column <code>performance_schema.events_waits_history.OBJECT_SCHEMA</code>.
     */
    val OBJECT_SCHEMA: TableField<Record, String?> = createField(DSL.name("OBJECT_SCHEMA"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>performance_schema.events_waits_history.OBJECT_NAME</code>.
     */
    val OBJECT_NAME: TableField<Record, String?> = createField(DSL.name("OBJECT_NAME"), SQLDataType.VARCHAR(512), this, "")

    /**
     * The column <code>performance_schema.events_waits_history.INDEX_NAME</code>.
     */
    val INDEX_NAME: TableField<Record, String?> = createField(DSL.name("INDEX_NAME"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>performance_schema.events_waits_history.OBJECT_TYPE</code>.
     */
    val OBJECT_TYPE: TableField<Record, String?> = createField(DSL.name("OBJECT_TYPE"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>performance_schema.events_waits_history.OBJECT_INSTANCE_BEGIN</code>.
     */
    val OBJECT_INSTANCE_BEGIN: TableField<Record, ULong?> = createField(DSL.name("OBJECT_INSTANCE_BEGIN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_waits_history.NESTING_EVENT_ID</code>.
     */
    val NESTING_EVENT_ID: TableField<Record, ULong?> = createField(DSL.name("NESTING_EVENT_ID"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>performance_schema.events_waits_history.NESTING_EVENT_TYPE</code>.
     */
    val NESTING_EVENT_TYPE: TableField<Record, EventsWaitsHistoryNestingEventType?> = createField(DSL.name("NESTING_EVENT_TYPE"), SQLDataType.VARCHAR(11).asEnumDataType(nu.studer.sample.performance_schema.enums.EventsWaitsHistoryNestingEventType::class.java), this, "")

    /**
     * The column <code>performance_schema.events_waits_history.OPERATION</code>.
     */
    val OPERATION: TableField<Record, String?> = createField(DSL.name("OPERATION"), SQLDataType.VARCHAR(32).nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_waits_history.NUMBER_OF_BYTES</code>.
     */
    val NUMBER_OF_BYTES: TableField<Record, Long?> = createField(DSL.name("NUMBER_OF_BYTES"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>performance_schema.events_waits_history.FLAGS</code>.
     */
    val FLAGS: TableField<Record, UInteger?> = createField(DSL.name("FLAGS"), SQLDataType.INTEGERUNSIGNED, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>performance_schema.events_waits_history</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>performance_schema.events_waits_history</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>performance_schema.events_waits_history</code> table reference
     */
    constructor(): this(DSL.name("events_waits_history"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, EVENTS_WAITS_HISTORY, null)
    override fun getSchema(): Schema = PerformanceSchema.PERFORMANCE_SCHEMA
    override fun `as`(alias: String): EventsWaitsHistory = EventsWaitsHistory(DSL.name(alias), this)
    override fun `as`(alias: Name): EventsWaitsHistory = EventsWaitsHistory(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): EventsWaitsHistory = EventsWaitsHistory(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): EventsWaitsHistory = EventsWaitsHistory(name, null)
}
