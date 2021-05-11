package jsongson.homework1

class Developer {
    var id: Int? = null
    var name: String? = null
    var username: String? = null
    var email: String? = null
    var phone: String? = null
    var website: String? = null
    var listAddress: ArrayList<Address>? = null
    var listGeo: ArrayList<Geo>? = null
    var listCompany: ArrayList<Company>? = null

    constructor(
        id: Int?,
        name: String?,
        username: String?,
        email: String?,
        phone: String?,
        website: String?,
        listAddress: ArrayList<Address>?,
        listGeo: ArrayList<Geo>?,
        listCompany: ArrayList<Company>?
    ) {
        this.id = id
        this.name = name
        this.username = username
        this.email = email
        this.phone = phone
        this.website = website
        this.listAddress = listAddress
        this.listGeo = listGeo
        this.listCompany = listCompany
    }

    override fun toString(): String {
        return "Developer(id=$id, name=$name, username=$username, email=$email, phone=$phone, website=$website, listAddress=$listAddress, listGeo=$listGeo, listCompany=$listCompany)"
    }

}