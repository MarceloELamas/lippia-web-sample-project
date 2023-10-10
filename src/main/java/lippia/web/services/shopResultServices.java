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

    private static WebElement statsPopularCategory() {
        return getElement(shopConstants.POPULAR_CATEGORY_BOOKS);
    }

    public static boolean getStatsPopularCategory() {

        return statsPopularCategory().isDisplayed();
    }

    public static void verifyResultsPopularCategory() {
        Assert.assertTrue(getStatsPopularCategory());
    }
}
