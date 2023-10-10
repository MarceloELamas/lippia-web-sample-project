package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.myAccountRegistrationConstants;

public class myAccountRegistrationServices extends ActionManager {

    public static void clickOnMyAccount() {
        ActionManager.waitVisibility(myAccountRegistrationConstants.MY_ACCOUNT);
        click(myAccountRegistrationConstants.MY_ACCOUNT);
        }
    public static void clickOnRegister() {
        ActionManager.waitVisibility(myAccountRegistrationConstants.REGISTER);
        click(myAccountRegistrationConstants.REGISTER);
    }

    public static void enterMail(String mail) {
        setInput(myAccountRegistrationConstants.MAIL_BOX, mail);
    }

    public static void enterPassword(String mail) {
        setInput(myAccountRegistrationConstants.PASSWORD_BOX, mail);
    }
}
