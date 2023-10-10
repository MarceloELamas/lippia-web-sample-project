package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.myAccountRegistrationConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class myAccountsRegistrationResultService extends ActionManager {

    private static WebElement stats() {
        return getElement(myAccountRegistrationConstants.HELLO_MESSAGE);
    }

    public static boolean getStats() {

        return stats().isDisplayed();
    }

    //public static String getUserDisplay(){
     //   return getText(myAccountRegistrationConstants.USER_DISPLAY);
    //}

    public static void verifyResults() {
        Assert.assertTrue(getStats());
        //Assert.assertEquals(user, getUserDisplay());
    }
}
