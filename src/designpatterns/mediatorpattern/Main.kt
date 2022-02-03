package designpatterns.mediatorpattern

fun main(args: Array<String>) {
   
    val atcMediator = ATCMediator()
    val sparrow101 = Flight(atcMediator)
    val mainRunway = Runway(atcMediator)
    atcMediator.registerFlight(sparrow101)
    atcMediator.registerRunway(mainRunway)
    sparrow101.getReady()
    mainRunway.land()
    sparrow101.land()
}
