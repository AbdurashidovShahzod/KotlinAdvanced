package designpatterns.mediatorpattern

class Flight(private val atcMediator: IATCMediator) : Command {

        override fun land() {
            if (atcMediator.isLandingOk) {
                println("Landing done....")
                atcMediator.setLandingStatus(true)
            } else
                println("Will wait to land....")
        }

        fun getReady() {
            println("Getting ready...")
        }
    }



interface IATCMediator {

    val isLandingOk: Boolean
    fun registerRunway(runway: Runway)
    fun registerFlight(flight: Flight)
    fun setLandingStatus(status: Boolean)
}
class Runway(private val atcMediator: IATCMediator) : Command {

    init {
        atcMediator.setLandingStatus(true)
    }

    override fun land() {
        println("Landing permission granted...")
        atcMediator.setLandingStatus(true)
    }

}
class ATCMediator : IATCMediator {
    private var flight: Flight? = null
    private var runway: Runway? = null

    override var isLandingOk: Boolean = false

    override fun registerRunway(runway: Runway) {
        this.runway = runway
    }

    override fun registerFlight(flight: Flight) {
        this.flight = flight
    }

    override fun setLandingStatus(status: Boolean) {
        isLandingOk = status

    }
}