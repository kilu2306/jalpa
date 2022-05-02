package com.cart_x.mobile.testSuite.shoppingtest;

import com.cart_x.mobile.pages.BestSellerPage;
import com.cart_x.mobile.pages.HomePage;
import com.cart_x.mobile.pages.shopping.ViewCartPage;
import com.cart_x.mobile.testbase.TestBase;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingCartClearTest extends TestBase {
    HomePage homePage = new HomePage();
    BestSellerPage bestSellerPage = new BestSellerPage();
    ViewCartPage viewCartPage = new ViewCartPage();

    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
        homePage.mouseHoverOnHotelDeal();
        Thread.sleep(1000);
        homePage.clickOnBestSeller();
        String expactedText = "Bestsellers";
        String actualText = bestSellerPage.getTextFromBestsellerField();
        //Verify the text "Bestsellers";
        Assert.assertEquals(actualText,expactedText,"verify text");
        //Mouse hover on “Sort By” and select “Name A-Z”
        bestSellerPage.mouseHoverOnSortByField();
        Thread.sleep(2000);
        bestSellerPage.clickOnAToZfield();
        //1.5 Click on “Add to cart” button of the product “Astro A50 halo edition
        Thread.sleep(5000);
        bestSellerPage.mouseHoeverToAstroA50Image();
        bestSellerPage.clickOnAddToCartField();
        //verify product added messsage
        String expactedtext="Product has been added to your cart";
        String actualtext= bestSellerPage.getTextFromProductAddedFiled();
        Assert.assertEquals(actualText,expactedText,"verify text");
        //closing added message
        bestSellerPage.closingProductAddedmessage();
        //clicking on yourcart field
        bestSellerPage.clickOnYourCart();
        Thread.sleep(2000);
        //click on view cart
        bestSellerPage.clickOnViewCart();
        String expactedText1="Your shopping cart - 1 item";
        String actualText1= viewCartPage.getTextFromCartMessageField();
        Assert.assertEquals(actualText,expactedText,"verify text");
    // clear shoppi g cart
        viewCartPage.clickOnEmptyCart();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        //verify item has been deleted message
        String expactedMessage="Item(s) deleted from your cart";
        String actualMessage=viewCartPage.getMessageFromItemDeletedField();
        Assert.assertEquals(actualMessage,expactedMessage,"verify Text");
        //veryfy cart empty message
        String expactedMessage1="Your cart is empty";
        Thread.sleep(2000);
        String actualMessage1=viewCartPage.getMessageFromCartEmptyField();
        Assert.assertEquals(actualMessage1,expactedMessage1,"verify Text");
    }
}