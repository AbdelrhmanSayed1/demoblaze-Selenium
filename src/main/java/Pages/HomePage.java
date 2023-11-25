package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class HomePage extends PageBase{
    public HomePage(SHAFT.GUI.WebDriver driver) {
        super(driver);

    }
    By phoneCategories = By.xpath("//*[@onclick=\"byCat('phone')\"]");
    By firstSelection= By.xpath("//*[@id=\"tbodyid\"]/div[1]");


    public void PressOnPhoneCategory(){
        driver.element().click(phoneCategories);
    }

    public void PressOnFirstCard(){
        driver.element().click(firstSelection);
    }




}
