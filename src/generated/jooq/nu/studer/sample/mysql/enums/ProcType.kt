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
enum class ProcType(@get:JvmName("literal") val literal: String) : EnumType {
    FUNCTION("FUNCTION"),
    PROCEDURE("PROCEDURE");
    override fun getCatalog(): Catalog? = null
    override fun getSchema(): Schema? = null
    override fun getName(): String = "proc_type"
    override fun getLiteral(): String = literal
}