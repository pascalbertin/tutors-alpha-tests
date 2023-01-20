package pageObjects;

import general.PageURLs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    public static WebDriver driver = null;
    public PageURLs pageKey = PageURLs.HOME_PAGE;
    String URL = pageKey.getPageURL();

    public void init() {
        driver = new ChromeDriver();
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public static String getTitle() {
        return driver.getTitle();
    }

    public void navigate() {
        navigateTo(this.getURL());
    }

    public void navigateTo(String URL) {
        driver.get(URL);
    }

    public void cleanDriver() {
        driver.quit();
    }
}
