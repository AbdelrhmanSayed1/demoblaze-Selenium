package TestPackage;

import Pages.ContactUsPage;
import com.shaft.driver.SHAFT;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FillingContactUsForm extends TestBase{

    ContactUsPage contactUsObj;


    @Test
    public void FillContactUsFormWithValidData(){
        contactUsObj =new ContactUsPage(driver);
        contactUsObj.PressOnContactUs();
        contactUsObj.FillContactUsForm("Ahmed1@gmail.com","Ahmed","Message");
        Assert.assertEquals(contactUsObj.alertText, "Thanks for the message!!");

    }
}
