package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.loginConstants;
import lippia.web.constants.myAccountConstants;
import org.testng.Assert;


public class myAccountServices extends ActionManager {
    public static void clickOnAccountDetails() {
        ActionManager.waitVisibility(myAccountConstants.ACCOUNT_DETAILS_BUTTON);
        click(myAccountConstants.ACCOUNT_DETAILS_BUTTON);

    }

    public static void viewChangePassword() {
            Assert.assertEquals("Password Change",getTextChangePassword());
    }
    public static String getTextChangePassword(){
        return getText(myAccountConstants.CHANGE_PASS_TEXT);
    }
}
