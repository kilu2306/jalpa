package com.cart_x.mobile.pages.shopping;

import com.cart_x.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ViewCartPage extends Utility {
    By cartMessageField=By.xpath("//h1[contains(@id,'page-title')]");
    By subTotalField= By.xpath("//ul[@class='sums']/li[1]/child::span/descendant::span[@class='surcharge-cell']/child::span");
    By totalField=By.xpath("//li[@class='total']/descendant::span[contains(@class,'surcharge-cell')]/child::span");
    By checkOutFeild=By.xpath("//li[contains(@class,'button main-button')]/descendant::span");
    By  emptyCartField=By.xpath("//a[contains(text(),'Empty your cart')]");
    By itemDeletedMessageFeild=By.xpath("//li[contains(text(),'Item(s) deleted from your cart')]");
    By cartEmptyMessageField=By.xpath("//h1[contains(text(),'Your cart is empty')");

    public String getTextFromCartMessageField(){
        return getTextFromElement(cartMessageField);
    }
    public String gettingSubToal(){
        List<WebElement> totalPriceList = driver.findElements(subTotalField);
        StringBuilder strbul1 = new StringBuilder();
        for (WebElement str : totalPriceList) { // append all the list in strbul
            strbul1.append(str.getText());
        }
        String totalSum = strbul1.toString();
        return totalSum;
    }
    public String GettingtotalAmount(){
        List<WebElement> totalPriceList = driver.findElements(totalField);
        StringBuilder strbul1 = new StringBuilder();
        for (WebElement str : totalPriceList) { // append all the list in strbul
            strbul1.append(str.getText());
        }
        String totalSum = strbul1.toString();
        return totalSum;
    }
    public void clickOnCheckOutButton(){
        clickOnElement(checkOutFeild);
    }
    public void clickOnEmptyCart(){
        clickOnElement(emptyCartField);
    }
    public String getMessageFromItemDeletedField(){
        return getTextFromElement(itemDeletedMessageFeild);
    }
    public String getMessageFromCartEmptyField(){
        return getTextFromElement(cartEmptyMessageField);
    }
}
