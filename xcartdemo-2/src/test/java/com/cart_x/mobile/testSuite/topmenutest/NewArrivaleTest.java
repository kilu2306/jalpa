package com.cart_x.mobile.testSuite.topmenutest;

import com.cart_x.mobile.pages.HomePage;
import com.cart_x.mobile.pages.topmenu.NewArrivalPage;
import com.cart_x.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewArrivaleTest extends TestBase {
    HomePage homePage = new HomePage();
    NewArrivalPage newArrivalPage = new NewArrivalPage();

    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully() {
        homePage.clickOnNewArrivalField();
        newArrivalPage.gettingTextFromNewArriavlFiedl();
        String expactedtext = "New arrivals";
        String actualtext = newArrivalPage.gettingTextFromNewArriavlFiedl();
        Assert.assertEquals(actualtext, expactedtext, "verify text");
    }
}