package com.example.kotlinSampleApp.domain.model.bank_account

import java.util.*
import com.example.kotlinSampleApp.domain.model.Entity

class BankAccount private constructor(
        id: UUID,
        bankName: String,
        bankType: String,
        bankNumber: Int,
): Entity() {
    override val id: UUID = UUID.randomUUID()

    companion object {
        fun create(bankName: String, bankType: String, bankNumber: Int): BankAccount {
            return BankAccount(
                    UUID.randomUUID(),
                    bankName,
                    bankType,
                    bankNumber,
            )
        }
    }
}