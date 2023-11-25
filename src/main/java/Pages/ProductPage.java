package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;

public class ProductPage extends PageBase{
    public ProductPage(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }

    By addToCartBttn = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");
    Alert alert;
    public String alertText;

    public void pressOnAddToCart(){

        driver.element().click(addToCartBttn);
        alert = driver.getDriver().switchTo().alert();
        alertText = alert.getText();
    }
}
