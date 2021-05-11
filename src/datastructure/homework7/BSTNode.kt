package datastructure.homework7


class BSTNode {

    var left: BSTNode? = null
    var rigth: BSTNode? = null
    var data = 0

    constructor() : super() {}

    constructor(data: Int) {
        this.left = null
        this.rigth = null
        this.data = data
    }

    override fun toString(): String {
        return "BSTNode [left=$left, rigth=$rigth, data=$data]"
    }

}
