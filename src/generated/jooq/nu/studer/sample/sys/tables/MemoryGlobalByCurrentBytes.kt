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
open class MemoryGlobalByCurrentBytes(
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
    TableOptions.view("create view `memory_global_by_current_bytes` as select `performance_schema`.`memory_summary_global_by_event_name`.`EVENT_NAME` AS `event_name`,`performance_schema`.`memory_summary_global_by_event_name`.`CURRENT_COUNT_USED` AS `current_count`,`sys`.`format_bytes`(`performance_schema`.`memory_summary_global_by_event_name`.`CURRENT_NUMBER_OF_BYTES_USED`) AS `current_alloc`,`sys`.`format_bytes`(ifnull((`performance_schema`.`memory_summary_global_by_event_name`.`CURRENT_NUMBER_OF_BYTES_USED` / nullif(`performance_schema`.`memory_summary_global_by_event_name`.`CURRENT_COUNT_USED`,0)),0)) AS `current_avg_alloc`,`performance_schema`.`memory_summary_global_by_event_name`.`HIGH_COUNT_USED` AS `high_count`,`sys`.`format_bytes`(`performance_schema`.`memory_summary_global_by_event_name`.`HIGH_NUMBER_OF_BYTES_USED`) AS `high_alloc`,`sys`.`format_bytes`(ifnull((`performance_schema`.`memory_summary_global_by_event_name`.`HIGH_NUMBER_OF_BYTES_USED` / nullif(`performance_schema`.`memory_summary_global_by_event_name`.`HIGH_COUNT_USED`,0)),0)) AS `high_avg_alloc` from `performance_schema`.`memory_summary_global_by_event_name` where (`performance_schema`.`memory_summary_global_by_event_name`.`CURRENT_NUMBER_OF_BYTES_USED` > 0) order by `performance_schema`.`memory_summary_global_by_event_name`.`CURRENT_NUMBER_OF_BYTES_USED` desc")
) {
    companion object {

        /**
         * The reference instance of <code>sys.memory_global_by_current_bytes</code>
         */
        val MEMORY_GLOBAL_BY_CURRENT_BYTES = MemoryGlobalByCurrentBytes()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>sys.memory_global_by_current_bytes.event_name</code>.
     */
    val EVENT_NAME: TableField<Record, String?> = createField(DSL.name("event_name"), SQLDataType.VARCHAR(128).nullable(false), this, "")

    /**
     * The column <code>sys.memory_global_by_current_bytes.current_count</code>.
     */
    val CURRENT_COUNT: TableField<Record, Long?> = createField(DSL.name("current_count"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>sys.memory_global_by_current_bytes.current_alloc</code>.
     */
    val CURRENT_ALLOC: TableField<Record, String?> = createField(DSL.name("current_alloc"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>sys.memory_global_by_current_bytes.current_avg_alloc</code>.
     */
    val CURRENT_AVG_ALLOC: TableField<Record, String?> = createField(DSL.name("current_avg_alloc"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>sys.memory_global_by_current_bytes.high_count</code>.
     */
    val HIGH_COUNT: TableField<Record, Long?> = createField(DSL.name("high_count"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>sys.memory_global_by_current_bytes.high_alloc</code>.
     */
    val HIGH_ALLOC: TableField<Record, String?> = createField(DSL.name("high_alloc"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>sys.memory_global_by_current_bytes.high_avg_alloc</code>.
     */
    val HIGH_AVG_ALLOC: TableField<Record, String?> = createField(DSL.name("high_avg_alloc"), SQLDataType.CLOB, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>sys.memory_global_by_current_bytes</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sys.memory_global_by_current_bytes</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sys.memory_global_by_current_bytes</code> table reference
     */
    constructor(): this(DSL.name("memory_global_by_current_bytes"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, MEMORY_GLOBAL_BY_CURRENT_BYTES, null)
    override fun getSchema(): Schema = Sys.SYS
    override fun `as`(alias: String): MemoryGlobalByCurrentBytes = MemoryGlobalByCurrentBytes(DSL.name(alias), this)
    override fun `as`(alias: Name): MemoryGlobalByCurrentBytes = MemoryGlobalByCurrentBytes(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): MemoryGlobalByCurrentBytes = MemoryGlobalByCurrentBytes(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): MemoryGlobalByCurrentBytes = MemoryGlobalByCurrentBytes(name, null)
}