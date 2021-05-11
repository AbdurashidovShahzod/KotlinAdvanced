package thread.main2

import com.google.gson.Gson
import java.io.File
import java.io.OutputStream
import java.lang.Exception
import java.lang.StringBuilder
import java.net.HttpURLConnection
import java.net.URL

class MovieThread : Runnable {
    val gson = Gson()
    val thread = Thread(this)
    var file = File("api.txt")


    private fun writeText(jsonString: String) {
        file.writeBytes(jsonString.toByteArray())
    }

    override fun run() {
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
            val listJson = gson.fromJson<MovieApi>(stringBuilder.toString(), MovieApi::class.java)
            writeText(listJson.toString())

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    init {
        thread.start()
    }
}