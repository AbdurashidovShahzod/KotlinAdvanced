package jsongson.registration

import com.google.gson.Gson
import java.util.*


class ContactServiceImp : ContactService {
    var scanner = Scanner(System.`in`)
    val service = Service()
    private val gson = Gson()

    override fun addContact() {
        val listContactNumbers = arrayListOf<String>()
        println("Contact name:")
        val contactName = scanner.next()
        println("Contact count:")
        val count = scanner.nextInt()

        for (i in 0 until count) {
            println("${i + 1} - contact numbers:")
            val contactNumber = scanner.next()
            listContactNumbers.add(contactNumber)
        }
        val contact = Contact(contactName, listContactNumbers)
        val contactList = service.getContactList()
        contactList.add(contact)
        val jsonContactString = gson.toJson(contactList)
        service.writeText(jsonContactString)
        println("Successfully added... ")
    }

    override fun listContacts() {
        val contactList = service.getContactList()
        for (contact in contactList) {
            println(contact)
        }
    }

    override fun updateContact() {
        var i = -1
        println("Contact name:")
        val contactNameOld = scanner.next()
        val contactList = service.getContactList()
        contactList.forEachIndexed { index, contact ->
            if (contact.contactName == contactNameOld) {
                i = index
            }
        }
        if (i == -1) {
            System.err.println("Contact not found!!!")
        } else {
            println("New contact name:")
            var newContactName = scanner.next()
            contactList[i].contactName = newContactName
            var toJson = gson.toJson(contactList)
            service.writeText(toJson)
            println("Contact successfully updated...")
        }
    }

    override fun removeContact() {
        var i = -1
        println("Contact name:")
        val contactNameOld = scanner.next()
        val contactList = service.getContactList()
        contactList.forEachIndexed { index, contact ->
            if (contact.contactName == contactNameOld) {
                i = index
            }
        }
        if (i == -1) {
            System.err.println("Contact not found!!!")
        } else {
            contactList.removeAt(i)
            service.writeText(gson.toJson(contactList))
            println("Contact successfully removed...")
        }
    }

    override fun searchContact() {

        println("Search contact name:")
        var searchContactName = scanner.next()
        var contactList = service.getContactList()
        for (contact in contactList) {
            if (contact.contactName!!.contains(searchContactName)) {
                println(contact)
            }
        }
    }
}