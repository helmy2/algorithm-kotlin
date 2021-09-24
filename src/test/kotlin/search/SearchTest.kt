package search

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

abstract class SearchTest(private val strategy: Search) {

    @Test
    fun emptyTest() {
        assertEquals(-1, strategy.search(emptyArray(), 1))
    }

    @Test
    fun singletonTest() {
        assertEquals(0, strategy.search(arrayOf(1), 1))
        assertEquals(-1, strategy.search(arrayOf(1), 2))
    }

    @Test
    fun twoElementsTest() {
        assertEquals(0, strategy.search(arrayOf(1, 2), 1))
        assertEquals(1, strategy.search(arrayOf(1, 2), 2))
        assertEquals(-1, strategy.search(arrayOf(1, 2), 3))
    }

    @Test
    fun tenElementsTest() {
        assertEquals(0, strategy.search(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 1))
        assertEquals(1, strategy.search(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 2))
        assertEquals(2, strategy.search(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 3))
        assertEquals(3, strategy.search(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 4))
        assertEquals(4, strategy.search(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 5))
        assertEquals(5, strategy.search(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 6))
        assertEquals(6, strategy.search(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 7))
        assertEquals(7, strategy.search(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 8))
        assertEquals(8, strategy.search(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 9))
        assertEquals(9, strategy.search(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 10))
        assertEquals(-1, strategy.search(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 0))
        assertEquals(-1, strategy.search(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 11))
    }
}