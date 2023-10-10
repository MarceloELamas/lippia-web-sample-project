package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.shopConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class shopResultServices extends ActionManager {
    private static WebElement stats() {
        return getElement(shopConstants.STATS_ANDROID);
    }

    public static boolean getStatsAndroid() {

        return stats().isDisplayed();
    }

    public static void verifyResults(){
        Assert.assertTrue(getStatsAndroid());

    }
}
