package com.example.kotlinSampleApp.domain.model.amount

import com.example.kotlinSampleApp.domain.model.Money
import java.lang.IllegalArgumentException
import java.util.*

/**
 * 請求金額。
 *
 * <p>飲み会の請求金額を表す値オブジェクト。
 */
class BillingAmount private constructor(private val value: Money) {

    init {
        if (value.isNegative()) {
            throw IllegalArgumentException("value is negative")
        }
    }

    companion object {
        /**
         * ファクトリメソッド
         *
         * @param value {@link Money}
         * @return {@link BillingAmount}
         */
        fun of(value: Money): BillingAmount {
            return BillingAmount(value)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || javaClass != other.javaClass.kotlin) return false
        val that = other as BillingAmount
        return Objects.equals(value, that.value)
    }

    override fun hashCode(): Int {
        return Objects.hash(value)
    }
}