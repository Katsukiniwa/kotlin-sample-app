/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.mysql.tables


import java.time.LocalDateTime

import kotlin.collections.List

import nu.studer.sample.mysql.Mysql
import nu.studer.sample.mysql.keys.KEY_SERVER_COST_PRIMARY

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
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class ServerCost(
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
    DSL.comment(""),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>mysql.server_cost</code>
         */
        val SERVER_COST = ServerCost()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>mysql.server_cost.cost_name</code>.
     */
    val COST_NAME: TableField<Record, String?> = createField(DSL.name("cost_name"), SQLDataType.VARCHAR(64).nullable(false), this, "")

    /**
     * The column <code>mysql.server_cost.cost_value</code>.
     */
    val COST_VALUE: TableField<Record, Double?> = createField(DSL.name("cost_value"), SQLDataType.FLOAT, this, "")

    /**
     * The column <code>mysql.server_cost.last_update</code>.
     */
    val LAST_UPDATE: TableField<Record, LocalDateTime?> = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "")

    /**
     * The column <code>mysql.server_cost.comment</code>.
     */
    val COMMENT: TableField<Record, String?> = createField(DSL.name("comment"), SQLDataType.VARCHAR(1024), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>mysql.server_cost</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>mysql.server_cost</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>mysql.server_cost</code> table reference
     */
    constructor(): this(DSL.name("server_cost"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, SERVER_COST, null)
    override fun getSchema(): Schema = Mysql.MYSQL
    override fun getPrimaryKey(): UniqueKey<Record> = KEY_SERVER_COST_PRIMARY
    override fun getKeys(): List<UniqueKey<Record>> = listOf(KEY_SERVER_COST_PRIMARY)
    override fun `as`(alias: String): ServerCost = ServerCost(DSL.name(alias), this)
    override fun `as`(alias: Name): ServerCost = ServerCost(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): ServerCost = ServerCost(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): ServerCost = ServerCost(name, null)
}
