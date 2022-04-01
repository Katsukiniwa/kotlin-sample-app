package com.example.kotlinSampleApp.domain.model

/**
 * 差額調整区分。
 *
 * <p>差額が生じた場合に誰の支払金額から調整するかを指定する区分。
 */
enum class DifferenceAmountAdjustmentType {
    幹事,
    幹事以外;
}