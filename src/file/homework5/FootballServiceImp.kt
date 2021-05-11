package file.homework5

import java.io.File
import java.io.FileWriter
import java.util.*

class FootballServiceImp : FootballServiceInterface {
    var scanner = Scanner(System.`in`)
    var fileF = File("FootballTeam.txt")


    override fun teamFootball() {
        println("Klub nomi:")
        var name = scanner.next()
        println("Uy stadioni:")
        var uyStadioni = scanner.next()
        println("Liga pozitsiyasi")
        var ligaPozitsiyasi = scanner.next()
        println("Utkazib yuborilgan gollar")
        var utkazibYuborilganGollar = scanner.nextInt()
        println("Urilgan gollar:")
        var urilganGollar = scanner.nextInt()
        println("Olingan ballar:")
        var ball = scanner.nextInt()
        println("Uyin vaqti:")
        var sana = scanner.next()
        println("Azolar:")
        var azolar = scanner.next()
        try {
            var footballTeam = FileWriter("FootballTeam.txt", true)
            footballTeam.write(
                "Name:$name,Uy stadioni:$uyStadioni,Liga pozitsiyasi:$ligaPozitsiyasi\n" +
                        ",Utkazib yuborilgan gollar:$utkazibYuborilganGollar,Urilgan gollar:$urilganGollar,ball:$ball,Uyin vaqti:$sana,Azolar:$azolar \n\n"
            )
            footballTeam.close()
        } catch (ee: Exception) {
            ee.message
        }

    }

    override fun show() {
        File("FootballTeam.txt").forEachLine { football ->
            println(football)
        }
    }
}