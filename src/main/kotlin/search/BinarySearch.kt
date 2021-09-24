package search

class BinarySearch() : Search() {
    override fun search(array: Array<Int>, element: Int): Int {
        return binarySearch(array, array.size - 1, 0, element)
    }

    private fun binarySearch(arr: Array<Int>, high: Int, low: Int, eleToSearch: Int): Int {
        val mid = (high + low) / 2

        while (low <= high) {
            when {
                eleToSearch > arr[mid] -> return binarySearch(arr, high, mid + 1, eleToSearch)
                eleToSearch < arr[mid] -> return binarySearch(arr, mid - 1, low, eleToSearch)
                eleToSearch == arr[mid] -> return mid
            }
        }
        return -1
    }
}
