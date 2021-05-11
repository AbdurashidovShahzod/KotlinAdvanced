package jsongson.homework1

class Address {
    var street: String? = null
    var suite: String? = null
    var city: String? = null
    var zipcode: String? = null

    constructor()
    constructor(street: String?, suite: String?, city: String?, zipcode: String?) {
        this.street = street
        this.suite = suite
        this.city = city
        this.zipcode = zipcode
    }

    override fun toString(): String {
        return "Address(street=$street, suite=$suite, city=$city, zipcode=$zipcode)"
    }

}