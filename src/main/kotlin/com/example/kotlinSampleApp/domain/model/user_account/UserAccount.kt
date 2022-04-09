package com.example.kotlinSampleApp.domain.model.user_account

import com.example.kotlinSampleApp.domain.event.DomainEvent
import com.example.kotlinSampleApp.domain.model.Aggregate
import java.util.*

class UserAccount private constructor(
        id: UUID,
        name: String,
        icon: String,
        profileText: String,
): Aggregate() {
    override val id: UUID = UUID.randomUUID()
    override val domainEvents: List<DomainEvent> = mutableListOf()

    companion object {
        fun create(name: String, icon: String, profileText: String): UserAccount {
            return UserAccount(
                    UUID.randomUUID(),
                    name,
                    icon,
                    profileText,
            )
        }
    }
}