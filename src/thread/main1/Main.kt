package thread.main1

fun main(args: Array<String>) {

    val mostThread1 = MostThread1()
    if (mostThread1.thread.isAlive) {
        println("Birinchi Json malumotlari:")
    } else {
        System.err.println("No JSON!!!")
    }
    val mostThread2 = MostThread2()
    if (mostThread2.thread.isAlive) {
        println("Ikkinchi Json malumotlari:")
    } else {
        System.err.println("No JSON!!!")
    }

}