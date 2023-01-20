package steps;

import general.Messages;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pageObjects.EditDataPage;

public class EditDataPageSteps {
    EditDataPage editDataPage = new EditDataPage();
    @Then("Fill bank account with {string} and password {string}")
    public void fillInputsWithData(String bankAccount, String password) throws InterruptedException {
        editDataPage.fillInputsWithData(bankAccount, password);
        editDataPage.clickOnSaveChangesButton();
        Thread.sleep(500);
    }

    @Then("User receives edit profile success message")
    public void userIncorrectDataErrorMessage() throws InterruptedException {
        Messages msg = Messages.EDIT_PROFILE_DATA_SUCCESS_MSG;
        boolean ifContains = editDataPage.getConfirmationMessageEditProfileData().contains(msg.getMessage());
        Assert.assertTrue(ifContains);
    }
}
