package sort.homework2

import java.util.Arrays

fun main(args: Array<String>) {

    val array = intArrayOf(12, 88, 33, 1, 3, 4, 0, 7,8,-12)

    mergeSort(array, 0, array.size - 1)

    println("Merge saralash algoritimi orqali saralandi:")
    println(Arrays.toString(array))
}

fun merge(array: IntArray, p: Int, q: Int, r: Int) {

    val n1 = q - p + 1
    val n2 = r - q

    val l = IntArray(n1)
    val m = IntArray(n2)
    for (i in 0 until n1)
        l[i] = array[p + i]
    for (j in 0 until n2)
        m[j] = array[q + 1 + j]

    var i: Int = 0
    var j: Int = 0
    var k: Int = p

    while (i < n1 && j < n2) {
        if (l[i] <= m[j]) {
            array[k] = l[i]
            i++
        } else {
            array[k] = m[j]
            j++
        }
        k++
    }

    while (i < n1) {
        array[k] = l[i]
        i++
        k++
    }

    while (j < n2) {
        array[k] = m[j]
        j++
        k++
    }
}

fun mergeSort(array: IntArray, left: Int, right: Int) {
    if (left < right) {

        val mid = (left + right) / 2

        mergeSort(array, left, mid)
        mergeSort(array, mid + 1, right)

        merge(array, left, mid, right)
    }
}




