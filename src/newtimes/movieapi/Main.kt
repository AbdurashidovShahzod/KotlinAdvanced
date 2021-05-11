package newtimes.movieapi

import com.google.gson.Gson
import java.lang.StringBuilder
import java.net.HttpURLConnection
import java.net.URL

fun main(args: Array<String>) {
    val gson = Gson()
    try {
        val url =
            URL("https://api.nytimes.com/svc/movies/v2/reviews/search.json?query=godfather&api-key=aq6QiZ5I0YURK1E3qI6iINjLG62As62Z")
        val httpURLConnection = url.openConnection() as HttpURLConnection
        httpURLConnection.connect()
        val inputStream = httpURLConnection.inputStream
        val bufferedReader = inputStream.bufferedReader()
        val list = bufferedReader.readLines()
        val stringBuilder = StringBuilder()
        for (s in list) {
            stringBuilder.append(s)
        }
        val listMovie = gson.fromJson<MovieApi>(stringBuilder.toString(), MovieApi::class.java)
        println(listMovie.toString())

    } catch (e: Exception) {
        e.printStackTrace()
    }
}