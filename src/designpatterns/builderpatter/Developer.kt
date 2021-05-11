package designpatterns.builderpatter

class Developer(val name: String, val surname: String, val age: Int, val specialization: String) {
    data class Builder(var name: String?=null, var surname: String?=null, var age: Int?=null, var specialization: String?=null) {
        fun name(name: String) = apply {
            this.name = name
        }

        fun surname(surname: String) = apply {
            this.surname = surname
        }

        fun age(age: Int) = apply {
            this.age = age
        }

        fun specialization(specialization: String) = apply {
            this.specialization = specialization
        }

        fun build() = Builder(name,surname,age,specialization)
    }

    override fun toString(): String {
        return "Developer(name='$name', surname='$surname', age=$age, specialization='$specialization')"
    }

}