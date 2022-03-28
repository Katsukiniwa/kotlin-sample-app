package com.example.kotlinSampleApp.domain.model.payment_type

class PaymentTypes(
        private var values: Set<PaymentType>,
) {
    init {
        this.values = values
    }

    companion object {
        /**
         * ファクトリメソッド
         *
         * @param head 先頭要素
         * @param tail 残りの要素
         * @return {@link PaymentTypes}
         */
        fun of(head: PaymentType, vararg tail: PaymentType): PaymentTypes {
            val result = hashSetOf(tail).plus(head) as Set<PaymentType>
            return of(result)
        }

        /**
         * ファクトリメソッド
         *
         * @param head 先頭要素
         * @param tail 残りのセット
         * @return {@link PaymentTypes}
         */
        fun of(head: PaymentType, tail: Set<PaymentType>): PaymentTypes {
            return of(tail.plus(head))
        }

        fun of(values: Set<PaymentType>): PaymentTypes {
            return PaymentTypes(values)
        }
    }
}