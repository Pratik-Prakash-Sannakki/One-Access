package UI.HospitalAdminRole;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class sms {
        // Find your Account SID and Auth Token at twilio.com/console
    // and set the environment variables. See http://twil.io/secure
    public static final String ACCOUNT_SID = "";    // add in Twilio Account SID
    public static final String AUTH_TOKEN = "";     // add in Twilio Auth Token

    public static void smms(String s) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber(""), // To phone Number 
                new com.twilio.type.PhoneNumber(""), //  from phone number
                s)
            .create();

        System.out.println(message.getSid());
    }

}
