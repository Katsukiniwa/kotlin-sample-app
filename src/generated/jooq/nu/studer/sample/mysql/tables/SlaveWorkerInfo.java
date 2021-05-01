/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.mysql.tables;


import java.util.Arrays;
import java.util.List;

import nu.studer.sample.mysql.Keys;
import nu.studer.sample.mysql.Mysql;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * Worker Information
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SlaveWorkerInfo extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>mysql.slave_worker_info</code>
     */
    public static final SlaveWorkerInfo SLAVE_WORKER_INFO = new SlaveWorkerInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>mysql.slave_worker_info.Id</code>.
     */
    public final TableField<Record, UInteger> ID = createField(DSL.name("Id"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.slave_worker_info.Relay_log_name</code>.
     */
    public final TableField<Record, String> RELAY_LOG_NAME = createField(DSL.name("Relay_log_name"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>mysql.slave_worker_info.Relay_log_pos</code>.
     */
    public final TableField<Record, ULong> RELAY_LOG_POS = createField(DSL.name("Relay_log_pos"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.slave_worker_info.Master_log_name</code>.
     */
    public final TableField<Record, String> MASTER_LOG_NAME = createField(DSL.name("Master_log_name"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>mysql.slave_worker_info.Master_log_pos</code>.
     */
    public final TableField<Record, ULong> MASTER_LOG_POS = createField(DSL.name("Master_log_pos"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.slave_worker_info.Checkpoint_relay_log_name</code>.
     */
    public final TableField<Record, String> CHECKPOINT_RELAY_LOG_NAME = createField(DSL.name("Checkpoint_relay_log_name"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>mysql.slave_worker_info.Checkpoint_relay_log_pos</code>.
     */
    public final TableField<Record, ULong> CHECKPOINT_RELAY_LOG_POS = createField(DSL.name("Checkpoint_relay_log_pos"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.slave_worker_info.Checkpoint_master_log_name</code>.
     */
    public final TableField<Record, String> CHECKPOINT_MASTER_LOG_NAME = createField(DSL.name("Checkpoint_master_log_name"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>mysql.slave_worker_info.Checkpoint_master_log_pos</code>.
     */
    public final TableField<Record, ULong> CHECKPOINT_MASTER_LOG_POS = createField(DSL.name("Checkpoint_master_log_pos"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.slave_worker_info.Checkpoint_seqno</code>.
     */
    public final TableField<Record, UInteger> CHECKPOINT_SEQNO = createField(DSL.name("Checkpoint_seqno"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.slave_worker_info.Checkpoint_group_size</code>.
     */
    public final TableField<Record, UInteger> CHECKPOINT_GROUP_SIZE = createField(DSL.name("Checkpoint_group_size"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.slave_worker_info.Checkpoint_group_bitmap</code>.
     */
    public final TableField<Record, byte[]> CHECKPOINT_GROUP_BITMAP = createField(DSL.name("Checkpoint_group_bitmap"), SQLDataType.BLOB.nullable(false), this, "");

    /**
     * The column <code>mysql.slave_worker_info.Channel_name</code>. The channel on which the slave is connected to a source. Used in Multisource Replication
     */
    public final TableField<Record, String> CHANNEL_NAME = createField(DSL.name("Channel_name"), SQLDataType.CHAR(64).nullable(false), this, "The channel on which the slave is connected to a source. Used in Multisource Replication");

    private SlaveWorkerInfo(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private SlaveWorkerInfo(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Worker Information"), TableOptions.table());
    }

    /**
     * Create an aliased <code>mysql.slave_worker_info</code> table reference
     */
    public SlaveWorkerInfo(String alias) {
        this(DSL.name(alias), SLAVE_WORKER_INFO);
    }

    /**
     * Create an aliased <code>mysql.slave_worker_info</code> table reference
     */
    public SlaveWorkerInfo(Name alias) {
        this(alias, SLAVE_WORKER_INFO);
    }

    /**
     * Create a <code>mysql.slave_worker_info</code> table reference
     */
    public SlaveWorkerInfo() {
        this(DSL.name("slave_worker_info"), null);
    }

    public <O extends Record> SlaveWorkerInfo(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, SLAVE_WORKER_INFO);
    }

    @Override
    public Schema getSchema() {
        return Mysql.MYSQL;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.KEY_SLAVE_WORKER_INFO_PRIMARY;
    }

    @Override
    public List<UniqueKey<Record>> getKeys() {
        return Arrays.<UniqueKey<Record>>asList(Keys.KEY_SLAVE_WORKER_INFO_PRIMARY);
    }

    @Override
    public SlaveWorkerInfo as(String alias) {
        return new SlaveWorkerInfo(DSL.name(alias), this);
    }

    @Override
    public SlaveWorkerInfo as(Name alias) {
        return new SlaveWorkerInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SlaveWorkerInfo rename(String name) {
        return new SlaveWorkerInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SlaveWorkerInfo rename(Name name) {
        return new SlaveWorkerInfo(name, null);
    }
}