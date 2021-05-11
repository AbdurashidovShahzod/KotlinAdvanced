package designpatterns.statepattern

import designpatterns.statepattern.AlerStatateContext
import designpatterns.statepattern.MobileOgohlantirishlar

class Sound : MobileOgohlantirishlar {
    override fun ogohlantirish(ctx: AlerStatateContext) {
        println("Ovoz bermoqda tut tut tut...")
    }
}