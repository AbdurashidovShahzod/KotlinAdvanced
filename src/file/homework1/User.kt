package file.homework1

class User {
    var login: String = ""
    var password: String = ""
    var name: String = ""
    var surname: String = ""
    var age: Int = 0
    var address: String = ""
    var email: String = ""
    var phoneNumber: String = ""

    constructor(
        login: String,
        password: String,
        name: String,
        surname: String,
        age: Int,
        address: String,
        email: String,
        phoneNumber: String
    ) {
        this.login = login
        this.password = password
        this.name = name
        this.surname = surname
        this.age = age
        this.address = address
        this.email = email
        this.phoneNumber = phoneNumber
    }

    override fun toString(): String {
        return "User(login='$login', password='$password', name='$name', surname='$surname', age=$age, address='$address', email='$email', phoneNumber='$phoneNumber')"
    }

}