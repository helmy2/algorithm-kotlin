package datastructures

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.util.NoSuchElementException

internal class QueueTest{
    @Test
    fun emptyTest() {
        val queue = Queue<Int>()
        assertEquals(0, queue.size)
        assertTrue(queue.isEmpty())
    }

    @Test()
    fun exceptionTest() {
        val queue = Queue<Int>()
        assertThrows(NoSuchElementException::class.java){
            queue.peek()
        }
    }

    @Test
    fun naiveTest() {
        val queue = Queue<Int>()
        for (i in 0..10) {
            queue.add(i)
        }
        for (i in 0..10) {
            assertEquals(i, queue.peek())
            assertEquals(i, queue.poll())
        }
        assertEquals(0, queue.size)
    }

    @Test
    fun naiveIteratorTest() {
        val queue = Queue<Int>()
        for (i in 0..10) {
            queue.add(i)
        }

        var k = 0
        for (i in queue) {
            assertEquals(i, k++)
        }
    }

    @Test
    fun naiveContainsTest() {
        val queue = Queue<Int>()
        for (i in 0..10) {
            queue.add(i)
        }

        for (i in 0..10) {
            assertTrue(queue.contains(i))
        }

        assertFalse(queue.contains(100))
        assertFalse(queue.contains(101))
        assertFalse(queue.contains(103))
    }
}