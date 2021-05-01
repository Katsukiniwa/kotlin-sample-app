/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.performance_schema.tables;


import java.time.LocalDateTime;

import nu.studer.sample.performance_schema.PerformanceSchema;
import nu.studer.sample.performance_schema.enums.ReplicationApplierStatusByWorkerServiceState;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReplicationApplierStatusByWorker extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>performance_schema.replication_applier_status_by_worker</code>
     */
    public static final ReplicationApplierStatusByWorker REPLICATION_APPLIER_STATUS_BY_WORKER = new ReplicationApplierStatusByWorker();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>performance_schema.replication_applier_status_by_worker.CHANNEL_NAME</code>.
     */
    public final TableField<Record, String> CHANNEL_NAME = createField(DSL.name("CHANNEL_NAME"), SQLDataType.CHAR(64).nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_applier_status_by_worker.WORKER_ID</code>.
     */
    public final TableField<Record, ULong> WORKER_ID = createField(DSL.name("WORKER_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_applier_status_by_worker.THREAD_ID</code>.
     */
    public final TableField<Record, ULong> THREAD_ID = createField(DSL.name("THREAD_ID"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.replication_applier_status_by_worker.SERVICE_STATE</code>.
     */
    public final TableField<Record, ReplicationApplierStatusByWorkerServiceState> SERVICE_STATE = createField(DSL.name("SERVICE_STATE"), SQLDataType.VARCHAR(3).nullable(false).asEnumDataType(nu.studer.sample.performance_schema.enums.ReplicationApplierStatusByWorkerServiceState.class), this, "");

    /**
     * The column <code>performance_schema.replication_applier_status_by_worker.LAST_SEEN_TRANSACTION</code>.
     */
    public final TableField<Record, String> LAST_SEEN_TRANSACTION = createField(DSL.name("LAST_SEEN_TRANSACTION"), SQLDataType.CHAR(57).nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_applier_status_by_worker.LAST_ERROR_NUMBER</code>.
     */
    public final TableField<Record, Integer> LAST_ERROR_NUMBER = createField(DSL.name("LAST_ERROR_NUMBER"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_applier_status_by_worker.LAST_ERROR_MESSAGE</code>.
     */
    public final TableField<Record, String> LAST_ERROR_MESSAGE = createField(DSL.name("LAST_ERROR_MESSAGE"), SQLDataType.VARCHAR(1024).nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_applier_status_by_worker.LAST_ERROR_TIMESTAMP</code>.
     */
    public final TableField<Record, LocalDateTime> LAST_ERROR_TIMESTAMP = createField(DSL.name("LAST_ERROR_TIMESTAMP"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    private ReplicationApplierStatusByWorker(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private ReplicationApplierStatusByWorker(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>performance_schema.replication_applier_status_by_worker</code> table reference
     */
    public ReplicationApplierStatusByWorker(String alias) {
        this(DSL.name(alias), REPLICATION_APPLIER_STATUS_BY_WORKER);
    }

    /**
     * Create an aliased <code>performance_schema.replication_applier_status_by_worker</code> table reference
     */
    public ReplicationApplierStatusByWorker(Name alias) {
        this(alias, REPLICATION_APPLIER_STATUS_BY_WORKER);
    }

    /**
     * Create a <code>performance_schema.replication_applier_status_by_worker</code> table reference
     */
    public ReplicationApplierStatusByWorker() {
        this(DSL.name("replication_applier_status_by_worker"), null);
    }

    public <O extends Record> ReplicationApplierStatusByWorker(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, REPLICATION_APPLIER_STATUS_BY_WORKER);
    }

    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public ReplicationApplierStatusByWorker as(String alias) {
        return new ReplicationApplierStatusByWorker(DSL.name(alias), this);
    }

    @Override
    public ReplicationApplierStatusByWorker as(Name alias) {
        return new ReplicationApplierStatusByWorker(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReplicationApplierStatusByWorker rename(String name) {
        return new ReplicationApplierStatusByWorker(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReplicationApplierStatusByWorker rename(Name name) {
        return new ReplicationApplierStatusByWorker(name, null);
    }
}
