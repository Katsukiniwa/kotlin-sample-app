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
enum class EventsTransactionsHistoryAccessMode(@get:JvmName("literal") val literal: String) : EnumType {
    `READ ONLY`("READ ONLY"),
    `READ WRITE`("READ WRITE");
    override fun getCatalog(): Catalog? = null
    override fun getSchema(): Schema? = null
    override fun getName(): String = "events_transactions_history_ACCESS_MODE"
    override fun getLiteral(): String = literal
}
