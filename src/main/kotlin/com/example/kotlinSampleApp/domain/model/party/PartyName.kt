package com.example.kotlinSampleApp.domain.model.party

import java.lang.IllegalArgumentException

data class PartyName constructor(private val value: String) {

    init {
        if (value.isEmpty()) {
            throw IllegalArgumentException("value is empty")
        }
    }

    companion object {
        /**
         * ファクトリメソッド。
         *
         * @param value 飲み会名
         * @return {@link PartyName}
         */
        fun of(value: String): PartyName {
            return PartyName(value)
        }
    }
}