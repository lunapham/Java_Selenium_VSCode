package utility;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;


public class BrowserFactory {
    
    public static WebDriver startWebsite(WebDriver driver, String browserName, String appURL) {
        if (browserName.equals("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equals("Firefox")) {
            driver = new FirefoxDriver();
        }else {
            System.out.println("We do not support this browser");
        }

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get(appURL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }
    
    public static void quitBrowser(WebDriver driver) {
        driver.quit();
    }
    
}
