package steps;

import general.Messages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.LoginPage;

public class LoginPageSteps {
    LoginPage loginPage = new LoginPage();

    @When("Fill login inputs with {string} username and {string} email and {string} password")
    public void fillLoginForm(String username, String email, String password) throws InterruptedException {
        loginPage.setAllLoginFormInputs(username, email, password);
        loginPage.clickLoginButton();
        Thread.sleep(500);
    }

    @Then("User receives unauthorized message")
    public void userDuplicateErrorMessage() {
        Messages msg = Messages.LOGIN_UNAUTHORIZED_MSG;
        boolean ifContains = loginPage.getConfirmationMessageAfterLogin().contains(msg.getMessage());
        Assert.assertTrue(ifContains);
        loginPage.cleanDriver();
    }
}
