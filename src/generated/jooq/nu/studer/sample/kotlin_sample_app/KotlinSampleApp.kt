/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.kotlin_sample_app


import kotlin.collections.List

import nu.studer.sample.DefaultCatalog
import nu.studer.sample.kotlin_sample_app.tables.Articles
import nu.studer.sample.kotlin_sample_app.tables.FlywaySchemaHistory
import nu.studer.sample.kotlin_sample_app.tables.Users

import org.jooq.Catalog
import org.jooq.Table
import org.jooq.impl.SchemaImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class KotlinSampleApp : SchemaImpl("kotlin_sample_app", DefaultCatalog.DEFAULT_CATALOG) {
    companion object {

        /**
         * The reference instance of <code>kotlin_sample_app</code>
         */
        val KOTLIN_SAMPLE_APP = KotlinSampleApp()
    }

    /**
     * The table <code>kotlin_sample_app.articles</code>.
     */
    val ARTICLES get() = Articles.ARTICLES

    /**
     * The table <code>kotlin_sample_app.flyway_schema_history</code>.
     */
    val FLYWAY_SCHEMA_HISTORY get() = FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY

    /**
     * The table <code>kotlin_sample_app.users</code>.
     */
    val USERS get() = Users.USERS

    override fun getCatalog(): Catalog = DefaultCatalog.DEFAULT_CATALOG

    override fun getTables(): List<Table<*>> = listOf(
        Articles.ARTICLES,
        FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY,
        Users.USERS
    )
}