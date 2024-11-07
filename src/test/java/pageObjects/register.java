package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class register extends basePage {

    WebDriver driver;

    public register(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#input-firstname")
    WebElement firstName;
    @FindBy(css = "#input-lastname")
    WebElement lastName;
    @FindBy(css = "#input-email")
    WebElement email;
    @FindBy(css = "#input-telephone")
    WebElement telephone;
    @FindBy(css = "#input-password")
    WebElement password;
    @FindBy(css = "#input-confirm")
    WebElement confirmPassword;
    @FindBy(css = "input[type='submit']")
    WebElement continueBtn;
    @FindBy(css = "input[value='1'][name='agree']")
    WebElement agreeChk;
    @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
    WebElement accountCreatedTxt;
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueBtnAfterAccountCreation;


    public void setFirstName(String firstname) {
        firstName.sendKeys(firstname);
    }

    public void setLastName(String lastname) {
        lastName.sendKeys(lastname);
    }

    public void setEmail(String emailAddress) {
        email.sendKeys(emailAddress);
    }

    public void setTelephone(String phone) {
        telephone.sendKeys(phone);
    }

    public void setPassword(String pass) {
        password.sendKeys(pass);
    }

    public void setConfirmPassword(String pass) {
        confirmPassword.sendKeys(pass);
    }

    public void clickOnAgree() {
        agreeChk.click();
    }

    public void clickOnContinueButton() {
        waitForElementToBeClickable(continueBtn);
        continueBtn.click();
    }

    public String getAccountCreatedText() {
        try {
            return accountCreatedTxt.getText();
        } catch (Exception e) {
            return e.getMessage();

        }
    }

    public void clickOnContinueAfterAccountCreation() {
        continueBtnAfterAccountCreation.click();
    }


}

