package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.myAccountRegistrationConstants;
import org.testng.Assert;

public class myAccountsRegistrationResultService extends ActionManager {

    private static String stats() {
        return (myAccountRegistrationConstants.HELLO_MESSAGE);
    }

    public static boolean getStats() {

        return stats().isEmpty();
    }

    public static String getUserDisplay(){
        return getText(myAccountRegistrationConstants.USER_DISPLAY);
    }

    public static void verifyResults(String user) {
        Assert.assertFalse(getStats());
        Assert.assertEquals(user,getUserDisplay());
    }
}
