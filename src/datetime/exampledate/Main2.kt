package datetime.exampledate

import java.text.SimpleDateFormat
import java.util.*

fun main(args: Array<String>) {
    val date = Date()
    /**
     * Vaqtni chiqarish
     */
    var simpleDateFormat = SimpleDateFormat("dd.MM.yyyy")
    var format = simpleDateFormat.format(date)
    println(format)


    val  parseDate = simpleDateFormat.parse("24.05.1999")
    println(parseDate)





}