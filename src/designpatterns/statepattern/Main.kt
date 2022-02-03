package designpatterns.statepattern

fun main(args: Array<String>) {

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
