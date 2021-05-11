package jsongson.homework5

import com.google.gson.Gson

fun main(args: Array<String>) {
    val jsonStudent = """
        {
        "id":1,
        "email":"georg.bluth@reqres.in",
        "first_name":"George",
        "last_name":"Bluth",
        "avatar":"https://s3.amazonaws.com/uifaces/faces/twitter/calebogden/128.jpg"
        }
    """.trimIndent()
    val gson = Gson()
    val fromJson = gson.fromJson<Student>(jsonStudent, Student::class.java)
    println(fromJson.toString())


}