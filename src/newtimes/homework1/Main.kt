package newtimes.homework1

import com.google.gson.Gson
import java.lang.StringBuilder
import java.net.HttpURLConnection
import java.net.URL

fun main(args: Array<String>) {

    val gson = Gson()
    val url =
        URL("https://api.nytimes.com/svc/search/v2/articlesearch.json?q=election&api-key=aq6QiZ5I0YURK1E3qI6iINjLG62As62Z")
    val httpURLConnection = url.openConnection() as HttpURLConnection
    httpURLConnection.connect()
    val inputStream = httpURLConnection.inputStream
    val bufferedReader = inputStream.bufferedReader()
    val list = bufferedReader.readLines()
    val stringBuilder = StringBuilder()
    for (s in list) {
        stringBuilder.append(s)
    }
    //val type = object : TypeToken<List<ArticleSearch>>() {}.type

    val fromJson = gson.fromJson<ArticleSearch>(stringBuilder.toString(), ArticleSearch::class.java)
    println(fromJson.toString())


}