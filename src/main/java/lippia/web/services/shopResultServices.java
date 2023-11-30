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

    private static WebElement statsAverageCategory() {

        return getElement(shopConstants.AVERAGE_CATEGORY_BOOKS);
    }

    public static boolean getStatsAverageCategory() {

        return statsAverageCategory().isDisplayed();
    }

    private static WebElement statsNewnessCategory() {

        return getElement(shopConstants.NEWNESS_CATEGORY_BOOKS);
    }

    public static boolean getStatsNewnessCategory() {

        return statsNewnessCategory().isDisplayed();
    }

    public static void verifyResultsPopularCategory(String criteria) {
        switch(criteria) {
            case "Popular":
                Assert.assertTrue(getStatsPopularCategory());
                break;
            case "Average rating":
                Assert.assertTrue(getStatsAverageCategory());
                break;
            case "Newness":
                Assert.assertTrue(getStatsNewnessCategory());
                break;
        }

    }
    private static WebElement purchaseDetailText() {

        return getElement(shopConstants.ORDERDETAILS_TEXT);
    }

    public static boolean getStatsDetailOrder() {

        return purchaseDetailText().isDisplayed();
    }

    public static void verifyResultsPurchase(){
        Assert.assertTrue(getStatsDetailOrder());
    }

}
