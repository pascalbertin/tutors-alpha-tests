package pageObjects;

import org.openqa.selenium.By;

public class RegisterPage extends HomePage {
    private final static By userNameRegistrationInput = By.id("username");
    private final static By emailRegistrationInput = By.id("email");
    private final static By passwordRegistrationInput = By.id("password");
    private final static By passwordRepeatRegistrationInput = By.id("passwordRepeat");
    private final static By rulesRegistrationCheckbox = By.id("rules");
    private final static By submitRegistrationButton = By.xpath("//button[@type='submit']");
    private final static By confirmationRegistrationMessage = By.xpath("//div[@class='form-container flex-col text-xl text-first items-center text-center my-10']");

    public void setAllRegistrationFormInputs(
            String userName,
            String email,
            String password)
    {
        driver.findElement(userNameRegistrationInput).sendKeys(userName);
        driver.findElement(emailRegistrationInput).sendKeys(email);
        driver.findElement(passwordRegistrationInput).sendKeys(password);
        driver.findElement(passwordRepeatRegistrationInput).sendKeys(password);
        driver.findElement(rulesRegistrationCheckbox).click();
    }

    public void clickRegistrationButton() {
        driver.findElement(submitRegistrationButton).click();
    }

    public String getConfirmationMessageAfterRegistration() {
        return driver.findElement(confirmationRegistrationMessage).getText();
    }
}
