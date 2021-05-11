package sort.homework3

import java.util.Arrays

fun main(args: Array<String>) {

    val data =  intArrayOf(12, 88, 33, 1, 3, 4, 0, 7,8,-12)
    val size = data.size
    quickSort(data, 0, size - 1)
    println("Quick sort saralash algoritimi orqali saralandi:")
    println(Arrays.toString(data))
}

fun partition(array: IntArray, low: Int, high: Int): Int {

    val pivot = array[high]
    var i = low - 1

    for (j in low until high) {
        if (array[j] <= pivot) {
            i++
            val temp = array[i]
            array[i] = array[j]
            array[j] = temp
        }
    }
    val temp = array[i + 1]
    array[i + 1] = array[high]
    array[high] = temp
    return i + 1
}

fun quickSort(array: IntArray, low: Int, high: Int) {
    if (low < high) {
        val pi = partition(array, low, high)
        quickSort(array, low, pi - 1)
        quickSort(array, pi + 1, high)
    }
}
