package thread.main1

import com.google.gson.Gson
import newtimes.mostpopularapi.MostPopularApi1
import java.lang.Exception
import java.lang.StringBuilder
import java.net.HttpURLConnection
import java.net.URL

class MostThread1 : Runnable {
    private val gson = Gson()
    val thread = Thread(this)

    override fun run() {
        println("Running....")
        try {
            Thread.sleep(1000)
            val url =
                URL("https://api.nytimes.com/svc/mostpopular/v2/emailed/7.json?api-key=aq6QiZ5I0YURK1E3qI6iINjLG62As62Z")
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


            val listMostPopular = gson.fromJson<MostPopularApi1>(stringBuilder.toString(), MostPopularApi1::class.java)
            println(listMostPopular.toString())


        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    init {
        thread.start()
    }


}