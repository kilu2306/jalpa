package com.cart_x.mobile.pages.shopping;

import com.cart_x.mobile.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {
    By message = By.xpath("//h3[contains(text(),'Log in to your account')]");
    By emailField = By.xpath("//input[@id='email']");
    By continueButton = By.xpath("//button[contains(@class,'continue-button submit')]");
    By secureMessagefield = By.xpath("//h1[contains(@class,'title')]");
    By firstName=By.xpath("//input[@id='shippingaddress-firstname']");
    By lastName=By.xpath("//input[@id='shippingaddress-lastname']");
    By address=By.xpath("//input[@id='shippingaddress-street']");
    By city=By.xpath("//input[@id='shippingaddress-city']");
    By country=By.xpath("//select[@id='shippingaddress-country-code']");
    By statename=By.xpath("//input[@id='shippingaddress-custom-state']");
    By zipCode=By.xpath("//input[@id='shippingaddress-zipcode']");
    By checkBox=(By.id("create_profile"));
    By passWord=By.id("password");
    By localDelivery=By.id("method128");
    By cod=By.id("pmethod6");
    By totalSum=By.xpath("//button[contains(@type,'submit')]/child::span[contains(text(),' $312.04')]");
    By placeOrderButton=By.xpath("//button[contains(@type,'submit')]/child::span[contains(text(),' $312.04')]");
    public String gettingMsgAfterCheckout() {
        return getTextFromElement(message);
    }

    public void enterInEmailField(String name) {
        sendTextToElement(emailField, name);
    }

    public void clickOnContinue() {
        clickOnElement(continueButton);
    }

    public String gettingSecureMsg() {
return  getTextFromElement(secureMessagefield);
    }
    public void enterMessageInFirstName(String name ){
        sendTextToElement(firstName,name);
    }
    public void enterLastName(String name ){
        sendTextToElement(lastName, name);
    }
    public void enterAdress(String street){
        sendTextToElement(address,street);
    }
    public void enterCity(String cityname){
        sendTextToElement(city,cityname);
    }
    public void enterCountry(String number){
        sendTextToElement(country, number);
    }
    public void enterStateName(String stateName){
        sendTextToElement(statename , stateName);

    }
    public void enterZipcode(String number){
        sendTextToElement(zipCode, number);
    }
    public void clickOnCheckBox(){
        clickOnElement(checkBox);
    }
    public void enterPassword(String number){
        sendTextToElement(passWord,number);
    }
    public  void  clickOnLocalDelivery(){
        clickOnElement(localDelivery);
    }
    public void clickOnCod(){
        clickOnElement(cod);
    }
    public String gettextFromTotalsum(){
        return getTextFromElement(totalSum);
    }
    public void clickOnPlaceOrderButton(){
        clickOnElement(placeOrderButton);
    }

}
