package jsongson.registration

class Contact {

    var contactName: String? = null
    var contactNumber: List<String>? = null

    constructor()
    constructor(contactName: String?, contactNumber: List<String>?) {
        this.contactName = contactName
        this.contactNumber = contactNumber
    }


    override fun toString(): String {
        return "Contact(contactName=$contactName, contactNumber=$contactNumber)"
    }


}