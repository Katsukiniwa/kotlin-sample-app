/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.performance_schema.tables


import nu.studer.sample.performance_schema.PerformanceSchema

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
open class ReplicationGroupMembers(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, Record>?,
    aliased: Table<Record>?,
    parameters: Array<Field<*>?>?
): TableImpl<Record>(
    alias,
    PerformanceSchema.PERFORMANCE_SCHEMA,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>performance_schema.replication_group_members</code>
         */
        val REPLICATION_GROUP_MEMBERS = ReplicationGroupMembers()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>performance_schema.replication_group_members.CHANNEL_NAME</code>.
     */
    val CHANNEL_NAME: TableField<Record, String?> = createField(DSL.name("CHANNEL_NAME"), SQLDataType.CHAR(64).nullable(false), this, "")

    /**
     * The column <code>performance_schema.replication_group_members.MEMBER_ID</code>.
     */
    val MEMBER_ID: TableField<Record, String?> = createField(DSL.name("MEMBER_ID"), SQLDataType.CHAR(36).nullable(false), this, "")

    /**
     * The column <code>performance_schema.replication_group_members.MEMBER_HOST</code>.
     */
    val MEMBER_HOST: TableField<Record, String?> = createField(DSL.name("MEMBER_HOST"), SQLDataType.CHAR(60).nullable(false), this, "")

    /**
     * The column <code>performance_schema.replication_group_members.MEMBER_PORT</code>.
     */
    val MEMBER_PORT: TableField<Record, Int?> = createField(DSL.name("MEMBER_PORT"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>performance_schema.replication_group_members.MEMBER_STATE</code>.
     */
    val MEMBER_STATE: TableField<Record, String?> = createField(DSL.name("MEMBER_STATE"), SQLDataType.CHAR(64).nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>performance_schema.replication_group_members</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>performance_schema.replication_group_members</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>performance_schema.replication_group_members</code> table reference
     */
    constructor(): this(DSL.name("replication_group_members"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, REPLICATION_GROUP_MEMBERS, null)
    override fun getSchema(): Schema = PerformanceSchema.PERFORMANCE_SCHEMA
    override fun `as`(alias: String): ReplicationGroupMembers = ReplicationGroupMembers(DSL.name(alias), this)
    override fun `as`(alias: Name): ReplicationGroupMembers = ReplicationGroupMembers(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): ReplicationGroupMembers = ReplicationGroupMembers(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): ReplicationGroupMembers = ReplicationGroupMembers(name, null)
}