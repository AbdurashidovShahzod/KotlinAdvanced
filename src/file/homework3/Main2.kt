package file.homework3

import java.io.*
import java.nio.charset.Charset

fun main() {
    val file = File("shahzod.txt")

    val text = "Data filtration, Border, Sr No., Format Painter\n" +
            "Codes used in VBA\n" +
            "Function today() and Equation additing\n" +
            "Command Dollar {\$} understanding\n" +
            "Data Validation - Drop Down List creation\n" +
            "IF, Nested if, if(And) command\n" +
            "Use of Conditional Formatting with Example\n" +
            "Remove Duplicates value in Excel\n" +
            "Automate Boarder - Where data available\n" +
            "Understanding of VLOOKUP\n" +
            "Index - Match equation\n" +
            "Data Filter - Analyse data\n" +
            "Bar Chart, Pie Chart Creation - Dashboard\n" +
            "VBA Form Creation\n" +
            "Password Protected Mail shooting directly from excel"

    FileOutputStream(file).use { shax ->
        OutputStreamWriter(shax, Charsets.UTF_8).use {
            BufferedWriter(it).use { bf ->
                bf.write(text)
            }
        }
    }
    val inputStream = file.inputStream()
    val content = inputStream.readBytes()
        .toString(Charset.defaultCharset())
    println(content)
}