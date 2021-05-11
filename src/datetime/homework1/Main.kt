package datetime.homework1

import java.time.LocalDate
import java.util.*
import kotlin.math.abs

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    println("Tugilgan kuningizni kiriting:")
    val day = scanner.nextInt()
    println("Oyni kiriting:")
    val month = scanner.nextInt()
    println("Yilni kiriting:")
    val year = scanner.nextInt()
    val localDate = LocalDate.of(year, month, day)
    println("Tugilgan kuningiz:$localDate")
    val nowDay = LocalDate.now()
    println("Hozirgi kun:$nowDay")
    val newYear = nowDay.year.minus(year)
    val newDay = abs(nowDay.dayOfMonth.minus(localDate.dayOfMonth))
    println("Ikki yil orasida $newYear yilu  va $newDay kun farq bor.")


}