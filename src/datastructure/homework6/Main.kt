package datastructure.homework6

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val shelfService = ShelfServiceImp()
    var isStart = true
    while (isStart) {
        println("∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞")
        println("Kitoblar javoni dasturiga hush kelibsiz...")
        println("∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞")
        println("1-> Javonga birinchi qatordan kitob qo'shish")
        println("2-> Javonga oxiridan kitob qo'shish")
        println("3-> Javonda birinchi turgan kitobni o'qish")
        println("4-> Javonda oxirida turgan kitobni o'qish")
        println("5-> Javondagi kitoblar soni")
        println("6-> Javonda turgan birinchi kitob")
        println("7-> Javondagi kitoblar haqida malumot")
        println("8-> Tizimdan chiqish")


        when (scanner.nextInt()) {
            1 -> shelfService.addFirstBook()
            2 -> shelfService.addLastBook()
            3 -> shelfService.readFirstBook()
            4 -> shelfService.readLastBook()
            5 -> shelfService.countBooks()
            6 -> shelfService.firstBookShow()
            7 -> shelfService.showBooks()
            8 -> isStart = false
        }

    }
}