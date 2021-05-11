package designpatterns.statepattern

import designpatterns.statepattern.AlerStatateContext
import designpatterns.statepattern.MobileOgohlantirishlar

class VibratsiyaJarayoni : MobileOgohlantirishlar {
    override fun ogohlantirish(ctx: AlerStatateContext) {
        println("Vibratsiya bermoqda....")
    }

}