/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.information_schema.tables


import java.time.LocalDateTime

import nu.studer.sample.information_schema.InformationSchema

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
open class InnodbMetrics(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, Record>?,
    aliased: Table<Record>?,
    parameters: Array<Field<*>?>?
): TableImpl<Record>(
    alias,
    InformationSchema.INFORMATION_SCHEMA,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>information_schema.INNODB_METRICS</code>
         */
        val INNODB_METRICS = InnodbMetrics()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>information_schema.INNODB_METRICS.NAME</code>.
     */
    val NAME: TableField<Record, String?> = createField(DSL.name("NAME"), SQLDataType.VARCHAR(193).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.INNODB_METRICS.SUBSYSTEM</code>.
     */
    val SUBSYSTEM: TableField<Record, String?> = createField(DSL.name("SUBSYSTEM"), SQLDataType.VARCHAR(193).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.INNODB_METRICS.COUNT</code>.
     */
    val COUNT: TableField<Record, Long?> = createField(DSL.name("COUNT"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "")

    /**
     * The column <code>information_schema.INNODB_METRICS.MAX_COUNT</code>.
     */
    val MAX_COUNT: TableField<Record, Long?> = createField(DSL.name("MAX_COUNT"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>information_schema.INNODB_METRICS.MIN_COUNT</code>.
     */
    val MIN_COUNT: TableField<Record, Long?> = createField(DSL.name("MIN_COUNT"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>information_schema.INNODB_METRICS.AVG_COUNT</code>.
     */
    val AVG_COUNT: TableField<Record, Double?> = createField(DSL.name("AVG_COUNT"), SQLDataType.DOUBLE, this, "")

    /**
     * The column <code>information_schema.INNODB_METRICS.COUNT_RESET</code>.
     */
    val COUNT_RESET: TableField<Record, Long?> = createField(DSL.name("COUNT_RESET"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "")

    /**
     * The column <code>information_schema.INNODB_METRICS.MAX_COUNT_RESET</code>.
     */
    val MAX_COUNT_RESET: TableField<Record, Long?> = createField(DSL.name("MAX_COUNT_RESET"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>information_schema.INNODB_METRICS.MIN_COUNT_RESET</code>.
     */
    val MIN_COUNT_RESET: TableField<Record, Long?> = createField(DSL.name("MIN_COUNT_RESET"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>information_schema.INNODB_METRICS.AVG_COUNT_RESET</code>.
     */
    val AVG_COUNT_RESET: TableField<Record, Double?> = createField(DSL.name("AVG_COUNT_RESET"), SQLDataType.DOUBLE, this, "")

    /**
     * The column <code>information_schema.INNODB_METRICS.TIME_ENABLED</code>.
     */
    val TIME_ENABLED: TableField<Record, LocalDateTime?> = createField(DSL.name("TIME_ENABLED"), SQLDataType.LOCALDATETIME(0), this, "")

    /**
     * The column <code>information_schema.INNODB_METRICS.TIME_DISABLED</code>.
     */
    val TIME_DISABLED: TableField<Record, LocalDateTime?> = createField(DSL.name("TIME_DISABLED"), SQLDataType.LOCALDATETIME(0), this, "")

    /**
     * The column <code>information_schema.INNODB_METRICS.TIME_ELAPSED</code>.
     */
    val TIME_ELAPSED: TableField<Record, Long?> = createField(DSL.name("TIME_ELAPSED"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>information_schema.INNODB_METRICS.TIME_RESET</code>.
     */
    val TIME_RESET: TableField<Record, LocalDateTime?> = createField(DSL.name("TIME_RESET"), SQLDataType.LOCALDATETIME(0), this, "")

    /**
     * The column <code>information_schema.INNODB_METRICS.STATUS</code>.
     */
    val STATUS: TableField<Record, String?> = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(193).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.INNODB_METRICS.TYPE</code>.
     */
    val TYPE: TableField<Record, String?> = createField(DSL.name("TYPE"), SQLDataType.VARCHAR(193).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.INNODB_METRICS.COMMENT</code>.
     */
    val COMMENT: TableField<Record, String?> = createField(DSL.name("COMMENT"), SQLDataType.VARCHAR(193).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>information_schema.INNODB_METRICS</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.INNODB_METRICS</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.INNODB_METRICS</code> table reference
     */
    constructor(): this(DSL.name("INNODB_METRICS"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, INNODB_METRICS, null)
    override fun getSchema(): Schema = InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): InnodbMetrics = InnodbMetrics(DSL.name(alias), this)
    override fun `as`(alias: Name): InnodbMetrics = InnodbMetrics(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): InnodbMetrics = InnodbMetrics(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): InnodbMetrics = InnodbMetrics(name, null)
}
