package com.example.kotlinSampleApp.domain.model.comment

import com.example.kotlinSampleApp.domain.event.DomainEvent
import com.example.kotlinSampleApp.domain.model.Aggregate
import com.example.kotlinSampleApp.domain.model.author.Author
import java.util.*

class Comment private constructor(
        id: UUID,
        body: String,
        authorId: UUID,
): Aggregate() {
    override val id: UUID = UUID.randomUUID()
    override val domainEvents: List<DomainEvent> = mutableListOf()

    companion object {
        fun create(body: String, authorId: UUID): Comment {
            return Comment(
                    UUID.randomUUID(),
                    body,
                    authorId,
            )
        }
    }
}