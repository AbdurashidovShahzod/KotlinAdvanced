package jsongson.homework1

class Geo {
    var lat: String? = null
    var lng: String? = null

    constructor()
    constructor(lat: String?, lng: String?) {
        this.lat = lat
        this.lng = lng
    }

    override fun toString(): String {
        return "Geo(lat=$lat, lng=$lng)"
    }

}