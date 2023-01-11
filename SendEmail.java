import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class SendEmail {
    public static void sendEmail(String to,String frizer,String oferta,String pret,String data,String interval) {
        
        String from = "mariuscoroian27@gmail.com";
       

        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("mariuscoroian27@gmail.com", "yjzkumldjychyujs");
            }
        });

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Confirmare");
            message.setText("Buna ziua!\nProgramarea dumneavoastra din data "+data+" in intervalul "+interval+" pentru "+oferta+", in valoare de "+pret+" cu frizerul "+frizer+" a fost confirmata!\nVa asteptam!");

            Transport.send(message);
            System.out.println("Email sent successfully");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
    
      public static void Sign(String to,String parola) {
        
        String from = "mariuscoroian27@gmail.com";
       

        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("mariuscoroian27@gmail.com", "yjzkumldjychyujs");
            }
        });

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Confirmare");
            message.setText("Buna ziua!\nVa amintim detaliile contului dumneavoastra:\nEmail: "+to+"\nParola: "+parola);

            Transport.send(message);
            System.out.println("Email sent successfully");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
 
}
