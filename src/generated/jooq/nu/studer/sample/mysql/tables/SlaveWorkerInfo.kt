/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.mysql.tables


import kotlin.collections.List

import nu.studer.sample.mysql.Mysql
import nu.studer.sample.mysql.keys.KEY_SLAVE_WORKER_INFO_PRIMARY

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
import org.jooq.types.ULong


/**
 * Worker Information
 */
@Suppress("UNCHECKED_CAST")
open class SlaveWorkerInfo(
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
    DSL.comment("Worker Information"),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>mysql.slave_worker_info</code>
         */
        val SLAVE_WORKER_INFO = SlaveWorkerInfo()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>mysql.slave_worker_info.Id</code>.
     */
    val ID: TableField<Record, UInteger?> = createField(DSL.name("Id"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>mysql.slave_worker_info.Relay_log_name</code>.
     */
    val RELAY_LOG_NAME: TableField<Record, String?> = createField(DSL.name("Relay_log_name"), SQLDataType.CLOB.nullable(false), this, "")

    /**
     * The column <code>mysql.slave_worker_info.Relay_log_pos</code>.
     */
    val RELAY_LOG_POS: TableField<Record, ULong?> = createField(DSL.name("Relay_log_pos"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>mysql.slave_worker_info.Master_log_name</code>.
     */
    val MASTER_LOG_NAME: TableField<Record, String?> = createField(DSL.name("Master_log_name"), SQLDataType.CLOB.nullable(false), this, "")

    /**
     * The column <code>mysql.slave_worker_info.Master_log_pos</code>.
     */
    val MASTER_LOG_POS: TableField<Record, ULong?> = createField(DSL.name("Master_log_pos"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>mysql.slave_worker_info.Checkpoint_relay_log_name</code>.
     */
    val CHECKPOINT_RELAY_LOG_NAME: TableField<Record, String?> = createField(DSL.name("Checkpoint_relay_log_name"), SQLDataType.CLOB.nullable(false), this, "")

    /**
     * The column <code>mysql.slave_worker_info.Checkpoint_relay_log_pos</code>.
     */
    val CHECKPOINT_RELAY_LOG_POS: TableField<Record, ULong?> = createField(DSL.name("Checkpoint_relay_log_pos"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>mysql.slave_worker_info.Checkpoint_master_log_name</code>.
     */
    val CHECKPOINT_MASTER_LOG_NAME: TableField<Record, String?> = createField(DSL.name("Checkpoint_master_log_name"), SQLDataType.CLOB.nullable(false), this, "")

    /**
     * The column <code>mysql.slave_worker_info.Checkpoint_master_log_pos</code>.
     */
    val CHECKPOINT_MASTER_LOG_POS: TableField<Record, ULong?> = createField(DSL.name("Checkpoint_master_log_pos"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>mysql.slave_worker_info.Checkpoint_seqno</code>.
     */
    val CHECKPOINT_SEQNO: TableField<Record, UInteger?> = createField(DSL.name("Checkpoint_seqno"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>mysql.slave_worker_info.Checkpoint_group_size</code>.
     */
    val CHECKPOINT_GROUP_SIZE: TableField<Record, UInteger?> = createField(DSL.name("Checkpoint_group_size"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>mysql.slave_worker_info.Checkpoint_group_bitmap</code>.
     */
    val CHECKPOINT_GROUP_BITMAP: TableField<Record, ByteArray?> = createField(DSL.name("Checkpoint_group_bitmap"), SQLDataType.BLOB.nullable(false), this, "")

    /**
     * The column <code>mysql.slave_worker_info.Channel_name</code>. The channel on which the slave is connected to a source. Used in Multisource Replication
     */
    val CHANNEL_NAME: TableField<Record, String?> = createField(DSL.name("Channel_name"), SQLDataType.CHAR(64).nullable(false), this, "The channel on which the slave is connected to a source. Used in Multisource Replication")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>mysql.slave_worker_info</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>mysql.slave_worker_info</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>mysql.slave_worker_info</code> table reference
     */
    constructor(): this(DSL.name("slave_worker_info"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, SLAVE_WORKER_INFO, null)
    override fun getSchema(): Schema = Mysql.MYSQL
    override fun getPrimaryKey(): UniqueKey<Record> = KEY_SLAVE_WORKER_INFO_PRIMARY
    override fun getKeys(): List<UniqueKey<Record>> = listOf(KEY_SLAVE_WORKER_INFO_PRIMARY)
    override fun `as`(alias: String): SlaveWorkerInfo = SlaveWorkerInfo(DSL.name(alias), this)
    override fun `as`(alias: Name): SlaveWorkerInfo = SlaveWorkerInfo(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): SlaveWorkerInfo = SlaveWorkerInfo(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): SlaveWorkerInfo = SlaveWorkerInfo(name, null)
}