/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.mysql.tables


import kotlin.collections.List

import nu.studer.sample.mysql.Mysql
import nu.studer.sample.mysql.keys.KEY_PLUGIN_PRIMARY

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
 * MySQL plugins
 */
@Suppress("UNCHECKED_CAST")
open class Plugin(
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
    DSL.comment("MySQL plugins"),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>mysql.plugin</code>
         */
        val PLUGIN = Plugin()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>mysql.plugin.name</code>.
     */
    val NAME: TableField<Record, String?> = createField(DSL.name("name"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>mysql.plugin.dl</code>.
     */
    val DL: TableField<Record, String?> = createField(DSL.name("dl"), SQLDataType.VARCHAR(128).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>mysql.plugin</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>mysql.plugin</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>mysql.plugin</code> table reference
     */
    constructor(): this(DSL.name("plugin"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, PLUGIN, null)
    override fun getSchema(): Schema = Mysql.MYSQL
    override fun getPrimaryKey(): UniqueKey<Record> = KEY_PLUGIN_PRIMARY
    override fun getKeys(): List<UniqueKey<Record>> = listOf(KEY_PLUGIN_PRIMARY)
    override fun `as`(alias: String): Plugin = Plugin(DSL.name(alias), this)
    override fun `as`(alias: Name): Plugin = Plugin(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Plugin = Plugin(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Plugin = Plugin(name, null)
}
