/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.sys.tables;


import nu.studer.sample.sys.Sys;

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
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SchemaTablesWithFullTableScans extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.schema_tables_with_full_table_scans</code>
     */
    public static final SchemaTablesWithFullTableScans SCHEMA_TABLES_WITH_FULL_TABLE_SCANS = new SchemaTablesWithFullTableScans();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>sys.schema_tables_with_full_table_scans.object_schema</code>.
     */
    public final TableField<Record, String> OBJECT_SCHEMA = createField(DSL.name("object_schema"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.schema_tables_with_full_table_scans.object_name</code>.
     */
    public final TableField<Record, String> OBJECT_NAME = createField(DSL.name("object_name"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.schema_tables_with_full_table_scans.rows_full_scanned</code>.
     */
    public final TableField<Record, ULong> ROWS_FULL_SCANNED = createField(DSL.name("rows_full_scanned"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.schema_tables_with_full_table_scans.latency</code>.
     */
    public final TableField<Record, String> LATENCY = createField(DSL.name("latency"), SQLDataType.CLOB, this, "");

    private SchemaTablesWithFullTableScans(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private SchemaTablesWithFullTableScans(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `schema_tables_with_full_table_scans` as select `performance_schema`.`table_io_waits_summary_by_index_usage`.`OBJECT_SCHEMA` AS `object_schema`,`performance_schema`.`table_io_waits_summary_by_index_usage`.`OBJECT_NAME` AS `object_name`,`performance_schema`.`table_io_waits_summary_by_index_usage`.`COUNT_READ` AS `rows_full_scanned`,`sys`.`format_time`(`performance_schema`.`table_io_waits_summary_by_index_usage`.`SUM_TIMER_WAIT`) AS `latency` from `performance_schema`.`table_io_waits_summary_by_index_usage` where (isnull(`performance_schema`.`table_io_waits_summary_by_index_usage`.`INDEX_NAME`) and (`performance_schema`.`table_io_waits_summary_by_index_usage`.`COUNT_READ` > 0)) order by `performance_schema`.`table_io_waits_summary_by_index_usage`.`COUNT_READ` desc"));
    }

    /**
     * Create an aliased <code>sys.schema_tables_with_full_table_scans</code> table reference
     */
    public SchemaTablesWithFullTableScans(String alias) {
        this(DSL.name(alias), SCHEMA_TABLES_WITH_FULL_TABLE_SCANS);
    }

    /**
     * Create an aliased <code>sys.schema_tables_with_full_table_scans</code> table reference
     */
    public SchemaTablesWithFullTableScans(Name alias) {
        this(alias, SCHEMA_TABLES_WITH_FULL_TABLE_SCANS);
    }

    /**
     * Create a <code>sys.schema_tables_with_full_table_scans</code> table reference
     */
    public SchemaTablesWithFullTableScans() {
        this(DSL.name("schema_tables_with_full_table_scans"), null);
    }

    public <O extends Record> SchemaTablesWithFullTableScans(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, SCHEMA_TABLES_WITH_FULL_TABLE_SCANS);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public SchemaTablesWithFullTableScans as(String alias) {
        return new SchemaTablesWithFullTableScans(DSL.name(alias), this);
    }

    @Override
    public SchemaTablesWithFullTableScans as(Name alias) {
        return new SchemaTablesWithFullTableScans(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemaTablesWithFullTableScans rename(String name) {
        return new SchemaTablesWithFullTableScans(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemaTablesWithFullTableScans rename(Name name) {
        return new SchemaTablesWithFullTableScans(name, null);
    }
}
