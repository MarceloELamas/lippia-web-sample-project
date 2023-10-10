package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.myAccountRegistrationServices;
import lippia.web.services.myAccountsRegistrationResultService;

public class myAccountRegistrationSteps extends PageSteps {

    @When("the client Clicks on My Account")
    public void clickOn() {
        myAccountRegistrationServices.clickOnMyAccount();
    }
    @And("the client Clicks on Register")
    public void theClientClicksOnRegister() {
        myAccountRegistrationServices.clickOnRegister();
    }

    @When("^the client enter (.*) in its textbox$")
    public void theClientEnterInTextbox(String mail) {

        if (mail.contains("@gmail.com")){
            myAccountRegistrationServices.enterMail(mail);

        } else {
            myAccountRegistrationServices.enterPassword(mail);
        }

}

    @Then("the client can view the message Hello (.*) in page")
    public void theClienCanViewTheMessageHelloInPage(String user) {
        myAccountsRegistrationResultService.verifyResults(user);
    }


}
