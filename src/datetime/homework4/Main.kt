package datetime.homework4

fun main(args: Array<String>) {

    val listSpain = arrayListOf<TeamFootball>()
    val teamFootball = TeamFootball("Barcelona")
    val teamFootbal2 = TeamFootball("Real Madrid")

    listSpain.add(teamFootball)
    listSpain.add(teamFootbal2)

    val listEngland = arrayListOf<TeamFootball>()
    val football = TeamFootball("Manchester city")
    val football2 = TeamFootball("Chelsea")

    listEngland.add(football)
    listEngland.add(football2)

    for (i in listEngland.indices) {
        if (listEngland[i].simpleDateFormat == listSpain[i].simpleDateFormat) {
            println("${listEngland[i].name} va ${listSpain[i].name} o'yinlari bir vaqtda to'qnash kelib qoldi!!!")
        } else {
            println("Hech qaysi jamoa o'yinlari to'qnash kelmadi!!")
        }
    }
}