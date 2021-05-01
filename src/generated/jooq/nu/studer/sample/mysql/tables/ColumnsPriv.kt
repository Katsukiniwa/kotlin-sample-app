/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.mysql.tables


import java.time.LocalDateTime

import kotlin.collections.List

import nu.studer.sample.mysql.Mysql
import nu.studer.sample.mysql.keys.KEY_COLUMNS_PRIV_PRIMARY

import org.jooq.Field
import org.jooq.ForeignKey
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
 * Column privileges
 */
@Suppress("UNCHECKED_CAST")
open class ColumnsPriv(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, Record>?,
    aliased: Table<Record>?,
    parameters: Array<Field<*>?>?
): TableImpl<Record>(
    alias,
    Mysql.MYSQL,
    child,
    path,
    aliased,
    parameters,
    DSL.comment("Column privileges"),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>mysql.columns_priv</code>
         */
        val COLUMNS_PRIV = ColumnsPriv()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>mysql.columns_priv.Host</code>.
     */
    val HOST: TableField<Record, String?> = createField(DSL.name("Host"), SQLDataType.CHAR(60).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "")

    /**
     * The column <code>mysql.columns_priv.Db</code>.
     */
    val DB: TableField<Record, String?> = createField(DSL.name("Db"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "")

    /**
     * The column <code>mysql.columns_priv.User</code>.
     */
    val USER: TableField<Record, String?> = createField(DSL.name("User"), SQLDataType.CHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "")

    /**
     * The column <code>mysql.columns_priv.Table_name</code>.
     */
    val TABLE_NAME: TableField<Record, String?> = createField(DSL.name("Table_name"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "")

    /**
     * The column <code>mysql.columns_priv.Column_name</code>.
     */
    val COLUMN_NAME: TableField<Record, String?> = createField(DSL.name("Column_name"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "")

    /**
     * The column <code>mysql.columns_priv.Timestamp</code>.
     */
    val TIMESTAMP: TableField<Record, LocalDateTime?> = createField(DSL.name("Timestamp"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "")

    /**
     * The column <code>mysql.columns_priv.Column_priv</code>.
     */
    val COLUMN_PRIV: TableField<Record, String?> = createField(DSL.name("Column_priv"), SQLDataType.VARCHAR(31).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>mysql.columns_priv</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>mysql.columns_priv</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>mysql.columns_priv</code> table reference
     */
    constructor(): this(DSL.name("columns_priv"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, COLUMNS_PRIV, null)
    override fun getSchema(): Schema = Mysql.MYSQL
    override fun getPrimaryKey(): UniqueKey<Record> = KEY_COLUMNS_PRIV_PRIMARY
    override fun getKeys(): List<UniqueKey<Record>> = listOf(KEY_COLUMNS_PRIV_PRIMARY)
    override fun `as`(alias: String): ColumnsPriv = ColumnsPriv(DSL.name(alias), this)
    override fun `as`(alias: Name): ColumnsPriv = ColumnsPriv(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): ColumnsPriv = ColumnsPriv(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): ColumnsPriv = ColumnsPriv(name, null)
}
