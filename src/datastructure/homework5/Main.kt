package datastructure.homework5

import java.util.*

fun main(args: Array<String>) {
    val dequeToy: Deque<Toy> = ArrayDeque()
    val toy1 = Toy("Car", 3000.0)
    val toy2 = Toy("Qo'g'irchoq", 300.0)
    val toy3 = Toy("Pistolet", 12000.0)
    val toy4 = Toy("Ayiqcha", 4300.0)
    val toy5 = Toy("Yumshoq O'yinchoq", 12500.0)
    dequeToy.addFirst(toy1)
    dequeToy.addLast(toy2)
    dequeToy.addFirst(toy3)
    dequeToy.addFirst(toy4)
    dequeToy.addLast(toy5)
    println(dequeToy.first)
    println(dequeToy.last)
    println(dequeToy.offerFirst(toy2))
    println(dequeToy.peekFirst())
    println(dequeToy.peekLast())
    println(dequeToy.pollFirst())
    println(dequeToy.pollLast())
    println(dequeToy.pop())
    println(dequeToy.removeFirst())
    println(dequeToy.removeLast())
    println(dequeToy)

}