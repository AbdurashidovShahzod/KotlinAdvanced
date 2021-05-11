package datastructure.homework3

import datastructure.homework1.Group
import datastructure.homework1.Student
import java.util.*

fun main(args: Array<String>) {
    val groupStack: Stack<Group> = Stack()
    val student1 = Student("Shahzod", "Abdurashidov", 21)
    val student2 = Student("Shoxrux", "Togev", 21)
    val student3 = Student("Aziza", "Mukhtorova", 21)
    val group1 = Group(student1, "Telecom", "413-18")
    val group2 = Group(student2, "KIF", "213-18")
    val group3 = Group(student3, "KIF", "213-18")
    groupStack.add(group1)
    groupStack.add(group2)
    groupStack.add(group3)
    val iterator = groupStack.iterator()
    iterator.forEachRemaining { group: Group? ->
        println(group)
    }
    println(groupStack.empty())
    println(groupStack.peek())
    println(groupStack.pop())
    println(groupStack.push(group2))
    println(groupStack.search(group1))
    println(groupStack.first())
}