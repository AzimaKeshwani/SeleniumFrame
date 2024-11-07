package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class myAccountPage extends basePage {

    public myAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h2[normalize-space()='My Account']")
    WebElement myAccountHeader;

    public boolean accountHeaderTextIsDisplayed() {
        try {
            return myAccountHeader.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }


}
