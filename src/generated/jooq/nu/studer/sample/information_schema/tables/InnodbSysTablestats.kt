/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.information_schema.tables


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
open class InnodbSysTablestats(
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
         * The reference instance of <code>information_schema.INNODB_SYS_TABLESTATS</code>
         */
        val INNODB_SYS_TABLESTATS = InnodbSysTablestats()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>information_schema.INNODB_SYS_TABLESTATS.TABLE_ID</code>.
     */
    val TABLE_ID: TableField<Record, ULong?> = createField(DSL.name("TABLE_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column <code>information_schema.INNODB_SYS_TABLESTATS.NAME</code>.
     */
    val NAME: TableField<Record, String?> = createField(DSL.name("NAME"), SQLDataType.VARCHAR(193).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.INNODB_SYS_TABLESTATS.STATS_INITIALIZED</code>.
     */
    val STATS_INITIALIZED: TableField<Record, String?> = createField(DSL.name("STATS_INITIALIZED"), SQLDataType.VARCHAR(193).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.INNODB_SYS_TABLESTATS.NUM_ROWS</code>.
     */
    val NUM_ROWS: TableField<Record, ULong?> = createField(DSL.name("NUM_ROWS"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column <code>information_schema.INNODB_SYS_TABLESTATS.CLUST_INDEX_SIZE</code>.
     */
    val CLUST_INDEX_SIZE: TableField<Record, ULong?> = createField(DSL.name("CLUST_INDEX_SIZE"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column <code>information_schema.INNODB_SYS_TABLESTATS.OTHER_INDEX_SIZE</code>.
     */
    val OTHER_INDEX_SIZE: TableField<Record, ULong?> = createField(DSL.name("OTHER_INDEX_SIZE"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column <code>information_schema.INNODB_SYS_TABLESTATS.MODIFIED_COUNTER</code>.
     */
    val MODIFIED_COUNTER: TableField<Record, ULong?> = createField(DSL.name("MODIFIED_COUNTER"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column <code>information_schema.INNODB_SYS_TABLESTATS.AUTOINC</code>.
     */
    val AUTOINC: TableField<Record, ULong?> = createField(DSL.name("AUTOINC"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "")

    /**
     * The column <code>information_schema.INNODB_SYS_TABLESTATS.REF_COUNT</code>.
     */
    val REF_COUNT: TableField<Record, Int?> = createField(DSL.name("REF_COUNT"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_TABLESTATS</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_TABLESTATS</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.INNODB_SYS_TABLESTATS</code> table reference
     */
    constructor(): this(DSL.name("INNODB_SYS_TABLESTATS"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, INNODB_SYS_TABLESTATS, null)
    override fun getSchema(): Schema = InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): InnodbSysTablestats = InnodbSysTablestats(DSL.name(alias), this)
    override fun `as`(alias: Name): InnodbSysTablestats = InnodbSysTablestats(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): InnodbSysTablestats = InnodbSysTablestats(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): InnodbSysTablestats = InnodbSysTablestats(name, null)
}
