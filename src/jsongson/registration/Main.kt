package jsongson.registration

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val contactService = ContactServiceImp()
    var isStart = true
    while (isStart) {
        println("1-> Add contact")
        println("2-> Show contacts")
        println("3-> Contact update")
        println("4-> Contact remove")
        println("5-> Search contact")
        println("6-> Sign out")

        when (scanner.nextInt()) {
            1 -> contactService.addContact()
            2 -> contactService.listContacts()
            3 -> contactService.updateContact()
            4 -> contactService.removeContact()
            5 -> contactService.searchContact()
            6 -> isStart = false
        }

    }
}