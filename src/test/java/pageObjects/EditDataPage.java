package pageObjects;

import org.openqa.selenium.By;

public class EditDataPage extends ProfilePage {
    private final static By bankAccountInput = By.id("bank_account");
    private final static By passwordInput = By.id("password");
    private final static By passwordRepeatInput = By.id("passwordRepeat");
    private final static By editUserDataButton = By.xpath("//button[contains(text(),'Zapisz zmiany')]");
    private final static By confirmationEditDataMessage = By.xpath("//div[@class='form-container flex-col text-xl text-first items-center text-center my-10']");


    public void fillInputsWithData(String bankAccount, String password) {
        driver.findElement(bankAccountInput).sendKeys(bankAccount);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(passwordRepeatInput).sendKeys(password);
    }

    public void clickOnSaveChangesButton() {
        driver.findElement(editUserDataButton).click();
    }

    public String getConfirmationMessageEditProfileData() throws InterruptedException {
        Thread.sleep(1000);
        return driver.findElement(confirmationEditDataMessage).getText();
    }
}
