package com.example.kotlinSampleApp.domain.model.members

/**
 * 参加者名
 */
class MemberName(private val value: String) {
    init {
        if (value.isEmpty()) throw Exception("value is empty")
    }

    companion object {
        /**
         * ファクトリメソッド
         *
         * @param value 参加者名
         * @return {@link MemberName}
         */
        fun of(value: String): MemberName {
            return MemberName(value)
        }
    }
}