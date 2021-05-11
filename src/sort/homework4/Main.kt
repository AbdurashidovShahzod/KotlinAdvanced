package sort.homework4

import java.util.*

fun main(args: Array<String>) {
    val arr = intArrayOf(12, 88, 33, 1, 3, 4, 0, 7,8,-12)
    sort(arr)
    println("Heap sort saralash algoritimi orqali saralandi:")
    printArray(arr)
}


fun sort(arr: IntArray) {
    val n = arr.size
    for (i in n / 2 - 1 downTo 0) {
        heaping(arr, n, i)
    }

    for (i in n - 1 downTo 0) {
        val temp = arr[0]
        arr[0] = arr[i]
        arr[i] = temp
        heaping(arr, i, 0)
    }
}

fun heaping(arr: IntArray, n: Int, i: Int) {
    var largest = i
    val l = 2 * i + 1
    val r = 2 * i + 2
    if (l < n && arr[l] > arr[largest])
        largest = l
    if (r < n && arr[r] > arr[largest])
        largest = r
    if (largest != i) {
        val swap = arr[i]
        arr[i] = arr[largest]
        arr[largest] = swap
        heaping(arr, n, largest)
    }
}

fun printArray(arr: IntArray) {
    val n = arr.size
    for (i in 0 until n)
        print(arr[i].toString() + " ")
    println()
}
