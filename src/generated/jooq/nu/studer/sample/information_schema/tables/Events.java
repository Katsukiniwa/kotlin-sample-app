/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.information_schema.tables;


import java.time.LocalDateTime;

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
public class Events extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.EVENTS</code>
     */
    public static final Events EVENTS = new Events();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.EVENTS.EVENT_CATALOG</code>.
     */
    public final TableField<Record, String> EVENT_CATALOG = createField(DSL.name("EVENT_CATALOG"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.EVENTS.EVENT_SCHEMA</code>.
     */
    public final TableField<Record, String> EVENT_SCHEMA = createField(DSL.name("EVENT_SCHEMA"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.EVENTS.EVENT_NAME</code>.
     */
    public final TableField<Record, String> EVENT_NAME = createField(DSL.name("EVENT_NAME"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.EVENTS.DEFINER</code>.
     */
    public final TableField<Record, String> DEFINER = createField(DSL.name("DEFINER"), SQLDataType.VARCHAR(93).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.EVENTS.TIME_ZONE</code>.
     */
    public final TableField<Record, String> TIME_ZONE = createField(DSL.name("TIME_ZONE"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.EVENTS.EVENT_BODY</code>.
     */
    public final TableField<Record, String> EVENT_BODY = createField(DSL.name("EVENT_BODY"), SQLDataType.VARCHAR(8).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.EVENTS.EVENT_DEFINITION</code>.
     */
    public final TableField<Record, String> EVENT_DEFINITION = createField(DSL.name("EVENT_DEFINITION"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>information_schema.EVENTS.EVENT_TYPE</code>.
     */
    public final TableField<Record, String> EVENT_TYPE = createField(DSL.name("EVENT_TYPE"), SQLDataType.VARCHAR(9).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.EVENTS.EXECUTE_AT</code>.
     */
    public final TableField<Record, LocalDateTime> EXECUTE_AT = createField(DSL.name("EXECUTE_AT"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>information_schema.EVENTS.INTERVAL_VALUE</code>.
     */
    public final TableField<Record, String> INTERVAL_VALUE = createField(DSL.name("INTERVAL_VALUE"), SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>information_schema.EVENTS.INTERVAL_FIELD</code>.
     */
    public final TableField<Record, String> INTERVAL_FIELD = createField(DSL.name("INTERVAL_FIELD"), SQLDataType.VARCHAR(18), this, "");

    /**
     * The column <code>information_schema.EVENTS.SQL_MODE</code>.
     */
    public final TableField<Record, String> SQL_MODE = createField(DSL.name("SQL_MODE"), SQLDataType.VARCHAR(8192).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.EVENTS.STARTS</code>.
     */
    public final TableField<Record, LocalDateTime> STARTS = createField(DSL.name("STARTS"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>information_schema.EVENTS.ENDS</code>.
     */
    public final TableField<Record, LocalDateTime> ENDS = createField(DSL.name("ENDS"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>information_schema.EVENTS.STATUS</code>.
     */
    public final TableField<Record, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(18).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.EVENTS.ON_COMPLETION</code>.
     */
    public final TableField<Record, String> ON_COMPLETION = createField(DSL.name("ON_COMPLETION"), SQLDataType.VARCHAR(12).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.EVENTS.CREATED</code>.
     */
    public final TableField<Record, LocalDateTime> CREATED = createField(DSL.name("CREATED"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.inline("0000-00-00 00:00:00", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>information_schema.EVENTS.LAST_ALTERED</code>.
     */
    public final TableField<Record, LocalDateTime> LAST_ALTERED = createField(DSL.name("LAST_ALTERED"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.inline("0000-00-00 00:00:00", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>information_schema.EVENTS.LAST_EXECUTED</code>.
     */
    public final TableField<Record, LocalDateTime> LAST_EXECUTED = createField(DSL.name("LAST_EXECUTED"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>information_schema.EVENTS.EVENT_COMMENT</code>.
     */
    public final TableField<Record, String> EVENT_COMMENT = createField(DSL.name("EVENT_COMMENT"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.EVENTS.ORIGINATOR</code>.
     */
    public final TableField<Record, Long> ORIGINATOR = createField(DSL.name("ORIGINATOR"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>information_schema.EVENTS.CHARACTER_SET_CLIENT</code>.
     */
    public final TableField<Record, String> CHARACTER_SET_CLIENT = createField(DSL.name("CHARACTER_SET_CLIENT"), SQLDataType.VARCHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.EVENTS.COLLATION_CONNECTION</code>.
     */
    public final TableField<Record, String> COLLATION_CONNECTION = createField(DSL.name("COLLATION_CONNECTION"), SQLDataType.VARCHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.EVENTS.DATABASE_COLLATION</code>.
     */
    public final TableField<Record, String> DATABASE_COLLATION = createField(DSL.name("DATABASE_COLLATION"), SQLDataType.VARCHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    private Events(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Events(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.EVENTS</code> table reference
     */
    public Events(String alias) {
        this(DSL.name(alias), EVENTS);
    }

    /**
     * Create an aliased <code>information_schema.EVENTS</code> table reference
     */
    public Events(Name alias) {
        this(alias, EVENTS);
    }

    /**
     * Create a <code>information_schema.EVENTS</code> table reference
     */
    public Events() {
        this(DSL.name("EVENTS"), null);
    }

    public <O extends Record> Events(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, EVENTS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Events as(String alias) {
        return new Events(DSL.name(alias), this);
    }

    @Override
    public Events as(Name alias) {
        return new Events(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Events rename(String name) {
        return new Events(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Events rename(Name name) {
        return new Events(name, null);
    }
}
