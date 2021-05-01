/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.sys.tables


import java.time.LocalDateTime

import kotlin.collections.List

import nu.studer.sample.sys.Sys
import nu.studer.sample.sys.keys.KEY_SYS_CONFIG_PRIMARY

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
open class SysConfig(
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
    DSL.comment(""),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>sys.sys_config</code>
         */
        val SYS_CONFIG = SysConfig()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>sys.sys_config.variable</code>.
     */
    val VARIABLE: TableField<Record, String?> = createField(DSL.name("variable"), SQLDataType.VARCHAR(128).nullable(false), this, "")

    /**
     * The column <code>sys.sys_config.value</code>.
     */
    val VALUE: TableField<Record, String?> = createField(DSL.name("value"), SQLDataType.VARCHAR(128), this, "")

    /**
     * The column <code>sys.sys_config.set_time</code>.
     */
    val SET_TIME: TableField<Record, LocalDateTime?> = createField(DSL.name("set_time"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "")

    /**
     * The column <code>sys.sys_config.set_by</code>.
     */
    val SET_BY: TableField<Record, String?> = createField(DSL.name("set_by"), SQLDataType.VARCHAR(128), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>sys.sys_config</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sys.sys_config</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sys.sys_config</code> table reference
     */
    constructor(): this(DSL.name("sys_config"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, SYS_CONFIG, null)
    override fun getSchema(): Schema = Sys.SYS
    override fun getPrimaryKey(): UniqueKey<Record> = KEY_SYS_CONFIG_PRIMARY
    override fun getKeys(): List<UniqueKey<Record>> = listOf(KEY_SYS_CONFIG_PRIMARY)
    override fun `as`(alias: String): SysConfig = SysConfig(DSL.name(alias), this)
    override fun `as`(alias: Name): SysConfig = SysConfig(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): SysConfig = SysConfig(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): SysConfig = SysConfig(name, null)
}
