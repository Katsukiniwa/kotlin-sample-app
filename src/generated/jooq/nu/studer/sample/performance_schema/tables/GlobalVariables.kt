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


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class GlobalVariables(
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
         * The reference instance of <code>performance_schema.global_variables</code>
         */
        val GLOBAL_VARIABLES = GlobalVariables()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>performance_schema.global_variables.VARIABLE_NAME</code>.
     */
    val VARIABLE_NAME: TableField<Record, String?> = createField(DSL.name("VARIABLE_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "")

    /**
     * The column <code>performance_schema.global_variables.VARIABLE_VALUE</code>.
     */
    val VARIABLE_VALUE: TableField<Record, String?> = createField(DSL.name("VARIABLE_VALUE"), SQLDataType.VARCHAR(1024), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>performance_schema.global_variables</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>performance_schema.global_variables</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>performance_schema.global_variables</code> table reference
     */
    constructor(): this(DSL.name("global_variables"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, GLOBAL_VARIABLES, null)
    override fun getSchema(): Schema = PerformanceSchema.PERFORMANCE_SCHEMA
    override fun `as`(alias: String): GlobalVariables = GlobalVariables(DSL.name(alias), this)
    override fun `as`(alias: Name): GlobalVariables = GlobalVariables(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): GlobalVariables = GlobalVariables(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): GlobalVariables = GlobalVariables(name, null)
}
