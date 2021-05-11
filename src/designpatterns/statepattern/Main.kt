package designpatterns.statepattern

fun main(args: Array<String>) {

    /**
     * Albatta design patternlarni o'rganish ancha qiyin bo'layabdi
     * shuning uchun ham internet orqali har xil manbalardan foydalangan
     * holda code larni qayta qayta yozib har bitta jarayoni nima bo'layotganini
     * tushunishga harakat qildim va bunga oz bo'lsada natijaga erishdim deb o'ylayman...
     */
    val statateContext = AlerStatateContext()
    statateContext.setState(VibratsiyaJarayoni())
    statateContext.alert()
    statateContext.alert()
    statateContext.setState(Silent())
    statateContext.alert()
    statateContext.alert()
    statateContext.setState(Sound())
    statateContext.alert()
    statateContext.alert()

}
