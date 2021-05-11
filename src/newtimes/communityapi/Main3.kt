package newtimes.communityapi

import com.google.gson.Gson
import java.lang.StringBuilder
import java.net.HttpURLConnection
import java.net.URL

fun main(args: Array<String>) {
    val gson = Gson()
    try {
        val url = URL("https://api.nytimes.com/svc/mostpopular/v2/emailed/7.json?api-key=aq6QiZ5I0YURK1E3qI6iINjLG62As62Z")
        val httpURLConnection = url.openConnection() as HttpURLConnection
        httpURLConnection.connect()
        val inputStream = httpURLConnection.inputStream
        val bufferedReader = inputStream.bufferedReader()
        val list = bufferedReader.readLines()
        val stringBuilder = StringBuilder()
        for (s in list) {
            stringBuilder.append(s)
        }
        val listCommunity = gson.fromJson<Community3>(stringBuilder.toString(), Community3::class.java)
        println(listCommunity.toString())


    }catch (e:Exception){
        e.printStackTrace()
    }
}