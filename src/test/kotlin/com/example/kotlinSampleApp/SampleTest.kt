package com.example.kotlinSampleApp

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Test

class SampleTest {
    // OKケース１
    @Test
    fun ampleTest001() {
        var sample = Sample()
        assertEquals(10, sample.echo(10))
    }

    // OKケース２
    @Test
    fun sampleTest002() {
        var sample = Sample()
        assertEquals(-15, sample.echo(-15))
    }

    // NGケース１
    @Test
    fun sampleTest100() {
        var sample = Sample()
        assertNotEquals(10, sample.echo(20))
    }

}