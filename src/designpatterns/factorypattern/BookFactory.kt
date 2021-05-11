package designpatterns.factorypattern

class BookFactory {

    companion object {
        fun createBook(genre: Genre): Book = when (genre) {

            Genre.SCIENCE -> object : Book {
                private val title = "Theory of relativity"
                override fun getInfo() {
                    println(title)
                }

                override fun order() {
                    println("Order $title")
                }

                override fun rate() {
                    println("Rate for:$title")
                }
            }
            Genre.LITERATURE -> object : Book {

                private val title = "Theory of relativity"
                override fun getInfo() {
                    println(title)
                }

                override fun order() {
                    println("Order $title")
                }

                override fun rate() {
                    println("Rate for $title")
                }
            }
        }

    }


}