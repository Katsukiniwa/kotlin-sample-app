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
public class GlobalVariables extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.GLOBAL_VARIABLES</code>
     */
    public static final GlobalVariables GLOBAL_VARIABLES = new GlobalVariables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.GLOBAL_VARIABLES.VARIABLE_NAME</code>.
     */
    public final TableField<Record, String> VARIABLE_NAME = createField(DSL.name("VARIABLE_NAME"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.GLOBAL_VARIABLES.VARIABLE_VALUE</code>.
     */
    public final TableField<Record, String> VARIABLE_VALUE = createField(DSL.name("VARIABLE_VALUE"), SQLDataType.VARCHAR(1024), this, "");

    private GlobalVariables(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private GlobalVariables(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.GLOBAL_VARIABLES</code> table reference
     */
    public GlobalVariables(String alias) {
        this(DSL.name(alias), GLOBAL_VARIABLES);
    }

    /**
     * Create an aliased <code>information_schema.GLOBAL_VARIABLES</code> table reference
     */
    public GlobalVariables(Name alias) {
        this(alias, GLOBAL_VARIABLES);
    }

    /**
     * Create a <code>information_schema.GLOBAL_VARIABLES</code> table reference
     */
    public GlobalVariables() {
        this(DSL.name("GLOBAL_VARIABLES"), null);
    }

    public <O extends Record> GlobalVariables(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, GLOBAL_VARIABLES);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public GlobalVariables as(String alias) {
        return new GlobalVariables(DSL.name(alias), this);
    }

    @Override
    public GlobalVariables as(Name alias) {
        return new GlobalVariables(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GlobalVariables rename(String name) {
        return new GlobalVariables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GlobalVariables rename(Name name) {
        return new GlobalVariables(name, null);
    }
}