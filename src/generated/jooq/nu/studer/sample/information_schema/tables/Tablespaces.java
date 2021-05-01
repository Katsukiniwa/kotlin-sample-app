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
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tablespaces extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.TABLESPACES</code>
     */
    public static final Tablespaces TABLESPACES = new Tablespaces();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.TABLESPACES.TABLESPACE_NAME</code>.
     */
    public final TableField<Record, String> TABLESPACE_NAME = createField(DSL.name("TABLESPACE_NAME"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.TABLESPACES.ENGINE</code>.
     */
    public final TableField<Record, String> ENGINE = createField(DSL.name("ENGINE"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.TABLESPACES.TABLESPACE_TYPE</code>.
     */
    public final TableField<Record, String> TABLESPACE_TYPE = createField(DSL.name("TABLESPACE_TYPE"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>information_schema.TABLESPACES.LOGFILE_GROUP_NAME</code>.
     */
    public final TableField<Record, String> LOGFILE_GROUP_NAME = createField(DSL.name("LOGFILE_GROUP_NAME"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>information_schema.TABLESPACES.EXTENT_SIZE</code>.
     */
    public final TableField<Record, ULong> EXTENT_SIZE = createField(DSL.name("EXTENT_SIZE"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.TABLESPACES.AUTOEXTEND_SIZE</code>.
     */
    public final TableField<Record, ULong> AUTOEXTEND_SIZE = createField(DSL.name("AUTOEXTEND_SIZE"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.TABLESPACES.MAXIMUM_SIZE</code>.
     */
    public final TableField<Record, ULong> MAXIMUM_SIZE = createField(DSL.name("MAXIMUM_SIZE"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.TABLESPACES.NODEGROUP_ID</code>.
     */
    public final TableField<Record, ULong> NODEGROUP_ID = createField(DSL.name("NODEGROUP_ID"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.TABLESPACES.TABLESPACE_COMMENT</code>.
     */
    public final TableField<Record, String> TABLESPACE_COMMENT = createField(DSL.name("TABLESPACE_COMMENT"), SQLDataType.VARCHAR(2048), this, "");

    private Tablespaces(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Tablespaces(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.TABLESPACES</code> table reference
     */
    public Tablespaces(String alias) {
        this(DSL.name(alias), TABLESPACES);
    }

    /**
     * Create an aliased <code>information_schema.TABLESPACES</code> table reference
     */
    public Tablespaces(Name alias) {
        this(alias, TABLESPACES);
    }

    /**
     * Create a <code>information_schema.TABLESPACES</code> table reference
     */
    public Tablespaces() {
        this(DSL.name("TABLESPACES"), null);
    }

    public <O extends Record> Tablespaces(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, TABLESPACES);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Tablespaces as(String alias) {
        return new Tablespaces(DSL.name(alias), this);
    }

    @Override
    public Tablespaces as(Name alias) {
        return new Tablespaces(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Tablespaces rename(String name) {
        return new Tablespaces(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tablespaces rename(Name name) {
        return new Tablespaces(name, null);
    }
}
