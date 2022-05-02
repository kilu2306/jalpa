package com.cart_x.mobile.pages.topmenu;

import com.cart_x.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ContactUsPage extends Utility {
    By contactUsField=By.xpath("//h1[@id='page-title']");
    //getting text from contactus field
    public String gettingtextFromContactUsField(){
       return getTextFromElement(contactUsField);
    }
}
