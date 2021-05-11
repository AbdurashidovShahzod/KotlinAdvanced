package datastructure.homework1

import java.util.*

fun main(args: Array<String>) {

    val groupQueue: Queue<Group> = LinkedList<Group>()
    val student1 = Student("Shahzod", "Abdurashidov", 21)
    val student2 = Student("Shoxrux", "Togev", 21)
    val student3 = Student("Aziza", "Mukhtorova", 21)
    val group1 = Group(student1, "Telecom", "413-18")
    val group2 = Group(student2, "KIF", "213-18")
    val group3 = Group(student3, "KIF", "213-18")
    groupQueue.add(group1)
    groupQueue.add(group2)
    groupQueue.add(group3)
    val iterator = groupQueue.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }
    println(groupQueue.remove().student)
    println(groupQueue.poll())
    println(groupQueue.offer(group2))
    println(groupQueue.peek())
    println(groupQueue.element())
    println(println(groupQueue.parallelStream()))
    for (group in groupQueue) {
        println(group)
    }


}