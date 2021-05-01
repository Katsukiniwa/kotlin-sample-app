/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.sys.enums


import org.jooq.Catalog
import org.jooq.EnumType
import org.jooq.Schema


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
enum class SessionTrxState(@get:JvmName("literal") val literal: String) : EnumType {
    ACTIVE("ACTIVE"),
    COMMITTED("COMMITTED"),
    `ROLLED BACK`("ROLLED BACK");
    override fun getCatalog(): Catalog? = null
    override fun getSchema(): Schema? = null
    override fun getName(): String = "session_trx_state"
    override fun getLiteral(): String = literal
}