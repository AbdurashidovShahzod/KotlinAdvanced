package datetime.homework5

import java.time.LocalDateTime
import java.time.LocalTime
import java.util.*

class TvProgram {
    var name: String = ""
    var timeTv = LocalTime.of(22,30)

    constructor(name: String, timeTv: LocalTime?) {
        this.name = name
        this.timeTv = timeTv
    }

    override fun toString(): String {
        return "TvProgram(name='$name', timeTv=$timeTv)"
    }

}