package com.example.kotlinSampleApp.domain.model.members

import java.lang.IllegalArgumentException

/**
 * メンバーグループ
 */
class Members {
    private val values: List<Member>

    private constructor(values: List<Member>) {
        if (values.isEmpty()) throw IllegalArgumentException("values are empty")
        this.values = values
    }

    private constructor(head: Member, tail: List<Member>) {
        this.values = tail.plus(head)
        values.find { it.isSecretary() } ?: throw IllegalArgumentException("secretaries are empty")
    }

    fun contains(element: Member): Boolean {
        return values.contains(element)
    }
}