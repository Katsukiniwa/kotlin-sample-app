/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.mysql.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import nu.studer.sample.mysql.Keys;
import nu.studer.sample.mysql.Mysql;
import nu.studer.sample.mysql.enums.EventIntervalField;
import nu.studer.sample.mysql.enums.EventOnCompletion;
import nu.studer.sample.mysql.enums.EventStatus;

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
 * Events
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Event extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>mysql.event</code>
     */
    public static final Event EVENT = new Event();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>mysql.event.db</code>.
     */
    public final TableField<Record, String> DB = createField(DSL.name("db"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.event.name</code>.
     */
    public final TableField<Record, String> NAME = createField(DSL.name("name"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.event.body</code>.
     */
    public final TableField<Record, byte[]> BODY = createField(DSL.name("body"), SQLDataType.BLOB.nullable(false), this, "");

    /**
     * The column <code>mysql.event.definer</code>.
     */
    public final TableField<Record, String> DEFINER = createField(DSL.name("definer"), SQLDataType.CHAR(93).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.event.execute_at</code>.
     */
    public final TableField<Record, LocalDateTime> EXECUTE_AT = createField(DSL.name("execute_at"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>mysql.event.interval_value</code>.
     */
    public final TableField<Record, Integer> INTERVAL_VALUE = createField(DSL.name("interval_value"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>mysql.event.interval_field</code>.
     */
    public final TableField<Record, EventIntervalField> INTERVAL_FIELD = createField(DSL.name("interval_field"), SQLDataType.VARCHAR(18).asEnumDataType(nu.studer.sample.mysql.enums.EventIntervalField.class), this, "");

    /**
     * The column <code>mysql.event.created</code>.
     */
    public final TableField<Record, LocalDateTime> CREATED = createField(DSL.name("created"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>mysql.event.modified</code>.
     */
    public final TableField<Record, LocalDateTime> MODIFIED = createField(DSL.name("modified"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.inline("0000-00-00 00:00:00", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>mysql.event.last_executed</code>.
     */
    public final TableField<Record, LocalDateTime> LAST_EXECUTED = createField(DSL.name("last_executed"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>mysql.event.starts</code>.
     */
    public final TableField<Record, LocalDateTime> STARTS = createField(DSL.name("starts"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>mysql.event.ends</code>.
     */
    public final TableField<Record, LocalDateTime> ENDS = createField(DSL.name("ends"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>mysql.event.status</code>.
     */
    public final TableField<Record, EventStatus> STATUS = createField(DSL.name("status"), SQLDataType.VARCHAR(18).nullable(false).defaultValue(DSL.inline("ENABLED", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.EventStatus.class), this, "");

    /**
     * The column <code>mysql.event.on_completion</code>.
     */
    public final TableField<Record, EventOnCompletion> ON_COMPLETION = createField(DSL.name("on_completion"), SQLDataType.VARCHAR(8).nullable(false).defaultValue(DSL.inline("DROP", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.EventOnCompletion.class), this, "");

    /**
     * The column <code>mysql.event.sql_mode</code>.
     */
    public final TableField<Record, String> SQL_MODE = createField(DSL.name("sql_mode"), SQLDataType.VARCHAR(478).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.event.comment</code>.
     */
    public final TableField<Record, String> COMMENT = createField(DSL.name("comment"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.event.originator</code>.
     */
    public final TableField<Record, UInteger> ORIGINATOR = createField(DSL.name("originator"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.event.time_zone</code>.
     */
    public final TableField<Record, String> TIME_ZONE = createField(DSL.name("time_zone"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("SYSTEM", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.event.character_set_client</code>.
     */
    public final TableField<Record, String> CHARACTER_SET_CLIENT = createField(DSL.name("character_set_client"), SQLDataType.CHAR(32), this, "");

    /**
     * The column <code>mysql.event.collation_connection</code>.
     */
    public final TableField<Record, String> COLLATION_CONNECTION = createField(DSL.name("collation_connection"), SQLDataType.CHAR(32), this, "");

    /**
     * The column <code>mysql.event.db_collation</code>.
     */
    public final TableField<Record, String> DB_COLLATION = createField(DSL.name("db_collation"), SQLDataType.CHAR(32), this, "");

    /**
     * The column <code>mysql.event.body_utf8</code>.
     */
    public final TableField<Record, byte[]> BODY_UTF8 = createField(DSL.name("body_utf8"), SQLDataType.BLOB, this, "");

    private Event(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Event(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Events"), TableOptions.table());
    }

    /**
     * Create an aliased <code>mysql.event</code> table reference
     */
    public Event(String alias) {
        this(DSL.name(alias), EVENT);
    }

    /**
     * Create an aliased <code>mysql.event</code> table reference
     */
    public Event(Name alias) {
        this(alias, EVENT);
    }

    /**
     * Create a <code>mysql.event</code> table reference
     */
    public Event() {
        this(DSL.name("event"), null);
    }

    public <O extends Record> Event(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, EVENT);
    }

    @Override
    public Schema getSchema() {
        return Mysql.MYSQL;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.KEY_EVENT_PRIMARY;
    }

    @Override
    public List<UniqueKey<Record>> getKeys() {
        return Arrays.<UniqueKey<Record>>asList(Keys.KEY_EVENT_PRIMARY);
    }

    @Override
    public Event as(String alias) {
        return new Event(DSL.name(alias), this);
    }

    @Override
    public Event as(Name alias) {
        return new Event(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Event rename(String name) {
        return new Event(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Event rename(Name name) {
        return new Event(name, null);
    }
}