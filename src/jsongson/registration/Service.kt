package jsongson.registration

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.File

class Service {
    var file = File("contact.txt")
    var gson = Gson()

    fun getContactList(): ArrayList<Contact> {
        val jsonString = file.readText()
        val list: ArrayList<Contact>
        list = if (jsonString.isEmpty()) {
            ArrayList()
        } else {
            val type = object : TypeToken<List<Contact>>() {}.type
            gson.fromJson(jsonString, type)
        }
        return list
    }

    fun writeText(jsonString: String) {
        file.writeBytes(jsonString.toByteArray())
    }
}