package datastructure.homework2

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val doctorService = DoctorServiceImp()
    var isStart = true
    while (isStart) {
        println("∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞")
        println("Shifokor qabuliga hush kelibsiz...")
        println("∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞")
        println("1-> Qabulga yozilish")
        println("2-> Qabulda kim birinchi ekanligini ko'rish")
        println("3-> Qabuldan shiqayotgan bemor tavsiloti")
        println("4-> Shifokor qabulida bor yo'qligingizni tekshirish.")
        println("5-> Chiqish")
        when (scanner.nextInt()) {
            1 -> doctorService.addNavbat()
            2 -> doctorService.showFirstPerson()
            3 -> doctorService.removePerson()
            4 -> doctorService.isPeson()
            5 -> isStart = false
        }
    }
}