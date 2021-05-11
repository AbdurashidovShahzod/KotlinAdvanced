package designpatterns.statepattern

class AlerStatateContext {
    private var currentState: MobileOgohlantirishlar? = null

    init {
        currentState = VibratsiyaJarayoni()
    }

    fun setState(state: MobileOgohlantirishlar) {
        currentState = state
    }

    fun alert() {
        currentState!!.ogohlantirish(this)
    }

}