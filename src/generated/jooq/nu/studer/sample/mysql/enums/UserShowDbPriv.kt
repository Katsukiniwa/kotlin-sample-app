/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.mysql.enums


import org.jooq.Catalog
import org.jooq.EnumType
import org.jooq.Schema


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
enum class UserShowDbPriv(@get:JvmName("literal") val literal: String) : EnumType {
    N("N"),
    Y("Y");
    override fun getCatalog(): Catalog? = null
    override fun getSchema(): Schema? = null
    override fun getName(): String = "user_Show_db_priv"
    override fun getLiteral(): String = literal
}
