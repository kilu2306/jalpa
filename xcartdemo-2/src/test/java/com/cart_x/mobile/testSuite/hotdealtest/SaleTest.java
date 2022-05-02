package com.cart_x.mobile.testSuite.hotdealtest;

import com.cart_x.mobile.pages.HomePage;
import com.cart_x.mobile.pages.SalePage;
import com.cart_x.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SaleTest extends TestBase {
    HomePage homePage= new HomePage();
    SalePage salePage=new SalePage();
    @Test
    public void verifySaleProductsArrangeAlphabetically(){
        homePage.mouseHoverOnHotelDeal();
        homePage.clickOnSale();
        salePage.mouseHoverOnSortByfield();
        salePage.clickOnA_zFiled();
        String expactedStartingText="A";
        String actualText=salePage.gettextFromProductname().substring(0,1);
        Assert.assertEquals(actualText,expactedStartingText,"verify product list starting alphabet");
    }
    @Test
    public void verifySaleProductsPriceArrangeLowToHigh(){
        homePage.mouseHoverOnHotelDeal();
        homePage.clickOnSale();
        salePage.mouseHoverOnSortByfield();

    }
    @Test
    public void verifyBestSellersProductsArrangeByZToA(){

    }
}
