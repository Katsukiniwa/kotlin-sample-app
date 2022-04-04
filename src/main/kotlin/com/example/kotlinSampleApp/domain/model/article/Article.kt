package com.example.kotlinSampleApp.domain.model.article

import com.example.kotlinSampleApp.domain.event.DomainEvent
import com.example.kotlinSampleApp.domain.model.comment.Comment
import com.example.kotlinSampleApp.domain.model.Aggregate
import java.time.LocalDate
import java.util.*

class Article private constructor(
        id: UUID,
        title: String,
        content: String,
        comments: List<Comment>,
        publishedAt: LocalDate,
        withdrewAt: LocalDate,
) : Aggregate() {
    override val id: UUID = UUID.randomUUID()
    private var title = title
    private var content = content
    private var publishedAt = publishedAt
    private var withdrewAt = withdrewAt
    override val domainEvents: List<DomainEvent> = mutableListOf()

    companion object {
        fun create(
                title: String,
                content: String,
                comments: List<Comment>,
                publishedAt: LocalDate,
                withdrewAt: LocalDate,
        ): Article {
            return Article(
                    UUID.randomUUID(),
                    title,
                    content,
                    comments,
                    publishedAt,
                    withdrewAt,
            )
        }

        fun reConstruct(
                id: UUID,
                title: String,
                content: String,
                comments: List<Comment>,
                publishedAt: LocalDate,
                withdrewAt: LocalDate,
        ): Article {
            return Article(
                    id,
                    title,
                    content,
                    comments,
                    publishedAt,
                    withdrewAt,
            )
        }
    }

    fun changeTitle(title: String) {
        this.title = title
    }

    fun changeContent(content: String) {
       this.content = content
    }
}