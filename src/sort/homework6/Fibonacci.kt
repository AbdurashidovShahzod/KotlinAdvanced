package sort.homework6

fun main(args: Array<String>) {

    val arr = intArrayOf(0, 1, 2, 3, 4, 53, 111, 123, 121, 33, 43, 46, 744, 0, 3, 6, 123, 44)
    val size = arr.size
    arr.sort()
    val x = 46
    print("$x soni ${fibMonacanSearch(arr, x, size)} chi indexda joylashgan...")
}

fun min(x: Int, y: Int): Int {
    return if (x <= y) x else y
}


fun fibMonacanSearch(
    arr: IntArray,
    x: Int, n: Int
): Int {

    var fibMMm2 = 0
    var fibMMm1 = 1
    var fibM = fibMMm2 + fibMMm1
    while (fibM < n) {
        fibMMm2 = fibMMm1
        fibMMm1 = fibM
        fibM = fibMMm2 + fibMMm1
    }
    var offset = -1
    while (fibM > 1) {

        val i = min(offset + fibMMm2, n - 1)

        when {
            arr[i] < x -> {
                fibM = fibMMm1
                fibMMm1 = fibMMm2
                fibMMm2 = fibM - fibMMm1
                offset = i
            }
            arr[i] > x -> {
                fibM = fibMMm2
                fibMMm1 -= fibMMm2
                fibMMm2 = fibM - fibMMm1
            }
            else -> return i
        }
    }
    return if (fibMMm1 == 1 && arr[offset + 1] == x) offset + 1 else -1
}