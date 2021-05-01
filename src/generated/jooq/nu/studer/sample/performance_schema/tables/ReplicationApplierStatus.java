/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.performance_schema.tables;


import nu.studer.sample.performance_schema.PerformanceSchema;
import nu.studer.sample.performance_schema.enums.ReplicationApplierStatusServiceState;

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
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReplicationApplierStatus extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>performance_schema.replication_applier_status</code>
     */
    public static final ReplicationApplierStatus REPLICATION_APPLIER_STATUS = new ReplicationApplierStatus();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>performance_schema.replication_applier_status.CHANNEL_NAME</code>.
     */
    public final TableField<Record, String> CHANNEL_NAME = createField(DSL.name("CHANNEL_NAME"), SQLDataType.CHAR(64).nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_applier_status.SERVICE_STATE</code>.
     */
    public final TableField<Record, ReplicationApplierStatusServiceState> SERVICE_STATE = createField(DSL.name("SERVICE_STATE"), SQLDataType.VARCHAR(3).nullable(false).asEnumDataType(nu.studer.sample.performance_schema.enums.ReplicationApplierStatusServiceState.class), this, "");

    /**
     * The column <code>performance_schema.replication_applier_status.REMAINING_DELAY</code>.
     */
    public final TableField<Record, UInteger> REMAINING_DELAY = createField(DSL.name("REMAINING_DELAY"), SQLDataType.INTEGERUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.replication_applier_status.COUNT_TRANSACTIONS_RETRIES</code>.
     */
    public final TableField<Record, ULong> COUNT_TRANSACTIONS_RETRIES = createField(DSL.name("COUNT_TRANSACTIONS_RETRIES"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    private ReplicationApplierStatus(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private ReplicationApplierStatus(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>performance_schema.replication_applier_status</code> table reference
     */
    public ReplicationApplierStatus(String alias) {
        this(DSL.name(alias), REPLICATION_APPLIER_STATUS);
    }

    /**
     * Create an aliased <code>performance_schema.replication_applier_status</code> table reference
     */
    public ReplicationApplierStatus(Name alias) {
        this(alias, REPLICATION_APPLIER_STATUS);
    }

    /**
     * Create a <code>performance_schema.replication_applier_status</code> table reference
     */
    public ReplicationApplierStatus() {
        this(DSL.name("replication_applier_status"), null);
    }

    public <O extends Record> ReplicationApplierStatus(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, REPLICATION_APPLIER_STATUS);
    }

    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public ReplicationApplierStatus as(String alias) {
        return new ReplicationApplierStatus(DSL.name(alias), this);
    }

    @Override
    public ReplicationApplierStatus as(Name alias) {
        return new ReplicationApplierStatus(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReplicationApplierStatus rename(String name) {
        return new ReplicationApplierStatus(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReplicationApplierStatus rename(Name name) {
        return new ReplicationApplierStatus(name, null);
    }
}
