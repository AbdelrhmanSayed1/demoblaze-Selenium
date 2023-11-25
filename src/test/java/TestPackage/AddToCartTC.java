package TestPackage;

import Pages.HomePage;
import Pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTC extends TestBase{


    HomePage homeObj;
    ProductPage productObj;

    @Test
    public void AddingPhoneToCart(){
        homeObj = new HomePage(driver);
        homeObj.PressOnPhoneCategory();
        homeObj.PressOnFirstCard();
        productObj = new ProductPage(driver);
        productObj.pressOnAddToCart();
        Assert.assertEquals(productObj.alertText, "Product added");


    }
}
