package newtimes.topstories

import com.google.gson.Gson
import java.lang.StringBuilder
import java.net.HttpURLConnection
import java.net.URL

fun main(args: Array<String>) {
    val gson = Gson()
    try {
        val url = URL("https://api.nytimes.com/svc/topstories/v2/world.json?api-key=aq6QiZ5I0YURK1E3qI6iINjLG62As62Z")
        val httpURLConnection = url.openConnection() as HttpURLConnection
        httpURLConnection.connect()
        val inputStream = httpURLConnection.inputStream
        val bufferedReader = inputStream.bufferedReader()
        val list = bufferedReader.readLines()
        val stringBuilder = StringBuilder()
        for (s in list) {
            stringBuilder.append(s)
        }
        val listHome =
            gson.fromJson<TopStoriesWorld>(stringBuilder.toString(), TopStoriesWorld::class.java)
        println(listHome.toString())


    } catch (e: Exception) {
        e.printStackTrace()
    }
}