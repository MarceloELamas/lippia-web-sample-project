package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.loginConstants;
import org.testng.Assert;

public class loginResultService extends ActionManager {

    public static String getMessageLogin(){

            return getText(loginConstants.ERROR_MESSAGE_MAIL);

    }

    public static void verifyMessage(String message) {
        Assert.assertEquals(message,getMessageLogin());
    }

    public static void verifyLoginText() {
        Assert.assertEquals("Login",getTextLogin());
    }

    public static String getTextLogin(){
        return getText(loginConstants.LOGIN_TEXT);
    }
}
