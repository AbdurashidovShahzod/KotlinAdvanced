package sort.homework5

import kotlin.math.floor
import kotlin.math.min
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val arr = intArrayOf(0, 1, 2, 3, 4, 53, 111, 123, 121, 33, 43, 46, 744, 0, 3, 6, 123, 44)
    arr.sort()
    val x = 123
    val index = jumpSearch(arr, x)
    println("$x soni $index indexda joylashgan....")
}

fun jumpSearch(arr: IntArray, x: Int): Int {
    val n = arr.size
    var step = floor(sqrt(n.toDouble())).toInt()
    var prev = 0
    while (arr[min(step, n) - 1] < x) {
        prev = step
        step += floor(sqrt(n.toDouble())).toInt()
        if (prev >= n)
            return -1
    }
    while (arr[prev] < x) {
        prev++
        if (prev == min(step, n))
            return -1
    }
    return if (arr[prev] == x) prev else -1

}

