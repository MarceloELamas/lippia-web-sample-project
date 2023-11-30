package lippia.web.steps;
import io.cucumber.java.en.Then;
import lippia.web.services.myAccountServices;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.When;

public class myAccountSteps extends PageSteps {

    @When("the client Clicks on Account Details")
    public void theClientClicksOnAccountDetails() {
        myAccountServices.clickOnAccountDetails();
    }


    @Then("the client can view the message Password Change")
    public void theClientCanViewTheMessagePasswordChange() {
        myAccountServices.viewChangePassword();
    }
}
