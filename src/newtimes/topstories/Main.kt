package newtimes.topstories

import com.google.gson.Gson
import java.lang.Exception
import java.lang.StringBuilder
import java.net.HttpURLConnection
import java.net.URL

fun main(args: Array<String>) {
    val gson = Gson()
    try {

        val url = URL("https://api.nytimes.com/svc/topstories/v2/arts.json?api-key=aq6QiZ5I0YURK1E3qI6iINjLG62As62Z")
        val httpURLConnection = url.openConnection() as HttpURLConnection
        httpURLConnection.connect()
        val inputStream = httpURLConnection.inputStream
        val bufferedReader = inputStream.bufferedReader()
        val list = bufferedReader.readLines()
        val stringBuilder = StringBuilder()
        for (s in list) {
            stringBuilder.append(s)
        }
        val listTopStoriesArts = gson.fromJson<TopStoriesArts>(stringBuilder.toString(), TopStoriesArts::class.java)
        println(listTopStoriesArts.toString())


    } catch (ee: Exception) {
        ee.printStackTrace()
    }
}