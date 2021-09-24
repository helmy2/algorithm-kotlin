package sort

class QuickSort : Sort() {
    override fun sort(array: Array<Int>) {
        quickSort(array, 0, array.size - 1)
    }

    private fun quickSort(arr: Array<Int>, start: Int, end: Int) {
        if (start >= end) return
        val loc = partition1(arr, start, end)
        quickSort(arr, start, loc - 1)
        quickSort(arr, loc + 1, end)
    }

    private fun partition(arr: Array<Int>, start: Int, end: Int): Int {
        var left = start
        var right = end
        var pivot = start
        while (true) {
            while (arr[pivot] <= arr[right] && pivot != right) right--
            if (pivot == right) break
            else if (arr[pivot] > arr[right]) {
                arr[pivot] = arr[right].also { arr[right] = arr[pivot] }
                pivot = right
            }

            while (arr[pivot] >= arr[left] && pivot != left) left++
            if (pivot == left) break
            else if (arr[pivot] < arr[left]) {
                arr[pivot] = arr[left].also { arr[left] = arr[pivot] }
                pivot = left
            }
        }
        return pivot
    }

    private fun partition1(arr: Array<Int>, start: Int, end: Int): Int {
        var i = start
        var j = end + 1
        val pivot = arr[start]
        while (true) {
            while (arr[++i] < pivot)
                if (i == end) break
            while (pivot < arr[--j])
                if (j == start) break
            if (j <= i) break
            arr[i] = arr[j].also { arr[j] = arr[i] }
        }
        arr[j] = arr[start].also { arr[start] = arr[j] }
        return j
    }
}