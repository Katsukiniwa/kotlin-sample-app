/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.mysql.tables


import java.time.LocalDateTime

import kotlin.collections.List

import nu.studer.sample.mysql.Mysql
import nu.studer.sample.mysql.enums.UserAccountLocked
import nu.studer.sample.mysql.enums.UserAlterPriv
import nu.studer.sample.mysql.enums.UserAlterRoutinePriv
import nu.studer.sample.mysql.enums.UserCreatePriv
import nu.studer.sample.mysql.enums.UserCreateRoutinePriv
import nu.studer.sample.mysql.enums.UserCreateTablespacePriv
import nu.studer.sample.mysql.enums.UserCreateTmpTablePriv
import nu.studer.sample.mysql.enums.UserCreateUserPriv
import nu.studer.sample.mysql.enums.UserCreateViewPriv
import nu.studer.sample.mysql.enums.UserDeletePriv
import nu.studer.sample.mysql.enums.UserDropPriv
import nu.studer.sample.mysql.enums.UserEventPriv
import nu.studer.sample.mysql.enums.UserExecutePriv
import nu.studer.sample.mysql.enums.UserFilePriv
import nu.studer.sample.mysql.enums.UserGrantPriv
import nu.studer.sample.mysql.enums.UserIndexPriv
import nu.studer.sample.mysql.enums.UserInsertPriv
import nu.studer.sample.mysql.enums.UserLockTablesPriv
import nu.studer.sample.mysql.enums.UserPasswordExpired
import nu.studer.sample.mysql.enums.UserProcessPriv
import nu.studer.sample.mysql.enums.UserReferencesPriv
import nu.studer.sample.mysql.enums.UserReloadPriv
import nu.studer.sample.mysql.enums.UserReplClientPriv
import nu.studer.sample.mysql.enums.UserReplSlavePriv
import nu.studer.sample.mysql.enums.UserSelectPriv
import nu.studer.sample.mysql.enums.UserShowDbPriv
import nu.studer.sample.mysql.enums.UserShowViewPriv
import nu.studer.sample.mysql.enums.UserShutdownPriv
import nu.studer.sample.mysql.enums.UserSslType
import nu.studer.sample.mysql.enums.UserSuperPriv
import nu.studer.sample.mysql.enums.UserTriggerPriv
import nu.studer.sample.mysql.enums.UserUpdatePriv
import nu.studer.sample.mysql.keys.KEY_USER_PRIMARY

import org.jooq.Field
import org.jooq.ForeignKey
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
import org.jooq.types.UInteger
import org.jooq.types.UShort


/**
 * Users and global privileges
 */
@Suppress("UNCHECKED_CAST")
open class User(
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
    DSL.comment("Users and global privileges"),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>mysql.user</code>
         */
        val USER = User()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<Record> = Record::class.java

    /**
     * The column <code>mysql.user.Host</code>.
     */
    val HOST: TableField<Record, String?> = createField(DSL.name("Host"), SQLDataType.CHAR(60).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "")

    /**
     * The column <code>mysql.user.User</code>.
     */
    val USER_: TableField<Record, String?> = createField(DSL.name("User"), SQLDataType.CHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "")

    /**
     * The column <code>mysql.user.Select_priv</code>.
     */
    val SELECT_PRIV: TableField<Record, UserSelectPriv?> = createField(DSL.name("Select_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.UserSelectPriv::class.java), this, "")

    /**
     * The column <code>mysql.user.Insert_priv</code>.
     */
    val INSERT_PRIV: TableField<Record, UserInsertPriv?> = createField(DSL.name("Insert_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.UserInsertPriv::class.java), this, "")

    /**
     * The column <code>mysql.user.Update_priv</code>.
     */
    val UPDATE_PRIV: TableField<Record, UserUpdatePriv?> = createField(DSL.name("Update_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.UserUpdatePriv::class.java), this, "")

    /**
     * The column <code>mysql.user.Delete_priv</code>.
     */
    val DELETE_PRIV: TableField<Record, UserDeletePriv?> = createField(DSL.name("Delete_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.UserDeletePriv::class.java), this, "")

    /**
     * The column <code>mysql.user.Create_priv</code>.
     */
    val CREATE_PRIV: TableField<Record, UserCreatePriv?> = createField(DSL.name("Create_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.UserCreatePriv::class.java), this, "")

    /**
     * The column <code>mysql.user.Drop_priv</code>.
     */
    val DROP_PRIV: TableField<Record, UserDropPriv?> = createField(DSL.name("Drop_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.UserDropPriv::class.java), this, "")

    /**
     * The column <code>mysql.user.Reload_priv</code>.
     */
    val RELOAD_PRIV: TableField<Record, UserReloadPriv?> = createField(DSL.name("Reload_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.UserReloadPriv::class.java), this, "")

    /**
     * The column <code>mysql.user.Shutdown_priv</code>.
     */
    val SHUTDOWN_PRIV: TableField<Record, UserShutdownPriv?> = createField(DSL.name("Shutdown_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.UserShutdownPriv::class.java), this, "")

    /**
     * The column <code>mysql.user.Process_priv</code>.
     */
    val PROCESS_PRIV: TableField<Record, UserProcessPriv?> = createField(DSL.name("Process_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.UserProcessPriv::class.java), this, "")

    /**
     * The column <code>mysql.user.File_priv</code>.
     */
    val FILE_PRIV: TableField<Record, UserFilePriv?> = createField(DSL.name("File_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.UserFilePriv::class.java), this, "")

    /**
     * The column <code>mysql.user.Grant_priv</code>.
     */
    val GRANT_PRIV: TableField<Record, UserGrantPriv?> = createField(DSL.name("Grant_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.UserGrantPriv::class.java), this, "")

    /**
     * The column <code>mysql.user.References_priv</code>.
     */
    val REFERENCES_PRIV: TableField<Record, UserReferencesPriv?> = createField(DSL.name("References_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.UserReferencesPriv::class.java), this, "")

    /**
     * The column <code>mysql.user.Index_priv</code>.
     */
    val INDEX_PRIV: TableField<Record, UserIndexPriv?> = createField(DSL.name("Index_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.UserIndexPriv::class.java), this, "")

    /**
     * The column <code>mysql.user.Alter_priv</code>.
     */
    val ALTER_PRIV: TableField<Record, UserAlterPriv?> = createField(DSL.name("Alter_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.UserAlterPriv::class.java), this, "")

    /**
     * The column <code>mysql.user.Show_db_priv</code>.
     */
    val SHOW_DB_PRIV: TableField<Record, UserShowDbPriv?> = createField(DSL.name("Show_db_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.UserShowDbPriv::class.java), this, "")

    /**
     * The column <code>mysql.user.Super_priv</code>.
     */
    val SUPER_PRIV: TableField<Record, UserSuperPriv?> = createField(DSL.name("Super_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.UserSuperPriv::class.java), this, "")

    /**
     * The column <code>mysql.user.Create_tmp_table_priv</code>.
     */
    val CREATE_TMP_TABLE_PRIV: TableField<Record, UserCreateTmpTablePriv?> = createField(DSL.name("Create_tmp_table_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.UserCreateTmpTablePriv::class.java), this, "")

    /**
     * The column <code>mysql.user.Lock_tables_priv</code>.
     */
    val LOCK_TABLES_PRIV: TableField<Record, UserLockTablesPriv?> = createField(DSL.name("Lock_tables_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.UserLockTablesPriv::class.java), this, "")

    /**
     * The column <code>mysql.user.Execute_priv</code>.
     */
    val EXECUTE_PRIV: TableField<Record, UserExecutePriv?> = createField(DSL.name("Execute_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.UserExecutePriv::class.java), this, "")

    /**
     * The column <code>mysql.user.Repl_slave_priv</code>.
     */
    val REPL_SLAVE_PRIV: TableField<Record, UserReplSlavePriv?> = createField(DSL.name("Repl_slave_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.UserReplSlavePriv::class.java), this, "")

    /**
     * The column <code>mysql.user.Repl_client_priv</code>.
     */
    val REPL_CLIENT_PRIV: TableField<Record, UserReplClientPriv?> = createField(DSL.name("Repl_client_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.UserReplClientPriv::class.java), this, "")

    /**
     * The column <code>mysql.user.Create_view_priv</code>.
     */
    val CREATE_VIEW_PRIV: TableField<Record, UserCreateViewPriv?> = createField(DSL.name("Create_view_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.UserCreateViewPriv::class.java), this, "")

    /**
     * The column <code>mysql.user.Show_view_priv</code>.
     */
    val SHOW_VIEW_PRIV: TableField<Record, UserShowViewPriv?> = createField(DSL.name("Show_view_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.UserShowViewPriv::class.java), this, "")

    /**
     * The column <code>mysql.user.Create_routine_priv</code>.
     */
    val CREATE_ROUTINE_PRIV: TableField<Record, UserCreateRoutinePriv?> = createField(DSL.name("Create_routine_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.UserCreateRoutinePriv::class.java), this, "")

    /**
     * The column <code>mysql.user.Alter_routine_priv</code>.
     */
    val ALTER_ROUTINE_PRIV: TableField<Record, UserAlterRoutinePriv?> = createField(DSL.name("Alter_routine_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.UserAlterRoutinePriv::class.java), this, "")

    /**
     * The column <code>mysql.user.Create_user_priv</code>.
     */
    val CREATE_USER_PRIV: TableField<Record, UserCreateUserPriv?> = createField(DSL.name("Create_user_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.UserCreateUserPriv::class.java), this, "")

    /**
     * The column <code>mysql.user.Event_priv</code>.
     */
    val EVENT_PRIV: TableField<Record, UserEventPriv?> = createField(DSL.name("Event_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.UserEventPriv::class.java), this, "")

    /**
     * The column <code>mysql.user.Trigger_priv</code>.
     */
    val TRIGGER_PRIV: TableField<Record, UserTriggerPriv?> = createField(DSL.name("Trigger_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.UserTriggerPriv::class.java), this, "")

    /**
     * The column <code>mysql.user.Create_tablespace_priv</code>.
     */
    val CREATE_TABLESPACE_PRIV: TableField<Record, UserCreateTablespacePriv?> = createField(DSL.name("Create_tablespace_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.UserCreateTablespacePriv::class.java), this, "")

    /**
     * The column <code>mysql.user.ssl_type</code>.
     */
    val SSL_TYPE: TableField<Record, UserSslType?> = createField(DSL.name("ssl_type"), SQLDataType.VARCHAR(9).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.UserSslType::class.java), this, "")

    /**
     * The column <code>mysql.user.ssl_cipher</code>.
     */
    val SSL_CIPHER: TableField<Record, ByteArray?> = createField(DSL.name("ssl_cipher"), SQLDataType.BLOB.nullable(false), this, "")

    /**
     * The column <code>mysql.user.x509_issuer</code>.
     */
    val X509_ISSUER: TableField<Record, ByteArray?> = createField(DSL.name("x509_issuer"), SQLDataType.BLOB.nullable(false), this, "")

    /**
     * The column <code>mysql.user.x509_subject</code>.
     */
    val X509_SUBJECT: TableField<Record, ByteArray?> = createField(DSL.name("x509_subject"), SQLDataType.BLOB.nullable(false), this, "")

    /**
     * The column <code>mysql.user.max_questions</code>.
     */
    val MAX_QUESTIONS: TableField<Record, UInteger?> = createField(DSL.name("max_questions"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGERUNSIGNED)), this, "")

    /**
     * The column <code>mysql.user.max_updates</code>.
     */
    val MAX_UPDATES: TableField<Record, UInteger?> = createField(DSL.name("max_updates"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGERUNSIGNED)), this, "")

    /**
     * The column <code>mysql.user.max_connections</code>.
     */
    val MAX_CONNECTIONS: TableField<Record, UInteger?> = createField(DSL.name("max_connections"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGERUNSIGNED)), this, "")

    /**
     * The column <code>mysql.user.max_user_connections</code>.
     */
    val MAX_USER_CONNECTIONS: TableField<Record, UInteger?> = createField(DSL.name("max_user_connections"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGERUNSIGNED)), this, "")

    /**
     * The column <code>mysql.user.plugin</code>.
     */
    val PLUGIN: TableField<Record, String?> = createField(DSL.name("plugin"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("mysql_native_password", SQLDataType.CHAR)), this, "")

    /**
     * The column <code>mysql.user.authentication_string</code>.
     */
    val AUTHENTICATION_STRING: TableField<Record, String?> = createField(DSL.name("authentication_string"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>mysql.user.password_expired</code>.
     */
    val PASSWORD_EXPIRED: TableField<Record, UserPasswordExpired?> = createField(DSL.name("password_expired"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.UserPasswordExpired::class.java), this, "")

    /**
     * The column <code>mysql.user.password_last_changed</code>.
     */
    val PASSWORD_LAST_CHANGED: TableField<Record, LocalDateTime?> = createField(DSL.name("password_last_changed"), SQLDataType.LOCALDATETIME(0), this, "")

    /**
     * The column <code>mysql.user.password_lifetime</code>.
     */
    val PASSWORD_LIFETIME: TableField<Record, UShort?> = createField(DSL.name("password_lifetime"), SQLDataType.SMALLINTUNSIGNED, this, "")

    /**
     * The column <code>mysql.user.account_locked</code>.
     */
    val ACCOUNT_LOCKED: TableField<Record, UserAccountLocked?> = createField(DSL.name("account_locked"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(nu.studer.sample.mysql.enums.UserAccountLocked::class.java), this, "")

    private constructor(alias: Name, aliased: Table<Record>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<Record>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>mysql.user</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>mysql.user</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>mysql.user</code> table reference
     */
    constructor(): this(DSL.name("user"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, Record>): this(Internal.createPathAlias(child, key), child, key, USER, null)
    override fun getSchema(): Schema = Mysql.MYSQL
    override fun getPrimaryKey(): UniqueKey<Record> = KEY_USER_PRIMARY
    override fun getKeys(): List<UniqueKey<Record>> = listOf(KEY_USER_PRIMARY)
    override fun `as`(alias: String): User = User(DSL.name(alias), this)
    override fun `as`(alias: Name): User = User(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): User = User(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): User = User(name, null)
}
