/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.sys.tables


import java.math.BigInteger

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
import org.jooq.types.ULong


/**
 * VIEW
 */
@Suppress("UNCHECKED_CAST")
open class MemoryByThreadByCurrentBytes(
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
    TableOptions.view("create view `memory_by_thread_by_current_bytes` as select `mt`.`THREAD_ID` AS `thread_id`,if((`t`.`NAME` = 'thread/sql/one_connection'),concat(`t`.`PROCESSLIST_USER`,'@',`t`.`PROCESSLIST_HOST`),replace(`t`.`NAME`,'thread/','')) AS `user`,sum(`mt`.`CURRENT_COUNT_USED`) AS `current_count_used`,`sys`.`format_bytes`(sum(`mt`.`CURRENT_NUMBER_OF_BYTES_USED`)) AS `current_allocated`,`sys`.`format_bytes`(ifnull((sum(`mt`.`CURRENT_NUMBER_OF_BYTES_USED`) / nullif(sum(`mt`.`CURRENT_COUNT_USED`),0)),0)) AS `current_avg_alloc`,`sys`.`format_bytes`(max(`mt`.`CURRENT_NUMBER_OF_BYTES_USED`)) AS `current_max_alloc`,`sys`.`format_bytes`(sum(`mt`.`SUM_NUMBER_OF_BYTES_ALLOC`)) AS `total_allocated` from (`performance_schema`.`memory_summary_by_thread_by_event_name` `mt` join `performance_schema`.`threads` `t` on((`mt`.`THREAD_ID` = `t`.`THREAD_ID`))) group by `mt`.`THREAD_ID`,if((`t`.`NAME` = 'thread/sql/one_connection'),concat(`t`.`PROCESSLIST_USER`,'@',`t`.`PROCESSLIST_HOST`),replace(`t`.`NAME`,'thread/','')) order by sum(`mt`.`CURRENT_NUMBER_OF_BYTES_USED`) desc")
) {
    companion object {

        /**
         * The reference instance of <code>sys.memory_by_thread_by_current_bytes</code>
         */
        val MEMORY_BY_THREAD_BY_CURRENT_BYTES = MemoryByThreadByCurrentBytes()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>sys.memory_by_thread_by_current_bytes.thread_id</code>.
     */
    val THREAD_ID: TableField<Record, ULong?> = createField(DSL.name("thread_id"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.memory_by_thread_by_current_bytes.user</code>.
     */
    val USER: TableField<Record, String?> = createField(DSL.name("user"), SQLDataType.VARCHAR(128), this, "")

    /**
     * The column <code>sys.memory_by_thread_by_current_bytes.current_count_used</code>.
     */
    val CURRENT_COUNT_USED: TableField<Record, BigInteger?> = createField(DSL.name("current_count_used"), SQLDataType.DECIMAL_INTEGER(41), this, "")

    /**
     * The column <code>sys.memory_by_thread_by_current_bytes.current_allocated</code>.
     */
    val CURRENT_ALLOCATED: TableField<Record, String?> = createField(DSL.name("current_allocated"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>sys.memory_by_thread_by_current_bytes.current_avg_alloc</code>.
     */
    val CURRENT_AVG_ALLOC: TableField<Record, String?> = createField(DSL.name("current_avg_alloc"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>sys.memory_by_thread_by_current_bytes.current_max_alloc</code>.
     */
    val CURRENT_MAX_ALLOC: TableField<Record, String?> = createField(DSL.name("current_max_alloc"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>sys.memory_by_thread_by_current_bytes.total_allocated</code>.
     */
    val TOTAL_ALLOCATED: TableField<Record, String?> = createField(DSL.name("total_allocated"), SQLDataType.CLOB, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>sys.memory_by_thread_by_current_bytes</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sys.memory_by_thread_by_current_bytes</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sys.memory_by_thread_by_current_bytes</code> table reference
     */
    constructor(): this(DSL.name("memory_by_thread_by_current_bytes"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, MEMORY_BY_THREAD_BY_CURRENT_BYTES, null)
    override fun getSchema(): Schema = Sys.SYS
    override fun `as`(alias: String): MemoryByThreadByCurrentBytes = MemoryByThreadByCurrentBytes(DSL.name(alias), this)
    override fun `as`(alias: Name): MemoryByThreadByCurrentBytes = MemoryByThreadByCurrentBytes(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): MemoryByThreadByCurrentBytes = MemoryByThreadByCurrentBytes(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): MemoryByThreadByCurrentBytes = MemoryByThreadByCurrentBytes(name, null)
}
