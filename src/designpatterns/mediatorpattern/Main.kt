package designpatterns.mediatorpattern

fun main(args: Array<String>) {
    /**
     * Albatta design patternlarni o'rganish ancha qiyin bo'layabdi
     * shuning uchun ham internet orqali har xil manbalardan foydalangan
     * holda code larni qayta qayta yozib har bitta jarayoni nima bo'layotganini
     * tushunishga harakat qildim va bunga oz bo'lsada natijaga erishdim deb o'ylayman...
     */
    val atcMediator = ATCMediator()
    val sparrow101 = Flight(atcMediator)
    val mainRunway = Runway(atcMediator)
    atcMediator.registerFlight(sparrow101)
    atcMediator.registerRunway(mainRunway)
    sparrow101.getReady()
    mainRunway.land()
    sparrow101.land()
}