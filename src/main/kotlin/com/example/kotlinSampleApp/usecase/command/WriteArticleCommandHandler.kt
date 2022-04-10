package com.example.kotlinSampleApp.usecase.command

import java.util.*

class WriteArticleCommand(
        val authorId: UUID,
        val title: String,
        val content: String,
)
