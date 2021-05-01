/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.mysql.tables


import kotlin.collections.List

import nu.studer.sample.mysql.Mysql
import nu.studer.sample.mysql.keys.KEY_HELP_TOPIC_NAME
import nu.studer.sample.mysql.keys.KEY_HELP_TOPIC_PRIMARY

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
import org.jooq.types.UInteger
import org.jooq.types.UShort


/**
 * help topics
 */
@Suppress("UNCHECKED_CAST")
open class HelpTopic(
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
    DSL.comment("help topics"),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>mysql.help_topic</code>
         */
        val HELP_TOPIC = HelpTopic()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>mysql.help_topic.help_topic_id</code>.
     */
    val HELP_TOPIC_ID: TableField<Record, UInteger?> = createField(DSL.name("help_topic_id"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>mysql.help_topic.name</code>.
     */
    val NAME: TableField<Record, String?> = createField(DSL.name("name"), SQLDataType.CHAR(64).nullable(false), this, "")

    /**
     * The column <code>mysql.help_topic.help_category_id</code>.
     */
    val HELP_CATEGORY_ID: TableField<Record, UShort?> = createField(DSL.name("help_category_id"), SQLDataType.SMALLINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>mysql.help_topic.description</code>.
     */
    val DESCRIPTION: TableField<Record, String?> = createField(DSL.name("description"), SQLDataType.CLOB.nullable(false), this, "")

    /**
     * The column <code>mysql.help_topic.example</code>.
     */
    val EXAMPLE: TableField<Record, String?> = createField(DSL.name("example"), SQLDataType.CLOB.nullable(false), this, "")

    /**
     * The column <code>mysql.help_topic.url</code>.
     */
    val URL: TableField<Record, String?> = createField(DSL.name("url"), SQLDataType.CLOB.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>mysql.help_topic</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>mysql.help_topic</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>mysql.help_topic</code> table reference
     */
    constructor(): this(DSL.name("help_topic"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, HELP_TOPIC, null)
    override fun getSchema(): Schema = Mysql.MYSQL
    override fun getPrimaryKey(): UniqueKey<Record> = KEY_HELP_TOPIC_PRIMARY
    override fun getKeys(): List<UniqueKey<Record>> = listOf(KEY_HELP_TOPIC_PRIMARY, KEY_HELP_TOPIC_NAME)
    override fun `as`(alias: String): HelpTopic = HelpTopic(DSL.name(alias), this)
    override fun `as`(alias: Name): HelpTopic = HelpTopic(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): HelpTopic = HelpTopic(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): HelpTopic = HelpTopic(name, null)
}