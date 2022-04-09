package com.example.kotlinSampleApp.domain.service.authentication

interface AuthenticationService {
    fun generateHashedPassword(rawPassword: String): String
    fun verifyPassword(rawPassword: String): Boolean
}