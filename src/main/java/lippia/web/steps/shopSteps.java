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

    @When("^the client Clicks on (.*) item in Default sorting dropdown$")
    public void clickOndropdown(String criteria) {
        switch(criteria) {
            case "Sort by Popularity":
                shopServices.clickdropdown(criteria);
                break;
            case "Sort by Average rating":
                shopServices.clickdropdown(criteria);
                break;
            case "Sort by Newness":
                shopServices.clickdropdown(criteria);
                break;
        }
    }

    @Then("^the client can view books the (.*) products only$")
    public void popularBooksCategory(String criteria) {
        shopResultServices.verifyResultsPopularCategory(criteria);
        }


    @When("the client Clicks on ADDTOBASKET in product")
    public void theClientClicksOnADDTOBASKETInProduct() {
        shopServices.clickAddToBasket();
    }

    @When("the client Clicks on CART")
    public void theClientClicksOnCART() {
        shopServices.clickOnCart();
        shopServices.clickOnCart();
    }

    @When("the client Clicks on PROCED_TO_CHECKOUT")
    public void theClientClicksOnPROCED_TO_CHECKOUT() {
        shopServices.clickOnCheckOut();
    }

    @When("^the client Complete all inputs with (.*), (.*), (.*), (.*), (.*), (.*), (.*)$")
    public void theClientCompleteAllInputsWith(String firstName, String lastName, String email, String phone, String address, String town, String postalCode) {
        shopServices.addDataToInput(firstName,lastName, email, phone, address, town, postalCode);
    }

    @When("the client Clicks on Cash on Delibery")
    public void theClientClicksOnCashOnDelibery() {
        shopServices.clickOnDelibery();
    }

    @When("the client Clicks on Cash on Place order")
    public void theClientClicksOnCashOnPlaceOrder() {
        shopServices.clickOnPlaceOrder();
        shopServices.clickOnPlaceOrder();
    }

    @Then("client can view her purchase details")
    public void clientCanViewHerPurchaseDetails() {
        shopResultServices.verifyResultsPurchase();
    }
}