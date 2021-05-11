package newtimes.timenewswire

import com.google.gson.Gson
import java.lang.StringBuilder
import java.net.HttpURLConnection
import java.net.URL
import java.net.http.HttpConnectTimeoutException

fun main(args: Array<String>) {
    val gson = Gson()
    try {
        val url =
            URL("https://api.nytimes.com/svc/news/v3/content/all/all.json?api-key=aq6QiZ5I0YURK1E3qI6iINjLG62As62Z")
        val httpURLConnection = url.openConnection() as HttpURLConnection
        httpURLConnection.connect()
        val inputStream = httpURLConnection.inputStream
        val bufferedReader = inputStream.bufferedReader()
        val list = bufferedReader.readLines()
        val stringBuilder = StringBuilder()
        for (s in list) {
            stringBuilder.append(s)
        }
        for (s in list) {
            println(s)
        }
        val listTimesView = gson.fromJson<TimesNewsViewer>(stringBuilder.toString(), TimesNewsViewer::class.java)
        println(listTimesView.toString())

    } catch (e: HttpConnectTimeoutException) {
        e.printStackTrace()
    }
}