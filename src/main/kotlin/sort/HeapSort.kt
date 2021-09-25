package sort

class HeapSort : Sort() {
    override fun sort(array: Array<Int>) {
        val size = array.size
        // build heap (rearrange array)
        for (i in (size / 2 - 1) downTo 0)
            heapify(array, size, i)

        // one by one extract an element from heap
        for (i in (size - 1) downTo 0) {
            array[0] = array[i].also { array[i] = array[0] }
            heapify(array, i, 0)
        }
    }

    private fun heapify(array: Array<Int>, size: Int, i: Int) {
        var largestIndex = i
        val leftIndex = 2 * i + 1
        val rightIndex = 2 * i + 2

        // if left child is larger than root
        if (leftIndex < size && array[leftIndex] > array[largestIndex])
            largestIndex = leftIndex

        // if right child is larger than largest so far
        if (rightIndex < size && array[rightIndex] > array[largestIndex])
            largestIndex = rightIndex

        // if largest is not root
        if (largestIndex != i) {
            array[i] = array[largestIndex].also { array[largestIndex] = array[i] }
            heapify(array, size, largestIndex);
        }
    }
}