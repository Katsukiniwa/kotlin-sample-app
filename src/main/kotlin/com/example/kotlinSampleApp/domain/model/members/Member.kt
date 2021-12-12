package com.example.kotlinSampleApp.domain.model.members

class Member(private val name: MemberName, private val secretaryType: SecretaryType) {

    fun isSecretary(): Boolean {
        return secretaryType == SecretaryType.Secretary
    }

    fun nonSecretary(): Boolean {
        return !isSecretary()
    }
}