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
import org.jooq.types.ULong


/**
 * VIEW
 */
@Suppress("UNCHECKED_CAST")
open class `X$session`(
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
    TableOptions.view("create view `x\$session` as select `x\$processlist`.`thd_id` AS `thd_id`,`x\$processlist`.`conn_id` AS `conn_id`,`x\$processlist`.`user` AS `user`,`x\$processlist`.`db` AS `db`,`x\$processlist`.`command` AS `command`,`x\$processlist`.`state` AS `state`,`x\$processlist`.`time` AS `time`,`x\$processlist`.`current_statement` AS `current_statement`,`x\$processlist`.`statement_latency` AS `statement_latency`,`x\$processlist`.`progress` AS `progress`,`x\$processlist`.`lock_latency` AS `lock_latency`,`x\$processlist`.`rows_examined` AS `rows_examined`,`x\$processlist`.`rows_sent` AS `rows_sent`,`x\$processlist`.`rows_affected` AS `rows_affected`,`x\$processlist`.`tmp_tables` AS `tmp_tables`,`x\$processlist`.`tmp_disk_tables` AS `tmp_disk_tables`,`x\$processlist`.`full_scan` AS `full_scan`,`x\$processlist`.`last_statement` AS `last_statement`,`x\$processlist`.`last_statement_latency` AS `last_statement_latency`,`x\$processlist`.`current_memory` AS `current_memory`,`x\$processlist`.`last_wait` AS `last_wait`,`x\$processlist`.`last_wait_latency` AS `last_wait_latency`,`x\$processlist`.`source` AS `source`,`x\$processlist`.`trx_latency` AS `trx_latency`,`x\$processlist`.`trx_state` AS `trx_state`,`x\$processlist`.`trx_autocommit` AS `trx_autocommit`,`x\$processlist`.`pid` AS `pid`,`x\$processlist`.`program_name` AS `program_name` from `sys`.`x\$processlist` where ((`x\$processlist`.`conn_id` is not null) and (`x\$processlist`.`command` <> 'Daemon'))")
) {
    companion object {

        /**
         * The reference instance of <code>sys.x$session</code>
         */
        val `X$SESSION` = `X$session`()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>sys.x$session.thd_id</code>.
     */
    val THD_ID: TableField<Record, ULong?> = createField(DSL.name("thd_id"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sys.x$session.conn_id</code>.
     */
    val CONN_ID: TableField<Record, ULong?> = createField(DSL.name("conn_id"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>sys.x$session.user</code>.
     */
    val USER: TableField<Record, String?> = createField(DSL.name("user"), SQLDataType.VARCHAR(128), this, "")

    /**
     * The column <code>sys.x$session.db</code>.
     */
    val DB: TableField<Record, String?> = createField(DSL.name("db"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>sys.x$session.command</code>.
     */
    val COMMAND: TableField<Record, String?> = createField(DSL.name("command"), SQLDataType.VARCHAR(16), this, "")

    /**
     * The column <code>sys.x$session.state</code>.
     */
    val STATE: TableField<Record, String?> = createField(DSL.name("state"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>sys.x$session.time</code>.
     */
    val TIME: TableField<Record, Long?> = createField(DSL.name("time"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>sys.x$session.current_statement</code>.
     */
    val CURRENT_STATEMENT: TableField<Record, String?> = createField(DSL.name("current_statement"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>sys.x$session.statement_latency</code>.
     */
    val STATEMENT_LATENCY: TableField<Record, ULong?> = createField(DSL.name("statement_latency"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>sys.x$session.progress</code>.
     */
    val PROGRESS: TableField<Record, BigDecimal?> = createField(DSL.name("progress"), SQLDataType.DECIMAL(26, 2), this, "")

    /**
     * The column <code>sys.x$session.lock_latency</code>.
     */
    val LOCK_LATENCY: TableField<Record, ULong?> = createField(DSL.name("lock_latency"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>sys.x$session.rows_examined</code>.
     */
    val ROWS_EXAMINED: TableField<Record, ULong?> = createField(DSL.name("rows_examined"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>sys.x$session.rows_sent</code>.
     */
    val ROWS_SENT: TableField<Record, ULong?> = createField(DSL.name("rows_sent"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>sys.x$session.rows_affected</code>.
     */
    val ROWS_AFFECTED: TableField<Record, ULong?> = createField(DSL.name("rows_affected"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>sys.x$session.tmp_tables</code>.
     */
    val TMP_TABLES: TableField<Record, ULong?> = createField(DSL.name("tmp_tables"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>sys.x$session.tmp_disk_tables</code>.
     */
    val TMP_DISK_TABLES: TableField<Record, ULong?> = createField(DSL.name("tmp_disk_tables"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>sys.x$session.full_scan</code>.
     */
    val FULL_SCAN: TableField<Record, String?> = createField(DSL.name("full_scan"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>sys.x$session.last_statement</code>.
     */
    val LAST_STATEMENT: TableField<Record, String?> = createField(DSL.name("last_statement"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>sys.x$session.last_statement_latency</code>.
     */
    val LAST_STATEMENT_LATENCY: TableField<Record, ULong?> = createField(DSL.name("last_statement_latency"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>sys.x$session.current_memory</code>.
     */
    val CURRENT_MEMORY: TableField<Record, BigInteger?> = createField(DSL.name("current_memory"), SQLDataType.DECIMAL_INTEGER(41), this, "")

    /**
     * The column <code>sys.x$session.last_wait</code>.
     */
    val LAST_WAIT: TableField<Record, String?> = createField(DSL.name("last_wait"), SQLDataType.VARCHAR(128), this, "")

    /**
     * The column <code>sys.x$session.last_wait_latency</code>.
     */
    val LAST_WAIT_LATENCY: TableField<Record, String?> = createField(DSL.name("last_wait_latency"), SQLDataType.VARCHAR(20), this, "")

    /**
     * The column <code>sys.x$session.source</code>.
     */
    val SOURCE: TableField<Record, String?> = createField(DSL.name("source"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>sys.x$session.trx_latency</code>.
     */
    val TRX_LATENCY: TableField<Record, ULong?> = createField(DSL.name("trx_latency"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>sys.x$session.trx_state</code>.
     */
    val TRX_STATE: TableField<Record, nu.studer.sample.sys.enums.`X$sessionTrxState`?> = createField(DSL.name("trx_state"), SQLDataType.VARCHAR(11).asEnumDataType(nu.studer.sample.sys.enums.`X$sessionTrxState`::class.java), this, "")

    /**
     * The column <code>sys.x$session.trx_autocommit</code>.
     */
    val TRX_AUTOCOMMIT: TableField<Record, nu.studer.sample.sys.enums.`X$sessionTrxAutocommit`?> = createField(DSL.name("trx_autocommit"), SQLDataType.VARCHAR(3).asEnumDataType(nu.studer.sample.sys.enums.`X$sessionTrxAutocommit`::class.java), this, "")

    /**
     * The column <code>sys.x$session.pid</code>.
     */
    val PID: TableField<Record, String?> = createField(DSL.name("pid"), SQLDataType.VARCHAR(1024), this, "")

    /**
     * The column <code>sys.x$session.program_name</code>.
     */
    val PROGRAM_NAME: TableField<Record, String?> = createField(DSL.name("program_name"), SQLDataType.VARCHAR(1024), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>sys.x$session</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sys.x$session</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sys.x$session</code> table reference
     */
    constructor(): this(DSL.name("x\$session"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, `X$SESSION`, null)
    override fun getSchema(): Schema = Sys.SYS
    override fun `as`(alias: String): `X$session` = `X$session`(DSL.name(alias), this)
    override fun `as`(alias: Name): `X$session` = `X$session`(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): `X$session` = `X$session`(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): `X$session` = `X$session`(name, null)
}