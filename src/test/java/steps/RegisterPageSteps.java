package steps;

import io.cucumber.java.en.When;
import pageObjects.RegisterPage;

public class RegisterPageSteps {
    RegisterPage registerPage = new RegisterPage();
    @When("Fill inputs with {string} username and {string} email and {string} password")
    public void fillRegistrationForm(String username, String email, String password) {
        registerPage.setAllRegistrationFormInputs(username, email, password);
        //registerPage.clickRegistrationButton();
    }
}
