/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.information_schema.tables


import java.time.LocalDateTime

import nu.studer.sample.information_schema.InformationSchema

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
import org.jooq.types.ULong


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Partitions(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, Record>?,
    aliased: Table<Record>?,
    parameters: Array<Field<*>?>?
): TableImpl<Record>(
    alias,
    InformationSchema.INFORMATION_SCHEMA,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>information_schema.PARTITIONS</code>
         */
        val PARTITIONS = Partitions()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>information_schema.PARTITIONS.TABLE_CATALOG</code>.
     */
    val TABLE_CATALOG: TableField<Record, String?> = createField(DSL.name("TABLE_CATALOG"), SQLDataType.VARCHAR(512).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.PARTITIONS.TABLE_SCHEMA</code>.
     */
    val TABLE_SCHEMA: TableField<Record, String?> = createField(DSL.name("TABLE_SCHEMA"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.PARTITIONS.TABLE_NAME</code>.
     */
    val TABLE_NAME: TableField<Record, String?> = createField(DSL.name("TABLE_NAME"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.PARTITIONS.PARTITION_NAME</code>.
     */
    val PARTITION_NAME: TableField<Record, String?> = createField(DSL.name("PARTITION_NAME"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>information_schema.PARTITIONS.SUBPARTITION_NAME</code>.
     */
    val SUBPARTITION_NAME: TableField<Record, String?> = createField(DSL.name("SUBPARTITION_NAME"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>information_schema.PARTITIONS.PARTITION_ORDINAL_POSITION</code>.
     */
    val PARTITION_ORDINAL_POSITION: TableField<Record, ULong?> = createField(DSL.name("PARTITION_ORDINAL_POSITION"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>information_schema.PARTITIONS.SUBPARTITION_ORDINAL_POSITION</code>.
     */
    val SUBPARTITION_ORDINAL_POSITION: TableField<Record, ULong?> = createField(DSL.name("SUBPARTITION_ORDINAL_POSITION"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>information_schema.PARTITIONS.PARTITION_METHOD</code>.
     */
    val PARTITION_METHOD: TableField<Record, String?> = createField(DSL.name("PARTITION_METHOD"), SQLDataType.VARCHAR(18), this, "")

    /**
     * The column <code>information_schema.PARTITIONS.SUBPARTITION_METHOD</code>.
     */
    val SUBPARTITION_METHOD: TableField<Record, String?> = createField(DSL.name("SUBPARTITION_METHOD"), SQLDataType.VARCHAR(12), this, "")

    /**
     * The column <code>information_schema.PARTITIONS.PARTITION_EXPRESSION</code>.
     */
    val PARTITION_EXPRESSION: TableField<Record, String?> = createField(DSL.name("PARTITION_EXPRESSION"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>information_schema.PARTITIONS.SUBPARTITION_EXPRESSION</code>.
     */
    val SUBPARTITION_EXPRESSION: TableField<Record, String?> = createField(DSL.name("SUBPARTITION_EXPRESSION"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>information_schema.PARTITIONS.PARTITION_DESCRIPTION</code>.
     */
    val PARTITION_DESCRIPTION: TableField<Record, String?> = createField(DSL.name("PARTITION_DESCRIPTION"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>information_schema.PARTITIONS.TABLE_ROWS</code>.
     */
    val TABLE_ROWS: TableField<Record, ULong?> = createField(DSL.name("TABLE_ROWS"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column <code>information_schema.PARTITIONS.AVG_ROW_LENGTH</code>.
     */
    val AVG_ROW_LENGTH: TableField<Record, ULong?> = createField(DSL.name("AVG_ROW_LENGTH"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column <code>information_schema.PARTITIONS.DATA_LENGTH</code>.
     */
    val DATA_LENGTH: TableField<Record, ULong?> = createField(DSL.name("DATA_LENGTH"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column <code>information_schema.PARTITIONS.MAX_DATA_LENGTH</code>.
     */
    val MAX_DATA_LENGTH: TableField<Record, ULong?> = createField(DSL.name("MAX_DATA_LENGTH"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>information_schema.PARTITIONS.INDEX_LENGTH</code>.
     */
    val INDEX_LENGTH: TableField<Record, ULong?> = createField(DSL.name("INDEX_LENGTH"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column <code>information_schema.PARTITIONS.DATA_FREE</code>.
     */
    val DATA_FREE: TableField<Record, ULong?> = createField(DSL.name("DATA_FREE"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column <code>information_schema.PARTITIONS.CREATE_TIME</code>.
     */
    val CREATE_TIME: TableField<Record, LocalDateTime?> = createField(DSL.name("CREATE_TIME"), SQLDataType.LOCALDATETIME(0), this, "")

    /**
     * The column <code>information_schema.PARTITIONS.UPDATE_TIME</code>.
     */
    val UPDATE_TIME: TableField<Record, LocalDateTime?> = createField(DSL.name("UPDATE_TIME"), SQLDataType.LOCALDATETIME(0), this, "")

    /**
     * The column <code>information_schema.PARTITIONS.CHECK_TIME</code>.
     */
    val CHECK_TIME: TableField<Record, LocalDateTime?> = createField(DSL.name("CHECK_TIME"), SQLDataType.LOCALDATETIME(0), this, "")

    /**
     * The column <code>information_schema.PARTITIONS.CHECKSUM</code>.
     */
    val CHECKSUM: TableField<Record, ULong?> = createField(DSL.name("CHECKSUM"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>information_schema.PARTITIONS.PARTITION_COMMENT</code>.
     */
    val PARTITION_COMMENT: TableField<Record, String?> = createField(DSL.name("PARTITION_COMMENT"), SQLDataType.VARCHAR(80).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.PARTITIONS.NODEGROUP</code>.
     */
    val NODEGROUP: TableField<Record, String?> = createField(DSL.name("NODEGROUP"), SQLDataType.VARCHAR(12).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.PARTITIONS.TABLESPACE_NAME</code>.
     */
    val TABLESPACE_NAME: TableField<Record, String?> = createField(DSL.name("TABLESPACE_NAME"), SQLDataType.VARCHAR(64), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>information_schema.PARTITIONS</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.PARTITIONS</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.PARTITIONS</code> table reference
     */
    constructor(): this(DSL.name("PARTITIONS"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, PARTITIONS, null)
    override fun getSchema(): Schema = InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): Partitions = Partitions(DSL.name(alias), this)
    override fun `as`(alias: Name): Partitions = Partitions(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Partitions = Partitions(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Partitions = Partitions(name, null)
}
