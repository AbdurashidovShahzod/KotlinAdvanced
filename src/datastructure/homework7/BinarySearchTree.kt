package datastructure.homework7


class BinarySearchTree {

    var root: BSTNode? = null

    fun insert(data: Int) {
        val node = BSTNode(data)
        if (root == null) {
            root = node
            return
        }

        var currentNode = root
        var parentNode: BSTNode? = null

        while (true) {
            parentNode = currentNode
            if (currentNode!!.data == data)
                throw IllegalArgumentException("Duplicates nodes note allowed in Binary Search Tree")

            if (currentNode.data > data) {
                currentNode = currentNode.left
                if (currentNode == null) {
                    parentNode!!.left = node
                    return
                }
            } else {
                currentNode = currentNode.rigth
                if (currentNode == null) {
                    parentNode!!.rigth = node
                    return
                }
            }
        }
    }

    fun countNodes(): Int {
        return countNodes(root)
    }

    private fun countNodes(node: BSTNode?): Int {
        if (node == null) {
            return 0
        } else {
            var count = 1
            count += countNodes(node.left)
            count += countNodes(node.rigth)
            return count
        }
    }

    fun searchNode(data: Int): Boolean {
        return if (empty()) empty() else searchNode(data, root)
    }

    private fun searchNode(data: Int, node: BSTNode?): Boolean {
        if (node != null) {
            if (node.data == data)
                return true
            else if (node.data > data)
                return searchNode(data, node.left)
            else if (node.data < data)
                return searchNode(data, node.rigth)
        }
        return false
    }

    fun delete(data: Int): Boolean {
        if (empty())
            throw NoSuchElementException("Tree is Empty")

        var currentNode = root
        var parentNode = root
        var isLeftChild = false

        while (currentNode!!.data != data) {
            parentNode = currentNode
            if (currentNode.data > data) {
                isLeftChild = true
                currentNode = currentNode.left
            } else if (currentNode.data < data) {
                isLeftChild = false
                currentNode = currentNode.rigth
            }
            if (currentNode == null)
                return false
        }

        // CASE 1: node with no child
        if (currentNode.left == null && currentNode.rigth == null) {
            if (currentNode === root)
                root = null
            if (isLeftChild)
                parentNode!!.left = null
            else
                parentNode!!.rigth = null
        } else if (currentNode.left != null && currentNode.rigth == null) {
            if (root === currentNode) {
                root = currentNode.left
            }
            if (isLeftChild)
                parentNode!!.left = currentNode.left
            else
                parentNode!!.rigth = currentNode.left
        } else if (currentNode.rigth != null && currentNode.left == null) {
            if (root === currentNode)
                root = currentNode.rigth
            if (isLeftChild)
                parentNode!!.left = currentNode.rigth
            else
                parentNode!!.rigth = currentNode.rigth
        } else if (currentNode.left != null && currentNode.rigth != null) {

            // Now we have to find minimum element in rigth sub tree
            // that is called successor
            val successor = getSuccessor(currentNode)
            if (currentNode === root)
                root = successor
            if (isLeftChild)
                parentNode!!.left = successor
            else
                parentNode!!.rigth = successor
            successor!!.left = currentNode.left
        }// CASE 3: node with two child
        // CASE 2: if node with only one child

        return true
    }

    private fun getSuccessor(deleteNode: BSTNode): BSTNode? {

        var successor: BSTNode? = null
        var parentSuccessor: BSTNode? = null
        var currentNode = deleteNode.left

        while (currentNode != null) {
            parentSuccessor = successor
            successor = currentNode
            currentNode = currentNode.left
        }

        if (successor !== deleteNode.rigth) {
            parentSuccessor!!.left = successor!!.left
            successor.rigth = deleteNode.rigth
        }

        return successor
    }

    fun nodeWithMinimumValue(): Int {
        return nodeWithMinimumValue(root!!)
    }

    private fun nodeWithMinimumValue(node: BSTNode): Int {
        return if (node.left != null) nodeWithMinimumValue(node.left!!) else node.data
    }

    fun nodewithMaximumValue(): Int {
        return nodewithMaximumValue(root!!)
    }

    private fun nodewithMaximumValue(node: BSTNode): Int {
        return if (node.rigth != null) nodewithMaximumValue(node.rigth!!) else node.data
    }

    fun parent(data: Int): Int {
        return parent(root, data)
    }

    private fun parent(node: BSTNode?, data: Int): Int {
        if (empty())
            throw IllegalArgumentException("Empty")
        if (root!!.data == data)
            throw IllegalArgumentException("No Parent node found")

        var parent: BSTNode? = null
        var current = node

        while (current!!.data != data) {
            parent = current
            if (current.data > data)
                current = current.left
            else
                current = current.rigth
            if (current == null)
                throw IllegalArgumentException("$data is not a node in tree")
        }
        return parent!!.data
    }

    fun sibling(data: Int): Int {
        return sibling(root, data)
    }

    private fun sibling(node: BSTNode?, data: Int): Int {
        if (empty())
            throw IllegalArgumentException("Empty")
        if (root!!.data == data)
            throw IllegalArgumentException("No Parent node found")

        var cureent = node
        var parent: BSTNode? = null
        var isLeft = false

        while (cureent!!.data != data) {
            parent = cureent
            if (cureent.data > data) {
                cureent = cureent.left
                isLeft = true
            } else {
                cureent = cureent.rigth
                isLeft = false
            }
            if (cureent == null)
                throw IllegalArgumentException("No Parent node found")
        }
        return if (isLeft) {
            if (parent!!.rigth != null) {
                parent.rigth!!.data
            } else
                throw IllegalArgumentException("No Sibling is there")
        } else {
            if (parent!!.left != null)
                parent.left!!.data
            else
                throw IllegalArgumentException("No Sibling is there")
        }
    }

    fun leafNodes() {
        if (empty())
            throw IllegalArgumentException("Empty")
        leafNode(root)
    }

    private fun leafNode(node: BSTNode?) {
        if (node == null)
            return
        if (node.rigth == null && node.left == null)
            print(node.data.toString() + " ")
        leafNode(node.left)
        leafNode(node.rigth)
    }

    fun level(data: Int): Int {
        if (empty())
            throw IllegalArgumentException("Empty")
        return level(root, data, 1)
    }

    private fun level(node: BSTNode?, data: Int, level: Int): Int {
        if (node == null)
            return 0
        if (node.data == data)
            return level
        var result = level(node.left, data, level + 1)
        if (result != 0)
            return result
        result = level(node.rigth, data, level + 1)
        return result
    }

    fun depth(): Int {
        return depth(root)
    }

    private fun depth(node: BSTNode?): Int {
        return if (node == null)
            0
        else
            1 + Math.max(depth(node.left), depth(node.rigth))
    }

    fun height(): Int {
        return height(root)
    }

    private fun height(node: BSTNode?): Int {
        return if (node == null)
            0
        else
            1 + Math.max(height(node.left), height(node.rigth))
    }

    fun leftView() {
        leftView(root)
    }

    private fun leftView(node: BSTNode?) {
        if (node == null)
            return
        val height = height(node)

        for (i in 1..height) {
            printLeftView(node, i)
        }
    }

    private fun printLeftView(node: BSTNode?, level: Int): Boolean {
        if (node == null)
            return false

        if (level == 1) {
            print(node.data.toString() + " ")
            return true
        } else {
            val left = printLeftView(node.left, level - 1)
            return if (left)
                true
            else
                printLeftView(node.rigth, level - 1)
        }
    }

    fun mirroeView() {
        val node = mirroeView(root)
        preorder(node)
        println()
        inorder(node)
        println()
        postorder(node)
        println()
    }

    private fun mirroeView(node: BSTNode?): BSTNode? {
        if (node == null || node.left == null && node.rigth == null)
            return node

        val temp = node.left
        node.left = node.rigth
        node.rigth = temp

        mirroeView(node.left)
        mirroeView(node.rigth)
        return node
    }

    fun preorder() {
        preorder(root)
    }

    private fun preorder(node: BSTNode?) {
        if (node != null) {
            print(node.data.toString() + " ")
            preorder(node.left)
            preorder(node.rigth)
        }
    }

    fun inorder() {
        inorder(root)
    }

    private fun inorder(node: BSTNode?) {
        if (node != null) {
            inorder(node.left)
            print(node.data.toString() + " ")
            inorder(node.rigth)
        }
    }

    fun postorder() {
        postorder(root)
    }

    private fun postorder(node: BSTNode?) {
        if (node != null) {
            postorder(node.left)
            postorder(node.rigth)
            print(node.data.toString() + " ")
        }
    }

    fun empty(): Boolean {
        return root == null
    }

}