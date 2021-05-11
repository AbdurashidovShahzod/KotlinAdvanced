package designpatterns.facadepattern

fun main(args: Array<String>) {
    /**
     * Albatta design patternlarni o'rganish ancha qiyin bo'layabdi
     * shuning uchun ham internet orqali har xil manbalardan foydalangan
     * holda code larni qayta qayta yozib har bitta jarayoni nima bo'layotganini
     * tushunishga harakat qildim va bunga oz bo'lsada natijaga erishdim deb o'ylayman...
     */
    val computer = Computer()
    computer.start()
}

class CPU {
    fun freeze() = println("Freezing.")

    fun jump(position: Long) = println("Jump to $position.")

    fun execute() = println("Executing.")
}

class HardDrive {
    fun read(lba: Long, size: Int): ByteArray = byteArrayOf()
}

class Memory {
    fun load(position: Long, data: ByteArray) = println("Loading from memory position: $position")
}

class Computer(val processor: CPU = CPU(), val ram: Memory = Memory(), val hd: HardDrive = HardDrive()) {
    companion object {
        val BOOT_ADDRESS = 0L
        val BOOT_SECTOR = 0L
        val SECTOR_SIZE = 0
    }

    fun start() {
        processor.freeze()
        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE))
        processor.jump(BOOT_ADDRESS)
        processor.execute()
    }
}