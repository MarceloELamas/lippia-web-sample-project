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

    public static void clickAddToBasket() {
        ActionManager.waitVisibility(shopConstants.ADDTOBASKET_BUTTON_PRODUCT);
        click(shopConstants.ADDTOBASKET_BUTTON_PRODUCT);
    }

    public static void clickOnCart() {
        ActionManager.waitVisibility(shopConstants.CART_BUTTON);
        click(shopConstants.CART_BUTTON);
    }

    public static void clickOnCheckOut() {
        ActionManager.waitVisibility(shopConstants.PROCEEDTOCHECKOUT_BUTTON);
        click(shopConstants.PROCEEDTOCHECKOUT_BUTTON);
    }

    public static void addDataToInput(String firstName, String lastName, String email, String phone, String address, String town, String postalCode) {
        ActionManager.setInput(shopConstants.FIRSTNAME_INPUT, firstName);
        ActionManager.setInput(shopConstants.LASTTNAME_INPUT, lastName);
        ActionManager.setInput(shopConstants.EMAIL_INPUT, email);
        ActionManager.setInput(shopConstants.PHONE_INPUT, phone);
        ActionManager.setInput(shopConstants.ADDRESS_INPUT, address);
        ActionManager.setInput(shopConstants.TOWN_INPUT, town);
        ActionManager.setInput(shopConstants.POSTALCODE_INPUT, postalCode);
    }

    public static void clickOnDelibery() {
        ActionManager.waitVisibility(shopConstants.CASH_BUTTON);
        click(shopConstants.CASH_BUTTON);
    }

    public static void clickOnPlaceOrder() {
        ActionManager.waitVisibility(shopConstants.PLACEORDER_BUTTON);
        click(shopConstants.PLACEORDER_BUTTON);
    }
}
