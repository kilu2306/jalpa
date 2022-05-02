package com.cart_x.mobile.testSuite.topmenutest;

import com.cart_x.mobile.pages.HomePage;
import com.cart_x.mobile.pages.topmenu.CommingSoonPage;
import com.cart_x.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CommingsoonFieldTest extends TestBase {
    HomePage homePage = new HomePage();
    CommingSoonPage commingSoonPage = new CommingSoonPage();

    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully() {
        homePage.clickOnCommingSoonField();
        String expactedTest = "Coming soon";
        String actualText = commingSoonPage.gettingTextFromCommingSoonField();
        //verify text for shipping field
        Assert.assertEquals(actualText, expactedTest, "verify text");

    }
}