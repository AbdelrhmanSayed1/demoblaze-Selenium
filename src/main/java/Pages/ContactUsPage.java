package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class ContactUsPage extends PageBase{


    public ContactUsPage(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }

    By contactUsSection = By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a");
    By emailField = By.id("recipient-email");
    By nameField =By.id("recipient-name");
    By messageField = By.id("message-text");
    By sendBttn = By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]");
    Alert alert;
    public String alertText;

    public void PressOnContactUs(){
        driver.element().click(contactUsSection);
    }
    public void FillContactUsForm(String email, String name, String message){

        driver.element().type(emailField,email)
                .type(nameField,name)
                .type(messageField,message)
                .click(sendBttn);
        alert = driver.getDriver().switchTo().alert();
        alertText = alert.getText();

    }
}
