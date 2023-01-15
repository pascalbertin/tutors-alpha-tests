package steps;

import io.cucumber.java.en.When;
import pageObjects.HomePage;

public class NavigationSteps {
    HomePage homePage = new HomePage();

    public NavigationSteps() {}
    @When("Go to {string} page")
    public void userNavigateToSite(String siteURL) {
        homePage.setURL(homePage.getURL() + siteURL);
        homePage.navigate();
    }
}
