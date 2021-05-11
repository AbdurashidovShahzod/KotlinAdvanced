package datastructure.homework6

class ShelfBook {
    var nameBook: String? = null
    var section: String? = null
    var sizeBook: Int? = null

    constructor(nameBook: String?, section: String?, sizeBook: Int?) {
        this.nameBook = nameBook
        this.section = section
        this.sizeBook = sizeBook

    }

    override fun toString(): String {
        return "ShelfBook(nameBook=$nameBook, section=$section, sizeBook=$sizeBook)"
    }

}