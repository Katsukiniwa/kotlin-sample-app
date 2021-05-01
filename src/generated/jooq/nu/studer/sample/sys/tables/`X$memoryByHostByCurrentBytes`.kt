/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.sys.tables


import java.math.BigDecimal
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
open class `X$memoryByHostByCurrentBytes`(
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
    TableOptions.view("create view `x\$memory_by_host_by_current_bytes` as select if(isnull(`performance_schema`.`memory_summary_by_host_by_event_name`.`HOST`),'background',`performance_schema`.`memory_summary_by_host_by_event_name`.`HOST`) AS `host`,sum(`performance_schema`.`memory_summary_by_host_by_event_name`.`CURRENT_COUNT_USED`) AS `current_count_used`,sum(`performance_schema`.`memory_summary_by_host_by_event_name`.`CURRENT_NUMBER_OF_BYTES_USED`) AS `current_allocated`,ifnull((sum(`performance_schema`.`memory_summary_by_host_by_event_name`.`CURRENT_NUMBER_OF_BYTES_USED`) / nullif(sum(`performance_schema`.`memory_summary_by_host_by_event_name`.`CURRENT_COUNT_USED`),0)),0) AS `current_avg_alloc`,max(`performance_schema`.`memory_summary_by_host_by_event_name`.`CURRENT_NUMBER_OF_BYTES_USED`) AS `current_max_alloc`,sum(`performance_schema`.`memory_summary_by_host_by_event_name`.`SUM_NUMBER_OF_BYTES_ALLOC`) AS `total_allocated` from `performance_schema`.`memory_summary_by_host_by_event_name` group by if(isnull(`performance_schema`.`memory_summary_by_host_by_event_name`.`HOST`),'background',`performance_schema`.`memory_summary_by_host_by_event_name`.`HOST`) order by sum(`performance_schema`.`memory_summary_by_host_by_event_name`.`CURRENT_NUMBER_OF_BYTES_USED`) desc")
) {
    companion object {

        /**
         * The reference instance of <code>sys.x$memory_by_host_by_current_bytes</code>
         */
        val `X$MEMORY_BY_HOST_BY_CURRENT_BYTES` = `X$memoryByHostByCurrentBytes`()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>sys.x$memory_by_host_by_current_bytes.host</code>.
     */
    val HOST: TableField<Record, String?> = createField(DSL.name("host"), SQLDataType.VARCHAR(60), this, "")

    /**
     * The column <code>sys.x$memory_by_host_by_current_bytes.current_count_used</code>.
     */
    val CURRENT_COUNT_USED: TableField<Record, BigInteger?> = createField(DSL.name("current_count_used"), SQLDataType.DECIMAL_INTEGER(41), this, "")

    /**
     * The column <code>sys.x$memory_by_host_by_current_bytes.current_allocated</code>.
     */
    val CURRENT_ALLOCATED: TableField<Record, BigInteger?> = createField(DSL.name("current_allocated"), SQLDataType.DECIMAL_INTEGER(41), this, "")

    /**
     * The column <code>sys.x$memory_by_host_by_current_bytes.current_avg_alloc</code>.
     */
    val CURRENT_AVG_ALLOC: TableField<Record, BigDecimal?> = createField(DSL.name("current_avg_alloc"), SQLDataType.DECIMAL(45, 4).nullable(false).defaultValue(DSL.inline("0.0000", SQLDataType.DECIMAL)), this, "")

    /**
     * The column <code>sys.x$memory_by_host_by_current_bytes.current_max_alloc</code>.
     */
    val CURRENT_MAX_ALLOC: TableField<Record, Long?> = createField(DSL.name("current_max_alloc"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>sys.x$memory_by_host_by_current_bytes.total_allocated</code>.
     */
    val TOTAL_ALLOCATED: TableField<Record, BigInteger?> = createField(DSL.name("total_allocated"), SQLDataType.DECIMAL_INTEGER(42), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>sys.x$memory_by_host_by_current_bytes</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sys.x$memory_by_host_by_current_bytes</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sys.x$memory_by_host_by_current_bytes</code> table reference
     */
    constructor(): this(DSL.name("x\$memory_by_host_by_current_bytes"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, `X$MEMORY_BY_HOST_BY_CURRENT_BYTES`, null)
    override fun getSchema(): Schema = Sys.SYS
    override fun `as`(alias: String): `X$memoryByHostByCurrentBytes` = `X$memoryByHostByCurrentBytes`(DSL.name(alias), this)
    override fun `as`(alias: Name): `X$memoryByHostByCurrentBytes` = `X$memoryByHostByCurrentBytes`(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): `X$memoryByHostByCurrentBytes` = `X$memoryByHostByCurrentBytes`(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): `X$memoryByHostByCurrentBytes` = `X$memoryByHostByCurrentBytes`(name, null)
}
