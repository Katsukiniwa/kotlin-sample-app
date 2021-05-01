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


/**
 * VIEW
 */
@Suppress("UNCHECKED_CAST")
open class `X$psSchemaTableStatisticsIo`(
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
    TableOptions.view("create view `x\$ps_schema_table_statistics_io` as select `extract_schema_from_file_name`(`performance_schema`.`file_summary_by_instance`.`FILE_NAME`) AS `table_schema`,`extract_table_from_file_name`(`performance_schema`.`file_summary_by_instance`.`FILE_NAME`) AS `table_name`,sum(`performance_schema`.`file_summary_by_instance`.`COUNT_READ`) AS `count_read`,sum(`performance_schema`.`file_summary_by_instance`.`SUM_NUMBER_OF_BYTES_READ`) AS `sum_number_of_bytes_read`,sum(`performance_schema`.`file_summary_by_instance`.`SUM_TIMER_READ`) AS `sum_timer_read`,sum(`performance_schema`.`file_summary_by_instance`.`COUNT_WRITE`) AS `count_write`,sum(`performance_schema`.`file_summary_by_instance`.`SUM_NUMBER_OF_BYTES_WRITE`) AS `sum_number_of_bytes_write`,sum(`performance_schema`.`file_summary_by_instance`.`SUM_TIMER_WRITE`) AS `sum_timer_write`,sum(`performance_schema`.`file_summary_by_instance`.`COUNT_MISC`) AS `count_misc`,sum(`performance_schema`.`file_summary_by_instance`.`SUM_TIMER_MISC`) AS `sum_timer_misc` from `performance_schema`.`file_summary_by_instance` group by `table_schema`,`table_name`")
) {
    companion object {

        /**
         * The reference instance of <code>sys.x$ps_schema_table_statistics_io</code>
         */
        val `X$PS_SCHEMA_TABLE_STATISTICS_IO` = `X$psSchemaTableStatisticsIo`()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>sys.x$ps_schema_table_statistics_io.table_schema</code>.
     */
    val TABLE_SCHEMA: TableField<Record, String?> = createField(DSL.name("table_schema"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>sys.x$ps_schema_table_statistics_io.table_name</code>.
     */
    val TABLE_NAME: TableField<Record, String?> = createField(DSL.name("table_name"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>sys.x$ps_schema_table_statistics_io.count_read</code>.
     */
    val COUNT_READ: TableField<Record, BigInteger?> = createField(DSL.name("count_read"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    /**
     * The column <code>sys.x$ps_schema_table_statistics_io.sum_number_of_bytes_read</code>.
     */
    val SUM_NUMBER_OF_BYTES_READ: TableField<Record, BigInteger?> = createField(DSL.name("sum_number_of_bytes_read"), SQLDataType.DECIMAL_INTEGER(41), this, "")

    /**
     * The column <code>sys.x$ps_schema_table_statistics_io.sum_timer_read</code>.
     */
    val SUM_TIMER_READ: TableField<Record, BigInteger?> = createField(DSL.name("sum_timer_read"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    /**
     * The column <code>sys.x$ps_schema_table_statistics_io.count_write</code>.
     */
    val COUNT_WRITE: TableField<Record, BigInteger?> = createField(DSL.name("count_write"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    /**
     * The column <code>sys.x$ps_schema_table_statistics_io.sum_number_of_bytes_write</code>.
     */
    val SUM_NUMBER_OF_BYTES_WRITE: TableField<Record, BigInteger?> = createField(DSL.name("sum_number_of_bytes_write"), SQLDataType.DECIMAL_INTEGER(41), this, "")

    /**
     * The column <code>sys.x$ps_schema_table_statistics_io.sum_timer_write</code>.
     */
    val SUM_TIMER_WRITE: TableField<Record, BigInteger?> = createField(DSL.name("sum_timer_write"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    /**
     * The column <code>sys.x$ps_schema_table_statistics_io.count_misc</code>.
     */
    val COUNT_MISC: TableField<Record, BigInteger?> = createField(DSL.name("count_misc"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    /**
     * The column <code>sys.x$ps_schema_table_statistics_io.sum_timer_misc</code>.
     */
    val SUM_TIMER_MISC: TableField<Record, BigInteger?> = createField(DSL.name("sum_timer_misc"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>sys.x$ps_schema_table_statistics_io</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sys.x$ps_schema_table_statistics_io</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sys.x$ps_schema_table_statistics_io</code> table reference
     */
    constructor(): this(DSL.name("x\$ps_schema_table_statistics_io"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, `X$PS_SCHEMA_TABLE_STATISTICS_IO`, null)
    override fun getSchema(): Schema = Sys.SYS
    override fun `as`(alias: String): `X$psSchemaTableStatisticsIo` = `X$psSchemaTableStatisticsIo`(DSL.name(alias), this)
    override fun `as`(alias: Name): `X$psSchemaTableStatisticsIo` = `X$psSchemaTableStatisticsIo`(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): `X$psSchemaTableStatisticsIo` = `X$psSchemaTableStatisticsIo`(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): `X$psSchemaTableStatisticsIo` = `X$psSchemaTableStatisticsIo`(name, null)
}
