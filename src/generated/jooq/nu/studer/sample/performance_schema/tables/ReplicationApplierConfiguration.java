/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.performance_schema.tables;


import nu.studer.sample.performance_schema.PerformanceSchema;

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


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReplicationApplierConfiguration extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>performance_schema.replication_applier_configuration</code>
     */
    public static final ReplicationApplierConfiguration REPLICATION_APPLIER_CONFIGURATION = new ReplicationApplierConfiguration();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>performance_schema.replication_applier_configuration.CHANNEL_NAME</code>.
     */
    public final TableField<Record, String> CHANNEL_NAME = createField(DSL.name("CHANNEL_NAME"), SQLDataType.CHAR(64).nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_applier_configuration.DESIRED_DELAY</code>.
     */
    public final TableField<Record, Integer> DESIRED_DELAY = createField(DSL.name("DESIRED_DELAY"), SQLDataType.INTEGER.nullable(false), this, "");

    private ReplicationApplierConfiguration(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private ReplicationApplierConfiguration(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>performance_schema.replication_applier_configuration</code> table reference
     */
    public ReplicationApplierConfiguration(String alias) {
        this(DSL.name(alias), REPLICATION_APPLIER_CONFIGURATION);
    }

    /**
     * Create an aliased <code>performance_schema.replication_applier_configuration</code> table reference
     */
    public ReplicationApplierConfiguration(Name alias) {
        this(alias, REPLICATION_APPLIER_CONFIGURATION);
    }

    /**
     * Create a <code>performance_schema.replication_applier_configuration</code> table reference
     */
    public ReplicationApplierConfiguration() {
        this(DSL.name("replication_applier_configuration"), null);
    }

    public <O extends Record> ReplicationApplierConfiguration(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, REPLICATION_APPLIER_CONFIGURATION);
    }

    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public ReplicationApplierConfiguration as(String alias) {
        return new ReplicationApplierConfiguration(DSL.name(alias), this);
    }

    @Override
    public ReplicationApplierConfiguration as(Name alias) {
        return new ReplicationApplierConfiguration(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReplicationApplierConfiguration rename(String name) {
        return new ReplicationApplierConfiguration(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReplicationApplierConfiguration rename(Name name) {
        return new ReplicationApplierConfiguration(name, null);
    }
}
