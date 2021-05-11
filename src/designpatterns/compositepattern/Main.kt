package designpatterns.compositepattern

fun main(args: Array<String>) {
    /**
     * Albatta design patternlarni o'rganish ancha qiyin bo'layabdi
     * shuning uchun ham internet orqali har xil manbalardan foydalangan
     * holda code larni qayta qayta yozib har bitta jarayoni nima bo'layotganini
     * tushunishga harakat qildim va bunga oz bo'lsada natijaga erishdim deb o'ylayman...
     */
    val ellipse1 = Ellipse()
    val ellipse2 = Ellipse()
    val ellipse3 = Ellipse()
    val ellipse4 = Ellipse()
    val square1 = Square()
    val square2 = Square()
    val square3 = Square()
    val square4 = Square()
    val graphic = CompositeGraphic()
    val graphic1 = CompositeGraphic()
    val graphic2 = CompositeGraphic()
    graphic1.add(ellipse1)
    graphic1.add(ellipse2)
    graphic1.add(square1)
    graphic1.add(ellipse3)
    graphic2.add(ellipse4)
    graphic2.add(square2)
    graphic2.add(square3)
    graphic2.add(square4)
    graphic.add(graphic1)
    graphic.add(graphic2)
    graphic.print()
}