package com.cart_x.mobile.pages;

import com.cart_x.mobile.utility.Utility;
import org.openqa.selenium.By;

public class SalePage extends Utility {
    By saleTextFiled=By.linkText("Sale");
    By sortByFiled=By.xpath("//span[contains(text(),'Recommended')]");
    By A_ZFiled=By.xpath("//a[@data-sort-by='translations.name' and @data-sort-order='asc']");
    By productStartingName=By.xpath("//a[contains(text(),'Avengers: ')]");
    By priceLowHighfield=By.xpath("//a[@class='fn url next-previous-assigned']");
    public String getTextFromSaleTextFiled(){
        return getTextFromElement(saleTextFiled);
    }
    public void mouseHoverOnSortByfield(){
        mouseHoverToElementAndClick(saleTextFiled);
    }
    public void clickOnA_zFiled(){
        clickOnElement(A_ZFiled);
    }
    public String gettextFromProductname(){
        return getTextFromElement(productStartingName);
    }

}
