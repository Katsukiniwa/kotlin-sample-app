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


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SchemaRedundantIndexes extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sys.schema_redundant_indexes</code>
     */
    public static final SchemaRedundantIndexes SCHEMA_REDUNDANT_INDEXES = new SchemaRedundantIndexes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>sys.schema_redundant_indexes.table_schema</code>.
     */
    public final TableField<Record, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sys.schema_redundant_indexes.table_name</code>.
     */
    public final TableField<Record, String> TABLE_NAME = createField(DSL.name("table_name"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sys.schema_redundant_indexes.redundant_index_name</code>.
     */
    public final TableField<Record, String> REDUNDANT_INDEX_NAME = createField(DSL.name("redundant_index_name"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sys.schema_redundant_indexes.redundant_index_columns</code>.
     */
    public final TableField<Record, String> REDUNDANT_INDEX_COLUMNS = createField(DSL.name("redundant_index_columns"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.schema_redundant_indexes.redundant_index_non_unique</code>.
     */
    public final TableField<Record, Long> REDUNDANT_INDEX_NON_UNIQUE = createField(DSL.name("redundant_index_non_unique"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>sys.schema_redundant_indexes.dominant_index_name</code>.
     */
    public final TableField<Record, String> DOMINANT_INDEX_NAME = createField(DSL.name("dominant_index_name"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sys.schema_redundant_indexes.dominant_index_columns</code>.
     */
    public final TableField<Record, String> DOMINANT_INDEX_COLUMNS = createField(DSL.name("dominant_index_columns"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.schema_redundant_indexes.dominant_index_non_unique</code>.
     */
    public final TableField<Record, Long> DOMINANT_INDEX_NON_UNIQUE = createField(DSL.name("dominant_index_non_unique"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>sys.schema_redundant_indexes.subpart_exists</code>.
     */
    public final TableField<Record, Integer> SUBPART_EXISTS = createField(DSL.name("subpart_exists"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>sys.schema_redundant_indexes.sql_drop_index</code>.
     */
    public final TableField<Record, String> SQL_DROP_INDEX = createField(DSL.name("sql_drop_index"), SQLDataType.VARCHAR(223), this, "");

    private SchemaRedundantIndexes(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private SchemaRedundantIndexes(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `schema_redundant_indexes` as select `redundant_keys`.`table_schema` AS `table_schema`,`redundant_keys`.`table_name` AS `table_name`,`redundant_keys`.`index_name` AS `redundant_index_name`,`redundant_keys`.`index_columns` AS `redundant_index_columns`,`redundant_keys`.`non_unique` AS `redundant_index_non_unique`,`dominant_keys`.`index_name` AS `dominant_index_name`,`dominant_keys`.`index_columns` AS `dominant_index_columns`,`dominant_keys`.`non_unique` AS `dominant_index_non_unique`,if((`redundant_keys`.`subpart_exists` or `dominant_keys`.`subpart_exists`),1,0) AS `subpart_exists`,concat('ALTER TABLE `',`redundant_keys`.`table_schema`,'`.`',`redundant_keys`.`table_name`,'` DROP INDEX `',`redundant_keys`.`index_name`,'`') AS `sql_drop_index` from (`sys`.`x$schema_flattened_keys` `redundant_keys` join `sys`.`x$schema_flattened_keys` `dominant_keys` on(((`redundant_keys`.`table_schema` = `dominant_keys`.`table_schema`) and (`redundant_keys`.`table_name` = `dominant_keys`.`table_name`)))) where ((`redundant_keys`.`index_name` <> `dominant_keys`.`index_name`) and (((`redundant_keys`.`index_columns` = `dominant_keys`.`index_columns`) and ((`redundant_keys`.`non_unique` > `dominant_keys`.`non_unique`) or ((`redundant_keys`.`non_unique` = `dominant_keys`.`non_unique`) and (if((`redundant_keys`.`index_name` = 'PRIMARY'),'',`redundant_keys`.`index_name`) > if((`dominant_keys`.`index_name` = 'PRIMARY'),'',`dominant_keys`.`index_name`))))) or ((locate(concat(`redundant_keys`.`index_columns`,','),`dominant_keys`.`index_columns`) = 1) and (`redundant_keys`.`non_unique` = 1)) or ((locate(concat(`dominant_keys`.`index_columns`,','),`redundant_keys`.`index_columns`) = 1) and (`dominant_keys`.`non_unique` = 0))))"));
    }

    /**
     * Create an aliased <code>sys.schema_redundant_indexes</code> table reference
     */
    public SchemaRedundantIndexes(String alias) {
        this(DSL.name(alias), SCHEMA_REDUNDANT_INDEXES);
    }

    /**
     * Create an aliased <code>sys.schema_redundant_indexes</code> table reference
     */
    public SchemaRedundantIndexes(Name alias) {
        this(alias, SCHEMA_REDUNDANT_INDEXES);
    }

    /**
     * Create a <code>sys.schema_redundant_indexes</code> table reference
     */
    public SchemaRedundantIndexes() {
        this(DSL.name("schema_redundant_indexes"), null);
    }

    public <O extends Record> SchemaRedundantIndexes(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, SCHEMA_REDUNDANT_INDEXES);
    }

    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    @Override
    public SchemaRedundantIndexes as(String alias) {
        return new SchemaRedundantIndexes(DSL.name(alias), this);
    }

    @Override
    public SchemaRedundantIndexes as(Name alias) {
        return new SchemaRedundantIndexes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemaRedundantIndexes rename(String name) {
        return new SchemaRedundantIndexes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemaRedundantIndexes rename(Name name) {
        return new SchemaRedundantIndexes(name, null);
    }
}
