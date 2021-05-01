/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.mysql.tables


import kotlin.collections.List

import nu.studer.sample.mysql.Mysql
import nu.studer.sample.mysql.enums.DbAlterPriv
import nu.studer.sample.mysql.enums.DbAlterRoutinePriv
import nu.studer.sample.mysql.enums.DbCreatePriv
import nu.studer.sample.mysql.enums.DbCreateRoutinePriv
import nu.studer.sample.mysql.enums.DbCreateTmpTablePriv
import nu.studer.sample.mysql.enums.DbCreateViewPriv
import nu.studer.sample.mysql.enums.DbDeletePriv
import nu.studer.sample.mysql.enums.DbDropPriv
import nu.studer.sample.mysql.enums.DbEventPriv
import nu.studer.sample.mysql.enums.DbExecutePriv
import nu.studer.sample.mysql.enums.DbGrantPriv
import nu.studer.sample.mysql.enums.DbIndexPriv
import nu.studer.sample.mysql.enums.DbInsertPriv
import nu.studer.sample.mysql.enums.DbLockTablesPriv
import nu.studer.sample.mysql.enums.DbReferencesPriv
import nu.studer.sample.mysql.enums.DbSelectPriv
import nu.studer.sample.mysql.enums.DbShowViewPriv
import nu.studer.sample.mysql.enums.DbTriggerPriv
import nu.studer.sample.mysql.enums.DbUpdatePriv
import nu.studer.sample.mysql.indexes.DB_USER
import nu.studer.sample.mysql.keys.KEY_DB_PRIMARY

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Index
import org.jooq.Name
import org.jooq.Record
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * Database privileges
 */
@Suppress("UNCHECKED_CAST")
open class Db(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, Record>?,
    aliased: Table<Record>?,
    parameters: Array<Field<*>?>?
): TableImpl<Record>(
    alias,
    Mysql.MYSQL,
    child,
    path,
    aliased,
    parameters,
    DSL.comment("Database privileges"),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>mysql.db</code>
         */
        val DB = Db()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>mysql.db.Host</code>.
     */
    val HOST: TableField<Record, String?> = createField(DSL.name("Host"), SQLDataType.CHAR(60).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "")

    /**
     * The column <code>mysql.db.Db</code>.
     */
    val DB_: TableField<Record, String?> = createField(DSL.name("Db"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "")

    /**
     * The column <code>mysql.db.User</code>.
     */
    val USER: TableField<Record, String?> = createField(DSL.name("User"), SQLDataType.CHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "")

    /**
     * The column <code>mysql.db.Select_priv</code>.
     */
    val SELECT_PRIV: TableField<Record, DbSelectPriv?> = createField(DSL.name("Select_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbSelectPriv::class.java), this, "")

    /**
     * The column <code>mysql.db.Insert_priv</code>.
     */
    val INSERT_PRIV: TableField<Record, DbInsertPriv?> = createField(DSL.name("Insert_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbInsertPriv::class.java), this, "")

    /**
     * The column <code>mysql.db.Update_priv</code>.
     */
    val UPDATE_PRIV: TableField<Record, DbUpdatePriv?> = createField(DSL.name("Update_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbUpdatePriv::class.java), this, "")

    /**
     * The column <code>mysql.db.Delete_priv</code>.
     */
    val DELETE_PRIV: TableField<Record, DbDeletePriv?> = createField(DSL.name("Delete_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbDeletePriv::class.java), this, "")

    /**
     * The column <code>mysql.db.Create_priv</code>.
     */
    val CREATE_PRIV: TableField<Record, DbCreatePriv?> = createField(DSL.name("Create_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbCreatePriv::class.java), this, "")

    /**
     * The column <code>mysql.db.Drop_priv</code>.
     */
    val DROP_PRIV: TableField<Record, DbDropPriv?> = createField(DSL.name("Drop_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbDropPriv::class.java), this, "")

    /**
     * The column <code>mysql.db.Grant_priv</code>.
     */
    val GRANT_PRIV: TableField<Record, DbGrantPriv?> = createField(DSL.name("Grant_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbGrantPriv::class.java), this, "")

    /**
     * The column <code>mysql.db.References_priv</code>.
     */
    val REFERENCES_PRIV: TableField<Record, DbReferencesPriv?> = createField(DSL.name("References_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbReferencesPriv::class.java), this, "")

    /**
     * The column <code>mysql.db.Index_priv</code>.
     */
    val INDEX_PRIV: TableField<Record, DbIndexPriv?> = createField(DSL.name("Index_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbIndexPriv::class.java), this, "")

    /**
     * The column <code>mysql.db.Alter_priv</code>.
     */
    val ALTER_PRIV: TableField<Record, DbAlterPriv?> = createField(DSL.name("Alter_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbAlterPriv::class.java), this, "")

    /**
     * The column <code>mysql.db.Create_tmp_table_priv</code>.
     */
    val CREATE_TMP_TABLE_PRIV: TableField<Record, DbCreateTmpTablePriv?> = createField(DSL.name("Create_tmp_table_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbCreateTmpTablePriv::class.java), this, "")

    /**
     * The column <code>mysql.db.Lock_tables_priv</code>.
     */
    val LOCK_TABLES_PRIV: TableField<Record, DbLockTablesPriv?> = createField(DSL.name("Lock_tables_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbLockTablesPriv::class.java), this, "")

    /**
     * The column <code>mysql.db.Create_view_priv</code>.
     */
    val CREATE_VIEW_PRIV: TableField<Record, DbCreateViewPriv?> = createField(DSL.name("Create_view_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbCreateViewPriv::class.java), this, "")

    /**
     * The column <code>mysql.db.Show_view_priv</code>.
     */
    val SHOW_VIEW_PRIV: TableField<Record, DbShowViewPriv?> = createField(DSL.name("Show_view_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbShowViewPriv::class.java), this, "")

    /**
     * The column <code>mysql.db.Create_routine_priv</code>.
     */
    val CREATE_ROUTINE_PRIV: TableField<Record, DbCreateRoutinePriv?> = createField(DSL.name("Create_routine_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbCreateRoutinePriv::class.java), this, "")

    /**
     * The column <code>mysql.db.Alter_routine_priv</code>.
     */
    val ALTER_ROUTINE_PRIV: TableField<Record, DbAlterRoutinePriv?> = createField(DSL.name("Alter_routine_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbAlterRoutinePriv::class.java), this, "")

    /**
     * The column <code>mysql.db.Execute_priv</code>.
     */
    val EXECUTE_PRIV: TableField<Record, DbExecutePriv?> = createField(DSL.name("Execute_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbExecutePriv::class.java), this, "")

    /**
     * The column <code>mysql.db.Event_priv</code>.
     */
    val EVENT_PRIV: TableField<Record, DbEventPriv?> = createField(DSL.name("Event_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbEventPriv::class.java), this, "")

    /**
     * The column <code>mysql.db.Trigger_priv</code>.
     */
    val TRIGGER_PRIV: TableField<Record, DbTriggerPriv?> = createField(DSL.name("Trigger_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.DbTriggerPriv::class.java), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>mysql.db</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>mysql.db</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>mysql.db</code> table reference
     */
    constructor(): this(DSL.name("db"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, DB, null)
    override fun getSchema(): Schema = Mysql.MYSQL
    override fun getIndexes(): List<Index> = listOf(DB_USER)
    override fun getPrimaryKey(): UniqueKey<Record> = KEY_DB_PRIMARY
    override fun getKeys(): List<UniqueKey<Record>> = listOf(KEY_DB_PRIMARY)
    override fun `as`(alias: String): Db = Db(DSL.name(alias), this)
    override fun `as`(alias: Name): Db = Db(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Db = Db(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Db = Db(name, null)
}