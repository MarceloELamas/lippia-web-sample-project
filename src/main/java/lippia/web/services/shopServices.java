package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.GoogleConstants;
import lippia.web.constants.shopConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class shopServices extends ActionManager {
    public static void navegarWeb(){

        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void clickShop() {
        ActionManager.waitVisibility(shopConstants.SHOP);
        click(shopConstants.SHOP);
    }

    public static void clickAndroid() {
        ActionManager.waitVisibility(shopConstants.ANDROID);
        click(shopConstants.ANDROID);
    }

    public static void clickdropdown() {
        ActionManager.waitVisibility(shopConstants.DROPDOWN);
        click(shopConstants.DROPDOWN);
        ActionManager.waitVisibility(shopConstants.SORT_BY_POPULARITY);
        click(shopConstants.SORT_BY_POPULARITY);
    }
}
