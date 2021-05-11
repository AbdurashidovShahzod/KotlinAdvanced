package thread.main3

object YY {
    @JvmStatic
    fun main(args: Array<String>) {
        val s = "Salom"
        for (i in 0 until s.length) {
            print(s[i])
            try {
                Thread.sleep(300)
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }
    }
}
