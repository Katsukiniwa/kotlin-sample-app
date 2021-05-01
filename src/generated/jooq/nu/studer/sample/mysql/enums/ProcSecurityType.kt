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
enum class ProcSecurityType(@get:JvmName("literal") val literal: String) : EnumType {
    INVOKER("INVOKER"),
    DEFINER("DEFINER");
    override fun getCatalog(): Catalog? = null
    override fun getSchema(): Schema? = null
    override fun getName(): String = "proc_security_type"
    override fun getLiteral(): String = literal
}
