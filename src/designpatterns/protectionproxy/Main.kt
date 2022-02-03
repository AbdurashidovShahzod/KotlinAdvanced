package designpatterns.protectionproxy

fun main(args: Array<String>) {
   
    var parcel = "SmartPhone" to "North"
    var parcelDispatcher = ParcelDispatcher()

    parcelDispatcher.dispatchParcel(parcel)
}
