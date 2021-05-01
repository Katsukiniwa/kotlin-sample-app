package com.example.kotlinSampleApp

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class HomeController(
        val articleRepository: ArticleRepository
) {
    @GetMapping("/")
    fun home(): String {
        val articles = articleRepository.selectAll()
        print(articles)
        return "hello world"
    }
}