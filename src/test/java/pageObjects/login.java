package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login extends basePage {

    public login(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='input-email']")
    WebElement emailAddress;

    @FindBy(css = "#input-password")
    WebElement password;

    @FindBy(css = "input[value='Login']")
    WebElement btnLogin;


    public void setEmail(String email) {
        emailAddress.sendKeys(email);
    }

    public void setPassword(String pass) {
        password.sendKeys(pass);
    }

    public void clickOnLoginButton() {
        btnLogin.click();
    }


}

