package file.homework1

import java.io.File
import java.io.FileOutputStream
import java.io.FileWriter
import java.util.*
import kotlin.collections.ArrayList

class UserServiceImp : UserServiceInterface {
    var scanner = Scanner(System.`in`)
    var myFileUsers = File("Userslist.txt")


    override fun addUser() {
        println("Login kiriting:")
        val login = scanner.next()
        println("Password kiriting:")
        val password = scanner.next()
        println("Ismingizni kiriting:")
        val name = scanner.next()
        println("Familiyangizni kiriting:")
        val surname = scanner.next()
        println("Yoshingizni kiriting:")
        val age = scanner.nextInt()
        println("Manzilingizni kiriting:")
        val address = scanner.next()
        println("Telefon nomeringizni kiriting:")
        val number = scanner.next()
        println("Email kiriting:")
        val email = scanner.next()

        if (email.endsWith("@gmail.com") || email.endsWith("@email.com")) {
            myFileUsers.createNewFile()
            val user = User(login, password, name, surname, age, address, email, number)
            try {
                var fo = FileWriter("Userslist.txt", true)
                fo.write("${user.login}•${user.password}••${user.name}•••${user.surname}••••${user.age}•••••${user.address}••••••${user.email}•••••••${user.phoneNumber}\n")
                fo.close()
            } catch (e: Exception) {
                println(e.message)
            }
        } else {
            System.err.println("Email xato kiritilgan.Iltimos qaytadan urinib ko'ring!!!")
        }

//
//        var writerList = file.writer()
//        writerList.write("${user.login}•${user.password}••${user.name}•••${user.surname}••••${user.age}•••••${user.address}••••••${user.email}•••••••${user.phoneNumber}")
//        writerList.close()
    }

    override fun showUser() {
        var showFile = File("Userslist.txt").forEachLine {
            println(it)
        }

    }

    override fun deleteUser() {
        println("Rostan ham fayldagi malumotlarni o'chirmoqchimisiz?")
        println("1-> XA")
        println("2-> YO'Q")

        when (scanner.nextInt()) {
            1 -> myFileUsers.deleteRecursively()
        }
    }

    override fun editUser() {
        var isHave = false
        var index = 0
        println("Uzgartiralayotgan usernameni kiriting:")
        val nameUser = scanner.next()
        println("Passwordni kiriting:")
        val password = scanner.next()
        val list = myFileUsers.readLines()
        val editListUser = ArrayList<String>()
        for (i in list.indices) {
            if ("$nameUser•$password" == list[i]) {
                isHave = true
                index = i
                continue
            } else {
                editListUser.add(list[i])
            }
        }
        if (!isHave) {
            System.err.println("Username yoki password xato kiritildi!!!")
        } else {
            val editList = FileOutputStream(myFileUsers)
            for (i in editListUser.indices) {
                if (i == index) {

                    println("Yangi usernamingizni kiriting:")
                    val newUsername = scanner.next()
                    println("Yangi password kiriting:")
                    val newPassword = scanner.next()
                    editList.write("${newUsername}•${newPassword}".toByteArray()).toString()
                    editList.write(editListUser[i].toByteArray()).toString()
                } else {
                    editList.write(editListUser[i].toByteArray()).toString()
                }
            }
            println("Tabriklaymiz foydalanuvchi malumotlari muvaffaqiyatli uzgartirildi")
        }
    }

    override fun findUser() {
        println("Qidirilayotgan username kiriting:")
        val searchName = scanner.next()
        val readLines = myFileUsers.readLines()
        var isHave = false
        for (user in readLines) {
            if (user.substring(0, user.indexOf("•"))
                == searchName.toLowerCase().trim()
            ) {
                isHave = true
                println(
                    "Username:${searchName}" +
                            "Password:${user.indexOf("•" + 1)}"
                )
                break
            }
        }
        if (!isHave) {
            System.err.println("Bunday username mavjud emas!!!")
        }
    }
}