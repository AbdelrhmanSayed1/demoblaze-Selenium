package Pages;

import com.shaft.driver.SHAFT;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;

public class LoginPage extends PageBase{
    public LoginPage(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }

    By loginSection = By.id("login2");
    By userNameField = By.id("loginusername");
    By passwordField = By.id("loginpassword");

    By loginBttn = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
    public By welcomeMessage = By.id("nameofuser");

    public void PressingOnLogin(){
        driver.element().click(loginSection);
    }

    public void LoginWithValidCredentials(String userName, String password){

        driver.element().type(userNameField,userName)
                .type(passwordField,password)
                .click(loginBttn);
    }

}
