package datastructure.homework5

class Toy {
    var name: String? = null
    var price: Double? = null

    constructor()
    constructor(name: String?, price: Double?) {
        this.name = name
        this.price = price
    }

    override fun toString(): String {
        return "Toy(name=$name, price=$price)"
    }

}