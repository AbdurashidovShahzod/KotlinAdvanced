package designpatterns.protectionproxy

interface IShipment {
    fun dispatchParcel(parcel: Pair<String, String>)
}


class SortingFacility(val location: String, var isWarehouseFull: Boolean) : IShipment {


    override fun dispatchParcel(parcel: Pair<String, String>) {
        println("${location} facility doing dispatching business...")
    }
}

class ParcelDispatcher : IShipment {

    private var facility = listOf<SortingFacility>(
        SortingFacility("North", true),
        SortingFacility("North West", false),
        SortingFacility("South", false),
        SortingFacility("West", true),
        SortingFacility("East", false)
    )

    override fun dispatchParcel(parcel: Pair<String, String>) {
        val facilityNearTpParcelLocation =
            facility.filter { it.location.contains(parcel.second, true) && !it.isWarehouseFull }.first()
        facilityNearTpParcelLocation.dispatchParcel(parcel)
    }

}
