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
open class CollationCharacterSetApplicability(
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
         * The reference instance of <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY</code>
         */
        val COLLATION_CHARACTER_SET_APPLICABILITY = CollationCharacterSetApplicability()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_NAME</code>.
     */
    val COLLATION_NAME: TableField<Record, String?> = createField(DSL.name("COLLATION_NAME"), SQLDataType.VARCHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    /**
     * The column <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_NAME</code>.
     */
    val CHARACTER_SET_NAME: TableField<Record, String?> = createField(DSL.name("CHARACTER_SET_NAME"), SQLDataType.VARCHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY</code> table reference
     */
    constructor(): this(DSL.name("COLLATION_CHARACTER_SET_APPLICABILITY"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, COLLATION_CHARACTER_SET_APPLICABILITY, null)
    override fun getSchema(): Schema = InformationSchema.INFORMATION_SCHEMA
    override fun `as`(alias: String): CollationCharacterSetApplicability = CollationCharacterSetApplicability(DSL.name(alias), this)
    override fun `as`(alias: Name): CollationCharacterSetApplicability = CollationCharacterSetApplicability(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): CollationCharacterSetApplicability = CollationCharacterSetApplicability(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): CollationCharacterSetApplicability = CollationCharacterSetApplicability(name, null)
}
