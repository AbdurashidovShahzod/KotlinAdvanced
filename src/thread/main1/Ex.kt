package thread.main1

class Ex : Thread() {

    override fun run() {

        val t: String = "Men seni sevaman!!!"
        for (i in 0..t.length) {
            sleep(1000)
            System.err.print(t)
        }
    }
}