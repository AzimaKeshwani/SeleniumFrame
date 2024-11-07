package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.homePage;
import pageObjects.register;

public class AccountRegistrationTest extends baseClass {
    homePage home;
    register registration;

    @Test
    public void verify_account_creation() {
        try {
            logger.info("Starting Account Creation");

            home = new homePage(driver);
            home.clickOnMyAccount();
            home.clickOnRegistration();

            registration = new register(driver);
            registration.setFirstName(randomString().toUpperCase());
            registration.setLastName(randomString().toUpperCase());
            registration.setEmail(randomString() + "@gmail.com");
            registration.setTelephone(randomNumber());

            String password = randomAlphaNumeric();
            registration.setPassword(password);
            registration.setConfirmPassword(password);
            registration.clickOnAgree();
            registration.clickOnContinueButton();

            String confirmationText = registration.getAccountCreatedText();
            if (confirmationText.equals("Your Account Has Been Created!")) {
                logger.debug("Account creation successful");
                Assert.assertTrue(true);
            } else {
                logger.error("Test account creation failed. Expected confirmation text, but got: " + confirmationText);
                Assert.fail("Account creation failed. Confirmation text mismatch.");
            }

        } catch (Exception e) {
            // Log exception if caught
            logger.error("An exception occurred during account creation: " + e.getMessage(), e);
            Assert.fail("Test failed due to an exception.");
        } finally {
            logger.info("Finished Account creation process.");
        }
    }


}
