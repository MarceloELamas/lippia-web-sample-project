package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.shopServices;
import lippia.web.services.shopResultServices;

public class shopSteps extends PageSteps {

    @Given("the client is on page Automation")
    public void home() {shopServices.navegarWeb();
    }

    @When("the client Clicks on Shop")
    public void clickOnShop() {
        shopServices.clickShop();
    }

    @And("the client does Click on Android from PRODUCT CATEGORIES")
    public void clickOnAndroid() {
        shopServices.clickAndroid();
    }

    @Then("the client can view books only from categories Android")
    public void androidBooksVerification() {
        shopResultServices.verifyResults();
    }

    @When("the client Clicks on {} item in Default sorting dropdown")
    public void theClientClicksOnItemInDefaultSortingDropdown(String arg0) {
    }
}
