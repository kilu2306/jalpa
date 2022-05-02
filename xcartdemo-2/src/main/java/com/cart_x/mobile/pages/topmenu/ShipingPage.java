package com.cart_x.mobile.pages.topmenu;

import com.cart_x.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ShipingPage extends Utility {
    By shippingFiledText=By.xpath("//h1[@id='page-title']");
    public String gettingShippingFieldText(){
        return getTextFromElement(shippingFiledText);
    }
}
