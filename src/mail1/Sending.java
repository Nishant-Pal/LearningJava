package mail1;
import javax.mail.*;
import java.util.Properties;
import javax.mail.internet.MimeMessage;

class Gmail{
 private java.util.Properties p;
 private javax.mail.Session s;
private javax.mail.Authenticator a;
    Gmail(String your_address ,String Password)
    {
        p=new java.util.Properties();
        p.put("mail.smtp.auth", "true");
        p.put("mail.smtp.host","smtp.gmail.com");
        p.put("mail.smtp.port","465");
        p.put("mail.smtp.SocketFactory.port","465");
        p.put("mail.smtp.class", "javax.net.ssl.SSLSocketFactory");
        
        a=javax.mail.Authenticator(){
        protected  PasswordAuthentication getPasswordAuthentication(){
            return new PasswordAuthentication("nishantpal77@gmail.com","nishu111");
        };
            };

        }
    }
        
        
    
