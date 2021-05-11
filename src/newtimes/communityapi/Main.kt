package newtimes.communityapi

import com.google.gson.Gson
import java.lang.StringBuilder
import java.net.HttpURLConnection
import java.net.URL

fun main(args: Array<String>) {
    val gson = Gson()
    try {
        val url =
            URL("https://api.nytimes.com/svc/mostpopular/v2/viewed/1.json?api-key=aq6QiZ5I0YURK1E3qI6iINjLG62As62Z")
        val httpURLConnection = url.openConnection() as HttpURLConnection
        httpURLConnection.connect()
        val inputStream = httpURLConnection.inputStream
        val bufferedReader = inputStream.bufferedReader()
        val list = bufferedReader.readLines()
        val stringBuilder = StringBuilder()
        for (s in list) {
            stringBuilder.append(s)
        }
        println(stringBuilder)
        val listCommunity = gson.fromJson<Community>(stringBuilder.toString(), Community::class.java)
        println(listCommunity.toString())


    } catch (e: Exception) {
        e.printStackTrace()
        System.err.println(e.message)
    }


}