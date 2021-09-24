package search

class LinearSearch : Search() {
    override fun search(array: Array<Int>, element: Int): Int {
        array.forEachIndexed { index, item -> if (item == element) return index }
        return -1
    }
}