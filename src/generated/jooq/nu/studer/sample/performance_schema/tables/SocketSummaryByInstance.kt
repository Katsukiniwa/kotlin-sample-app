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
open class SocketSummaryByInstance(
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
         * The reference instance of <code>performance_schema.socket_summary_by_instance</code>
         */
        val SOCKET_SUMMARY_BY_INSTANCE = SocketSummaryByInstance()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>performance_schema.socket_summary_by_instance.EVENT_NAME</code>.
     */
    val EVENT_NAME: TableField<Record, String?> = createField(DSL.name("EVENT_NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "")

    /**
     * The column <code>performance_schema.socket_summary_by_instance.OBJECT_INSTANCE_BEGIN</code>.
     */
    val OBJECT_INSTANCE_BEGIN: TableField<Record, ULong?> = createField(DSL.name("OBJECT_INSTANCE_BEGIN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.socket_summary_by_instance.COUNT_STAR</code>.
     */
    val COUNT_STAR: TableField<Record, ULong?> = createField(DSL.name("COUNT_STAR"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.socket_summary_by_instance.SUM_TIMER_WAIT</code>.
     */
    val SUM_TIMER_WAIT: TableField<Record, ULong?> = createField(DSL.name("SUM_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.socket_summary_by_instance.MIN_TIMER_WAIT</code>.
     */
    val MIN_TIMER_WAIT: TableField<Record, ULong?> = createField(DSL.name("MIN_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.socket_summary_by_instance.AVG_TIMER_WAIT</code>.
     */
    val AVG_TIMER_WAIT: TableField<Record, ULong?> = createField(DSL.name("AVG_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.socket_summary_by_instance.MAX_TIMER_WAIT</code>.
     */
    val MAX_TIMER_WAIT: TableField<Record, ULong?> = createField(DSL.name("MAX_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.socket_summary_by_instance.COUNT_READ</code>.
     */
    val COUNT_READ: TableField<Record, ULong?> = createField(DSL.name("COUNT_READ"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.socket_summary_by_instance.SUM_TIMER_READ</code>.
     */
    val SUM_TIMER_READ: TableField<Record, ULong?> = createField(DSL.name("SUM_TIMER_READ"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.socket_summary_by_instance.MIN_TIMER_READ</code>.
     */
    val MIN_TIMER_READ: TableField<Record, ULong?> = createField(DSL.name("MIN_TIMER_READ"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.socket_summary_by_instance.AVG_TIMER_READ</code>.
     */
    val AVG_TIMER_READ: TableField<Record, ULong?> = createField(DSL.name("AVG_TIMER_READ"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.socket_summary_by_instance.MAX_TIMER_READ</code>.
     */
    val MAX_TIMER_READ: TableField<Record, ULong?> = createField(DSL.name("MAX_TIMER_READ"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.socket_summary_by_instance.SUM_NUMBER_OF_BYTES_READ</code>.
     */
    val SUM_NUMBER_OF_BYTES_READ: TableField<Record, ULong?> = createField(DSL.name("SUM_NUMBER_OF_BYTES_READ"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.socket_summary_by_instance.COUNT_WRITE</code>.
     */
    val COUNT_WRITE: TableField<Record, ULong?> = createField(DSL.name("COUNT_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.socket_summary_by_instance.SUM_TIMER_WRITE</code>.
     */
    val SUM_TIMER_WRITE: TableField<Record, ULong?> = createField(DSL.name("SUM_TIMER_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.socket_summary_by_instance.MIN_TIMER_WRITE</code>.
     */
    val MIN_TIMER_WRITE: TableField<Record, ULong?> = createField(DSL.name("MIN_TIMER_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.socket_summary_by_instance.AVG_TIMER_WRITE</code>.
     */
    val AVG_TIMER_WRITE: TableField<Record, ULong?> = createField(DSL.name("AVG_TIMER_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.socket_summary_by_instance.MAX_TIMER_WRITE</code>.
     */
    val MAX_TIMER_WRITE: TableField<Record, ULong?> = createField(DSL.name("MAX_TIMER_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.socket_summary_by_instance.SUM_NUMBER_OF_BYTES_WRITE</code>.
     */
    val SUM_NUMBER_OF_BYTES_WRITE: TableField<Record, ULong?> = createField(DSL.name("SUM_NUMBER_OF_BYTES_WRITE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.socket_summary_by_instance.COUNT_MISC</code>.
     */
    val COUNT_MISC: TableField<Record, ULong?> = createField(DSL.name("COUNT_MISC"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.socket_summary_by_instance.SUM_TIMER_MISC</code>.
     */
    val SUM_TIMER_MISC: TableField<Record, ULong?> = createField(DSL.name("SUM_TIMER_MISC"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.socket_summary_by_instance.MIN_TIMER_MISC</code>.
     */
    val MIN_TIMER_MISC: TableField<Record, ULong?> = createField(DSL.name("MIN_TIMER_MISC"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.socket_summary_by_instance.AVG_TIMER_MISC</code>.
     */
    val AVG_TIMER_MISC: TableField<Record, ULong?> = createField(DSL.name("AVG_TIMER_MISC"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.socket_summary_by_instance.MAX_TIMER_MISC</code>.
     */
    val MAX_TIMER_MISC: TableField<Record, ULong?> = createField(DSL.name("MAX_TIMER_MISC"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>performance_schema.socket_summary_by_instance</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>performance_schema.socket_summary_by_instance</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>performance_schema.socket_summary_by_instance</code> table reference
     */
    constructor(): this(DSL.name("socket_summary_by_instance"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, SOCKET_SUMMARY_BY_INSTANCE, null)
    override fun getSchema(): Schema = PerformanceSchema.PERFORMANCE_SCHEMA
    override fun `as`(alias: String): SocketSummaryByInstance = SocketSummaryByInstance(DSL.name(alias), this)
    override fun `as`(alias: Name): SocketSummaryByInstance = SocketSummaryByInstance(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): SocketSummaryByInstance = SocketSummaryByInstance(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): SocketSummaryByInstance = SocketSummaryByInstance(name, null)
}
