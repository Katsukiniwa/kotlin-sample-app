package com.example.KotlinSampleApp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSampleAppApplication

fun main(args: Array<String>) {
	runApplication<KotlinSampleAppApplication>(*args)
}
