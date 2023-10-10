package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
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

    public static void clickdropdown(String criteria) {
        ActionManager.waitVisibility(shopConstants.DROPDOWN);
        click(shopConstants.DROPDOWN);

        switch(criteria) {
            case "Sort by Popularity":
                click(shopConstants.SORT_BY_POPULARITY);
                break;
            case "Sort by Average rating":
                click(shopConstants.SORT_BY_AVERAGE);
                break;
            case "Sort by Newness":
                click(shopConstants.SORT_BY_NEWNESS);
                break;
        }



    }
}
