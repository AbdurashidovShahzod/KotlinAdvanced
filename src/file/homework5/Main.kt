package file.homework5

import file.homework1.UserServiceImp
import java.io.File
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val footballService = FootballServiceImp()
    var isStart = true
    while (isStart) {
        println("1-> Futbol statistikasini shakllantirish:")
        println("2-> Jamolar haqida malumot")

        when (scanner.nextInt()) {
            1 -> footballService.teamFootball()
            2 -> footballService.show()
            3 -> isStart = false
        }
    }
}