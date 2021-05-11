package thread.main3

import java.util.*

class MathGame() : Runnable {

    override fun run() {
        val scanner = Scanner(System.`in`)
        val random = Random()

        while (true) {
            val number1 = random.nextInt(50)
            val number2 = random.nextInt(50)
            val ishoralar = random.nextInt(4)
            var natija: Int = 0
            when (ishoralar) {
                0 -> {
                    natija = number1 + number2
                    print("$number1+$number2=")
                }
                1 -> {
                    natija = number1 - number2
                    print("$number1-$number2=")
                }
                2 -> {
                    natija = number1 * number2
                    print("$number1*$number2=")
                }
                3 -> {
                    natija = number1 / number2
                    print("$number1/$number2=")
                }
            }

            val myResult = scanner.nextInt()
            if (natija == myResult) {
                val s = "Siz to'g'ri topdingiz xaqiqatan ham javob=$natija edi..."
                for (i in 0 until s.length) {
                    print(s[i])
                    try {
                        Thread.sleep(300)
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                }
            } else {
                val s = "Siz noto'g'ri topdingiz.Iltimos qayta urinib ko'ring"
                for (i in 0 until s.length) {
                    System.err.print(s[i])
                    try {
                        Thread.sleep(200)
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                }
            }
        }
    }
}