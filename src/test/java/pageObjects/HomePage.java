package pageObjects;

import general.PageURLs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HomePage {
    public PageURLs pageKey = PageURLs.HOME_PAGE;
    public static final WebDriver driver = new ChromeDriver();
    String pageRelativeURL = pageKey.getPageURL();
    String URL = pageRelativeURL;

    public HomePage() {

    }

    public String getURL() {
        return URL;
    }

    public static String getTitle() {
        return driver.getTitle();
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public void navigate() {
        navigateTo(this.getURL());
    }

    public void navigateTo(String URL) {
        driver.get(URL);
    }
}
