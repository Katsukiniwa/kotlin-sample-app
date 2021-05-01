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
open class MutexInstances(
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
         * The reference instance of <code>performance_schema.mutex_instances</code>
         */
        val MUTEX_INSTANCES = MutexInstances()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>performance_schema.mutex_instances.NAME</code>.
     */
    val NAME: TableField<Record, String?> = createField(DSL.name("NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "")

    /**
     * The column <code>performance_schema.mutex_instances.OBJECT_INSTANCE_BEGIN</code>.
     */
    val OBJECT_INSTANCE_BEGIN: TableField<Record, ULong?> = createField(DSL.name("OBJECT_INSTANCE_BEGIN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.mutex_instances.LOCKED_BY_THREAD_ID</code>.
     */
    val LOCKED_BY_THREAD_ID: TableField<Record, ULong?> = createField(DSL.name("LOCKED_BY_THREAD_ID"), SQLDataType.BIGINTUNSIGNED, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>performance_schema.mutex_instances</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>performance_schema.mutex_instances</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>performance_schema.mutex_instances</code> table reference
     */
    constructor(): this(DSL.name("mutex_instances"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, MUTEX_INSTANCES, null)
    override fun getSchema(): Schema = PerformanceSchema.PERFORMANCE_SCHEMA
    override fun `as`(alias: String): MutexInstances = MutexInstances(DSL.name(alias), this)
    override fun `as`(alias: Name): MutexInstances = MutexInstances(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): MutexInstances = MutexInstances(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): MutexInstances = MutexInstances(name, null)
}