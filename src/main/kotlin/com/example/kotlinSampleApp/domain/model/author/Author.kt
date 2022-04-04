package com.example.kotlinSampleApp.domain.model.author

import com.example.kotlinSampleApp.domain.event.DomainEvent
import java.util.*
import com.example.kotlinSampleApp.domain.model.Aggregate

class Author private constructor(
        id: UUID,
        name: String,
        articles: List<UUID>
): Aggregate() {
    override val id: UUID = UUID.randomUUID()
    override val domainEvents: List<DomainEvent> = mutableListOf()

    companion object {
        fun create(name: String): Author {
            return Author(
                    UUID.randomUUID(),
                    name,
                    mutableListOf(),
            )
        }
    }
}