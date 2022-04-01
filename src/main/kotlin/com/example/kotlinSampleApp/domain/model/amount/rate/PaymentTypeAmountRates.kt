package com.example.kotlinSampleApp.domain.model.amount.rate

import com.example.kotlinSampleApp.domain.model.payment_type.PaymentType
import com.example.kotlinSampleApp.domain.model.payment_type.PaymentTypes
import java.util.function.Predicate
import javax.swing.text.html.Option


/** 支払区分料金割合リスト。 */
class PaymentTypeAmountRates private constructor
(private val total: AmountRate, private val values: Set<PaymentTypeAmountRate>) {

    private fun equalsPaymentType(tpe: PaymentType): Predicate<PaymentTypeAmountRate> {
        return Predicate { paymentTypeAmountRate: PaymentTypeAmountRate -> paymentTypeAmountRate.paymentType().equals(tpe) }
    }

    /**
     * 要素が含まれるかを返す。
     *
     * @param element 要素
     * @return 含まれる場合true
     */
    operator fun contains(element: PaymentTypeAmountRate?): Boolean {
        return values.contains(element)
    }

    /**
     * 述語に該当するかを返す。
     *
     * @param p 述語関数
     * @return 該当する場合true
     */
    fun exists(p: Predicate<PaymentTypeAmountRate?>?): Boolean {
        return values.contains(p)
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
     * すべての[PaymentType]を取得する。
     *
     * @return [PaymentType]のセット
     */
    fun paymentTypes(): PaymentTypes? {
        return PaymentTypes.of(values.map(PaymentTypeAmountRate::paymentType).toSet())
    }

    /**
     * 指定した[PaymentType]の[AmountRate]を取得する。
     *
     * @param tpe [PaymentType]
     * @return [AmountRate]
     */
    fun amountRate(tpe: PaymentType): AmountRate? {
        return values.find(equalsPaymentType(tpe)).map(PaymentTypeAmountRate::amountRate)
    }
}