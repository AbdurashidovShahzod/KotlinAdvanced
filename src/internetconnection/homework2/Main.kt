package internetconnection.homework2

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.StringBuilder
import java.net.HttpURLConnection
import java.net.URL

fun main(args: Array<String>) {

    try {
        val gson = Gson()
        val url = URL("https://api.github.com/users")
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

        val type = object : TypeToken<List<UsersGitHub>>() {}.type
        val listGitHubUsersGitHub = gson.fromJson<List<UsersGitHub>>(stringBuilder.toString(), type)
        for (usersGitHub in listGitHubUsersGitHub) {
            println(usersGitHub)
        }

    } catch (e: Exception) {
        e.printStackTrace()
        println(e.message)
    }
}