package com.cart_x.mobile.pages;

import com.cart_x.mobile.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By hotedealFiled=By.xpath("//ul[contains(@class,'nav')]");
    By saleFiled=(By.linkText("Sale"));
    By bestseller=By.xpath("//ul[@class='nav navbar-nav top-main-menu']/descendant::span[@class='primary-title']//following::ul/descendant::span[contains(text()," +
            "'Bestse')]");
    By shippingField=By.xpath("//li[@class='leaf']/child::a/following::span[contains(text(),'Shipping')]");
    By newArrivalField=By.xpath("//ul[contains(@class,'nav')]/descendant::span[text()='New!']");
    By comingSoonField=By.xpath("//ul[contains(@class,'nav')]/descendant::span[contains(text(),'Coming soon')]");
    By contactUsFiled= By.xpath("//ul[contains(@class,'nav')]/descendant::span[contains(text(),'Contact us')]");

    public void mouseHoverOnHotelDeal(){
        mouseHoverToElement(hotedealFiled);
    }
    public void clickOnSale(){
        clickOnElement(saleFiled);
    }
    public void clickOnBestSeller(){
        clickOnElement(bestseller);
    }
   public void clickingOnShippingField(){
        clickOnElement(shippingField);
   }
   public void clickOnNewArrivalField(){
        clickOnElement(newArrivalField);
   }
   public void clickOnCommingSoonField(){
        clickOnElement(comingSoonField);
   }
   public void clickOnContactUsField(){
        clickOnElement(contactUsFiled);
   }
}
