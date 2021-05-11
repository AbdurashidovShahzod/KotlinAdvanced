package internetconnection.homework1

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.StringBuilder
import java.net.HttpURLConnection
import java.net.URL

fun main(args: Array<String>) {

    val gson = Gson()
    val url = URL("http://cbu.uz/uzc/arkhiv-kursov-valyut/json/")
    var httpURLConnection = url.openConnection() as HttpURLConnection
    httpURLConnection.connect()
    println(httpURLConnection.responseCode)
    var inputStream = httpURLConnection.inputStream
    var bufferedReader = inputStream.bufferedReader()
    val list = bufferedReader.readLines()
    val stringBuilder = StringBuilder()
    for (s in list) {
        stringBuilder.append(s)
    }
    // println(stringBuilder.toString())
    val type = object : TypeToken<List<MoneyConverts>>() {}.type
    val listMoneyConverts = gson.fromJson<List<MoneyConverts>>(stringBuilder.toString(), type)

    for (listMoneyConvert in listMoneyConverts) {
        println(listMoneyConvert)
    }
    for (convert in listMoneyConverts) {
        println("1$ USD  - ${convert.Rate} ${convert.CcyNm_EN},${convert.CcyNm_RU},${convert.CcyNm_UZ},${convert.CcyNm_UZC}")
    }


}