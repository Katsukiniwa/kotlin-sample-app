/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.mysql.tables


import kotlin.collections.List

import nu.studer.sample.mysql.Mysql
import nu.studer.sample.mysql.keys.KEY_SERVERS_PRIMARY

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
 * MySQL Foreign Servers table
 */
@Suppress("UNCHECKED_CAST")
open class Servers(
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
    DSL.comment("MySQL Foreign Servers table"),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>mysql.servers</code>
         */
        val SERVERS = Servers()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>mysql.servers.Server_name</code>.
     */
    val SERVER_NAME: TableField<Record, String?> = createField(DSL.name("Server_name"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "")

    /**
     * The column <code>mysql.servers.Host</code>.
     */
    val HOST: TableField<Record, String?> = createField(DSL.name("Host"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "")

    /**
     * The column <code>mysql.servers.Db</code>.
     */
    val DB: TableField<Record, String?> = createField(DSL.name("Db"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "")

    /**
     * The column <code>mysql.servers.Username</code>.
     */
    val USERNAME: TableField<Record, String?> = createField(DSL.name("Username"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "")

    /**
     * The column <code>mysql.servers.Password</code>.
     */
    val PASSWORD: TableField<Record, String?> = createField(DSL.name("Password"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "")

    /**
     * The column <code>mysql.servers.Port</code>.
     */
    val PORT: TableField<Record, Int?> = createField(DSL.name("Port"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "")

    /**
     * The column <code>mysql.servers.Socket</code>.
     */
    val SOCKET: TableField<Record, String?> = createField(DSL.name("Socket"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "")

    /**
     * The column <code>mysql.servers.Wrapper</code>.
     */
    val WRAPPER: TableField<Record, String?> = createField(DSL.name("Wrapper"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "")

    /**
     * The column <code>mysql.servers.Owner</code>.
     */
    val OWNER: TableField<Record, String?> = createField(DSL.name("Owner"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>mysql.servers</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>mysql.servers</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>mysql.servers</code> table reference
     */
    constructor(): this(DSL.name("servers"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, SERVERS, null)
    override fun getSchema(): Schema = Mysql.MYSQL
    override fun getPrimaryKey(): UniqueKey<Record> = KEY_SERVERS_PRIMARY
    override fun getKeys(): List<UniqueKey<Record>> = listOf(KEY_SERVERS_PRIMARY)
    override fun `as`(alias: String): Servers = Servers(DSL.name(alias), this)
    override fun `as`(alias: Name): Servers = Servers(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Servers = Servers(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Servers = Servers(name, null)
}
