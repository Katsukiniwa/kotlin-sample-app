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
}