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
import org.jooq.types.UInteger


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class InnodbSysForeign(
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
         * The reference instance of <code>information_schema.INNODB_SYS_FOREIGN</code>
         */
        val INNODB_SYS_FOREIGN = InnodbSysForeign()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>information_schema.INNODB_SYS_FOREIGN.ID</code>.
     */
    val ID: TableField<Record, String?> = createField(DSL.name("ID"), SQLDataType.VARCHAR(193).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.INNODB_SYS_FOREIGN.FOR_NAME</code>.
     */
    val FOR_NAME: TableField<Record, String?> = createField(DSL.name("FOR_NAME"), SQLDataType.VARCHAR(193).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.INNODB_SYS_FOREIGN.REF_NAME</code>.
     */
    val REF_NAME: TableField<Record, String?> = createField(DSL.name("REF_NAME"), SQLDataType.VARCHAR(193).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.INNODB_SYS_FOREIGN.N_COLS</code>.
     */
    val N_COLS: TableField<Record, UInteger?> = createField(DSL.name("N_COLS"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGERUNSIGNED)), this, "")

    /**
     * The column <code>information_schema.INNODB_SYS_FOREIGN.TYPE</code>.
     */
    val TYPE: TableField<Record, UInteger?> = createField(DSL.name("TYPE"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGERUNSIGNED)), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_FOREIGN</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_FOREIGN</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.INNODB_SYS_FOREIGN</code> table reference
     */
    constructor(): this(DSL.name("INNODB_SYS_FOREIGN"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, INNODB_SYS_FOREIGN, null)
    override fun getSchema(): Schema = InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): InnodbSysForeign = InnodbSysForeign(DSL.name(alias), this)
    override fun `as`(alias: Name): InnodbSysForeign = InnodbSysForeign(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): InnodbSysForeign = InnodbSysForeign(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): InnodbSysForeign = InnodbSysForeign(name, null)
}
