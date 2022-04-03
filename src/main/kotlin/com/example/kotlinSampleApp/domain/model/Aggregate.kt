package com.example.kotlinSampleApp.domain.model

import com.example.kotlinSampleApp.domain.event.DomainEvent

abstract class Aggregate: Entity() {
    abstract val domainEvents: List<DomainEvent>

    fun occur(event: DomainEvent) {
        this.domainEvents.plus(event)
    }

    fun removeEvent(event: DomainEvent) {
        this.domainEvents.filter { it != event }
    }
}