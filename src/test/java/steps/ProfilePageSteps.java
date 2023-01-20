package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.ProfilePage;

public class ProfilePageSteps {
    ProfilePage profilePage = new ProfilePage();

    @Then("Username {string} should be displayed")
    public void userLogInSuccessfully(String username) {
        boolean ifContains = profilePage.getLoggedInUsername().contains(username);
        Assert.assertTrue(ifContains);
    }

    @When("Click on edit profile button")
    public void clickOnEditButton() {
        profilePage.clickOnEditProfileButton();
    }

    @Then("Close the site")
    public void closeSite() {
        profilePage.cleanDriver();
    }
}
