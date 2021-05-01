/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.sys.tables


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
open class `X$latestFileIo`(
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
    TableOptions.view("create view `x\$latest_file_io` as select if(isnull(`information_schema`.`processlist`.`ID`),concat(substring_index(`performance_schema`.`threads`.`NAME`,'/',-(1)),':',`performance_schema`.`events_waits_history_long`.`THREAD_ID`),concat(`information_schema`.`processlist`.`USER`,'@',`information_schema`.`processlist`.`HOST`,':',`information_schema`.`processlist`.`ID`)) AS `thread`,`performance_schema`.`events_waits_history_long`.`OBJECT_NAME` AS `file`,`performance_schema`.`events_waits_history_long`.`TIMER_WAIT` AS `latency`,`performance_schema`.`events_waits_history_long`.`OPERATION` AS `operation`,`performance_schema`.`events_waits_history_long`.`NUMBER_OF_BYTES` AS `requested` from ((`performance_schema`.`events_waits_history_long` join `performance_schema`.`threads` on((`performance_schema`.`events_waits_history_long`.`THREAD_ID` = `performance_schema`.`threads`.`THREAD_ID`))) left join `information_schema`.`processlist` on((`performance_schema`.`threads`.`PROCESSLIST_ID` = `information_schema`.`processlist`.`ID`))) where ((`performance_schema`.`events_waits_history_long`.`OBJECT_NAME` is not null) and (`performance_schema`.`events_waits_history_long`.`EVENT_NAME` like 'wait/io/file/%')) order by `performance_schema`.`events_waits_history_long`.`TIMER_START`")
) {
    companion object {

        /**
         * The reference instance of <code>sys.x$latest_file_io</code>
         */
        val `X$LATEST_FILE_IO` = `X$latestFileIo`()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>sys.x$latest_file_io.thread</code>.
     */
    val THREAD: TableField<Record, String?> = createField(DSL.name("thread"), SQLDataType.VARCHAR(149), this, "")

    /**
     * The column <code>sys.x$latest_file_io.file</code>.
     */
    val FILE: TableField<Record, String?> = createField(DSL.name("file"), SQLDataType.VARCHAR(512), this, "")

    /**
     * The column <code>sys.x$latest_file_io.latency</code>.
     */
    val LATENCY: TableField<Record, ULong?> = createField(DSL.name("latency"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>sys.x$latest_file_io.operation</code>.
     */
    val OPERATION: TableField<Record, String?> = createField(DSL.name("operation"), SQLDataType.VARCHAR(32).nullable(false), this, "")

    /**
     * The column <code>sys.x$latest_file_io.requested</code>.
     */
    val REQUESTED: TableField<Record, Long?> = createField(DSL.name("requested"), SQLDataType.BIGINT, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>sys.x$latest_file_io</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sys.x$latest_file_io</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sys.x$latest_file_io</code> table reference
     */
    constructor(): this(DSL.name("x\$latest_file_io"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, `X$LATEST_FILE_IO`, null)
    override fun getSchema(): Schema = Sys.SYS
    override fun `as`(alias: String): `X$latestFileIo` = `X$latestFileIo`(DSL.name(alias), this)
    override fun `as`(alias: Name): `X$latestFileIo` = `X$latestFileIo`(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): `X$latestFileIo` = `X$latestFileIo`(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): `X$latestFileIo` = `X$latestFileIo`(name, null)
}
