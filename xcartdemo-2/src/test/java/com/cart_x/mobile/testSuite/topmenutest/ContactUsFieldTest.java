package com.cart_x.mobile.testSuite.topmenutest;

import com.cart_x.mobile.pages.HomePage;
import com.cart_x.mobile.pages.topmenu.ContactUsPage;
import com.cart_x.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUsFieldTest extends TestBase {
    HomePage homePage = new HomePage();
    ContactUsPage contactUsPage = new ContactUsPage();

    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully() {
    homePage.clickOnContactUsField();
    String expactedText="Contact us";
    String actualText= contactUsPage.gettingtextFromContactUsField();
    //to verify text for contact us field
        Assert.assertEquals(actualText,expactedText,"verifytext");
    }
}