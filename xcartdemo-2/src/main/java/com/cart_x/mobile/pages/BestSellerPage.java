package com.cart_x.mobile.pages;

import com.cart_x.mobile.utility.Utility;
import org.openqa.selenium.By;

import java.util.List;

public class BestSellerPage extends Utility {
    By bestSellerTextField = By.xpath("//h1[@id='page-title']");
    By beforeZtoAFilterList =By.xpath("//ul[contains(@class,'products')]/descendant::h5");
    By afterZtoAFilterList =By.xpath("//ul[contains(@class,'products')]/descendant::h5");
    By sortBylistFiled=By.xpath("//span[contains(text(),'Sort by:')]");
    By ztoAFiled=(By.xpath("//a[@data-sort-by='translations.name'and@data-sort-order='desc']"));
    By highToLowPriceField=By.xpath("//a[@data-sort-by='p.price' and @data-sort-order='desc']");
    By productListBeoforHighToLowPrice=By.xpath("//li[contains(@class,'product-price-base')]");
    By productListAfterHighToLowPrice=By.xpath("//li[contains(@class,'product-price-base')]");
    By atoZFiled=By.xpath("//a[@data-sort-by='translations.name' and @data-sort-order='asc']");
    By astroA50HaloEditionImageField=By.xpath("//div[@class='product-photo']/descendant::img[contains(@alt,'Astro A50 Halo Edition')]");
    By addToCartField=  By.xpath("//button[contains(@class,'productid-30')]");
    By productAddedmessageFiled=By.xpath("//li[contains(text(),'Product has been added to your cart')]");
    By proAddedMessageClose=By.xpath("//div[@id='status-messages']/child::a[@class='close']");
    By yourCartField=By.xpath("//div[@title='Your cart']");
    By viewCartField=By.xpath("//a[contains(@class,'regular-button cart')]/child::span");

    public String getTextFromBestsellerField() {
        return getTextFromElement(bestSellerTextField);
    }
    public String gettingBeforefilterZToAText(){
        return  beforFilteringZtoA(beforeZtoAFilterList);

    }
    public String gettingAfterfilterZToAText(){
        return  afterFilteringZtoA(afterZtoAFilterList);

    }
    public void  mouseHoverOnSortByField(){
        mouseHoverToElement(sortBylistFiled);
    }
    public void clickOnzToAFilter(){
        clickOnElement(ztoAFiled);
    }

    public List<Double> gettingBeforHighToLowPriceList(){
        return beforFilterPriceList(productListBeoforHighToLowPrice);

    }
    public List<Double> gettingAfterHighToLowPriceList(){
        return afterFilterProductPriceList(productListAfterHighToLowPrice);
    }
    public void clickOnHightToLowPriceFiler(){
        clickOnElement(highToLowPriceField);
    }
    public void clickOnAToZfield(){
        clickOnElement(atoZFiled);
    }
    public void mouseHoeverToAstroA50Image(){
        mouseHoverToElement(astroA50HaloEditionImageField);
    }
    public void clickOnAddToCartField(){
        clickOnElement(addToCartField);
    }
    public String getTextFromProductAddedFiled(){
        return getTextFromElement(productAddedmessageFiled);
    }
    public void closingProductAddedmessage(){
        clickOnElement(proAddedMessageClose);
    }
    public void clickOnYourCart(){
        clickOnElement(yourCartField);

    }
    public void clickOnViewCart(){
        clickOnElement(viewCartField);
    }
}
