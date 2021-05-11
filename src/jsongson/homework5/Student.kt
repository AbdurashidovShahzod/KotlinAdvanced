package jsongson.homework5

class Student {
    var id: Int? = null
    var email: String? = null
    var first_name: String? = null
    var last_name: String? = null
    var avatar:String?=null


    override fun toString(): String {
        return "Student(id=$id, email=$email, first_name=$first_name, last_name=$last_name, avatar=$avatar)"
    }


}