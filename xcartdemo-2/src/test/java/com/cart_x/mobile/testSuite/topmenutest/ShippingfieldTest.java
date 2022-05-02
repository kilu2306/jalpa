package com.cart_x.mobile.testSuite.topmenutest;

import com.cart_x.mobile.pages.HomePage;
import com.cart_x.mobile.pages.topmenu.ShipingPage;
import com.cart_x.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShippingfieldTest extends TestBase {
    HomePage homePage = new HomePage();
    ShipingPage shipingPage = new ShipingPage();

    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully() {
        homePage.clickingOnShippingField();
        String expactedtext = "Shipping";
        String actualText = shipingPage.gettingShippingFieldText();
        Assert.assertEquals(actualText, expactedtext, "verifyText");

    }

}
