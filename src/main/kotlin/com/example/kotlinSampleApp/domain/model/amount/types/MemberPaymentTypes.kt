package com.example.kotlinSampleApp.domain.model.amount.types


/** 参加者支払区分リスト */
class MemberPaymentTypes {
    private val values: List<MemberPaymentType>;

    private constructor(values: List<MemberPaymentType>){
        this.values = values
    }

    companion object {
        fun of(values: List<MemberPaymentType>): MemberPaymentTypes? {
            return MemberPaymentTypes(values)
        }
    }
}