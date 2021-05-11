package newtimes.communityapi

import com.google.gson.Gson
import java.lang.Exception
import java.lang.StringBuilder
import java.net.HttpURLConnection
import java.net.URL

fun main(args: Array<String>) {
    try {

        val gson = Gson()
        val url =
            URL("https://api.nytimes.com/svc/mostpopular/v2/shared/1/facebook.json?api-key=aq6QiZ5I0YURK1E3qI6iINjLG62As62Z")
        val httpURLConnection = url.openConnection() as HttpURLConnection
        httpURLConnection.connect()
        val inputStream = httpURLConnection.inputStream
        val bufferedReader = inputStream.bufferedReader()
        val list = bufferedReader.readLines()
        val stringBuilder = StringBuilder()
        for (s in list) {
            stringBuilder.append(s)
        }
        val listCommunity2 = gson.fromJson<Community2>(stringBuilder.toString(), Community2::class.java)
        println(listCommunity2.toString())


    } catch (e: Exception) {
        e.printStackTrace()
    }

}