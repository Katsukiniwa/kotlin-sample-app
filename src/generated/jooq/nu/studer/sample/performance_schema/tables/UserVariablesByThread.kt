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
open class UserVariablesByThread(
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
         * The reference instance of <code>performance_schema.user_variables_by_thread</code>
         */
        val USER_VARIABLES_BY_THREAD = UserVariablesByThread()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>performance_schema.user_variables_by_thread.THREAD_ID</code>.
     */
    val THREAD_ID: TableField<Record, ULong?> = createField(DSL.name("THREAD_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>performance_schema.user_variables_by_thread.VARIABLE_NAME</code>.
     */
    val VARIABLE_NAME: TableField<Record, String?> = createField(DSL.name("VARIABLE_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "")

    /**
     * The column <code>performance_schema.user_variables_by_thread.VARIABLE_VALUE</code>.
     */
    val VARIABLE_VALUE: TableField<Record, ByteArray?> = createField(DSL.name("VARIABLE_VALUE"), SQLDataType.BLOB, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>performance_schema.user_variables_by_thread</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>performance_schema.user_variables_by_thread</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>performance_schema.user_variables_by_thread</code> table reference
     */
    constructor(): this(DSL.name("user_variables_by_thread"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, USER_VARIABLES_BY_THREAD, null)
    override fun getSchema(): Schema = PerformanceSchema.PERFORMANCE_SCHEMA
    override fun `as`(alias: String): UserVariablesByThread = UserVariablesByThread(DSL.name(alias), this)
    override fun `as`(alias: Name): UserVariablesByThread = UserVariablesByThread(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): UserVariablesByThread = UserVariablesByThread(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): UserVariablesByThread = UserVariablesByThread(name, null)
}
