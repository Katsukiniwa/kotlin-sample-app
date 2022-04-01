package com.example.kotlinSampleApp.domain.model.party

import com.example.kotlinSampleApp.domain.model.amount.BillingAmount
import com.example.kotlinSampleApp.domain.model.DifferenceAmountAdjustmentType
import com.example.kotlinSampleApp.domain.model.amount.MemberPaymentAmounts
import com.example.kotlinSampleApp.domain.model.amount.rate.PaymentTypeAmountRates
import com.example.kotlinSampleApp.domain.model.amount.types.MemberPaymentTypes
import com.example.kotlinSampleApp.domain.model.members.Members
import java.util.*


class Party {
    private val name: PartyName
    private val members: Members
    private val memberPaymentTypes: MemberPaymentTypes
    private val differenceAmountAdjustmentType: DifferenceAmountAdjustmentType?

    private constructor(
            name: PartyName,
            members: Members,
            memberPaymentTypes: MemberPaymentTypes,
            differenceAmountAdjustmentType: DifferenceAmountAdjustmentType?
    ) {
        this.name = name
        this.members = members
        this.memberPaymentTypes = memberPaymentTypes
        this.differenceAmountAdjustmentType = differenceAmountAdjustmentType
    }

    /**
     * 請求金額の割り勘を行う。
     *
     * @param billingAmount {@link BillingAmount}
     * @param paymentTypeAmountRates {@link PaymentTypeAmountRates}
     * @return {@link MemberPaymentAmounts}
     */
    public fun warikan(billingAmount: BillingAmount, paymentTypeAmountRates: PaymentTypeAmountRates): MemberPaymentAmounts {
        /**
         * TODO: 実装する
         */
    }

    private fun notEqualsPaymentTypes(paymentTypeAmountRates: PaymentTypeAmountRates): Boolean {
        return memberPaymentTypes.paymentTypes() != paymentTypeAmountRates.paymentTypes()
    }
}