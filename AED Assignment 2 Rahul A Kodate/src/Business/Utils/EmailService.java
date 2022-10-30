/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Utils;



import java.util.Properties;
//import javax.mail.Session;
//import javax.mail.Authenticator;
//import javax.mail.Message;
//import javax.mail.Multipart;
//import javax.mail.PasswordAuthentication;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeBodyPart;
//import javax.mail.internet.MimeMessage;
//import javax.mail.internet.MimeMultipart;

/**
 *
 * @author rahulkodate
 */
public class EmailService {
    
    public static boolean sendEmail(String emailTo, String body, String subject) {
        
        Properties prop = new Properties();
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", 587);
        
//        Session session = Session.getInstance(prop, new Authenticator() {
//            @Override
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication("contactwecare28@gmail.com", "jody1234");
//            }
//        });
        
        try {
//                Message message = new MimeMessage(session);
//                message.setFrom(new InternetAddress("contactwecare28@gmail.com"));
//                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailTo));
//                message.setSubject(subject);
//
//                MimeBodyPart mimeBodyPart = new MimeBodyPart();
//                mimeBodyPart.setContent(body, "text/html");
//
//                Multipart multipart = new MimeMultipart();
//                multipart.addBodyPart(mimeBodyPart);
//
//                message.setContent(multipart);
//
//                Transport.send(message);
                
                return true;
           
        }catch(Exception e) {
            e.printStackTrace();
            
            return false;
            
        }
        
    }
    
}
