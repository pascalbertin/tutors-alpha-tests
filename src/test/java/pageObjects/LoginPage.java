package pageObjects;

import org.openqa.selenium.By;

public class LoginPage extends HomePage {
    private final static By userNameLoginInput = By.id("username");
    private final static By emailLoginInput = By.id("email");
    private final static By passwordLoginInput = By.id("password");
    private final static By submitLoginButton = By.xpath("//button[@type='submit']");
    private final static By confirmationLoginMessage = By.xpath("//div[@class='form-container flex-col text-xl text-first items-center text-center my-10']");


    public void setAllLoginFormInputs(
            String userName,
            String email,
            String password)
    {
        driver.findElement(userNameLoginInput).sendKeys(userName);
        driver.findElement(emailLoginInput).sendKeys(email);
        driver.findElement(passwordLoginInput).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(submitLoginButton).click();
    }

    public String getConfirmationMessageAfterLogin() throws InterruptedException {
        Thread.sleep(1000);
        return driver.findElement(confirmationLoginMessage).getText();
    }
}
