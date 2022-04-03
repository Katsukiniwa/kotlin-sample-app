package com.example.kotlinSampleApp.domain.event

import java.lang.Exception
import java.util.*

/**
 * ユーザ間で送金が行われた時にディスパッチされるドメインイベント
 */
data class TransferEvent(
        val fromUserId: UUID,
        val toUserId: UUID,
        val amount: Int,
) : DomainEvent {
    init {
        if (amount <= 0) {
            throw Exception("amount must be positive")
        }
    }
}