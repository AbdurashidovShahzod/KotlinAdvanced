package designpatterns.factorypattern

import java.lang.IllegalArgumentException

fun main(args: Array<String>) {
    /**
     * Albatta design patternlarni o'rganish ancha qiyin bo'layabdi
     * shuning uchun ham internet orqali har xil manbalardan foydalangan
     * holda code larni qayta qayta yozib har bitta jarayoni nima bo'layotganini
     * tushunishga harakat qildim va bunga oz bo'lsada natijaga erishdim deb o'ylayman...
     */
    val genre = "SCIENCE"
    val book = BookFactory.createBook(
        when (genre) {
            "SCIENCE" -> Genre.SCIENCE
            "LITERATURE" -> Genre.LITERATURE
            else -> throw IllegalArgumentException("There is no such genre!!!")
        }
    )
    println("Getting book info:")
    book.getInfo()
    println("Order book:")
    book.order()
    println("Rate book:")
    book.rate()
}