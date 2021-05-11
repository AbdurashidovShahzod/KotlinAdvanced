package jsongson.homework2

import com.google.gson.Gson

fun main(args: Array<String>) {

    val gson = Gson()
    var json = """
    {
    id: 68,
    code: "840",
    ccy: "USD",
    ccyNm_RU: "Доллар США",
    ccyNm_UZ: "AQSH dollari",
    ccyNm_UZC: "АҚШ доллари",
    ccyNm_EN: "US Dollar",
    nominal: "1",
    rate: "10270.08",
    diff: "7.21",
    date: "03.09.2020"
    }
    """.trimIndent()
    val fromJson = gson.fromJson<MoneyConvert>(json, MoneyConvert::class.java)
    println(fromJson.toString())
}