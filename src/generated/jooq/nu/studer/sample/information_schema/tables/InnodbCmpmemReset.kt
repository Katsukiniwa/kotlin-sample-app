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


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class InnodbCmpmemReset(
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
         * The reference instance of <code>information_schema.INNODB_CMPMEM_RESET</code>
         */
        val INNODB_CMPMEM_RESET = InnodbCmpmemReset()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>information_schema.INNODB_CMPMEM_RESET.page_size</code>.
     */
    val PAGE_SIZE: TableField<Record, Int?> = createField(DSL.name("page_size"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "")

    /**
     * The column <code>information_schema.INNODB_CMPMEM_RESET.buffer_pool_instance</code>.
     */
    val BUFFER_POOL_INSTANCE: TableField<Record, Int?> = createField(DSL.name("buffer_pool_instance"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "")

    /**
     * The column <code>information_schema.INNODB_CMPMEM_RESET.pages_used</code>.
     */
    val PAGES_USED: TableField<Record, Int?> = createField(DSL.name("pages_used"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "")

    /**
     * The column <code>information_schema.INNODB_CMPMEM_RESET.pages_free</code>.
     */
    val PAGES_FREE: TableField<Record, Int?> = createField(DSL.name("pages_free"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "")

    /**
     * The column <code>information_schema.INNODB_CMPMEM_RESET.relocation_ops</code>.
     */
    val RELOCATION_OPS: TableField<Record, Long?> = createField(DSL.name("relocation_ops"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "")

    /**
     * The column <code>information_schema.INNODB_CMPMEM_RESET.relocation_time</code>.
     */
    val RELOCATION_TIME: TableField<Record, Int?> = createField(DSL.name("relocation_time"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>information_schema.INNODB_CMPMEM_RESET</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.INNODB_CMPMEM_RESET</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.INNODB_CMPMEM_RESET</code> table reference
     */
    constructor(): this(DSL.name("INNODB_CMPMEM_RESET"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, INNODB_CMPMEM_RESET, null)
    override fun getSchema(): Schema = InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): InnodbCmpmemReset = InnodbCmpmemReset(DSL.name(alias), this)
    override fun `as`(alias: Name): InnodbCmpmemReset = InnodbCmpmemReset(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): InnodbCmpmemReset = InnodbCmpmemReset(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): InnodbCmpmemReset = InnodbCmpmemReset(name, null)
}