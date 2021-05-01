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
open class Files(
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
         * The reference instance of <code>information_schema.FILES</code>
         */
        val FILES = Files()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>information_schema.FILES.FILE_ID</code>.
     */
    val FILE_ID: TableField<Record, Long?> = createField(DSL.name("FILE_ID"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "")

    /**
     * The column <code>information_schema.FILES.FILE_NAME</code>.
     */
    val FILE_NAME: TableField<Record, String?> = createField(DSL.name("FILE_NAME"), SQLDataType.VARCHAR(4000), this, "")

    /**
     * The column <code>information_schema.FILES.FILE_TYPE</code>.
     */
    val FILE_TYPE: TableField<Record, String?> = createField(DSL.name("FILE_TYPE"), SQLDataType.VARCHAR(20).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.FILES.TABLESPACE_NAME</code>.
     */
    val TABLESPACE_NAME: TableField<Record, String?> = createField(DSL.name("TABLESPACE_NAME"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>information_schema.FILES.TABLE_CATALOG</code>.
     */
    val TABLE_CATALOG: TableField<Record, String?> = createField(DSL.name("TABLE_CATALOG"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.FILES.TABLE_SCHEMA</code>.
     */
    val TABLE_SCHEMA: TableField<Record, String?> = createField(DSL.name("TABLE_SCHEMA"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>information_schema.FILES.TABLE_NAME</code>.
     */
    val TABLE_NAME: TableField<Record, String?> = createField(DSL.name("TABLE_NAME"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>information_schema.FILES.LOGFILE_GROUP_NAME</code>.
     */
    val LOGFILE_GROUP_NAME: TableField<Record, String?> = createField(DSL.name("LOGFILE_GROUP_NAME"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>information_schema.FILES.LOGFILE_GROUP_NUMBER</code>.
     */
    val LOGFILE_GROUP_NUMBER: TableField<Record, Long?> = createField(DSL.name("LOGFILE_GROUP_NUMBER"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>information_schema.FILES.ENGINE</code>.
     */
    val ENGINE: TableField<Record, String?> = createField(DSL.name("ENGINE"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.FILES.FULLTEXT_KEYS</code>.
     */
    val FULLTEXT_KEYS: TableField<Record, String?> = createField(DSL.name("FULLTEXT_KEYS"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>information_schema.FILES.DELETED_ROWS</code>.
     */
    val DELETED_ROWS: TableField<Record, Long?> = createField(DSL.name("DELETED_ROWS"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>information_schema.FILES.UPDATE_COUNT</code>.
     */
    val UPDATE_COUNT: TableField<Record, Long?> = createField(DSL.name("UPDATE_COUNT"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>information_schema.FILES.FREE_EXTENTS</code>.
     */
    val FREE_EXTENTS: TableField<Record, Long?> = createField(DSL.name("FREE_EXTENTS"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>information_schema.FILES.TOTAL_EXTENTS</code>.
     */
    val TOTAL_EXTENTS: TableField<Record, Long?> = createField(DSL.name("TOTAL_EXTENTS"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>information_schema.FILES.EXTENT_SIZE</code>.
     */
    val EXTENT_SIZE: TableField<Record, Long?> = createField(DSL.name("EXTENT_SIZE"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "")

    /**
     * The column <code>information_schema.FILES.INITIAL_SIZE</code>.
     */
    val INITIAL_SIZE: TableField<Record, ULong?> = createField(DSL.name("INITIAL_SIZE"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>information_schema.FILES.MAXIMUM_SIZE</code>.
     */
    val MAXIMUM_SIZE: TableField<Record, ULong?> = createField(DSL.name("MAXIMUM_SIZE"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>information_schema.FILES.AUTOEXTEND_SIZE</code>.
     */
    val AUTOEXTEND_SIZE: TableField<Record, ULong?> = createField(DSL.name("AUTOEXTEND_SIZE"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>information_schema.FILES.CREATION_TIME</code>.
     */
    val CREATION_TIME: TableField<Record, LocalDateTime?> = createField(DSL.name("CREATION_TIME"), SQLDataType.LOCALDATETIME(0), this, "")

    /**
     * The column <code>information_schema.FILES.LAST_UPDATE_TIME</code>.
     */
    val LAST_UPDATE_TIME: TableField<Record, LocalDateTime?> = createField(DSL.name("LAST_UPDATE_TIME"), SQLDataType.LOCALDATETIME(0), this, "")

    /**
     * The column <code>information_schema.FILES.LAST_ACCESS_TIME</code>.
     */
    val LAST_ACCESS_TIME: TableField<Record, LocalDateTime?> = createField(DSL.name("LAST_ACCESS_TIME"), SQLDataType.LOCALDATETIME(0), this, "")

    /**
     * The column <code>information_schema.FILES.RECOVER_TIME</code>.
     */
    val RECOVER_TIME: TableField<Record, Long?> = createField(DSL.name("RECOVER_TIME"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>information_schema.FILES.TRANSACTION_COUNTER</code>.
     */
    val TRANSACTION_COUNTER: TableField<Record, Long?> = createField(DSL.name("TRANSACTION_COUNTER"), SQLDataType.BIGINT, this, "")

    /**
     * The column <code>information_schema.FILES.VERSION</code>.
     */
    val VERSION: TableField<Record, ULong?> = createField(DSL.name("VERSION"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>information_schema.FILES.ROW_FORMAT</code>.
     */
    val ROW_FORMAT: TableField<Record, String?> = createField(DSL.name("ROW_FORMAT"), SQLDataType.VARCHAR(10), this, "")

    /**
     * The column <code>information_schema.FILES.TABLE_ROWS</code>.
     */
    val TABLE_ROWS: TableField<Record, ULong?> = createField(DSL.name("TABLE_ROWS"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>information_schema.FILES.AVG_ROW_LENGTH</code>.
     */
    val AVG_ROW_LENGTH: TableField<Record, ULong?> = createField(DSL.name("AVG_ROW_LENGTH"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>information_schema.FILES.DATA_LENGTH</code>.
     */
    val DATA_LENGTH: TableField<Record, ULong?> = createField(DSL.name("DATA_LENGTH"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>information_schema.FILES.MAX_DATA_LENGTH</code>.
     */
    val MAX_DATA_LENGTH: TableField<Record, ULong?> = createField(DSL.name("MAX_DATA_LENGTH"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>information_schema.FILES.INDEX_LENGTH</code>.
     */
    val INDEX_LENGTH: TableField<Record, ULong?> = createField(DSL.name("INDEX_LENGTH"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>information_schema.FILES.DATA_FREE</code>.
     */
    val DATA_FREE: TableField<Record, ULong?> = createField(DSL.name("DATA_FREE"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>information_schema.FILES.CREATE_TIME</code>.
     */
    val CREATE_TIME: TableField<Record, LocalDateTime?> = createField(DSL.name("CREATE_TIME"), SQLDataType.LOCALDATETIME(0), this, "")

    /**
     * The column <code>information_schema.FILES.UPDATE_TIME</code>.
     */
    val UPDATE_TIME: TableField<Record, LocalDateTime?> = createField(DSL.name("UPDATE_TIME"), SQLDataType.LOCALDATETIME(0), this, "")

    /**
     * The column <code>information_schema.FILES.CHECK_TIME</code>.
     */
    val CHECK_TIME: TableField<Record, LocalDateTime?> = createField(DSL.name("CHECK_TIME"), SQLDataType.LOCALDATETIME(0), this, "")

    /**
     * The column <code>information_schema.FILES.CHECKSUM</code>.
     */
    val CHECKSUM: TableField<Record, ULong?> = createField(DSL.name("CHECKSUM"), SQLDataType.BIGINTUNSIGNED, this, "")

    /**
     * The column <code>information_schema.FILES.STATUS</code>.
     */
    val STATUS: TableField<Record, String?> = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(20).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.FILES.EXTRA</code>.
     */
    val EXTRA: TableField<Record, String?> = createField(DSL.name("EXTRA"), SQLDataType.VARCHAR(255), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>information_schema.FILES</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.FILES</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.FILES</code> table reference
     */
    constructor(): this(DSL.name("FILES"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, FILES, null)
    override fun getSchema(): Schema = InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): Files = Files(DSL.name(alias), this)
    override fun `as`(alias: Name): Files = Files(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Files = Files(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Files = Files(name, null)
}