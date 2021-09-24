package sort

class InsertionSort : Sort() {
    override fun sort(array: Array<Int>) {
        for (i in 1 until array.size) {
            var j = i
            while (j > 0 && array[j - 1] > array[j]) {
                array[j] = array[j - 1].also { array[j - 1] = array[j] }
                j--
            }
        }
    }
}