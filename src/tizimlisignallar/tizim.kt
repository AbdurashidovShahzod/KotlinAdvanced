package tizimlisignallar

import kotlin.math.PI
import kotlin.math.sin

fun main() {
    val t = 1.5625
    for (i in 0..39) {
        val u = 16 * sin(2 * PI * 1600 * i * t) - 1.2 * sin(2 * PI * 9000 * i * t)
        println(u)
    }
}