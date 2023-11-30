package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.loginService;
import lippia.web.services.loginResultService;

public class loginSteps extends PageSteps {

    @When("^the client enter (.*) in Login textbox$")
    public void enterLoginTextbox(String mail) {

        if (mail.contains("@gmail.com")){
            loginService.enterMailLogin(mail);

        } else {
            loginService.enterPasswordLogin(mail);
        }

    }

    @And("the client Clicks on Login")
    public void clicksOnLogin() {
        loginService.clioOnLogin();
    }


    @When("^the client enter (.*) in Login box mail$")
    public void theClientEnterInLoginBoxMail(String mail) {
        loginService.enterMailLogin(mail);
    }

    @When("^the client enter (.*) in Login box password$")
    public void theClientEnterInLoginBoxPassword(String mail) {
        loginService.enterPasswordLogin(mail);
    }

    @Then("^the client can view the message (.*) in Login Page$")
    public void theClientCanViewTheMessageInLoginPage(String message) {
        loginResultService.verifyMessage(message);
    }

    @And("the client Clicks on Logout")
    public void theClientClicksOnLogout() {
            loginService.clickOnLogout();}

    @Then("the client can view the text LOGIN in page")
    public void theClientCanViewTheTextLOGINInPage() {
        loginResultService.verifyLoginText();
    }
}
