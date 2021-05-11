package thread.main1

import com.google.gson.Gson
import java.lang.Exception
import java.lang.StringBuilder
import java.net.HttpURLConnection
import java.net.URL

class MostThread2 : Runnable {
    private val gson = Gson()
    val thread = Thread(this)
    override fun run() {
        println("Running....")
        try {
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
            val list2 = gson.fromJson<MostPopular2>(stringBuilder.toString(), MostPopular2::class.java)
            println(list2.toString())
            httpURLConnection.disconnect()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    init {
        thread.start()
    }

}