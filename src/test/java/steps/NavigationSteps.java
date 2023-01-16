package steps;

import general.PageURLs;
import io.cucumber.java.en.Given;
import pageObjects.BasePage;

public class NavigationSteps {
    BasePage basePage = new BasePage();
    PageURLs pageKey;

    public NavigationSteps() {}
    @Given("Go to {string} page")
    public void userNavigateToSite(String siteURL) {
        basePage.init();
        switch (siteURL) {
            case "register" -> pageKey = PageURLs.REGISTER_PAGE;
            case "login" -> pageKey = PageURLs.LOGIN_PAGE;
            case "categories" -> pageKey = PageURLs.CATEGORIES_PAGE;
        }

        basePage.setURL(basePage.getURL() + pageKey.getPageURL());
        basePage.navigate();
    }
}
