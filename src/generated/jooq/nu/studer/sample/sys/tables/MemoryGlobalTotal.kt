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


/**
 * VIEW
 */
@Suppress("UNCHECKED_CAST")
open class MemoryGlobalTotal(
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
    TableOptions.view("create view `memory_global_total` as select `sys`.`format_bytes`(sum(`performance_schema`.`memory_summary_global_by_event_name`.`CURRENT_NUMBER_OF_BYTES_USED`)) AS `total_allocated` from `performance_schema`.`memory_summary_global_by_event_name`")
) {
    companion object {

        /**
         * The reference instance of <code>sys.memory_global_total</code>
         */
        val MEMORY_GLOBAL_TOTAL = MemoryGlobalTotal()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>sys.memory_global_total.total_allocated</code>.
     */
    val TOTAL_ALLOCATED: TableField<Record, String?> = createField(DSL.name("total_allocated"), SQLDataType.CLOB, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>sys.memory_global_total</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sys.memory_global_total</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sys.memory_global_total</code> table reference
     */
    constructor(): this(DSL.name("memory_global_total"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, MEMORY_GLOBAL_TOTAL, null)
    override fun getSchema(): Schema = Sys.SYS
    override fun `as`(alias: String): MemoryGlobalTotal = MemoryGlobalTotal(DSL.name(alias), this)
    override fun `as`(alias: Name): MemoryGlobalTotal = MemoryGlobalTotal(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): MemoryGlobalTotal = MemoryGlobalTotal(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): MemoryGlobalTotal = MemoryGlobalTotal(name, null)
}