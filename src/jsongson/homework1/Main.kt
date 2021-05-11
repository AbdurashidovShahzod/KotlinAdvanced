package jsongson.homework1

import com.google.gson.Gson

fun main(args: Array<String>) {

    val gson = Gson()
    val json1 = """
        {
        "id":1,
       "name":"Leanne Graham",
       "username":"Bret",
       "email":"Sincere@april.biz",
       "phone":"12057412875-32",
       "website":"hildegard.org"

       }
    """.trimIndent()

    val json2 = """
       {
  "street": "Kulas Light",
  "suite": "Apt.556",
  "city": "Gwenborough",
  "zipcode": "925434-34"
    }
    """.trimIndent()

    val json3 = """
        {
        "lat":"-23875",
        "lng":"139846"
        }
    """.trimIndent()

    val json4 = """
        {
        "name":"Yagswer",
        "catchPhrase":"Multilaread",
        "bs":"harness"
        }
    """.trimIndent()

    val fromJson1 = gson.fromJson(json1, Developer::class.java)
    val fromJson2 = gson.fromJson<Address>(json2, Address::class.java)
    val fromJson3 = gson.fromJson<Geo>(json3, Geo::class.java)
    val fromJson4 = gson.fromJson<Company>(json4, Company::class.java)
    println("{id:${fromJson1.id},name:${fromJson1.name},username:${fromJson1.username},email:${fromJson1.email},phone:${fromJson1.phone},website:${fromJson1.website}}")
    println("{street:${fromJson2.street},suite:${fromJson2.suite},city:${fromJson2.city},zipcode:${fromJson2.zipcode}}")
    println("{lat:${fromJson3.lat},lng:${fromJson3.lng}}")
    println("{name:${fromJson4.name},catchPhrase:${fromJson4.catchPhrase},bs:${fromJson4.bs}}")
}