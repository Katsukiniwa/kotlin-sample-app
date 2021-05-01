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
open class TableConstraints(
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
         * The reference instance of <code>information_schema.TABLE_CONSTRAINTS</code>
         */
        val TABLE_CONSTRAINTS = TableConstraints()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>information_schema.TABLE_CONSTRAINTS.CONSTRAINT_CATALOG</code>.
     */
    val CONSTRAINT_CATALOG: TableField<Record, String?> = createField(DSL.name("CONSTRAINT_CATALOG"), SQLDataType.VARCHAR(512).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.TABLE_CONSTRAINTS.CONSTRAINT_SCHEMA</code>.
     */
    val CONSTRAINT_SCHEMA: TableField<Record, String?> = createField(DSL.name("CONSTRAINT_SCHEMA"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.TABLE_CONSTRAINTS.CONSTRAINT_NAME</code>.
     */
    val CONSTRAINT_NAME: TableField<Record, String?> = createField(DSL.name("CONSTRAINT_NAME"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.TABLE_CONSTRAINTS.TABLE_SCHEMA</code>.
     */
    val TABLE_SCHEMA: TableField<Record, String?> = createField(DSL.name("TABLE_SCHEMA"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.TABLE_CONSTRAINTS.TABLE_NAME</code>.
     */
    val TABLE_NAME: TableField<Record, String?> = createField(DSL.name("TABLE_NAME"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.TABLE_CONSTRAINTS.CONSTRAINT_TYPE</code>.
     */
    val CONSTRAINT_TYPE: TableField<Record, String?> = createField(DSL.name("CONSTRAINT_TYPE"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>information_schema.TABLE_CONSTRAINTS</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.TABLE_CONSTRAINTS</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.TABLE_CONSTRAINTS</code> table reference
     */
    constructor(): this(DSL.name("TABLE_CONSTRAINTS"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, TABLE_CONSTRAINTS, null)
    override fun getSchema(): Schema = InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): TableConstraints = TableConstraints(DSL.name(alias), this)
    override fun `as`(alias: Name): TableConstraints = TableConstraints(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): TableConstraints = TableConstraints(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): TableConstraints = TableConstraints(name, null)
}
