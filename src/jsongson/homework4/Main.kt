package jsongson.homework4

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import jsongson.homework1.Address
import jsongson.homework1.Company
import jsongson.homework1.Developer
import jsongson.homework1.Geo

fun main(args: Array<String>) {

    val gson = Gson()
    val listDeveloper = arrayListOf<Developer>()
    val listCompany = arrayListOf<Company>()
    val listGeo = arrayListOf<Geo>()
    val listAddress = arrayListOf<Address>()
    listCompany.add(Company("Google", "213-12", "1452-245"))
    listGeo.add(Geo("-1725-42", "31134432"))
    listAddress.add(Address("America", "267.32", "USA", "24552-64"))
    listDeveloper.add(
        Developer(
            1,
            "Shahzod",
            "Sheykhzad",
            "shahzod9933@gmail.com",
            "998935336778",
            "t.me/studentTUIT",
            listAddress,
            listGeo,
            listCompany
        )
    )
    val toJson = gson.toJson(listDeveloper)
    val typeJson = object : TypeToken<List<Developer>>() {}.type
    val fromJson = gson.fromJson<List<Developer>>(toJson, typeJson)
    for (developer in fromJson) {
        println(developer)
    }

}