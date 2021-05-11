package sendemail

import java.util.*
import javax.activation.FileDataSource
import javax.mail.*
import javax.mail.internet.InternetAddress
import javax.mail.internet.MimeBodyPart
import javax.mail.internet.MimeMessage
import javax.mail.internet.MimeMultipart
import javax.activation.DataHandler as DataHandler1

fun main(args: Array<String>) {

    val props = Properties()
    props["mail.smtp.host"] = "smtp.gmail.com"
    props["mail.smtp.socketFactory.port"] = "465"
    props["mail.smtp.socketFactory.class"] = "javax.net.ssl.SSLSocketFactory"
    props["mail.smtp.auth"] = "true"
    props["mail.smtp.port"] = "465"

    val session = Session.getDefaultInstance(props,
        object : Authenticator() {
            override fun getPasswordAuthentication(): PasswordAuthentication {
                return PasswordAuthentication("shahzod9933@gmail.com", "Shah9933")
            }
        })
    try {
        var mimeBodyPart = MimeBodyPart()
        mimeBodyPart.setText("Its file...")
        val mimeMultipart = MimeMultipart()
        mimeMultipart.addBodyPart(mimeBodyPart)

        mimeBodyPart = MimeBodyPart()
        val file = "emailsend.zip"
        val fileDataSource = FileDataSource(file)
        mimeBodyPart.dataHandler = DataHandler1(fileDataSource)
        mimeBodyPart.fileName = file
        mimeMultipart.addBodyPart(mimeBodyPart)

        val message = MimeMessage(session)
        message.setFrom(InternetAddress("shahzod9933@gmail.com"))
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("uzmobiler@gmail.com"))
        message.subject = "SMILE"
        message.setContent(mimeMultipart)
        Transport.send(message)
        println("Tabriklaymiz file muvaffaqiyatli yuborildi...")
    } catch (e: Exception) {
        e.printStackTrace()
    }

}