package pages;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
// import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;
    Actions builder;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    
    // wait = new WebDriverWait(driver, Duration.ofSeconds(5,1));
    // wait.until(ExpectedConditions.visibilityOf(username));

    @FindBy(name="username")
    WebElement username;
    @FindBy(name="//div[@class='login-step-start__register']//a")
    WebElement registerButton;
    @FindBy(xpath="//button[@type='submit']")
    WebElement loginButton;
    @FindBy(xpath="//div[@aria-checked='false']")
    WebElement disableRememberMe;
    @FindBy(xpath="//div[@aria-checked='true']")
    WebElement enableRememberMe;

    @FindAll({
        @FindBy(css = ".password-input__input-box"),
    })List<WebElement> pinElementsTxt;

    /**Add Pin Code function
     * pinElements param is get elements on Web
     * pin param is value which user inputs
     * 
     **/

    public void addPinCode(String pin, List<WebElement> pinElements ) {
        try {
            Thread.sleep(3000);
            String strArray[] = pin.split("");
            for(int i = 0; i < pinElements.size(); i++ )
            {
                for(int j = 0; j < strArray.length; j++ ){
                    wait.until(ExpectedConditions.visibilityOf(pinElements.get(i)));
                    pinElements.get(i).sendKeys(strArray[j]);
                    // builder.sendKeys(pinElements.get(i), strArray[j]).build().perform();
                    Thread.sleep(1000);
                    System.out.println("Pin Code " + i + "added successfully");
                    continue;
                }
            }
            
            System.out.println("Pin Code " + pin + " added successfully");
            wait = new WebDriverWait(driver, Duration.ofSeconds(2));

        } catch (Exception e) {
            System.err.println("Failed to add Pin Code"+ e);
        }
        
    }

    //Login Aspire function
    public void loginAspire(String usernameAspire, String pinCode) {
        //Waiting check 
        try {
            Thread.sleep(3000);
            
        } catch (InterruptedException e) {
            System.out.println("Browser could not open:" + e);
        }

        builder = new Actions(driver);
        
        builder.sendKeys(username, usernameAspire).build().perform();
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        System.out.println("Browser could not open:2");

        builder.click(loginButton).build().perform();
        wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        System.out.println("Browser could not open:3");
        
        //Add Pin Code
        this.addPinCode(pinCode, pinElementsTxt);
    }

    public void validateTitle(String expectedTitle) {

        String ActualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, ActualTitle);
        System.out.println("The page " + expectedTitle + " displays");

    }
    

    public String randomFullName(String test) {
        String fullName = "";

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        while (fullName.length() < 10) {
            int character = (int) (Math.random() * 10);

            fullName += alphabet.substring(character, character + 1);
            fullName += " ";
        }

        return fullName;
        
    }
    public String randomEmail(String domain) {
        
        String emailAddress = "";

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        int character = (int) (Math.random() * 10);
    
        emailAddress += alphabet.substring(character, character + 1);

        emailAddress += Integer.valueOf((int) (Math.random() * 99)).toString();

        emailAddress += "@" + domain;
        return emailAddress;
        
    }


}
