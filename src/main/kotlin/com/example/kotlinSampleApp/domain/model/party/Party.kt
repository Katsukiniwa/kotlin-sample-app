package com.example.kotlinSampleApp.domain.model.party

import com.example.kotlinSampleApp.domain.model.amount.types.MemberPaymentTypes
import com.example.kotlinSampleApp.domain.model.members.Members
import java.util.*

class Party {
//    private val name: PartyName

    private constructor(
            name: PartyName,
            members: Members,
            memberPaymentTypes: MemberPaymentTypes,
//            differenceAmountAdjustmentType: DifferenceAmountAdjustmentType
    )

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
}