package com.example.kotlinSampleApp

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class HomeController() {

    @GetMapping("/")
    fun hello(): String =
            "Hello World"
}