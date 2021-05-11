package datetime.homework4

import java.text.SimpleDateFormat
import java.util.*

class TeamFootball {
    var name: String? = null
    var random = Random()
    var simpleDateFormat = SimpleDateFormat("dd.MM.yyyy")
    var date1 = simpleDateFormat.parse(
        "${random.nextInt(31)}.${random.nextInt(12)}.2020"
    )

    constructor(name: String?) {
        this.name = name
    }


    override fun toString(): String {
        return "TeamFootball(name=$name, simpleDateFormat=$date1)"
    }

}