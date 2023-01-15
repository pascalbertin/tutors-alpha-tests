package pageObjects;

import org.openqa.selenium.By;

public class RegisterPage extends HomePage {
    private final static By userNameInput = By.id("username");
    private final static By emailInput = By.id("email");
    private final static By passwordInput = By.id("password");
    private final static By passwordRepeatInput = By.id("passwordRepeat");
    private final static By rulesCheckbox = By.id("rules");
    private final static By submitButton = By.xpath("//button[@type='submit']");


    public void setAllRegistrationFormInputs(
            String userName,
            String email,
            String password)
    {
        HomePage.driver.findElement(userNameInput).sendKeys(userName);
        HomePage.driver.findElement(emailInput).sendKeys(email);
        HomePage.driver.findElement(passwordInput).sendKeys(password);
        HomePage.driver.findElement(passwordRepeatInput).sendKeys(password);
        HomePage.driver.findElement(rulesCheckbox).click();
    }

    public void clickRegistrationButton() {
        HomePage.driver.findElement(submitButton).click();
    }
}
