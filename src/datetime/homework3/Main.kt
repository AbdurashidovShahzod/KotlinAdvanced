package datetime.homework3

import java.time.LocalDateTime

fun main(args: Array<String>) {

    val localDataTime = LocalDateTime.of(2020, 5, 10, 22, 30)
    val localDataTime2 = LocalDateTime.of(1999, 1, 2, 11, 20)
    val minusMonth = localDataTime.dayOfMonth.minus(localDataTime2.dayOfMonth)
    val minusYear = localDataTime.year.minus(localDataTime2.year)
    val day = localDataTime.dayOfMonth.minus(localDataTime2.dayOfMonth)
    val hour = localDataTime.hour.minus(localDataTime2.hour)
    val minute = localDataTime.minute.minus(localDataTime2.minute)
    println("$minusYear-$minusMonth-$day T $hour:$minute")

}