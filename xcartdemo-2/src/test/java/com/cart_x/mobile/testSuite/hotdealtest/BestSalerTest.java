package com.cart_x.mobile.testSuite.hotdealtest;

import com.cart_x.mobile.pages.BestSellerPage;
import com.cart_x.mobile.pages.HomePage;
import com.cart_x.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BestSalerTest extends TestBase {
    HomePage homePage = new HomePage();
    BestSellerPage bestSellerPage = new BestSellerPage();

    @Test
    public void verifyBestSellersProductsArrangeByZToA() throws InterruptedException {
        homePage.mouseHoverOnHotelDeal();
        Thread.sleep(1000);
        homePage.clickOnBestSeller();
        String expactedText = "Bestsellers";
        String actualText = bestSellerPage.getTextFromBestsellerField();
        Assert.assertEquals(actualText,expactedText,"verify text");
        bestSellerPage.gettingBeforefilterZToAText();
        bestSellerPage.mouseHoverOnSortByField();
        Thread.sleep(1000);
        bestSellerPage.clickOnzToAFilter();
        bestSellerPage.gettingAfterfilterZToAText();
        Thread.sleep(1000);
        Assert.assertEquals(bestSellerPage.gettingBeforefilterZToAText(), bestSellerPage.gettingAfterfilterZToAText(), "verify list");


    }
    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow() throws InterruptedException {
        homePage.mouseHoverOnHotelDeal();
        Thread.sleep(1000);
        homePage.clickOnBestSeller();
        String expactedText = "Bestsellers";
        String actualText = bestSellerPage.getTextFromBestsellerField();
        //verifying text bestseller text
        Assert.assertEquals(actualText, expactedText, "verify text");
        bestSellerPage.gettingBeforHighToLowPriceList();
        System.out.println("this is before filterhigh to low price list"+bestSellerPage.gettingBeforHighToLowPriceList());
        bestSellerPage.mouseHoverOnSortByField();
        bestSellerPage.clickOnHightToLowPriceFiler();
        bestSellerPage.gettingAfterHighToLowPriceList();
        System.out.println("this is after filter high lo low price list"+ bestSellerPage.gettingAfterHighToLowPriceList());
        Thread.sleep(1000);
        Assert.assertEquals(bestSellerPage.gettingBeforHighToLowPriceList(), bestSellerPage.gettingAfterHighToLowPriceList(),"verify product list after and before using filter high to low  ");

    }


    }


