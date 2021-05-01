/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.mysql.tables


import kotlin.collections.List

import nu.studer.sample.mysql.Mysql
import nu.studer.sample.mysql.keys.KEY_HELP_CATEGORY_NAME
import nu.studer.sample.mysql.keys.KEY_HELP_CATEGORY_PRIMARY

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
import org.jooq.types.UShort


/**
 * help categories
 */
@Suppress("UNCHECKED_CAST")
open class HelpCategory(
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
    DSL.comment("help categories"),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>mysql.help_category</code>
         */
        val HELP_CATEGORY = HelpCategory()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>mysql.help_category.help_category_id</code>.
     */
    val HELP_CATEGORY_ID: TableField<Record, UShort?> = createField(DSL.name("help_category_id"), SQLDataType.SMALLINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>mysql.help_category.name</code>.
     */
    val NAME: TableField<Record, String?> = createField(DSL.name("name"), SQLDataType.CHAR(64).nullable(false), this, "")

    /**
     * The column <code>mysql.help_category.parent_category_id</code>.
     */
    val PARENT_CATEGORY_ID: TableField<Record, UShort?> = createField(DSL.name("parent_category_id"), SQLDataType.SMALLINTUNSIGNED, this, "")

    /**
     * The column <code>mysql.help_category.url</code>.
     */
    val URL: TableField<Record, String?> = createField(DSL.name("url"), SQLDataType.CLOB.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>mysql.help_category</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>mysql.help_category</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>mysql.help_category</code> table reference
     */
    constructor(): this(DSL.name("help_category"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, HELP_CATEGORY, null)
    override fun getSchema(): Schema = Mysql.MYSQL
    override fun getPrimaryKey(): UniqueKey<Record> = KEY_HELP_CATEGORY_PRIMARY
    override fun getKeys(): List<UniqueKey<Record>> = listOf(KEY_HELP_CATEGORY_PRIMARY, KEY_HELP_CATEGORY_NAME)
    override fun `as`(alias: String): HelpCategory = HelpCategory(DSL.name(alias), this)
    override fun `as`(alias: Name): HelpCategory = HelpCategory(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): HelpCategory = HelpCategory(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): HelpCategory = HelpCategory(name, null)
}