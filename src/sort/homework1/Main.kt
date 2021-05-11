package sort.homework1

import java.util.*


fun main(args: Array<String>) {

    fun shellSort(array: IntArray, n: Int) {
        var middle = n / 2
        while (middle > 0) {
            var i = middle
            while (i < n) {
                val temp = array[i]
                var j: Int = i
                while (j >= middle && array[j - middle] > temp) {
                    array[j] = array[j - middle]
                    j -= middle
                }
                array[j] = temp
                i += 1
            }
            middle /= 2
        }
    }

    val data = intArrayOf(12, 88, 33, 1, 3, 4, 0, 7,8,-12)
    val size = data.size
    shellSort(data, size)
    println("Shell saralash algoritimi orqali saralandi: ")
    println(Arrays.toString(data))



}