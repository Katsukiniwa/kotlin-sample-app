/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.mysql.tables;


import java.util.Arrays;
import java.util.List;

import nu.studer.sample.mysql.Keys;
import nu.studer.sample.mysql.Mysql;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * MySQL plugins
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Plugin extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>mysql.plugin</code>
     */
    public static final Plugin PLUGIN = new Plugin();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>mysql.plugin.name</code>.
     */
    public final TableField<Record, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.plugin.dl</code>.
     */
    public final TableField<Record, String> DL = createField(DSL.name("dl"), SQLDataType.VARCHAR(128).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    private Plugin(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Plugin(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("MySQL plugins"), TableOptions.table());
    }

    /**
     * Create an aliased <code>mysql.plugin</code> table reference
     */
    public Plugin(String alias) {
        this(DSL.name(alias), PLUGIN);
    }

    /**
     * Create an aliased <code>mysql.plugin</code> table reference
     */
    public Plugin(Name alias) {
        this(alias, PLUGIN);
    }

    /**
     * Create a <code>mysql.plugin</code> table reference
     */
    public Plugin() {
        this(DSL.name("plugin"), null);
    }

    public <O extends Record> Plugin(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, PLUGIN);
    }

    @Override
    public Schema getSchema() {
        return Mysql.MYSQL;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.KEY_PLUGIN_PRIMARY;
    }

    @Override
    public List<UniqueKey<Record>> getKeys() {
        return Arrays.<UniqueKey<Record>>asList(Keys.KEY_PLUGIN_PRIMARY);
    }

    @Override
    public Plugin as(String alias) {
        return new Plugin(DSL.name(alias), this);
    }

    @Override
    public Plugin as(Name alias) {
        return new Plugin(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Plugin rename(String name) {
        return new Plugin(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Plugin rename(Name name) {
        return new Plugin(name, null);
    }
}
