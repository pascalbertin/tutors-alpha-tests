package steps;

import general.Messages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.RegisterPage;

public class RegisterPageSteps {
    RegisterPage registerPage = new RegisterPage();


    @When("Fill register inputs with {string} username and {string} email and {string} password")
    public void fillRegistrationForm(String username, String email, String password) throws InterruptedException {
        registerPage.setAllRegistrationFormInputs(username, email, password);
        registerPage.clickRegistrationButton();
        Thread.sleep(500);
    }

    @Then("User receives duplicated username message")
    public void userDuplicateErrorMessage() {
        Messages msg = Messages.REGISTER_USER_DUPLICATED;
        boolean ifContains = registerPage.getConfirmationMessageAfterRegistration().contains(msg.getMessage());
        Assert.assertTrue(ifContains);
        //registerPage.cleanDriver();
    }

}
