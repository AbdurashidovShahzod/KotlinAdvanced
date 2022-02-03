package datetime.homework5

import java.time.LocalDateTime
import java.time.LocalTime
import java.util.*

fun main(args: Array<String>) {
    
    val scanner = Scanner(System.`in`)
    val listTv = arrayListOf<TvProgram>()
    val localTime = LocalTime.of(6, 0)
    val tvProgram = TvProgram("Assalom O'zbekistan", localTime)
    val localTime2 = LocalTime.of(11, 30)
    val tvProgram2 = TvProgram("Oshxona qirollari", localTime2)
    val localTime3 = LocalTime.of(12, 0)
    val tvProgram3 = TvProgram("Yangliklar", localTime3)
    val localTime4 = LocalTime.of(15, 50)
    val tvProgram4 = TvProgram("Sport time", localTime4)
    val localTime5 = LocalTime.of(22, 45)
    val tvProgram5 = TvProgram("Kino", localTime5)
    listTv.add(tvProgram)
    listTv.add(tvProgram2)
    listTv.add(tvProgram3)
    listTv.add(tvProgram4)
    listTv.add(tvProgram5)

    println("Soatni kiriting:")
    var hour = scanner.nextInt()
    println("Minutni kiriting:")
    val minute = scanner.nextInt()
    val equalTime = LocalTime.of(hour, minute)
    var index = -1
    for (i in listTv.indices) {
        if (listTv[i].timeTv == equalTime) {
            index = i
            break
        }
    }
    if (index == -1) {
        System.err.println("$equalTime bu vaqtda bizning repertuarimizda hech qanday dastur mavjud emas!!!")
    } else {
        println(
            "Hozir $equalTime vaqtida repertuarimizda ${listTv[index].name} nomli dastur ketmoqda.\n" +
                    "Sizga maroqli xordiq tilaymiz"
        )
    }

}
