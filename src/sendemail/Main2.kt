package sendemail

import java.util.*
import javax.mail.*
import javax.mail.internet.InternetAddress
import javax.mail.internet.MimeMessage

fun main(args: Array<String>) {
    val props = Properties()
    props["mail.smtp.host"] = "smtp.gmail.com"
    props["mail.smtp.socketFactory.port"] = "465"
    props["mail.smtp.socketFactory.class"] = "javax.net.ssl.SSLSocketFactory"
    props["mail.smtp.port"] = "465"
    props["mail.smtp.auth"] = true

    val session = Session.getDefaultInstance(props, object : Authenticator() {
        override fun getPasswordAuthentication(): PasswordAuthentication {
            return PasswordAuthentication("shahzod9933@gmail.com", "Shah9933")
        }
    })
    try {
        val message = MimeMessage(session)
        message.setFrom(InternetAddress("shahzod9933@gmail.com"))
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("uzmobiler@gmail.com"))
        message.subject = "My HTML code!!!"
        message.setContent(
            "<html>\n" +
                    "<body>\n" +
                    "\n" +
                    "<a href=https://pdp.uz>This is a link</a>\n" +
                    "\n" +
                    "</body>\n" +
                    "</html>\n", "text/html"
        )
        Transport.send(message)
        println("Sizning HTML kodingiz yuborildi!!!")


    } catch (e: MessagingException) {
        e.printStackTrace()
    }

}