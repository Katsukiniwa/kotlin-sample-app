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
enum class EventsStagesHistoryLongNestingEventType(@get:JvmName("literal") val literal: String) : EnumType {
    TRANSACTION("TRANSACTION"),
    STATEMENT("STATEMENT"),
    STAGE("STAGE"),
    WAIT("WAIT");
    override fun getCatalog(): Catalog? = null
    override fun getSchema(): Schema? = null
    override fun getName(): String = "events_stages_history_long_NESTING_EVENT_TYPE"
    override fun getLiteral(): String = literal
}
