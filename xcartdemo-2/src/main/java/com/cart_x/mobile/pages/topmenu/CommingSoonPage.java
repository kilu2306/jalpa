package com.cart_x.mobile.pages.topmenu;

import com.cart_x.mobile.utility.Utility;
import org.openqa.selenium.By;

public class CommingSoonPage extends Utility {
    By commingsoonField=By.xpath("//h1[@id='page-title']");
    //method for getting text from comming soon field
    public String gettingTextFromCommingSoonField(){
        return getTextFromElement(commingsoonField);
    }

}
