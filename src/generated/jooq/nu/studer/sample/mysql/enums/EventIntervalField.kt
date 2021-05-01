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
enum class EventIntervalField(@get:JvmName("literal") val literal: String) : EnumType {
    YEAR("YEAR"),
    QUARTER("QUARTER"),
    MONTH("MONTH"),
    DAY("DAY"),
    HOUR("HOUR"),
    MINUTE("MINUTE"),
    WEEK("WEEK"),
    SECOND("SECOND"),
    MICROSECOND("MICROSECOND"),
    YEAR_MONTH("YEAR_MONTH"),
    DAY_HOUR("DAY_HOUR"),
    DAY_MINUTE("DAY_MINUTE"),
    DAY_SECOND("DAY_SECOND"),
    HOUR_MINUTE("HOUR_MINUTE"),
    HOUR_SECOND("HOUR_SECOND"),
    MINUTE_SECOND("MINUTE_SECOND"),
    DAY_MICROSECOND("DAY_MICROSECOND"),
    HOUR_MICROSECOND("HOUR_MICROSECOND"),
    MINUTE_MICROSECOND("MINUTE_MICROSECOND"),
    SECOND_MICROSECOND("SECOND_MICROSECOND");
    override fun getCatalog(): Catalog? = null
    override fun getSchema(): Schema? = null
    override fun getName(): String = "event_interval_field"
    override fun getLiteral(): String = literal
}