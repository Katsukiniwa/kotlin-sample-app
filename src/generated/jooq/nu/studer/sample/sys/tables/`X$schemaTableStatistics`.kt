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
open class `X$schemaTableStatistics`(
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
    TableOptions.view("create view `x\$schema_table_statistics` as select `pst`.`OBJECT_SCHEMA` AS `table_schema`,`pst`.`OBJECT_NAME` AS `table_name`,`pst`.`SUM_TIMER_WAIT` AS `total_latency`,`pst`.`COUNT_FETCH` AS `rows_fetched`,`pst`.`SUM_TIMER_FETCH` AS `fetch_latency`,`pst`.`COUNT_INSERT` AS `rows_inserted`,`pst`.`SUM_TIMER_INSERT` AS `insert_latency`,`pst`.`COUNT_UPDATE` AS `rows_updated`,`pst`.`SUM_TIMER_UPDATE` AS `update_latency`,`pst`.`COUNT_DELETE` AS `rows_deleted`,`pst`.`SUM_TIMER_DELETE` AS `delete_latency`,`fsbi`.`count_read` AS `io_read_requests`,`fsbi`.`sum_number_of_bytes_read` AS `io_read`,`fsbi`.`sum_timer_read` AS `io_read_latency`,`fsbi`.`count_write` AS `io_write_requests`,`fsbi`.`sum_number_of_bytes_write` AS `io_write`,`fsbi`.`sum_timer_write` AS `io_write_latency`,`fsbi`.`count_misc` AS `io_misc_requests`,`fsbi`.`sum_timer_misc` AS `io_misc_latency` from (`performance_schema`.`table_io_waits_summary_by_table` `pst` left join `sys`.`x\$ps_schema_table_statistics_io` `fsbi` on(((`pst`.`OBJECT_SCHEMA` = `fsbi`.`table_schema`) and (`pst`.`OBJECT_NAME` = `fsbi`.`table_name`)))) order by `pst`.`SUM_TIMER_WAIT` desc")
) {
    companion object {

        /**
         * The reference instance of <code>sys.x$schema_table_statistics</code>
         */
        val `X$SCHEMA_TABLE_STATISTICS` = `X$schemaTableStatistics`()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>sys.x$schema_table_statistics.table_schema</code>.
     */
    val TABLE_SCHEMA: TableField<Record, String?> = createField(DSL.name("table_schema"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>sys.x$schema_table_statistics.table_name</code>.
     */
    val TABLE_NAME: TableField<Record, String?> = createField(DSL.name("table_name"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>sys.x$schema_table_statistics.total_latency</code>.
     */
    val TOTAL_LATENCY: TableField<Record, ULong?> = createField(DSL.name("total_latency"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.x$schema_table_statistics.rows_fetched</code>.
     */
    val ROWS_FETCHED: TableField<Record, ULong?> = createField(DSL.name("rows_fetched"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.x$schema_table_statistics.fetch_latency</code>.
     */
    val FETCH_LATENCY: TableField<Record, ULong?> = createField(DSL.name("fetch_latency"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.x$schema_table_statistics.rows_inserted</code>.
     */
    val ROWS_INSERTED: TableField<Record, ULong?> = createField(DSL.name("rows_inserted"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.x$schema_table_statistics.insert_latency</code>.
     */
    val INSERT_LATENCY: TableField<Record, ULong?> = createField(DSL.name("insert_latency"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.x$schema_table_statistics.rows_updated</code>.
     */
    val ROWS_UPDATED: TableField<Record, ULong?> = createField(DSL.name("rows_updated"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.x$schema_table_statistics.update_latency</code>.
     */
    val UPDATE_LATENCY: TableField<Record, ULong?> = createField(DSL.name("update_latency"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.x$schema_table_statistics.rows_deleted</code>.
     */
    val ROWS_DELETED: TableField<Record, ULong?> = createField(DSL.name("rows_deleted"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.x$schema_table_statistics.delete_latency</code>.
     */
    val DELETE_LATENCY: TableField<Record, ULong?> = createField(DSL.name("delete_latency"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.x$schema_table_statistics.io_read_requests</code>.
     */
    val IO_READ_REQUESTS: TableField<Record, BigInteger?> = createField(DSL.name("io_read_requests"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    /**
     * The column <code>sys.x$schema_table_statistics.io_read</code>.
     */
    val IO_READ: TableField<Record, BigInteger?> = createField(DSL.name("io_read"), SQLDataType.DECIMAL_INTEGER(41), this, "")

    /**
     * The column <code>sys.x$schema_table_statistics.io_read_latency</code>.
     */
    val IO_READ_LATENCY: TableField<Record, BigInteger?> = createField(DSL.name("io_read_latency"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    /**
     * The column <code>sys.x$schema_table_statistics.io_write_requests</code>.
     */
    val IO_WRITE_REQUESTS: TableField<Record, BigInteger?> = createField(DSL.name("io_write_requests"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    /**
     * The column <code>sys.x$schema_table_statistics.io_write</code>.
     */
    val IO_WRITE: TableField<Record, BigInteger?> = createField(DSL.name("io_write"), SQLDataType.DECIMAL_INTEGER(41), this, "")

    /**
     * The column <code>sys.x$schema_table_statistics.io_write_latency</code>.
     */
    val IO_WRITE_LATENCY: TableField<Record, BigInteger?> = createField(DSL.name("io_write_latency"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    /**
     * The column <code>sys.x$schema_table_statistics.io_misc_requests</code>.
     */
    val IO_MISC_REQUESTS: TableField<Record, BigInteger?> = createField(DSL.name("io_misc_requests"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    /**
     * The column <code>sys.x$schema_table_statistics.io_misc_latency</code>.
     */
    val IO_MISC_LATENCY: TableField<Record, BigInteger?> = createField(DSL.name("io_misc_latency"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>sys.x$schema_table_statistics</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sys.x$schema_table_statistics</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sys.x$schema_table_statistics</code> table reference
     */
    constructor(): this(DSL.name("x\$schema_table_statistics"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, `X$SCHEMA_TABLE_STATISTICS`, null)
    override fun getSchema(): Schema = Sys.SYS
    override fun `as`(alias: String): `X$schemaTableStatistics` = `X$schemaTableStatistics`(DSL.name(alias), this)
    override fun `as`(alias: Name): `X$schemaTableStatistics` = `X$schemaTableStatistics`(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): `X$schemaTableStatistics` = `X$schemaTableStatistics`(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): `X$schemaTableStatistics` = `X$schemaTableStatistics`(name, null)
}
