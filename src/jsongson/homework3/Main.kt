package jsongson.homework3

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import jsongson.homework2.MoneyConvert
import java.io.File

fun main(args: Array<String>) {

    val gson = Gson()
    val listMoney = arrayListOf<MoneyConvert>()

    val moneyConvert = MoneyConvert(
        68,
        "840",
        "USD",
        "Доллар США",
        "AQSH dollari",
        "АҚШ доллари",
        "US Dollar",
        "1",
        "10270.08",
        "7.21"
    )
    val moneyConvert2 = MoneyConvert(
        21,
        "345",
        "USD",
        "Доллар США",
        "AQSH dollari",
        "АҚШ доллари",
        "US Dollar",
        "1",
        "23444.08",
        "17.3"
    )

    listMoney.add(moneyConvert)
    listMoney.add(moneyConvert2)

    val type = object : TypeToken<List<MoneyConvert>>() {}.type
    val toJson = gson.toJson(listMoney)
    val fromJson = gson.fromJson<List<MoneyConvert>>(toJson, type)
    println(fromJson.toString())

}
