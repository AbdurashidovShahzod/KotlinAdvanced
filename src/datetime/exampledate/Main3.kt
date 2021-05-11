package datetime.exampledate

import java.text.SimpleDateFormat

fun main(args: Array<String>) {
    val simpleFormat = SimpleDateFormat("dd.MM.yyyy")
    val time1 = simpleFormat.parse("24.05.1999")
    val time2 = simpleFormat.parse("07.10.2020")

    if (time1 > time2) {
        println("1")
    } else println("-1")

    println(time1.after(time2))


}