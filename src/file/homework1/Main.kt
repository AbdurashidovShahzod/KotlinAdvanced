package file.homework1

import java.util.*

fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`)
    var isStart = true
    var userImp = UserServiceImp()
    while (isStart) {
        println("••••••••••••••••••••••••••••••")
        println("1=> Add User")
        println("2=> Show Users")
        println("3=> Userlarni o'chirish")
        println("4=> User malumotlarini o'zgartirish")
        println("5=> User malumotlarini qidirish")
        println("6=> Tizimdan chiqish")
        when (scanner.nextInt()) {
            1 -> userImp.addUser()
            2 -> userImp.showUser()
            3 -> userImp.deleteUser()
            4 -> userImp.editUser()
            5 -> userImp.findUser()
            6 -> isStart = false
        }
    }
}