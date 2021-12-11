package com.example.kotlinSampleApp.domain.model

import java.math.BigDecimal
import java.math.RoundingMode
import java.util.Currency
import java.util.Locale
import java.util.Objects

public final class Money private constructor(private val amount: BigDecimal, private val currency: Currency) : Comparable<Money> {
    companion object {
        val DEFAULT_ROUNDING_MODE = RoundingMode.HALF_UP
        val DEFAULT_CURRENCY = Currency.getInstance(Locale.getDefault())
        val JPY = Currency.getInstance("JPY")
        val USD = Currency.getInstance("USD")

        /**
         * ファクトリメソッド
         * @param rawAmount 通貨の量
         * @param currency 通貨の単位
         * @return {@link Money}
         */
        fun of(rawAmount: BigDecimal, currency: Currency): Money {
            return Money(rawAmount, currency)
        }

        /**
         * ファクトリメソッド
         * @param rawAmount
         * @param currency 通貨の単位
         * @return {@link Money}
         */
        fun of(rawAmount: Long, currency: Currency): Money {
            return Money(BigDecimal.valueOf(rawAmount), currency)
        }

        /**
         * 通貨量0を返すファクトリメソッド
         * @params currency 通貨の単位
         * @return {@link Money}
         */
        fun zero(currency: Currency): Money {
            return of(BigDecimal.ZERO, currency)
        }

        /**
         * 通貨量1を返すファクトリメソッド
         * @param currency 通貨の単位
         * @return {@link Money}
         */
        fun one(currency: Currency): Money {
            return of(BigDecimal.ONE, currency)
        }

        /**
         * {@link Currency}のデフォルトの小数桁数にスケールを調整する
         *
         * @param rawAmount 通貨の量
         * @param currency {@link Currency}
         * @return {@link Money}
         */
        fun adjustBy(rawAmount: BigDecimal, currency: Currency): Money {
            return adjustBy(rawAmount, currency, DEFAULT_ROUNDING_MODE)
        }

        /**
         * @param {@link Currency}のデフォルトの小数桁数にスケールを調整する
         * @param rawAmount 通貨の量
         * @return {@link Money}
         */
        fun adjustBy(rawAmount: Long, currency: Currency): Money {
            return adjustBy(BigDecimal.valueOf(rawAmount), currency, DEFAULT_ROUNDING_MODE)
        }

        /**
         * {@link Currency}のデフォルトの小数桁数にスケールを調整する
         *
         * @param rawAmount 通貨の量
         * @param currency {@link Currency}
         * @param roundingMode {@link RoundingMode}
         * @return {@link Money}
         */
        private fun adjustBy(
                rawAmount: BigDecimal,
                currency: Currency,
                roundingMode: RoundingMode
        ): Money {
            val defaultFractionDigits = currency.defaultFractionDigits
            val amount = rawAmount.setScale(defaultFractionDigits, roundingMode)
            return Money(amount, currency)
        }
    }

    init {
        if (amount.scale() == currency.defaultFractionDigits) {
            throw Exception("Scale of amount does not match currency")
        }
    }

    override fun compareTo(other: Money): Int {
        if (currency != other.currency) throw Exception("currency miss match")
        return amount.compareTo(other.amount)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other.javaClass.kotlin != javaClass) return false
        val money = other as Money
        return Objects.equals(amount, money) && Objects.equals(currency, money.currency)
    }
}