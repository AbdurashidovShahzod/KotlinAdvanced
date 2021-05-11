package datastructure.homework4

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var isStart = true
    val borrowMoneyImp = BorrowMoneyImp()
    while (isStart) {
        println("∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞")
        println("Assolomu alaykum qarz berish tizimini tartibga soluvchi dasturga hush kelibsiz...")
        println("∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞")
        println("1-> Qarz miqdorini biriktirish")
        println("2-> Qarz olgan insonlar soni")
        println("3-> Qarzdan qutulish")
        println("4-> Qarzlar ro'yxati")
        println("5-> Tizimdan chiqish")
        when (scanner.nextInt()) {
            1 -> borrowMoneyImp.lend()
            2 -> borrowMoneyImp.countBorrowPerson()
            3 -> borrowMoneyImp.removeBorrowPerson()
            4 -> borrowMoneyImp.borrowsShow()
            5 -> isStart = false
        }
    }

}