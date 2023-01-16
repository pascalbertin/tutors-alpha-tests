package steps;

import io.cucumber.java.en.Then;
import pageObjects.HomePage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePageSteps {

    @Then("Site title should be {string}")
    public void checkSiteTitle(String siteTitle) {
        boolean ifTitleMatched = HomePage.getTitle().equals(siteTitle);
        assertTrue(ifTitleMatched);
    }

    @Then("Close the site")
    public void closeSite() {
        HomePage.driver.quit();
    }
}
