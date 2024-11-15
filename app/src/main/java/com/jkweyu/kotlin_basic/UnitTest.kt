package com.jkweyu.kotlin_basic
import junit.framework.Assert.assertEquals
import org.junit.Test

class UnitTest {
}
class CalculatorTest {

    // 테스트하려는 메서드
    fun add(a: Int, b: Int): Int {

        return a + b

    }

    @Test
    fun testAdd() {
        // add 함수가 의도한 대로 동작하는지 테스트
        val result = add(2, 3)
        assertEquals(5, result) // 예상값 5와 비교
    }

    @Test
    fun testAddNegativeNumbers() {
        val result = add(-2, -3)
        assertEquals(-5, result) // 예상값 -5와 비교
    }
}