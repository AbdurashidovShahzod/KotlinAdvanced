package thread.main2

import java.lang.Exception
import java.net.HttpURLConnection
import java.net.URL

fun main(args: Array<String>) {
    val movieThread = MovieThread()
    if (movieThread.thread.isAlive) {
        println("Tabriklaymiz Json malumotalri muvaffaqiyatli o'qib olindi va filega yozildi...")
    }
}
