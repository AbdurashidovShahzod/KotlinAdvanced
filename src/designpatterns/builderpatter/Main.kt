package designpatterns.builderpatter

fun main(args: Array<String>) {


    /**
     * Eng yoqtirgan va zor tushungan patterim aynan builder pattern bo'ldi
     */

//    val computer = Computer("Macintosh", 16, 13.3, true, externalKeyboard = true, battery = "Ultra")
//    println(computer.toString())
    val developer =
        Developer.Builder().name("Shahzod")
            .surname("Abdurashidov")
            .age(21)
            .specialization("Android")
            .build()
    println(developer.toString())

}