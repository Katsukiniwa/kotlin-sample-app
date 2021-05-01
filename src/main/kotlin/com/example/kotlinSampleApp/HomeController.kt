package com.example.kotlinSampleApp

import nu.studer.sample.kotlin_sample_app.tables.references.ARTICLES
import org.jooq.impl.DSL
import org.springframework.web.bind.annotation.*
import java.util.*
import org.jooq.DSLContext

@RestController
@RequestMapping("/api")
class HomeController(
        val articleRepository: ArticleRepository
) {

    @GetMapping("/")
    fun findAll(): String {
        val articles = articleRepository.selectAll()
        print(articles)
        return "sample"
    }
}