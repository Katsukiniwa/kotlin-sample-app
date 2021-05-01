/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.performance_schema.tables


import nu.studer.sample.performance_schema.PerformanceSchema
import nu.studer.sample.performance_schema.enums.EventsStatementsHistoryNestingEventType

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
open class EventsStatementsHistory(
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
         * The reference instance of <code>performance_schema.events_statements_history</code>
         */
        val EVENTS_STATEMENTS_HISTORY = EventsStatementsHistory()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>performance_schema.events_statements_history.THREAD_ID</code>.
     */
    val THREAD_ID: TableField<Record, ULong?> = createField(DSL.name("THREAD_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_statements_history.EVENT_ID</code>.
     */
    val EVENT_ID: TableField<Record, ULong?> = createField(DSL.name("EVENT_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_statements_history.END_EVENT_ID</code>.
     */
    val END_EVENT_ID: TableField<Record, ULong?> = createField(DSL.name("END_EVENT_ID"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>performance_schema.events_statements_history.EVENT_NAME</code>.
     */
    val EVENT_NAME: TableField<Record, String?> = createField(DSL.name("EVENT_NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_statements_history.SOURCE</code>.
     */
    val SOURCE: TableField<Record, String?> = createField(DSL.name("SOURCE"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>performance_schema.events_statements_history.TIMER_START</code>.
     */
    val TIMER_START: TableField<Record, ULong?> = createField(DSL.name("TIMER_START"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>performance_schema.events_statements_history.TIMER_END</code>.
     */
    val TIMER_END: TableField<Record, ULong?> = createField(DSL.name("TIMER_END"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>performance_schema.events_statements_history.TIMER_WAIT</code>.
     */
    val TIMER_WAIT: TableField<Record, ULong?> = createField(DSL.name("TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>performance_schema.events_statements_history.LOCK_TIME</code>.
     */
    val LOCK_TIME: TableField<Record, ULong?> = createField(DSL.name("LOCK_TIME"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_statements_history.SQL_TEXT</code>.
     */
    val SQL_TEXT: TableField<Record, String?> = createField(DSL.name("SQL_TEXT"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>performance_schema.events_statements_history.DIGEST</code>.
     */
    val DIGEST: TableField<Record, String?> = createField(DSL.name("DIGEST"), SQLDataType.VARCHAR(32), this, "")

    /**
     * The column <code>performance_schema.events_statements_history.DIGEST_TEXT</code>.
     */
    val DIGEST_TEXT: TableField<Record, String?> = createField(DSL.name("DIGEST_TEXT"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>performance_schema.events_statements_history.CURRENT_SCHEMA</code>.
     */
    val CURRENT_SCHEMA: TableField<Record, String?> = createField(DSL.name("CURRENT_SCHEMA"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>performance_schema.events_statements_history.OBJECT_TYPE</code>.
     */
    val OBJECT_TYPE: TableField<Record, String?> = createField(DSL.name("OBJECT_TYPE"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>performance_schema.events_statements_history.OBJECT_SCHEMA</code>.
     */
    val OBJECT_SCHEMA: TableField<Record, String?> = createField(DSL.name("OBJECT_SCHEMA"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>performance_schema.events_statements_history.OBJECT_NAME</code>.
     */
    val OBJECT_NAME: TableField<Record, String?> = createField(DSL.name("OBJECT_NAME"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>performance_schema.events_statements_history.OBJECT_INSTANCE_BEGIN</code>.
     */
    val OBJECT_INSTANCE_BEGIN: TableField<Record, ULong?> = createField(DSL.name("OBJECT_INSTANCE_BEGIN"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>performance_schema.events_statements_history.MYSQL_ERRNO</code>.
     */
    val MYSQL_ERRNO: TableField<Record, Int?> = createField(DSL.name("MYSQL_ERRNO"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>performance_schema.events_statements_history.RETURNED_SQLSTATE</code>.
     */
    val RETURNED_SQLSTATE: TableField<Record, String?> = createField(DSL.name("RETURNED_SQLSTATE"), SQLDataType.VARCHAR(5), this, "")

    /**
     * The column <code>performance_schema.events_statements_history.MESSAGE_TEXT</code>.
     */
    val MESSAGE_TEXT: TableField<Record, String?> = createField(DSL.name("MESSAGE_TEXT"), SQLDataType.VARCHAR(128), this, "")

    /**
     * The column <code>performance_schema.events_statements_history.ERRORS</code>.
     */
    val ERRORS: TableField<Record, ULong?> = createField(DSL.name("ERRORS"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_statements_history.WARNINGS</code>.
     */
    val WARNINGS: TableField<Record, ULong?> = createField(DSL.name("WARNINGS"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_statements_history.ROWS_AFFECTED</code>.
     */
    val ROWS_AFFECTED: TableField<Record, ULong?> = createField(DSL.name("ROWS_AFFECTED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_statements_history.ROWS_SENT</code>.
     */
    val ROWS_SENT: TableField<Record, ULong?> = createField(DSL.name("ROWS_SENT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_statements_history.ROWS_EXAMINED</code>.
     */
    val ROWS_EXAMINED: TableField<Record, ULong?> = createField(DSL.name("ROWS_EXAMINED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_statements_history.CREATED_TMP_DISK_TABLES</code>.
     */
    val CREATED_TMP_DISK_TABLES: TableField<Record, ULong?> = createField(DSL.name("CREATED_TMP_DISK_TABLES"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_statements_history.CREATED_TMP_TABLES</code>.
     */
    val CREATED_TMP_TABLES: TableField<Record, ULong?> = createField(DSL.name("CREATED_TMP_TABLES"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_statements_history.SELECT_FULL_JOIN</code>.
     */
    val SELECT_FULL_JOIN: TableField<Record, ULong?> = createField(DSL.name("SELECT_FULL_JOIN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_statements_history.SELECT_FULL_RANGE_JOIN</code>.
     */
    val SELECT_FULL_RANGE_JOIN: TableField<Record, ULong?> = createField(DSL.name("SELECT_FULL_RANGE_JOIN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_statements_history.SELECT_RANGE</code>.
     */
    val SELECT_RANGE: TableField<Record, ULong?> = createField(DSL.name("SELECT_RANGE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_statements_history.SELECT_RANGE_CHECK</code>.
     */
    val SELECT_RANGE_CHECK: TableField<Record, ULong?> = createField(DSL.name("SELECT_RANGE_CHECK"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_statements_history.SELECT_SCAN</code>.
     */
    val SELECT_SCAN: TableField<Record, ULong?> = createField(DSL.name("SELECT_SCAN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_statements_history.SORT_MERGE_PASSES</code>.
     */
    val SORT_MERGE_PASSES: TableField<Record, ULong?> = createField(DSL.name("SORT_MERGE_PASSES"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_statements_history.SORT_RANGE</code>.
     */
    val SORT_RANGE: TableField<Record, ULong?> = createField(DSL.name("SORT_RANGE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_statements_history.SORT_ROWS</code>.
     */
    val SORT_ROWS: TableField<Record, ULong?> = createField(DSL.name("SORT_ROWS"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_statements_history.SORT_SCAN</code>.
     */
    val SORT_SCAN: TableField<Record, ULong?> = createField(DSL.name("SORT_SCAN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_statements_history.NO_INDEX_USED</code>.
     */
    val NO_INDEX_USED: TableField<Record, ULong?> = createField(DSL.name("NO_INDEX_USED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_statements_history.NO_GOOD_INDEX_USED</code>.
     */
    val NO_GOOD_INDEX_USED: TableField<Record, ULong?> = createField(DSL.name("NO_GOOD_INDEX_USED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.events_statements_history.NESTING_EVENT_ID</code>.
     */
    val NESTING_EVENT_ID: TableField<Record, ULong?> = createField(DSL.name("NESTING_EVENT_ID"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>performance_schema.events_statements_history.NESTING_EVENT_TYPE</code>.
     */
    val NESTING_EVENT_TYPE: TableField<Record, EventsStatementsHistoryNestingEventType?> = createField(DSL.name("NESTING_EVENT_TYPE"), SQLDataType.VARCHAR(11).asEnumDataType(nu.studer.sample.performance_schema.enums.EventsStatementsHistoryNestingEventType::class.java), this, "")

    /**
     * The column <code>performance_schema.events_statements_history.NESTING_EVENT_LEVEL</code>.
     */
    val NESTING_EVENT_LEVEL: TableField<Record, Int?> = createField(DSL.name("NESTING_EVENT_LEVEL"), SQLDataType.INTEGER, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>performance_schema.events_statements_history</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>performance_schema.events_statements_history</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>performance_schema.events_statements_history</code> table reference
     */
    constructor(): this(DSL.name("events_statements_history"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, EVENTS_STATEMENTS_HISTORY, null)
    override fun getSchema(): Schema = PerformanceSchema.PERFORMANCE_SCHEMA
    override fun `as`(alias: String): EventsStatementsHistory = EventsStatementsHistory(DSL.name(alias), this)
    override fun `as`(alias: Name): EventsStatementsHistory = EventsStatementsHistory(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): EventsStatementsHistory = EventsStatementsHistory(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): EventsStatementsHistory = EventsStatementsHistory(name, null)
}
