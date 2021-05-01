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
public class CharacterSets extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.CHARACTER_SETS</code>
     */
    public static final CharacterSets CHARACTER_SETS = new CharacterSets();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.CHARACTER_SETS.CHARACTER_SET_NAME</code>.
     */
    public final TableField<Record, String> CHARACTER_SET_NAME = createField(DSL.name("CHARACTER_SET_NAME"), SQLDataType.VARCHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.CHARACTER_SETS.DEFAULT_COLLATE_NAME</code>.
     */
    public final TableField<Record, String> DEFAULT_COLLATE_NAME = createField(DSL.name("DEFAULT_COLLATE_NAME"), SQLDataType.VARCHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.CHARACTER_SETS.DESCRIPTION</code>.
     */
    public final TableField<Record, String> DESCRIPTION = createField(DSL.name("DESCRIPTION"), SQLDataType.VARCHAR(60).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.CHARACTER_SETS.MAXLEN</code>.
     */
    public final TableField<Record, Long> MAXLEN = createField(DSL.name("MAXLEN"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "");

    private CharacterSets(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private CharacterSets(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.CHARACTER_SETS</code> table reference
     */
    public CharacterSets(String alias) {
        this(DSL.name(alias), CHARACTER_SETS);
    }

    /**
     * Create an aliased <code>information_schema.CHARACTER_SETS</code> table reference
     */
    public CharacterSets(Name alias) {
        this(alias, CHARACTER_SETS);
    }

    /**
     * Create a <code>information_schema.CHARACTER_SETS</code> table reference
     */
    public CharacterSets() {
        this(DSL.name("CHARACTER_SETS"), null);
    }

    public <O extends Record> CharacterSets(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, CHARACTER_SETS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public CharacterSets as(String alias) {
        return new CharacterSets(DSL.name(alias), this);
    }

    @Override
    public CharacterSets as(Name alias) {
        return new CharacterSets(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CharacterSets rename(String name) {
        return new CharacterSets(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CharacterSets rename(Name name) {
        return new CharacterSets(name, null);
    }
}