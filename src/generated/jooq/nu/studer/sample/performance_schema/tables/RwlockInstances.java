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
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RwlockInstances extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>performance_schema.rwlock_instances</code>
     */
    public static final RwlockInstances RWLOCK_INSTANCES = new RwlockInstances();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>performance_schema.rwlock_instances.NAME</code>.
     */
    public final TableField<Record, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.rwlock_instances.OBJECT_INSTANCE_BEGIN</code>.
     */
    public final TableField<Record, ULong> OBJECT_INSTANCE_BEGIN = createField(DSL.name("OBJECT_INSTANCE_BEGIN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.rwlock_instances.WRITE_LOCKED_BY_THREAD_ID</code>.
     */
    public final TableField<Record, ULong> WRITE_LOCKED_BY_THREAD_ID = createField(DSL.name("WRITE_LOCKED_BY_THREAD_ID"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.rwlock_instances.READ_LOCKED_BY_COUNT</code>.
     */
    public final TableField<Record, UInteger> READ_LOCKED_BY_COUNT = createField(DSL.name("READ_LOCKED_BY_COUNT"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    private RwlockInstances(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private RwlockInstances(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>performance_schema.rwlock_instances</code> table reference
     */
    public RwlockInstances(String alias) {
        this(DSL.name(alias), RWLOCK_INSTANCES);
    }

    /**
     * Create an aliased <code>performance_schema.rwlock_instances</code> table reference
     */
    public RwlockInstances(Name alias) {
        this(alias, RWLOCK_INSTANCES);
    }

    /**
     * Create a <code>performance_schema.rwlock_instances</code> table reference
     */
    public RwlockInstances() {
        this(DSL.name("rwlock_instances"), null);
    }

    public <O extends Record> RwlockInstances(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, RWLOCK_INSTANCES);
    }

    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public RwlockInstances as(String alias) {
        return new RwlockInstances(DSL.name(alias), this);
    }

    @Override
    public RwlockInstances as(Name alias) {
        return new RwlockInstances(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RwlockInstances rename(String name) {
        return new RwlockInstances(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RwlockInstances rename(Name name) {
        return new RwlockInstances(name, null);
    }
}