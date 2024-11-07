package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.homePage;
import pageObjects.login;
import pageObjects.myAccountPage;

public class LoginTest extends baseClass {

    homePage hp;
    myAccountPage myAccountPage;
    login Login;
    myAccountPage accountPage;

    @Test
    public void verify_login() throws InterruptedException {
        try {
            logger.info("Starting login test");
            hp = new homePage(driver);

            hp.clickOnMyAccount();
            hp.clickOnLogin();

            Login = new login(driver);
            Login.setEmail(properties.getProperty("email"));
            Login.setPassword(properties.getProperty("password"));
            Login.clickOnLoginButton();

            accountPage = new myAccountPage(driver);
            Assert.assertTrue(accountPage.accountHeaderTextIsDisplayed(), "Account page is not displayed");
        } catch (Exception e) {
            Assert.fail();
        }
        logger.info("Finished Login test");
    }


}
