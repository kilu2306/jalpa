package com.cart_x.mobile.testSuite.shoppingtest;

import com.cart_x.mobile.pages.BestSellerPage;
import com.cart_x.mobile.pages.HomePage;
import com.cart_x.mobile.pages.shopping.CheckOutPage;
import com.cart_x.mobile.pages.shopping.ViewCartPage;
import com.cart_x.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShopingTest extends TestBase {
    HomePage homePage = new HomePage();
    BestSellerPage bestSellerPage = new BestSellerPage();
    ViewCartPage viewCartPage= new ViewCartPage();
    CheckOutPage checkOutPage= new CheckOutPage();

    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForAstroA50HaloEdition() throws InterruptedException {
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
        //verify subtotal $299.99
        String expactedPrice="$299.99";
        String actualPrice=viewCartPage.gettingSubToal();
        Assert.assertEquals(actualPrice,expactedPrice, "verify subtotalprice");
        //verify total
        String expactedtotal="$312.04";
        String actualTotal= viewCartPage.GettingtotalAmount();
        Assert.assertEquals(actualPrice,expactedPrice,"verify total");
        viewCartPage.clickOnCheckOutButton();
        //verify messag after clicking on checkout button
        String expactedMessage="Log in to your account";
        String actualMessage= checkOutPage.gettingMsgAfterCheckout();
        Assert.assertEquals(actualMessage,expactedMessage,"verify message ");
        checkOutPage.enterInEmailField("prime123@gmail.com");
        //click o continue
        checkOutPage.clickOnContinue();
        String expactedMessage1="Secure Checkout";
        String actualMessage1= checkOutPage.gettingSecureMsg();
        Assert.assertEquals(actualMessage,expactedMessage,"verify text");
        //filling data
        checkOutPage.enterMessageInFirstName("dhyani");
        checkOutPage.enterLastName("patel");
        checkOutPage.enterAdress("34 ramnagar soci");
        checkOutPage.enterCity("surat");
        checkOutPage.enterCountry("india");
        checkOutPage.enterStateName("gujrat");
        checkOutPage.enterZipcode("908763");
        checkOutPage.clickOnCheckBox();
        checkOutPage.enterPassword("prime123");
        //click on local delivery
        checkOutPage.clickOnLocalDelivery();
        //click on cod
        checkOutPage.clickOnCod();
        String expactedTotalSum="$312.14";
        String actualTotalSum= checkOutPage.gettextFromTotalsum();
        Assert.assertEquals(actualTotalSum,expactedTotalSum, "verify total sum");
//click on place order
        checkOutPage.clickOnPlaceOrderButton();

    }

}