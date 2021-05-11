package datastructure.homework2

import java.util.*

class DoctorServiceImp : DoctorsAppointmentInterface {

    private val queue: Queue<Person> = LinkedList<Person>()
    var scanner = Scanner(System.`in`)

    override fun addNavbat() {
        println("∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞")
        println("Shifokor qabuliga hush kelibsiz iltimos navbatga yoziling...")
        println("∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞")
        println("Ismingizni kiriting:")
        val name = scanner.next()
        println("Familiyangizni kiriting:")
        val surname = scanner.next()
        println("Yoshingizni kiriting:")
        val age = scanner.nextInt()
        println("Kassalik haqida qisqa malumot:")
        scanner = Scanner(System.`in`)
        val description = scanner.nextLine()
        scanner = Scanner(System.`in`)
        val person = Person(name, surname, age, description)
        queue.add(person)
        println("Siz muvaffaqiyatli ro'yxatdan o'tdingiz.....")

    }

    override fun showFirstPerson() {
        println(queue.peek())
    }

    override fun removePerson() {
        println(queue.remove())
        for (person in queue) {
            println(queue.peek().kassalikHaqida)
        }
    }

    override fun isPeson() {
        var isHave = false
        println("Ismingizni kiriting:")
        val name = scanner.next()
        for (i in queue) {
            if (i.namePerson.contains(name)) {
                isHave = true
                break
            }
        }
        if (isHave) {
            println("Siz shifokor qabulidagi navbatda mavjudsiz")
        }
    }
}