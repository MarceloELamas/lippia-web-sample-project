package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.loginConstants;

public class loginService extends ActionManager {
    public static void enterMailLogin(String mail) {
        setInput(loginConstants.ENTER_MAIL_LOGIN, mail);
    }

    public static void enterPasswordLogin(String mail) {
        setInput(loginConstants.ENTER_PASS_LOGIN, mail);
    }

    public static void clioOnLogin() {
        ActionManager.waitVisibility(loginConstants.LOGIN);
        click(loginConstants.LOGIN);
    }
}
