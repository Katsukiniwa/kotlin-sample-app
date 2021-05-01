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
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserVariablesByThread extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>performance_schema.user_variables_by_thread</code>
     */
    public static final UserVariablesByThread USER_VARIABLES_BY_THREAD = new UserVariablesByThread();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>performance_schema.user_variables_by_thread.THREAD_ID</code>.
     */
    public final TableField<Record, ULong> THREAD_ID = createField(DSL.name("THREAD_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.user_variables_by_thread.VARIABLE_NAME</code>.
     */
    public final TableField<Record, String> VARIABLE_NAME = createField(DSL.name("VARIABLE_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>performance_schema.user_variables_by_thread.VARIABLE_VALUE</code>.
     */
    public final TableField<Record, byte[]> VARIABLE_VALUE = createField(DSL.name("VARIABLE_VALUE"), SQLDataType.BLOB, this, "");

    private UserVariablesByThread(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private UserVariablesByThread(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>performance_schema.user_variables_by_thread</code> table reference
     */
    public UserVariablesByThread(String alias) {
        this(DSL.name(alias), USER_VARIABLES_BY_THREAD);
    }

    /**
     * Create an aliased <code>performance_schema.user_variables_by_thread</code> table reference
     */
    public UserVariablesByThread(Name alias) {
        this(alias, USER_VARIABLES_BY_THREAD);
    }

    /**
     * Create a <code>performance_schema.user_variables_by_thread</code> table reference
     */
    public UserVariablesByThread() {
        this(DSL.name("user_variables_by_thread"), null);
    }

    public <O extends Record> UserVariablesByThread(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, USER_VARIABLES_BY_THREAD);
    }

    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public UserVariablesByThread as(String alias) {
        return new UserVariablesByThread(DSL.name(alias), this);
    }

    @Override
    public UserVariablesByThread as(Name alias) {
        return new UserVariablesByThread(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserVariablesByThread rename(String name) {
        return new UserVariablesByThread(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserVariablesByThread rename(Name name) {
        return new UserVariablesByThread(name, null);
    }
}