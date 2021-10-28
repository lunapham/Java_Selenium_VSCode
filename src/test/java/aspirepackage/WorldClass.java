package aspirepackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utility.BrowserFactory;

public class WorldClass {
    public WebDriver driver;

    @BeforeClass
    public void setup() {
        try {
            driver = BrowserFactory.startWebsite(driver, "Chrome",
                "https://feature-qa-automation.customer-frontend.staging.aspireapp.com/sg/");
            System.out.println(driver.getTitle());
            Thread.sleep(10000);

        } catch (Exception e) {
            System.out.println("The website could not open!"+ e);
        }
        
    }

    @AfterClass
    public void tearDown() {
    
        BrowserFactory.quitBrowser(driver);
    }
}
