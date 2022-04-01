package com.example.kotlinSampleApp.domain.model.amount.types

import com.example.kotlinSampleApp.domain.model.payment_type.PaymentType
import com.example.kotlinSampleApp.domain.model.payment_type.PaymentTypes
import java.math.BigDecimal
import java.util.function.Predicate


/** 参加者支払区分リスト */
class MemberPaymentTypes private constructor(private val values: List<MemberPaymentType>) {

    companion object {
        fun of(values: List<MemberPaymentType>): MemberPaymentTypes? {
            return MemberPaymentTypes(values)
        }
    }

    private fun equalsPaymentType(paymentType: PaymentType): Predicate<MemberPaymentType> {
        return Predicate<MemberPaymentType> { element -> element.paymentType() == paymentType }
    }

    /**
     * 要素数を取得する。
     *
     * @return 要素数
     */
    fun size(): Int {
        return values.size
    }

    /**
     * 支払区分に対応するメンバー数を取得する。
     *
     * @param paymentType 支払区分
     * @return メンバー数
     */
    fun memberCountByPaymentType(paymentType: PaymentType): BigDecimal {
        return BigDecimal(values.count(equalsPaymentType(paymentType)))
    }

    /**
     * [PaymentTypes]を取得する。
     *
     * @return [PaymentTypes]
     */
    fun paymentTypes(): PaymentTypes {
        val set = values.map { obj: MemberPaymentType -> obj.paymentType() }.toSet()
        return PaymentTypes.of(set.head(), set.tail())
    }
}