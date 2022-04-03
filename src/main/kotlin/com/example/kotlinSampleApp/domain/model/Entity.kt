package com.example.kotlinSampleApp.domain.model

import java.util.*

abstract class Entity {
    abstract val id: UUID

    fun sameIdentifier(id: UUID): Boolean {
        return this.id == id
    }
}