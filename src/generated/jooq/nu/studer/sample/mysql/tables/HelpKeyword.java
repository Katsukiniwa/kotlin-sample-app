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
import org.jooq.types.UInteger;


/**
 * help keywords
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HelpKeyword extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>mysql.help_keyword</code>
     */
    public static final HelpKeyword HELP_KEYWORD = new HelpKeyword();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>mysql.help_keyword.help_keyword_id</code>.
     */
    public final TableField<Record, UInteger> HELP_KEYWORD_ID = createField(DSL.name("help_keyword_id"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.help_keyword.name</code>.
     */
    public final TableField<Record, String> NAME = createField(DSL.name("name"), SQLDataType.CHAR(64).nullable(false), this, "");

    private HelpKeyword(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private HelpKeyword(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("help keywords"), TableOptions.table());
    }

    /**
     * Create an aliased <code>mysql.help_keyword</code> table reference
     */
    public HelpKeyword(String alias) {
        this(DSL.name(alias), HELP_KEYWORD);
    }

    /**
     * Create an aliased <code>mysql.help_keyword</code> table reference
     */
    public HelpKeyword(Name alias) {
        this(alias, HELP_KEYWORD);
    }

    /**
     * Create a <code>mysql.help_keyword</code> table reference
     */
    public HelpKeyword() {
        this(DSL.name("help_keyword"), null);
    }

    public <O extends Record> HelpKeyword(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, HELP_KEYWORD);
    }

    @Override
    public Schema getSchema() {
        return Mysql.MYSQL;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.KEY_HELP_KEYWORD_PRIMARY;
    }

    @Override
    public List<UniqueKey<Record>> getKeys() {
        return Arrays.<UniqueKey<Record>>asList(Keys.KEY_HELP_KEYWORD_PRIMARY, Keys.KEY_HELP_KEYWORD_NAME);
    }

    @Override
    public HelpKeyword as(String alias) {
        return new HelpKeyword(DSL.name(alias), this);
    }

    @Override
    public HelpKeyword as(Name alias) {
        return new HelpKeyword(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HelpKeyword rename(String name) {
        return new HelpKeyword(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public HelpKeyword rename(Name name) {
        return new HelpKeyword(name, null);
    }
}
