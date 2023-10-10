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

    @Then("^the client can view the message Hello (.*)$")
    public void theClientCanViewTheMessageHelloInPage(String user) {
        myAccountsRegistrationResultService.verifyResults(user);
    }


    @When("^the client enter (.*) in the box mail$")
    public void theClientEnterInTheBoxMail(String mail) {
        myAccountRegistrationServices.enterMail(mail);
        }

    @When("^the client enter (.*) in the box password$")
    public void theClientEnterInTheBoxPassword(String mail) {
        myAccountRegistrationServices.enterPassword(mail);
    }

    @Then("^the client can view the message (.*) in page$")
    public void theClientCanViewTheMessageInPage(String message) {
            myAccountsRegistrationResultService.verifyMessage(message);
    }
}
