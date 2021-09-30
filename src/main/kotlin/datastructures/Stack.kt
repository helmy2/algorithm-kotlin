package datastructures

class Stack<T> : Collection<T> {
    private var head: Node<T>? = null

    public override var size: Int = 0
        private set

    private class Node<T>(val value: T) {
        var next: Node<T>? = null
    }

    override fun isEmpty(): Boolean {
        return size == 0
    }

    fun push(item: T) {
        val new = Node(item)
        new.next = head
        head = new
        size++
    }

    fun poll(): T {
        if (isEmpty()) throw NoSuchElementException()
        val old = head?.value
        head = head?.next
        size--
        return old!!
    }

    fun peek(): T {
        if (size == 0) throw java.util.NoSuchElementException()
        return head!!.value
    }

    override fun contains(element: T): Boolean {
        for (obj in this)
            if (obj == element) return true
        return false
    }

    override fun containsAll(elements: Collection<T>): Boolean {
        for (element in elements) {
            if (!contains(element)) return false
        }
        return true
    }

    override fun iterator(): Iterator<T> {
        return object : Iterator<T> {
            var node = head
            override fun hasNext() = node != null

            override fun next(): T {
                if (!hasNext()) throw java.util.NoSuchElementException()
                val current = node!!
                node = current.next
                return current.value
            }

        }
    }


}
