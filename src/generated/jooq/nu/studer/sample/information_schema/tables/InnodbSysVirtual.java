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
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbSysVirtual extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.INNODB_SYS_VIRTUAL</code>
     */
    public static final InnodbSysVirtual INNODB_SYS_VIRTUAL = new InnodbSysVirtual();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.INNODB_SYS_VIRTUAL.TABLE_ID</code>.
     */
    public final TableField<Record, ULong> TABLE_ID = createField(DSL.name("TABLE_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_VIRTUAL.POS</code>.
     */
    public final TableField<Record, UInteger> POS = createField(DSL.name("POS"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_VIRTUAL.BASE_POS</code>.
     */
    public final TableField<Record, UInteger> BASE_POS = createField(DSL.name("BASE_POS"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGERUNSIGNED)), this, "");

    private InnodbSysVirtual(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private InnodbSysVirtual(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_VIRTUAL</code> table reference
     */
    public InnodbSysVirtual(String alias) {
        this(DSL.name(alias), INNODB_SYS_VIRTUAL);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_VIRTUAL</code> table reference
     */
    public InnodbSysVirtual(Name alias) {
        this(alias, INNODB_SYS_VIRTUAL);
    }

    /**
     * Create a <code>information_schema.INNODB_SYS_VIRTUAL</code> table reference
     */
    public InnodbSysVirtual() {
        this(DSL.name("INNODB_SYS_VIRTUAL"), null);
    }

    public <O extends Record> InnodbSysVirtual(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, INNODB_SYS_VIRTUAL);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbSysVirtual as(String alias) {
        return new InnodbSysVirtual(DSL.name(alias), this);
    }

    @Override
    public InnodbSysVirtual as(Name alias) {
        return new InnodbSysVirtual(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbSysVirtual rename(String name) {
        return new InnodbSysVirtual(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbSysVirtual rename(Name name) {
        return new InnodbSysVirtual(name, null);
    }
}