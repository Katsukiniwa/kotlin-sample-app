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
enum class EventOnCompletion(@get:JvmName("literal") val literal: String) : EnumType {
    DROP("DROP"),
    PRESERVE("PRESERVE");
    override fun getCatalog(): Catalog? = null
    override fun getSchema(): Schema? = null
    override fun getName(): String = "event_on_completion"
    override fun getLiteral(): String = literal
}