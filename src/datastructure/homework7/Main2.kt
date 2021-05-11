package datastructure.homework7

import java.util.*

fun main(args: Array<String>) {

    /***
     * Daraxt mavzusiga qiziqganim bois qo'shimcha
     * ravishda xar xil manbalardan malumot olib
     * o'rganib chiqdim
     */
    println("Welcome to Binary Search Tree")
    val scanner = Scanner(System.`in`)
    val yes = true
    val tree = BinarySearchTree()
    do {
        println("\n1. Insert")
        println("2. Search Node")
        println("3. Count Node")
        println("4. Empty Status")
        println("5. Delete Node")
        println("6. Node with Minimum Value")
        println("7. Node with Maximum Value")
        println("8. Find Parent node")
        println("9. Count no of links")
        println("10. Get the sibling of any node")
        println("11. Print all the leaf node")
        println("12. Get the level of node")
        println("13. Depth of the tree")
        println("14. Height of Binary Tree")
        println("15. Left View")
        println("16. Mirror Image of Binary Tree")
        println("Enter Your Choice :: ")
        when (scanner.nextInt()) {
            1 -> try {
                println("Enter Value")
                tree.insert(scanner.nextInt())
            } catch (e: Exception) {
                println(e.message)
            }

            2 -> {
                println("Enter the node")
                println(tree.searchNode(scanner.nextInt()))
            }

            3 -> println(tree.countNodes())

            4 -> println(tree.empty())

            5 -> {
                try {
                    println("Enter the node")
                    println(tree.delete(scanner.nextInt()))
                } catch (e: Exception) {
                    println(e.message)
                }

                try {
                    println(tree.nodeWithMinimumValue())
                } catch (e: Exception) {
                    println(e.message)
                }

            }

            6 -> try {
                println(tree.nodeWithMinimumValue())
            } catch (e: Exception) {
                println(e.message)
            }

            7 -> try {
                println(tree.nodewithMaximumValue())
            } catch (e: Exception) {
                println(e.message)
            }

            8 -> try {
                println("Enter the node")
                println(tree.parent(scanner.nextInt()))
            } catch (e: Exception) {
                println(e.message)
            }

            9 -> try {
                println(tree.countNodes() - 1)
            } catch (e: Exception) {
                println(e.message)
            }

            10 -> try {
                println("Enter the node")
                println(tree.sibling(scanner.nextInt()))
            } catch (e: Exception) {
                println(e.message)
            }

            11 -> {
                try {
                    tree.leafNodes()
                } catch (e: Exception) {
                    println(e.message)
                }

                try {
                    println("Enter the node")
                    println("Level is : " + tree.level(scanner.nextInt()))
                } catch (e: Exception) {
                    println(e.message)
                }

            }

            12 -> try {
                println("Enter the node")
                println("Level is : " + tree.level(scanner.nextInt()))
            } catch (e: Exception) {
                println(e.message)
            }

            13 -> try {
                println(tree.depth())
            } catch (e: Exception) {
                println(e.message)
            }

            14 -> try {
                println(tree.height())
            } catch (e: Exception) {
                println(e.message)
            }

            15 -> try {
                tree.leftView()
                println()
            } catch (e: Exception) {
                println(e.message)
            }

            16 -> try {
                tree.mirroeView()
            } catch (e: Exception) {
                println(e.message)
            }

            else -> {
            }
        }
        tree.preorder()
        println()
        tree.inorder()
        println()
        tree.postorder()
    } while (yes)
    scanner.close()
}
