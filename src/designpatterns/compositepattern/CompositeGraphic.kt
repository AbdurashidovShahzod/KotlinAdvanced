package designpatterns.compositepattern

class CompositeGraphic(val graphics: ArrayList<Graphic> = ArrayList()) : Graphic {
    override fun print() = graphics.forEach(Graphic::print)
    fun add(graphic: Graphic) {
        graphics.add(graphic)
    }

    fun remove(graphic: Graphic) {
        graphics.remove(graphic)
    }
}

class Ellipse : Graphic {
    override fun print() = println("Ellipse")
}

class Square : Graphic {
    override fun print() = println("Square")
}