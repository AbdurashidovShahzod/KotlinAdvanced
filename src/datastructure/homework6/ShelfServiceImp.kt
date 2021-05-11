package datastructure.homework6

import java.util.*

class ShelfServiceImp : ShelfBookInterface {

    private val dequeShelfBook: Deque<ShelfBook> = ArrayDeque()
    val scanner = Scanner(System.`in`)

    override fun addFirstBook() {
        println("Kitob nomini kiriting:")
        val nameBook = scanner.next()
        println("Kitob javoni bolimi:")
        val section: String = scanner.next()
        println("Kitob hajmi:")
        val size = scanner.nextInt()
        val shelfBook = ShelfBook(nameBook, section, size)
        dequeShelfBook.addFirst(shelfBook)
        println("Kitob muvaffaqiyatli qo'shildi....")

    }

    override fun addLastBook() {
        println("Kitoblar javoni dasturiga hush kelibsiz...")
        println("Kitob nomini kiriting:")
        val nameBook = scanner.next()
        println("Kitob javoni bolimi:")
        val section: String = scanner.next()
        println("Kitob hajmi:")
        val size = scanner.nextInt()
        val shelfBook = ShelfBook(nameBook, section, size)
        dequeShelfBook.addLast(shelfBook)
        println("Kitob muvaffaqiyatli qo'shildi....")
    }

    override fun readFirstBook() {
        println(dequeShelfBook.removeFirst())
    }

    override fun readLastBook() {
        println(dequeShelfBook.removeLast())
    }

    override fun countBooks() {
        println("Javondagi umumiy kitoblar soni:${dequeShelfBook.size}")
    }

    override fun firstBookShow() {
        println(dequeShelfBook.pollFirst())
    }

    override fun showBooks() {
        val iterator = dequeShelfBook.iterator()
        iterator.forEachRemaining {
            println(it)
        }
    }
}