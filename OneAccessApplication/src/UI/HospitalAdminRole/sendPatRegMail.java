package UI.HospitalAdminRole;



import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.mail.Session;
import javax.mail.Transport;



public class sendPatRegMail
{

public  void mailfunc(String c,String Eemail)
{
	final String fromEmail = "sannakkipratik@gmail.com";//user.getFromEmail(); //requires valid gmail id
        final String password = "xdrpybmirodorvos";//user.getPassword(); // correct password for gmail id
         final String toEmail = Eemail; // can be any email id 

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
        props.put("mail.smtp.port", "587"); //TLS Port
        props.put("mail.smtp.auth", "true"); //enable authentication
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
        props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS
         //enable authentication
               try
        {
                Authenticator auth;
            auth = new Authenticator() {
                //override the getPasswordAuthentication method
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(fromEmail, password);
                }
            };
                Session session = Session.getDefaultInstance(props,null);
          MimeMessage msg = new MimeMessage(session);
          //set message headers
          msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
          msg.addHeader("format", "flowed");
          msg.addHeader("Content-Transfer-Encoding", "8bit");

          msg.setFrom(new InternetAddress(fromEmail, "Pratik P Sannakki - One Access App Admin"));

          msg.setReplyTo(InternetAddress.parse(fromEmail, false));

          msg.setSubject("app test email", "UTF-8");

          msg.setText(c, "UTF-8");

          msg.setSentDate(new Date());

          msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
          System.out.println("Message is ready");
              Transport trans=session.getTransport("smtp");
              trans.connect("smtp.gmail.com",fromEmail,password);
              trans.sendMessage(msg,msg.getAllRecipients());

          System.out.println("EMail Sent Successfully!!");
        }
        catch (Exception e) {
          e.printStackTrace();
        }
}
}
