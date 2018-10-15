/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MapLoction;

/**
 *
 * @author Niranjanii
 */

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.*;
import java.util.*;
import javax.swing.JOptionPane;
//import org.junit.Test;

public class EmailService {
    
    public static EmailService instance;

    public static EmailService getInstance(){
        if(instance == null)
            instance = new EmailService();
        return instance;
    }
    
    public EmailService(){
        
    }
    
    public String successRegistrationMessage(String userName, String pwd){
        return "Please check into your social welfare dashboard, the new "
            + "credentials are <ul>"
            + "<li> userName: " + userName +"</li>"
            + "<li> password: " + pwd +"</li>"
            + "</ul>";
    }
    
    public String failedRegistrationMessage(){
        return "Please register again to social welfare dashboard,"
            + "We were unable to approve your registration this time";
    }
    
    private class SMTPAuthenticator extends Authenticator {

        public PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(EmailConfig.email, EmailConfig.password);
        }
    }

    public void mailSend(String toEmail,String message) {

        Properties props = EmailConfig.getEmailProperties();

        SMTPAuthenticator auth = new SMTPAuthenticator();
        Session session = Session.getInstance(props, auth);
        session.setDebug(false);

        MimeMessage msg = new MimeMessage(session);
        try {
            msg.setSubject(EmailConfig.subject);
            msg.setFrom(new InternetAddress(EmailConfig.email));
            
            Multipart mp = new MimeMultipart();
            MimeBodyPart htmlPart = new MimeBodyPart();
            htmlPart.setContent(message, "text/html");
            mp.addBodyPart(htmlPart);
            msg.setContent(mp);
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));

            Transport transport = session.getTransport("smtps");
            transport.connect(EmailConfig.host, Integer.valueOf(EmailConfig.port), EmailConfig.email, EmailConfig.password);
            transport.sendMessage(msg, msg.getAllRecipients());
            transport.close();

        } catch (Exception e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Email  sent to the user!!");
        }
    }


}