/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.kotlin_sample_app.tables


import java.time.LocalDateTime

import kotlin.collections.List

import nu.studer.sample.kotlin_sample_app.KotlinSampleApp
import nu.studer.sample.kotlin_sample_app.indexes.FLYWAY_SCHEMA_HISTORY_FLYWAY_SCHEMA_HISTORY_S_IDX
import nu.studer.sample.kotlin_sample_app.keys.KEY_FLYWAY_SCHEMA_HISTORY_PRIMARY

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Index
import org.jooq.Name
import org.jooq.Record
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class FlywaySchemaHistory(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, Record>?,
    aliased: Table<Record>?,
    parameters: Array<Field<*>?>?
): TableImpl<Record>(
    alias,
    KotlinSampleApp.KOTLIN_SAMPLE_APP,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>kotlin_sample_app.flyway_schema_history</code>
         */
        val FLYWAY_SCHEMA_HISTORY = FlywaySchemaHistory()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>kotlin_sample_app.flyway_schema_history.installed_rank</code>.
     */
    val INSTALLED_RANK: TableField<Record, Int?> = createField(DSL.name("installed_rank"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>kotlin_sample_app.flyway_schema_history.version</code>.
     */
    val VERSION: TableField<Record, String?> = createField(DSL.name("version"), SQLDataType.VARCHAR(50), this, "")

    /**
     * The column <code>kotlin_sample_app.flyway_schema_history.description</code>.
     */
    val DESCRIPTION: TableField<Record, String?> = createField(DSL.name("description"), SQLDataType.VARCHAR(200).nullable(false), this, "")

    /**
     * The column <code>kotlin_sample_app.flyway_schema_history.type</code>.
     */
    val TYPE: TableField<Record, String?> = createField(DSL.name("type"), SQLDataType.VARCHAR(20).nullable(false), this, "")

    /**
     * The column <code>kotlin_sample_app.flyway_schema_history.script</code>.
     */
    val SCRIPT: TableField<Record, String?> = createField(DSL.name("script"), SQLDataType.VARCHAR(1000).nullable(false), this, "")

    /**
     * The column <code>kotlin_sample_app.flyway_schema_history.checksum</code>.
     */
    val CHECKSUM: TableField<Record, Int?> = createField(DSL.name("checksum"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>kotlin_sample_app.flyway_schema_history.installed_by</code>.
     */
    val INSTALLED_BY: TableField<Record, String?> = createField(DSL.name("installed_by"), SQLDataType.VARCHAR(100).nullable(false), this, "")

    /**
     * The column <code>kotlin_sample_app.flyway_schema_history.installed_on</code>.
     */
    val INSTALLED_ON: TableField<Record, LocalDateTime?> = createField(DSL.name("installed_on"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "")

    /**
     * The column <code>kotlin_sample_app.flyway_schema_history.execution_time</code>.
     */
    val EXECUTION_TIME: TableField<Record, Int?> = createField(DSL.name("execution_time"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>kotlin_sample_app.flyway_schema_history.success</code>.
     */
    val SUCCESS: TableField<Record, Byte?> = createField(DSL.name("success"), SQLDataType.TINYINT.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>kotlin_sample_app.flyway_schema_history</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>kotlin_sample_app.flyway_schema_history</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>kotlin_sample_app.flyway_schema_history</code> table reference
     */
    constructor(): this(DSL.name("flyway_schema_history"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, FLYWAY_SCHEMA_HISTORY, null)
    override fun getSchema(): Schema = KotlinSampleApp.KOTLIN_SAMPLE_APP
    override fun getIndexes(): List<Index> = listOf(FLYWAY_SCHEMA_HISTORY_FLYWAY_SCHEMA_HISTORY_S_IDX)
    override fun getPrimaryKey(): UniqueKey<Record> = KEY_FLYWAY_SCHEMA_HISTORY_PRIMARY
    override fun getKeys(): List<UniqueKey<Record>> = listOf(KEY_FLYWAY_SCHEMA_HISTORY_PRIMARY)
    override fun `as`(alias: String): FlywaySchemaHistory = FlywaySchemaHistory(DSL.name(alias), this)
    override fun `as`(alias: Name): FlywaySchemaHistory = FlywaySchemaHistory(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): FlywaySchemaHistory = FlywaySchemaHistory(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): FlywaySchemaHistory = FlywaySchemaHistory(name, null)
}