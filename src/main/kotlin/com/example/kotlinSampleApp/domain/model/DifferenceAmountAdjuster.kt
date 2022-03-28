package com.example.kotlinSampleApp.domain.model

class DifferenceAmountAdjuster {
//    private val unadjustedAmounts: MemberPaymentsAmounts
    private val differenceAmount: Money
//    private val differenceAmountAdjustmentType: DifferenceAmountAdjustmentType

    private constructor(
            differenceAmount: Money,
    ) {
        this.differenceAmount = differenceAmount
    }
}