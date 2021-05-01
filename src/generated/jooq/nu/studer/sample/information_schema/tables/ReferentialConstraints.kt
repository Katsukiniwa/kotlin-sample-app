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
open class ReferentialConstraints(
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
         * The reference instance of <code>information_schema.REFERENTIAL_CONSTRAINTS</code>
         */
        val REFERENTIAL_CONSTRAINTS = ReferentialConstraints()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>information_schema.REFERENTIAL_CONSTRAINTS.CONSTRAINT_CATALOG</code>.
     */
    val CONSTRAINT_CATALOG: TableField<Record, String?> = createField(DSL.name("CONSTRAINT_CATALOG"), SQLDataType.VARCHAR(512).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.REFERENTIAL_CONSTRAINTS.CONSTRAINT_SCHEMA</code>.
     */
    val CONSTRAINT_SCHEMA: TableField<Record, String?> = createField(DSL.name("CONSTRAINT_SCHEMA"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.REFERENTIAL_CONSTRAINTS.CONSTRAINT_NAME</code>.
     */
    val CONSTRAINT_NAME: TableField<Record, String?> = createField(DSL.name("CONSTRAINT_NAME"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_CATALOG</code>.
     */
    val UNIQUE_CONSTRAINT_CATALOG: TableField<Record, String?> = createField(DSL.name("UNIQUE_CONSTRAINT_CATALOG"), SQLDataType.VARCHAR(512).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_SCHEMA</code>.
     */
    val UNIQUE_CONSTRAINT_SCHEMA: TableField<Record, String?> = createField(DSL.name("UNIQUE_CONSTRAINT_SCHEMA"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_NAME</code>.
     */
    val UNIQUE_CONSTRAINT_NAME: TableField<Record, String?> = createField(DSL.name("UNIQUE_CONSTRAINT_NAME"), SQLDataType.VARCHAR(64), this, "")

    /**
     * The column <code>information_schema.REFERENTIAL_CONSTRAINTS.MATCH_OPTION</code>.
     */
    val MATCH_OPTION: TableField<Record, String?> = createField(DSL.name("MATCH_OPTION"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.REFERENTIAL_CONSTRAINTS.UPDATE_RULE</code>.
     */
    val UPDATE_RULE: TableField<Record, String?> = createField(DSL.name("UPDATE_RULE"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.REFERENTIAL_CONSTRAINTS.DELETE_RULE</code>.
     */
    val DELETE_RULE: TableField<Record, String?> = createField(DSL.name("DELETE_RULE"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.REFERENTIAL_CONSTRAINTS.TABLE_NAME</code>.
     */
    val TABLE_NAME: TableField<Record, String?> = createField(DSL.name("TABLE_NAME"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.REFERENTIAL_CONSTRAINTS.REFERENCED_TABLE_NAME</code>.
     */
    val REFERENCED_TABLE_NAME: TableField<Record, String?> = createField(DSL.name("REFERENCED_TABLE_NAME"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>information_schema.REFERENTIAL_CONSTRAINTS</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.REFERENTIAL_CONSTRAINTS</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.REFERENTIAL_CONSTRAINTS</code> table reference
     */
    constructor(): this(DSL.name("REFERENTIAL_CONSTRAINTS"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, REFERENTIAL_CONSTRAINTS, null)
    override fun getSchema(): Schema = InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): ReferentialConstraints = ReferentialConstraints(DSL.name(alias), this)
    override fun `as`(alias: Name): ReferentialConstraints = ReferentialConstraints(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): ReferentialConstraints = ReferentialConstraints(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): ReferentialConstraints = ReferentialConstraints(name, null)
}
