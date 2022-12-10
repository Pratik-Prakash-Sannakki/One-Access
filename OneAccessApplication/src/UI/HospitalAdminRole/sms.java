package UI.HospitalAdminRole;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class sms {
        // Find your Account SID and Auth Token at twilio.com/console
    // and set the environment variables. See http://twil.io/secure
    public static final String ACCOUNT_SID = "AC5521533cadaf8cd209708dc445cdf91e";
    public static final String AUTH_TOKEN = "276942d143d719305d56f8fed0ccc625";

    public static void smms() {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("+18573135748"),
                new com.twilio.type.PhoneNumber("+13346058410"),
                "Where's Wallace?")
            .create();

        System.out.println(message.getSid());
    }

}