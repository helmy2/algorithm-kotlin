package sort

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

abstract class SortTest(private val strategy: Sort) {
    @Test
    fun emptyTest() {
        val arr = arrayOf<Int>()
        strategy.sort(arr)
        Assertions.assertArrayEquals(arrayOf<Int>(), arr)
    }

    @Test
    fun oneElementTest(){
        val arr = arrayOf(1)
        strategy.sort(arr)
        Assertions.assertArrayEquals(arrayOf(1), arr)
    }

    @Test
    fun twoElementInOrderTest(){
        val arr = arrayOf(22,33)
        strategy.sort(arr)
        Assertions.assertArrayEquals(arrayOf(22, 33), arr)
    }

    @Test
    fun twoElementOutOfOrderTest(){
        val arr = arrayOf(33,22)
        strategy.sort(arr)
        Assertions.assertArrayEquals(arrayOf(22, 33), arr)
    }

    @Test
    fun twoElementEqualTest(){
        val arr = arrayOf(33,33)
        strategy.sort(arr)
        Assertions.assertArrayEquals(arrayOf(33, 33), arr)
    }

    @Test
    fun tenElementInReverseOrderTest(){
        val arr = arrayOf(10,9,8,7,6,5,4,3,2,1)
        strategy.sort(arr)
        Assertions.assertArrayEquals(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), arr)
    }

    @Test
    fun tenElementInRandomOrderTest(){
        val arr = arrayOf(10,9,4,3,1,5,2,8,7,6)
        strategy.sort(arr)
        Assertions.assertArrayEquals(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), arr)
    }
}