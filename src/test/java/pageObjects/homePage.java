package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage extends basePage {

    public homePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".fa.fa-phone")
    WebElement phone;

    @FindBy(css = ".fa.fa-user")
    WebElement account;

    @FindBy(xpath = "(//i[@class='fa fa-heart'])[1]")
    WebElement wishList;

    @FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[1]")
    WebElement shoppingCart;
    @FindBy(xpath = "//i[@class='fa fa-share']")
    WebElement checkoutCart;

    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement register;

    @FindBy(xpath = "//a[normalize-space()='Login']")
    WebElement login;

    public void clickOnMyAccount() {
        account.click();
    }

    public void clickOnRegistration() {
        register.click();
    }

    public void clickOnLogin() {
        login.click();
    }

}
