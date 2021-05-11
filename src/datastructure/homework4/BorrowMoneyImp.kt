package datastructure.homework4

import java.util.*

class BorrowMoneyImp : BorrowMoneyInterface {
    val stackLend: Stack<LendPerson> = Stack()
    val scanner = Scanner(System.`in`)

    override fun lend() {
        println("Qarz miqdorini kiriting:")
        val lent = scanner.nextInt()
        println("Ismingiz:")
        val name = scanner.next()
        println("Familiyangiz:")
        val surname = scanner.next()
        println("Qarz qaytarish muddati:")
        val dataLent = scanner.next()
        val lendPerson = LendPerson(lent, name, surname, dataLent)
        stackLend.push(lendPerson)
        println("Sizga muvaffaqiyatli qarz biriktirildi....")

    }

    override fun countBorrowPerson() {
        println("Qarz olgan insonlar soni:${stackLend.size}")
    }

    override fun borrowsShow() {
        println("Jami qarz olganlar ro'yxati:")
        val iterator = stackLend.iterator()
        iterator.forEachRemaining {
            println(it)
        }
    }
    override fun removeBorrowPerson() {
        println(stackLend.pop())
    }
}