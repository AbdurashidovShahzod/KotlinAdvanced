package internetconnection.homework3

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.File
import java.lang.StringBuilder
import java.net.HttpURLConnection
import java.net.URL

fun main(args: Array<String>) {
    try {
        val gson = Gson()
        val url = URL("https://reqres.in/api/users?page=1")
        val httpURLConnection = url.openConnection() as HttpURLConnection
        httpURLConnection.connect()
        println(httpURLConnection.responseCode)
        val inputStream = httpURLConnection.inputStream
        val bufferedReader = inputStream.bufferedReader()
        val list = bufferedReader.readLines()
        val stringBuilder = StringBuilder()
        for (s in list) {
            stringBuilder.append(s)
        }
        //val type = object : TypeToken<List<ReqresUsers>>() {}.type
        val listReqresUsers = gson.fromJson<ReqresUsers>(stringBuilder.toString(), ReqresUsers::class.java)
        println(listReqresUsers.toString())
        httpURLConnection.disconnect()


    } catch (e: Exception) {
        e.printStackTrace()
        println(e.message)
    }
}