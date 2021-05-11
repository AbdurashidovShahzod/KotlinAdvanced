package jsongson.homework1

class Company {
    var name: String? = null
    var catchPhrase: String? = null
    var bs: String? = null

    constructor()
    constructor(name: String?, catchPhrase: String?, bs: String?) {
        this.name = name
        this.catchPhrase = catchPhrase
        this.bs = bs
    }

    override fun toString(): String {
        return "Company(name=$name, catchPhrase=$catchPhrase, bs=$bs)"
    }

}
