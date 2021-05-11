package designpatterns.protectionproxy

fun main(args: Array<String>) {
    /**
     * Albatta design patternlarni o'rganish ancha qiyin bo'layabdi
     * shuning uchun ham internet orqali har xil manbalardan foydalangan
     * holda code larni qayta qayta yozib har bitta jarayoni nima bo'layotganini
     * tushunishga harakat qildim va bunga oz bo'lsada natijaga erishdim deb o'ylayman...
     */
    var parcel = "SmartPhone" to "North"
    var parcelDispatcher = ParcelDispatcher()

    parcelDispatcher.dispatchParcel(parcel)
}