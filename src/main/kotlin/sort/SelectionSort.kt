package sort

class SelectionSort : Sort() {
    override fun sort(array: Array<Int>) {
        for (i in array.indices) {
            var minIndex = i
            for (j in i until array.size)
                if (array[j] < array[minIndex])
                    minIndex = j
            array[i] = array[minIndex].also { array[minIndex] = array[i] }
        }
    }
}