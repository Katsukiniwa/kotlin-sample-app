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
public class InnodbCmpPerIndexReset extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.INNODB_CMP_PER_INDEX_RESET</code>
     */
    public static final InnodbCmpPerIndexReset INNODB_CMP_PER_INDEX_RESET = new InnodbCmpPerIndexReset();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.INNODB_CMP_PER_INDEX_RESET.database_name</code>.
     */
    public final TableField<Record, String> DATABASE_NAME = createField(DSL.name("database_name"), SQLDataType.VARCHAR(192).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMP_PER_INDEX_RESET.table_name</code>.
     */
    public final TableField<Record, String> TABLE_NAME = createField(DSL.name("table_name"), SQLDataType.VARCHAR(192).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMP_PER_INDEX_RESET.index_name</code>.
     */
    public final TableField<Record, String> INDEX_NAME = createField(DSL.name("index_name"), SQLDataType.VARCHAR(192).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMP_PER_INDEX_RESET.compress_ops</code>.
     */
    public final TableField<Record, Integer> COMPRESS_OPS = createField(DSL.name("compress_ops"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMP_PER_INDEX_RESET.compress_ops_ok</code>.
     */
    public final TableField<Record, Integer> COMPRESS_OPS_OK = createField(DSL.name("compress_ops_ok"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMP_PER_INDEX_RESET.compress_time</code>.
     */
    public final TableField<Record, Integer> COMPRESS_TIME = createField(DSL.name("compress_time"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMP_PER_INDEX_RESET.uncompress_ops</code>.
     */
    public final TableField<Record, Integer> UNCOMPRESS_OPS = createField(DSL.name("uncompress_ops"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMP_PER_INDEX_RESET.uncompress_time</code>.
     */
    public final TableField<Record, Integer> UNCOMPRESS_TIME = createField(DSL.name("uncompress_time"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    private InnodbCmpPerIndexReset(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private InnodbCmpPerIndexReset(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.INNODB_CMP_PER_INDEX_RESET</code> table reference
     */
    public InnodbCmpPerIndexReset(String alias) {
        this(DSL.name(alias), INNODB_CMP_PER_INDEX_RESET);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_CMP_PER_INDEX_RESET</code> table reference
     */
    public InnodbCmpPerIndexReset(Name alias) {
        this(alias, INNODB_CMP_PER_INDEX_RESET);
    }

    /**
     * Create a <code>information_schema.INNODB_CMP_PER_INDEX_RESET</code> table reference
     */
    public InnodbCmpPerIndexReset() {
        this(DSL.name("INNODB_CMP_PER_INDEX_RESET"), null);
    }

    public <O extends Record> InnodbCmpPerIndexReset(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, INNODB_CMP_PER_INDEX_RESET);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbCmpPerIndexReset as(String alias) {
        return new InnodbCmpPerIndexReset(DSL.name(alias), this);
    }

    @Override
    public InnodbCmpPerIndexReset as(Name alias) {
        return new InnodbCmpPerIndexReset(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbCmpPerIndexReset rename(String name) {
        return new InnodbCmpPerIndexReset(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbCmpPerIndexReset rename(Name name) {
        return new InnodbCmpPerIndexReset(name, null);
    }
}