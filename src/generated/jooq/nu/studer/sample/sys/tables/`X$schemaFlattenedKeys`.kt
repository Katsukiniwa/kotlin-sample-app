/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.sys.tables


import nu.studer.sample.sys.Sys

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * VIEW
 */
@Suppress("UNCHECKED_CAST")
open class `X$schemaFlattenedKeys`(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, Record>?,
    aliased: Table<Record>?,
    parameters: Array<Field<*>?>?
): TableImpl<Record>(
    alias,
    Sys.SYS,
    child,
    path,
    aliased,
    parameters,
    DSL.comment("VIEW"),
    TableOptions.view("create view `x\$schema_flattened_keys` as select `information_schema`.`STATISTICS`.`TABLE_SCHEMA` AS `table_schema`,`information_schema`.`STATISTICS`.`TABLE_NAME` AS `table_name`,`information_schema`.`STATISTICS`.`INDEX_NAME` AS `index_name`,max(`information_schema`.`STATISTICS`.`NON_UNIQUE`) AS `non_unique`,max(if(isnull(`information_schema`.`STATISTICS`.`SUB_PART`),0,1)) AS `subpart_exists`,group_concat(`information_schema`.`STATISTICS`.`COLUMN_NAME` order by `information_schema`.`STATISTICS`.`SEQ_IN_INDEX` ASC separator ',') AS `index_columns` from `INFORMATION_SCHEMA`.`STATISTICS` where ((`information_schema`.`STATISTICS`.`INDEX_TYPE` = 'BTREE') and (`information_schema`.`STATISTICS`.`TABLE_SCHEMA` not in ('mysql','sys','INFORMATION_SCHEMA','PERFORMANCE_SCHEMA'))) group by `information_schema`.`STATISTICS`.`TABLE_SCHEMA`,`information_schema`.`STATISTICS`.`TABLE_NAME`,`information_schema`.`STATISTICS`.`INDEX_NAME`")
) {
    companion object {

        /**
         * The reference instance of <code>sys.x$schema_flattened_keys</code>
         */
        val `X$SCHEMA_FLATTENED_KEYS` = `X$schemaFlattenedKeys`()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>sys.x$schema_flattened_keys.table_schema</code>.
     */
    val TABLE_SCHEMA: TableField<Record, String?> = createField(DSL.name("table_schema"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>sys.x$schema_flattened_keys.table_name</code>.
     */
    val TABLE_NAME: TableField<Record, String?> = createField(DSL.name("table_name"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>sys.x$schema_flattened_keys.index_name</code>.
     */
    val INDEX_NAME: TableField<Record, String?> = createField(DSL.name("index_name"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>sys.x$schema_flattened_keys.non_unique</code>.
     */
    val NON_UNIQUE: TableField<Record, Long?> = createField(DSL.name("non_unique"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>sys.x$schema_flattened_keys.subpart_exists</code>.
     */
    val SUBPART_EXISTS: TableField<Record, Long?> = createField(DSL.name("subpart_exists"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>sys.x$schema_flattened_keys.index_columns</code>.
     */
    val INDEX_COLUMNS: TableField<Record, String?> = createField(DSL.name("index_columns"), SQLDataType.CLOB, this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>sys.x$schema_flattened_keys</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sys.x$schema_flattened_keys</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sys.x$schema_flattened_keys</code> table reference
     */
    constructor(): this(DSL.name("x\$schema_flattened_keys"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, `X$SCHEMA_FLATTENED_KEYS`, null)
    override fun getSchema(): Schema = Sys.SYS
    override fun `as`(alias: String): `X$schemaFlattenedKeys` = `X$schemaFlattenedKeys`(DSL.name(alias), this)
    override fun `as`(alias: Name): `X$schemaFlattenedKeys` = `X$schemaFlattenedKeys`(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): `X$schemaFlattenedKeys` = `X$schemaFlattenedKeys`(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): `X$schemaFlattenedKeys` = `X$schemaFlattenedKeys`(name, null)
}