package TestPackage;

import Pages.LoginPage;
import org.testng.annotations.Test;

public class LoginHappyTC extends TestBase{

    LoginPage loginObj;

    @Test
    public void loginHappyTC(){
        loginObj = new LoginPage(driver);
        loginObj.PressingOnLogin();
        loginObj.LoginWithValidCredentials("aaaaaaa","aaaaaaa");
        driver.assertThat().element(loginObj.welcomeMessage).isVisible();



    }
}
