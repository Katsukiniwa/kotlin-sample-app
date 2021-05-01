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
import org.jooq.types.ULong


/**
 * VIEW
 */
@Suppress("UNCHECKED_CAST")
open class SchemaIndexStatistics(
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
    TableOptions.view("create view `schema_index_statistics` as select `performance_schema`.`table_io_waits_summary_by_index_usage`.`OBJECT_SCHEMA` AS `table_schema`,`performance_schema`.`table_io_waits_summary_by_index_usage`.`OBJECT_NAME` AS `table_name`,`performance_schema`.`table_io_waits_summary_by_index_usage`.`INDEX_NAME` AS `index_name`,`performance_schema`.`table_io_waits_summary_by_index_usage`.`COUNT_FETCH` AS `rows_selected`,`sys`.`format_time`(`performance_schema`.`table_io_waits_summary_by_index_usage`.`SUM_TIMER_FETCH`) AS `select_latency`,`performance_schema`.`table_io_waits_summary_by_index_usage`.`COUNT_INSERT` AS `rows_inserted`,`sys`.`format_time`(`performance_schema`.`table_io_waits_summary_by_index_usage`.`SUM_TIMER_INSERT`) AS `insert_latency`,`performance_schema`.`table_io_waits_summary_by_index_usage`.`COUNT_UPDATE` AS `rows_updated`,`sys`.`format_time`(`performance_schema`.`table_io_waits_summary_by_index_usage`.`SUM_TIMER_UPDATE`) AS `update_latency`,`performance_schema`.`table_io_waits_summary_by_index_usage`.`COUNT_DELETE` AS `rows_deleted`,`sys`.`format_time`(`performance_schema`.`table_io_waits_summary_by_index_usage`.`SUM_TIMER_DELETE`) AS `delete_latency` from `performance_schema`.`table_io_waits_summary_by_index_usage` where (`performance_schema`.`table_io_waits_summary_by_index_usage`.`INDEX_NAME` is not null) order by `performance_schema`.`table_io_waits_summary_by_index_usage`.`SUM_TIMER_WAIT` desc")
) {
    companion object {

        /**
         * The reference instance of <code>sys.schema_index_statistics</code>
         */
        val SCHEMA_INDEX_STATISTICS = SchemaIndexStatistics()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>sys.schema_index_statistics.table_schema</code>.
     */
    val TABLE_SCHEMA: TableField<Record, String?> = createField(DSL.name("table_schema"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>sys.schema_index_statistics.table_name</code>.
     */
    val TABLE_NAME: TableField<Record, String?> = createField(DSL.name("table_name"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>sys.schema_index_statistics.index_name</code>.
     */
    val INDEX_NAME: TableField<Record, String?> = createField(DSL.name("index_name"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>sys.schema_index_statistics.rows_selected</code>.
     */
    val ROWS_SELECTED: TableField<Record, ULong?> = createField(DSL.name("rows_selected"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.schema_index_statistics.select_latency</code>.
     */
    val SELECT_LATENCY: TableField<Record, String?> = createField(DSL.name("select_latency"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>sys.schema_index_statistics.rows_inserted</code>.
     */
    val ROWS_INSERTED: TableField<Record, ULong?> = createField(DSL.name("rows_inserted"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.schema_index_statistics.insert_latency</code>.
     */
    val INSERT_LATENCY: TableField<Record, String?> = createField(DSL.name("insert_latency"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>sys.schema_index_statistics.rows_updated</code>.
     */
    val ROWS_UPDATED: TableField<Record, ULong?> = createField(DSL.name("rows_updated"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.schema_index_statistics.update_latency</code>.
     */
    val UPDATE_LATENCY: TableField<Record, String?> = createField(DSL.name("update_latency"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>sys.schema_index_statistics.rows_deleted</code>.
     */
    val ROWS_DELETED: TableField<Record, ULong?> = createField(DSL.name("rows_deleted"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.schema_index_statistics.delete_latency</code>.
     */
    val DELETE_LATENCY: TableField<Record, String?> = createField(DSL.name("delete_latency"), SQLDataType.CLOB, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>sys.schema_index_statistics</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sys.schema_index_statistics</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sys.schema_index_statistics</code> table reference
     */
    constructor(): this(DSL.name("schema_index_statistics"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, SCHEMA_INDEX_STATISTICS, null)
    override fun getSchema(): Schema = Sys.SYS
    override fun `as`(alias: String): SchemaIndexStatistics = SchemaIndexStatistics(DSL.name(alias), this)
    override fun `as`(alias: Name): SchemaIndexStatistics = SchemaIndexStatistics(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): SchemaIndexStatistics = SchemaIndexStatistics(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): SchemaIndexStatistics = SchemaIndexStatistics(name, null)
}