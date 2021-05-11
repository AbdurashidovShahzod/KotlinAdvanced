package file.homework2

import java.io.File

fun main(args: Array<String>) {
    val myFile = arrayListOf<File>()
    var text = "Data filtration, Border, Sr No., Format Painter\n" +
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

    for (directory in 1..1) {
        for (directory2 in 1..2) {
            for (directory3 in 1..3) {
                for (directory4 in 1..4) {
                    myFile.add(
                        File(
                            "$directory/$directory2/$directory3/$directory4.txt"
                        )
                    )
                    myFile.last().parentFile.mkdirs()
                    myFile.last().createNewFile()
                    myFile.last().writeBytes(text.toByteArray()).toString()
                }
            }
        }
    }
}