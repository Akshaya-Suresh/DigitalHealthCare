/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MapLoction;
import java.util.Properties;
/**
 *
 * @author Niranjanii
 */
public class EmailConfig {

    public static final String email = "niranjhaniv@gmail.com",
            password = "9940122135",
            host = "smtp.gmail.com",
            port = "465",
            subject = "Emergency Alert",
            text = "Hey, this is the testing email.";
    
    static Properties props = new Properties();
    
    public static Properties getEmailProperties(){
        props.put("mail.smtp.user", email);
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.debug", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.socketFactory.port", port);
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.fallback", "false");
        
        return props;
    }
    
    public String emailUserName;
    public String emailpwd;
    
    
    public String successMessageBody = "Please check into your social welfare dashboard, the new "
            + "credentials are <ul>"
            + "<li> userName: " + emailUserName +"</li>"
            + "<li> password: " + emailpwd +"</li>"
            + "</ul>";
    
    public String failedMessageBody = "Please register again to social welfare dashboard,"
            + "We were unable to approve your registration this time";

}