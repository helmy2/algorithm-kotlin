package sort

class BubbleSort : Sort() {
    override fun sort(array: Array<Int>) {
        for (i in array.indices)
            for (j in 0 until array.size - i - 1)
                if (array[j] > array[j + 1])
                    array[j] = array[j + 1].also { array[j + 1] = array[j] }
    }
}
