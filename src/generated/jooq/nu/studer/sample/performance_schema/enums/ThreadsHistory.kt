/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.performance_schema.enums


import org.jooq.Catalog
import org.jooq.EnumType
import org.jooq.Schema


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
enum class ThreadsHistory(@get:JvmName("literal") val literal: String) : EnumType {
    YES("YES"),
    NO("NO");
    override fun getCatalog(): Catalog? = null
    override fun getSchema(): Schema? = null
    override fun getName(): String = "threads_HISTORY"
    override fun getLiteral(): String = literal
}
