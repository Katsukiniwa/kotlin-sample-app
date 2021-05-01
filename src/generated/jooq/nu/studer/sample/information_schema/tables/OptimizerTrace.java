/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.information_schema.tables;


import nu.studer.sample.information_schema.InformationSchema;

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
public class OptimizerTrace extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.OPTIMIZER_TRACE</code>
     */
    public static final OptimizerTrace OPTIMIZER_TRACE = new OptimizerTrace();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.OPTIMIZER_TRACE.QUERY</code>.
     */
    public final TableField<Record, String> QUERY = createField(DSL.name("QUERY"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>information_schema.OPTIMIZER_TRACE.TRACE</code>.
     */
    public final TableField<Record, String> TRACE = createField(DSL.name("TRACE"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>information_schema.OPTIMIZER_TRACE.MISSING_BYTES_BEYOND_MAX_MEM_SIZE</code>.
     */
    public final TableField<Record, Integer> MISSING_BYTES_BEYOND_MAX_MEM_SIZE = createField(DSL.name("MISSING_BYTES_BEYOND_MAX_MEM_SIZE"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.OPTIMIZER_TRACE.INSUFFICIENT_PRIVILEGES</code>.
     */
    public final TableField<Record, Byte> INSUFFICIENT_PRIVILEGES = createField(DSL.name("INSUFFICIENT_PRIVILEGES"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.TINYINT)), this, "");

    private OptimizerTrace(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private OptimizerTrace(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.OPTIMIZER_TRACE</code> table reference
     */
    public OptimizerTrace(String alias) {
        this(DSL.name(alias), OPTIMIZER_TRACE);
    }

    /**
     * Create an aliased <code>information_schema.OPTIMIZER_TRACE</code> table reference
     */
    public OptimizerTrace(Name alias) {
        this(alias, OPTIMIZER_TRACE);
    }

    /**
     * Create a <code>information_schema.OPTIMIZER_TRACE</code> table reference
     */
    public OptimizerTrace() {
        this(DSL.name("OPTIMIZER_TRACE"), null);
    }

    public <O extends Record> OptimizerTrace(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, OPTIMIZER_TRACE);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public OptimizerTrace as(String alias) {
        return new OptimizerTrace(DSL.name(alias), this);
    }

    @Override
    public OptimizerTrace as(Name alias) {
        return new OptimizerTrace(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OptimizerTrace rename(String name) {
        return new OptimizerTrace(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OptimizerTrace rename(Name name) {
        return new OptimizerTrace(name, null);
    }
}
