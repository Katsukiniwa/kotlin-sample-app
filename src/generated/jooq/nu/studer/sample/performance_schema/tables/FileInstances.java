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


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FileInstances extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>performance_schema.file_instances</code>
     */
    public static final FileInstances FILE_INSTANCES = new FileInstances();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>performance_schema.file_instances.FILE_NAME</code>.
     */
    public final TableField<Record, String> FILE_NAME = createField(DSL.name("FILE_NAME"), SQLDataType.VARCHAR(512).nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_instances.EVENT_NAME</code>.
     */
    public final TableField<Record, String> EVENT_NAME = createField(DSL.name("EVENT_NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_instances.OPEN_COUNT</code>.
     */
    public final TableField<Record, UInteger> OPEN_COUNT = createField(DSL.name("OPEN_COUNT"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    private FileInstances(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private FileInstances(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>performance_schema.file_instances</code> table reference
     */
    public FileInstances(String alias) {
        this(DSL.name(alias), FILE_INSTANCES);
    }

    /**
     * Create an aliased <code>performance_schema.file_instances</code> table reference
     */
    public FileInstances(Name alias) {
        this(alias, FILE_INSTANCES);
    }

    /**
     * Create a <code>performance_schema.file_instances</code> table reference
     */
    public FileInstances() {
        this(DSL.name("file_instances"), null);
    }

    public <O extends Record> FileInstances(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, FILE_INSTANCES);
    }

    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public FileInstances as(String alias) {
        return new FileInstances(DSL.name(alias), this);
    }

    @Override
    public FileInstances as(Name alias) {
        return new FileInstances(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FileInstances rename(String name) {
        return new FileInstances(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FileInstances rename(Name name) {
        return new FileInstances(name, null);
    }
}