package com.example.kotlinSampleApp

import nu.studer.sample.kotlin_sample_app.tables.references.ARTICLES
import org.jooq.DSLContext
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Repository
@Transactional
class ArticleRepository(
        private val dslContext: DSLContext
) {
    fun selectAll(): String? {
        return dslContext
                .select()
                .from(ARTICLES)
                .fetch()
                .formatJSON()
    }
}