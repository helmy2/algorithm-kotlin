package datastructures

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class StackTest{
    @Test
    fun emptyStack(){
        val stack = Stack<Int>()
        assertEquals(0,stack.size)
        assertTrue(stack.isEmpty())
    }

    @Test
    fun exceptionTest() {
        val stack = Stack<Int>()
        assertThrows(NoSuchElementException::class.java){
            stack.peek()
        }
    }

    @Test
    fun naiveTest() {
        val stack = Stack<Int>()
        for (i in 0..10) {
            stack.push(i)
        }
        for (i in 10 downTo 0) {
            assertEquals(i, stack.peek())
            assertEquals(i, stack.poll())
        }
        assertEquals(0, stack.size)
    }

    @Test
    fun naiveIteratorTest() {
        val stack = Stack<Int>()
        for (i in 0..10) {
            stack.push(i)
        }

        var k = 10
        for (i in stack) {
            assertEquals(i, k--)
        }
    }

    @Test
    fun naiveContainsTest() {
        val stack = Stack<Int>()
        for (i in 0..10) {
            stack.push(i)
        }

        for (i in 0..10) {
            assertTrue(stack.contains(i))
        }

        assertFalse(stack.contains(100))
        assertFalse(stack.contains(101))
        assertFalse(stack.contains(103))
    }
}