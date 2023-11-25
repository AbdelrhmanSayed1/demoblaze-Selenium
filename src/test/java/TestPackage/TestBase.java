package TestPackage;

import com.shaft.driver.SHAFT;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    public String URL = "https://www.demoblaze.com/#";
    public static SHAFT.GUI.WebDriver driver;

    @BeforeSuite
    public void SetupDriver() throws InterruptedException {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL(URL);
    }

}
