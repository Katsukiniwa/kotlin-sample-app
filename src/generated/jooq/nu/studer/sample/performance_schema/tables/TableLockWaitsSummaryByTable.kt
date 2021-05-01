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
open class TableLockWaitsSummaryByTable(
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
         * The reference instance of <code>performance_schema.table_lock_waits_summary_by_table</code>
         */
        val TABLE_LOCK_WAITS_SUMMARY_BY_TABLE = TableLockWaitsSummaryByTable()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.OBJECT_TYPE</code>.
     */
    val OBJECT_TYPE: TableField<Record, String?> = createField(DSL.name("OBJECT_TYPE"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.OBJECT_SCHEMA</code>.
     */
    val OBJECT_SCHEMA: TableField<Record, String?> = createField(DSL.name("OBJECT_SCHEMA"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.OBJECT_NAME</code>.
     */
    val OBJECT_NAME: TableField<Record, String?> = createField(DSL.name("OBJECT_NAME"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.COUNT_STAR</code>.
     */
    val COUNT_STAR: TableField<Record, ULong?> = createField(DSL.name("COUNT_STAR"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WAIT</code>.
     */
    val SUM_TIMER_WAIT: TableField<Record, ULong?> = createField(DSL.name("SUM_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WAIT</code>.
     */
    val MIN_TIMER_WAIT: TableField<Record, ULong?> = createField(DSL.name("MIN_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WAIT</code>.
     */
    val AVG_TIMER_WAIT: TableField<Record, ULong?> = createField(DSL.name("AVG_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WAIT</code>.
     */
    val MAX_TIMER_WAIT: TableField<Record, ULong?> = createField(DSL.name("MAX_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.COUNT_READ</code>.
     */
    val COUNT_READ: TableField<Record, ULong?> = createField(DSL.name("COUNT_READ"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_READ</code>.
     */
    val SUM_TIMER_READ: TableField<Record, ULong?> = createField(DSL.name("SUM_TIMER_READ"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_READ</code>.
     */
    val MIN_TIMER_READ: TableField<Record, ULong?> = createField(DSL.name("MIN_TIMER_READ"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_READ</code>.
     */
    val AVG_TIMER_READ: TableField<Record, ULong?> = createField(DSL.name("AVG_TIMER_READ"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_READ</code>.
     */
    val MAX_TIMER_READ: TableField<Record, ULong?> = createField(DSL.name("MAX_TIMER_READ"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.COUNT_WRITE</code>.
     */
    val COUNT_WRITE: TableField<Record, ULong?> = createField(DSL.name("COUNT_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WRITE</code>.
     */
    val SUM_TIMER_WRITE: TableField<Record, ULong?> = createField(DSL.name("SUM_TIMER_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WRITE</code>.
     */
    val MIN_TIMER_WRITE: TableField<Record, ULong?> = createField(DSL.name("MIN_TIMER_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WRITE</code>.
     */
    val AVG_TIMER_WRITE: TableField<Record, ULong?> = createField(DSL.name("AVG_TIMER_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WRITE</code>.
     */
    val MAX_TIMER_WRITE: TableField<Record, ULong?> = createField(DSL.name("MAX_TIMER_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.COUNT_READ_NORMAL</code>.
     */
    val COUNT_READ_NORMAL: TableField<Record, ULong?> = createField(DSL.name("COUNT_READ_NORMAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_READ_NORMAL</code>.
     */
    val SUM_TIMER_READ_NORMAL: TableField<Record, ULong?> = createField(DSL.name("SUM_TIMER_READ_NORMAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_READ_NORMAL</code>.
     */
    val MIN_TIMER_READ_NORMAL: TableField<Record, ULong?> = createField(DSL.name("MIN_TIMER_READ_NORMAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_READ_NORMAL</code>.
     */
    val AVG_TIMER_READ_NORMAL: TableField<Record, ULong?> = createField(DSL.name("AVG_TIMER_READ_NORMAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_READ_NORMAL</code>.
     */
    val MAX_TIMER_READ_NORMAL: TableField<Record, ULong?> = createField(DSL.name("MAX_TIMER_READ_NORMAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.COUNT_READ_WITH_SHARED_LOCKS</code>.
     */
    val COUNT_READ_WITH_SHARED_LOCKS: TableField<Record, ULong?> = createField(DSL.name("COUNT_READ_WITH_SHARED_LOCKS"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_READ_WITH_SHARED_LOCKS</code>.
     */
    val SUM_TIMER_READ_WITH_SHARED_LOCKS: TableField<Record, ULong?> = createField(DSL.name("SUM_TIMER_READ_WITH_SHARED_LOCKS"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_READ_WITH_SHARED_LOCKS</code>.
     */
    val MIN_TIMER_READ_WITH_SHARED_LOCKS: TableField<Record, ULong?> = createField(DSL.name("MIN_TIMER_READ_WITH_SHARED_LOCKS"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_READ_WITH_SHARED_LOCKS</code>.
     */
    val AVG_TIMER_READ_WITH_SHARED_LOCKS: TableField<Record, ULong?> = createField(DSL.name("AVG_TIMER_READ_WITH_SHARED_LOCKS"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_READ_WITH_SHARED_LOCKS</code>.
     */
    val MAX_TIMER_READ_WITH_SHARED_LOCKS: TableField<Record, ULong?> = createField(DSL.name("MAX_TIMER_READ_WITH_SHARED_LOCKS"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.COUNT_READ_HIGH_PRIORITY</code>.
     */
    val COUNT_READ_HIGH_PRIORITY: TableField<Record, ULong?> = createField(DSL.name("COUNT_READ_HIGH_PRIORITY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_READ_HIGH_PRIORITY</code>.
     */
    val SUM_TIMER_READ_HIGH_PRIORITY: TableField<Record, ULong?> = createField(DSL.name("SUM_TIMER_READ_HIGH_PRIORITY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_READ_HIGH_PRIORITY</code>.
     */
    val MIN_TIMER_READ_HIGH_PRIORITY: TableField<Record, ULong?> = createField(DSL.name("MIN_TIMER_READ_HIGH_PRIORITY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_READ_HIGH_PRIORITY</code>.
     */
    val AVG_TIMER_READ_HIGH_PRIORITY: TableField<Record, ULong?> = createField(DSL.name("AVG_TIMER_READ_HIGH_PRIORITY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_READ_HIGH_PRIORITY</code>.
     */
    val MAX_TIMER_READ_HIGH_PRIORITY: TableField<Record, ULong?> = createField(DSL.name("MAX_TIMER_READ_HIGH_PRIORITY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.COUNT_READ_NO_INSERT</code>.
     */
    val COUNT_READ_NO_INSERT: TableField<Record, ULong?> = createField(DSL.name("COUNT_READ_NO_INSERT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_READ_NO_INSERT</code>.
     */
    val SUM_TIMER_READ_NO_INSERT: TableField<Record, ULong?> = createField(DSL.name("SUM_TIMER_READ_NO_INSERT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_READ_NO_INSERT</code>.
     */
    val MIN_TIMER_READ_NO_INSERT: TableField<Record, ULong?> = createField(DSL.name("MIN_TIMER_READ_NO_INSERT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_READ_NO_INSERT</code>.
     */
    val AVG_TIMER_READ_NO_INSERT: TableField<Record, ULong?> = createField(DSL.name("AVG_TIMER_READ_NO_INSERT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_READ_NO_INSERT</code>.
     */
    val MAX_TIMER_READ_NO_INSERT: TableField<Record, ULong?> = createField(DSL.name("MAX_TIMER_READ_NO_INSERT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.COUNT_READ_EXTERNAL</code>.
     */
    val COUNT_READ_EXTERNAL: TableField<Record, ULong?> = createField(DSL.name("COUNT_READ_EXTERNAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_READ_EXTERNAL</code>.
     */
    val SUM_TIMER_READ_EXTERNAL: TableField<Record, ULong?> = createField(DSL.name("SUM_TIMER_READ_EXTERNAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_READ_EXTERNAL</code>.
     */
    val MIN_TIMER_READ_EXTERNAL: TableField<Record, ULong?> = createField(DSL.name("MIN_TIMER_READ_EXTERNAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_READ_EXTERNAL</code>.
     */
    val AVG_TIMER_READ_EXTERNAL: TableField<Record, ULong?> = createField(DSL.name("AVG_TIMER_READ_EXTERNAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_READ_EXTERNAL</code>.
     */
    val MAX_TIMER_READ_EXTERNAL: TableField<Record, ULong?> = createField(DSL.name("MAX_TIMER_READ_EXTERNAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.COUNT_WRITE_ALLOW_WRITE</code>.
     */
    val COUNT_WRITE_ALLOW_WRITE: TableField<Record, ULong?> = createField(DSL.name("COUNT_WRITE_ALLOW_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WRITE_ALLOW_WRITE</code>.
     */
    val SUM_TIMER_WRITE_ALLOW_WRITE: TableField<Record, ULong?> = createField(DSL.name("SUM_TIMER_WRITE_ALLOW_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WRITE_ALLOW_WRITE</code>.
     */
    val MIN_TIMER_WRITE_ALLOW_WRITE: TableField<Record, ULong?> = createField(DSL.name("MIN_TIMER_WRITE_ALLOW_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WRITE_ALLOW_WRITE</code>.
     */
    val AVG_TIMER_WRITE_ALLOW_WRITE: TableField<Record, ULong?> = createField(DSL.name("AVG_TIMER_WRITE_ALLOW_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WRITE_ALLOW_WRITE</code>.
     */
    val MAX_TIMER_WRITE_ALLOW_WRITE: TableField<Record, ULong?> = createField(DSL.name("MAX_TIMER_WRITE_ALLOW_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.COUNT_WRITE_CONCURRENT_INSERT</code>.
     */
    val COUNT_WRITE_CONCURRENT_INSERT: TableField<Record, ULong?> = createField(DSL.name("COUNT_WRITE_CONCURRENT_INSERT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WRITE_CONCURRENT_INSERT</code>.
     */
    val SUM_TIMER_WRITE_CONCURRENT_INSERT: TableField<Record, ULong?> = createField(DSL.name("SUM_TIMER_WRITE_CONCURRENT_INSERT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WRITE_CONCURRENT_INSERT</code>.
     */
    val MIN_TIMER_WRITE_CONCURRENT_INSERT: TableField<Record, ULong?> = createField(DSL.name("MIN_TIMER_WRITE_CONCURRENT_INSERT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WRITE_CONCURRENT_INSERT</code>.
     */
    val AVG_TIMER_WRITE_CONCURRENT_INSERT: TableField<Record, ULong?> = createField(DSL.name("AVG_TIMER_WRITE_CONCURRENT_INSERT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WRITE_CONCURRENT_INSERT</code>.
     */
    val MAX_TIMER_WRITE_CONCURRENT_INSERT: TableField<Record, ULong?> = createField(DSL.name("MAX_TIMER_WRITE_CONCURRENT_INSERT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.COUNT_WRITE_LOW_PRIORITY</code>.
     */
    val COUNT_WRITE_LOW_PRIORITY: TableField<Record, ULong?> = createField(DSL.name("COUNT_WRITE_LOW_PRIORITY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WRITE_LOW_PRIORITY</code>.
     */
    val SUM_TIMER_WRITE_LOW_PRIORITY: TableField<Record, ULong?> = createField(DSL.name("SUM_TIMER_WRITE_LOW_PRIORITY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WRITE_LOW_PRIORITY</code>.
     */
    val MIN_TIMER_WRITE_LOW_PRIORITY: TableField<Record, ULong?> = createField(DSL.name("MIN_TIMER_WRITE_LOW_PRIORITY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WRITE_LOW_PRIORITY</code>.
     */
    val AVG_TIMER_WRITE_LOW_PRIORITY: TableField<Record, ULong?> = createField(DSL.name("AVG_TIMER_WRITE_LOW_PRIORITY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WRITE_LOW_PRIORITY</code>.
     */
    val MAX_TIMER_WRITE_LOW_PRIORITY: TableField<Record, ULong?> = createField(DSL.name("MAX_TIMER_WRITE_LOW_PRIORITY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.COUNT_WRITE_NORMAL</code>.
     */
    val COUNT_WRITE_NORMAL: TableField<Record, ULong?> = createField(DSL.name("COUNT_WRITE_NORMAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WRITE_NORMAL</code>.
     */
    val SUM_TIMER_WRITE_NORMAL: TableField<Record, ULong?> = createField(DSL.name("SUM_TIMER_WRITE_NORMAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WRITE_NORMAL</code>.
     */
    val MIN_TIMER_WRITE_NORMAL: TableField<Record, ULong?> = createField(DSL.name("MIN_TIMER_WRITE_NORMAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WRITE_NORMAL</code>.
     */
    val AVG_TIMER_WRITE_NORMAL: TableField<Record, ULong?> = createField(DSL.name("AVG_TIMER_WRITE_NORMAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WRITE_NORMAL</code>.
     */
    val MAX_TIMER_WRITE_NORMAL: TableField<Record, ULong?> = createField(DSL.name("MAX_TIMER_WRITE_NORMAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.COUNT_WRITE_EXTERNAL</code>.
     */
    val COUNT_WRITE_EXTERNAL: TableField<Record, ULong?> = createField(DSL.name("COUNT_WRITE_EXTERNAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WRITE_EXTERNAL</code>.
     */
    val SUM_TIMER_WRITE_EXTERNAL: TableField<Record, ULong?> = createField(DSL.name("SUM_TIMER_WRITE_EXTERNAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WRITE_EXTERNAL</code>.
     */
    val MIN_TIMER_WRITE_EXTERNAL: TableField<Record, ULong?> = createField(DSL.name("MIN_TIMER_WRITE_EXTERNAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WRITE_EXTERNAL</code>.
     */
    val AVG_TIMER_WRITE_EXTERNAL: TableField<Record, ULong?> = createField(DSL.name("AVG_TIMER_WRITE_EXTERNAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WRITE_EXTERNAL</code>.
     */
    val MAX_TIMER_WRITE_EXTERNAL: TableField<Record, ULong?> = createField(DSL.name("MAX_TIMER_WRITE_EXTERNAL"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>performance_schema.table_lock_waits_summary_by_table</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>performance_schema.table_lock_waits_summary_by_table</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>performance_schema.table_lock_waits_summary_by_table</code> table reference
     */
    constructor(): this(DSL.name("table_lock_waits_summary_by_table"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, TABLE_LOCK_WAITS_SUMMARY_BY_TABLE, null)
    override fun getSchema(): Schema = PerformanceSchema.PERFORMANCE_SCHEMA
    override fun `as`(alias: String): TableLockWaitsSummaryByTable = TableLockWaitsSummaryByTable(DSL.name(alias), this)
    override fun `as`(alias: Name): TableLockWaitsSummaryByTable = TableLockWaitsSummaryByTable(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): TableLockWaitsSummaryByTable = TableLockWaitsSummaryByTable(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): TableLockWaitsSummaryByTable = TableLockWaitsSummaryByTable(name, null)
}
