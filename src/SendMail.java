

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {
    public static void sendMail(String recipient) throws MessagingException {
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        String myAccountEmail = "im.7249000@gmail.com";
        String password = "bmsdbusbdnciszay";

        Session session = Session.getDefaultInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail, password);
            }
        });

        Message message = prepareMessage(session, myAccountEmail, recipient);
        Transport.send(message);
    }

    private static Message prepareMessage(Session session, String myAccountEmail, String recipient) {
        Message message = new MimeMessage(session);
        try {
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
            message.setSubject("Fee Reminder");
            message.setText("I hope this email finds you well. As the gym's administrator, I wanted to reach out to you regarding your gym membership. We appreciate your continued support and dedication to our fitness community.\n\nKindly be informed that your gym membership fee is due for the upcoming month. To ensure uninterrupted access to our facilities and services, we kindly request you to settle the membership fee at your earliest convenience.\n\nThank you for being a valued member of our gym, and we look forward to seeing you soon for another great workout!");
            return message; // Return the created message here
        } catch (MessagingException ex) {
            Logger.getLogger(SendMail.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
