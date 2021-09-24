package sort

class MergeSort : Sort() {
    override fun sort(array: Array<Int>) {
        mergeSort(array, 0, array.size - 1)
    }

    private fun mergeSort(array: Array<Int>, start: Int, end: Int) {
        if (start >= end) return
        val middle = start + (end - start) / 2
        mergeSort(array, start, middle)
        mergeSort(array, middle + 1, end)
        merge(array, start, middle, end)
    }

    private fun merge(array: Array<Int>, start: Int, middle: Int, end: Int) {
        val leftArray = array.copyOfRange(start, middle + 1)
        val rightArray = array.copyOfRange(middle + 1, end + 1)
        var l = 0
        var r = 0
        for (k in start..end)
            if ((l <= leftArray.size - 1) && ((r >= rightArray.size) || (leftArray[l] <= rightArray[r])))
                array[k] = leftArray[l++]
            else
                array[k] = rightArray[r++]
    }
}