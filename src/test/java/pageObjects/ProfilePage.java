package pageObjects;

import org.openqa.selenium.By;

public class ProfilePage extends HomePage {
    private final static By userNameLoginDisplay = By.xpath("//h2[@class='avatar-nickname']");
    private final static By editUserDataButton = By.xpath("//button[contains(text(),'Edytuj profil')]");

    public String getLoggedInUsername() {
        return driver.findElement(userNameLoginDisplay).getText();
    }

    public void clickOnEditProfileButton() {
        driver.findElement(editUserDataButton).click();
    }
}
