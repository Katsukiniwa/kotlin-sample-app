package com.example.kotlinSampleApp.domain.model.amount.types

import com.example.kotlinSampleApp.domain.model.members.Member
import com.example.kotlinSampleApp.domain.model.payment_type.PaymentType

/**
 * 参加者支払区分。
 *
 * <p>参加者に設定された支払い区分を表す。
 */
class MemberPaymentType private constructor(private val member: Member, private val paymentType: PaymentType) {
    companion object {
        /**
         * ファクトリメソッド。
         *
         * @param member {@link Member}
         * @param paymentType {@link PaymentType}
         */
        fun of(member: Member, paymentType: PaymentType): MemberPaymentType {
            return MemberPaymentType(member, paymentType)
        }
    }

    fun member(): Member {
        return this.member
    }

    fun paymentType(): PaymentType {
        return this.paymentType
    }
}