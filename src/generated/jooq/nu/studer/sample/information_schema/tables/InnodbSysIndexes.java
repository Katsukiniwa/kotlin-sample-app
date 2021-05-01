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
public class InnodbSysIndexes extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.INNODB_SYS_INDEXES</code>
     */
    public static final InnodbSysIndexes INNODB_SYS_INDEXES = new InnodbSysIndexes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.INNODB_SYS_INDEXES.INDEX_ID</code>.
     */
    public final TableField<Record, ULong> INDEX_ID = createField(DSL.name("INDEX_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_INDEXES.NAME</code>.
     */
    public final TableField<Record, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(193).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_INDEXES.TABLE_ID</code>.
     */
    public final TableField<Record, ULong> TABLE_ID = createField(DSL.name("TABLE_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_INDEXES.TYPE</code>.
     */
    public final TableField<Record, Integer> TYPE = createField(DSL.name("TYPE"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_INDEXES.N_FIELDS</code>.
     */
    public final TableField<Record, Integer> N_FIELDS = createField(DSL.name("N_FIELDS"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_INDEXES.PAGE_NO</code>.
     */
    public final TableField<Record, Integer> PAGE_NO = createField(DSL.name("PAGE_NO"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_INDEXES.SPACE</code>.
     */
    public final TableField<Record, Integer> SPACE = createField(DSL.name("SPACE"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_INDEXES.MERGE_THRESHOLD</code>.
     */
    public final TableField<Record, Integer> MERGE_THRESHOLD = createField(DSL.name("MERGE_THRESHOLD"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    private InnodbSysIndexes(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private InnodbSysIndexes(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_INDEXES</code> table reference
     */
    public InnodbSysIndexes(String alias) {
        this(DSL.name(alias), INNODB_SYS_INDEXES);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_INDEXES</code> table reference
     */
    public InnodbSysIndexes(Name alias) {
        this(alias, INNODB_SYS_INDEXES);
    }

    /**
     * Create a <code>information_schema.INNODB_SYS_INDEXES</code> table reference
     */
    public InnodbSysIndexes() {
        this(DSL.name("INNODB_SYS_INDEXES"), null);
    }

    public <O extends Record> InnodbSysIndexes(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, INNODB_SYS_INDEXES);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbSysIndexes as(String alias) {
        return new InnodbSysIndexes(DSL.name(alias), this);
    }

    @Override
    public InnodbSysIndexes as(Name alias) {
        return new InnodbSysIndexes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbSysIndexes rename(String name) {
        return new InnodbSysIndexes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbSysIndexes rename(Name name) {
        return new InnodbSysIndexes(name, null);
    }
}