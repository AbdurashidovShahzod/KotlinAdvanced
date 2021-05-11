package datetime.homework2

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import java.util.*

fun main(args: Array<String>) {

    val localNow = LocalDateTime.now()
    println(localNow.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)))
    val calOne = Calendar.getInstance()
    val dayOfYear = calOne.get(Calendar.DAY_OF_YEAR)
    val year = calOne.get(Calendar.YEAR)
    println("Current Year: $year")
    val calTwo = GregorianCalendar(year, 11, 31)
    val day = calTwo.get(Calendar.DAY_OF_YEAR)
    println("Days in current year: $day")
    val totalDays = day - dayOfYear
    println("Total $totalDays days remaining in $year")


}