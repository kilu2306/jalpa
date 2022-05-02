package com.cart_x.mobile.pages.topmenu;

import com.cart_x.mobile.utility.Utility;
import org.openqa.selenium.By;

public class NewArrivalPage extends Utility {
    By newArraivalField=By.xpath("//h1[@id='page-title']");

    public String gettingTextFromNewArriavlFiedl(){
        return getTextFromElement(newArraivalField);
    }
}
