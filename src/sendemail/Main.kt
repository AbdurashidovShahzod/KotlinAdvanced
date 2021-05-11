package sendemail

import java.net.Authenticator
import java.net.PasswordAuthentication
import java.util.*
import javax.mail.*
import javax.mail.Session
import javax.mail.internet.InternetAddress
import javax.mail.internet.MimeMessage

fun main(args: Array<String>) {
    val props = Properties()
    props["mail.smtp.host"] = "smtp.gmail.com"
    props["mail.smtp.socketFactory.port"] = "465"
    props["mail.smtp.socketFactory.class"] = "javax.net.ssl.SSLSocketFactory"
    props["mail.smtp.auth"] = "true"
    props["mail.smtp.port"] = "465"

    val session = Session.getDefaultInstance(props,
        object : javax.mail.Authenticator() {
            override fun getPasswordAuthentication(): javax.mail.PasswordAuthentication {
                return PasswordAuthentication("shahzod9933@gmail.com", "Shah9933")
            }
        })
    try {
        val message = MimeMessage(session)
        message.setFrom(InternetAddress("shahzod9933@gmail.com"))
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("uzmobiler@gmail.com"))
        message.subject = "Hi my bro!!!"

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

        message.setText(text)
        Transport.send(message)
        println("Send message!!!")
    } catch (e: Exception) {
        e.printStackTrace()
    }
}