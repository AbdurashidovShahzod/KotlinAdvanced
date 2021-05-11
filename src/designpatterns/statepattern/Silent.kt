package designpatterns.statepattern

import designpatterns.statepattern.AlerStatateContext
import designpatterns.statepattern.MobileOgohlantirishlar

class Silent: MobileOgohlantirishlar {
    override fun ogohlantirish(ctx: AlerStatateContext) {
        println("Tovushsiz holati yoqilgan....")
    }
}