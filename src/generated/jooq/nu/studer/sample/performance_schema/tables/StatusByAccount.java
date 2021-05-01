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
public class StatusByAccount extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>performance_schema.status_by_account</code>
     */
    public static final StatusByAccount STATUS_BY_ACCOUNT = new StatusByAccount();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>performance_schema.status_by_account.USER</code>.
     */
    public final TableField<Record, String> USER = createField(DSL.name("USER"), SQLDataType.CHAR(32), this, "");

    /**
     * The column <code>performance_schema.status_by_account.HOST</code>.
     */
    public final TableField<Record, String> HOST = createField(DSL.name("HOST"), SQLDataType.CHAR(60), this, "");

    /**
     * The column <code>performance_schema.status_by_account.VARIABLE_NAME</code>.
     */
    public final TableField<Record, String> VARIABLE_NAME = createField(DSL.name("VARIABLE_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>performance_schema.status_by_account.VARIABLE_VALUE</code>.
     */
    public final TableField<Record, String> VARIABLE_VALUE = createField(DSL.name("VARIABLE_VALUE"), SQLDataType.VARCHAR(1024), this, "");

    private StatusByAccount(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private StatusByAccount(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>performance_schema.status_by_account</code> table reference
     */
    public StatusByAccount(String alias) {
        this(DSL.name(alias), STATUS_BY_ACCOUNT);
    }

    /**
     * Create an aliased <code>performance_schema.status_by_account</code> table reference
     */
    public StatusByAccount(Name alias) {
        this(alias, STATUS_BY_ACCOUNT);
    }

    /**
     * Create a <code>performance_schema.status_by_account</code> table reference
     */
    public StatusByAccount() {
        this(DSL.name("status_by_account"), null);
    }

    public <O extends Record> StatusByAccount(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, STATUS_BY_ACCOUNT);
    }

    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public StatusByAccount as(String alias) {
        return new StatusByAccount(DSL.name(alias), this);
    }

    @Override
    public StatusByAccount as(Name alias) {
        return new StatusByAccount(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public StatusByAccount rename(String name) {
        return new StatusByAccount(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public StatusByAccount rename(Name name) {
        return new StatusByAccount(name, null);
    }
}
