
package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class UsersPage {
    WebDriver driver;
    Actions builder;
    WebDriverWait wait;

    public UsersPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//img[@src='img/common/plus-white.svg']")
    WebElement newUserBtn;

    @FindBy(xpath = "//input[@placeholder = 'Enter user’s first and last name']")
    WebElement fullNameTxt;

    @FindBy(xpath = "//input[@placeholder = 'Provide user’s email address']")
    WebElement emailTxt;

    @FindBy(xpath = "//div[text()='Director (according to ACRA)']")
    WebElement directorRadio;

    @FindBy(xpath = "//div[text()='Non-director']")
    WebElement nonDirectorRadio;

    @FindBy(xpath = "//span[@class='block']")
    WebElement chooseBtn;
    

    
    
    public void selectRoleCompany(String role) {

        if (role.equals("Drirector")) {
            wait.until(ExpectedConditions.visibilityOf(directorRadio));
            directorRadio.click();
            System.out.println("== Select Director radio to Role Company");
        } else if (role.equals("Non Drirector")) {
            wait.until(ExpectedConditions.visibilityOf(nonDirectorRadio));
            nonDirectorRadio.click();
            System.out.println("== Select Director radio to Role Company");
        } else {
            System.err.println("The " + role + "radio could not found");
            return;
        }

    }

    
    public void addInfoNewUser(String fullName, String email, String role) {
        //Waiting load website 
        try {
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            System.out.println("Browser could not open:" + e);
        }

        wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        builder = new Actions(driver);

        String currUrl = driver.getCurrentUrl();
        System.out.println("Get current user" + currUrl);

        String curr = driver.getWindowHandle();
        System.out.println("Get current windows" + curr);

        wait.until(ExpectedConditions.visibilityOf(fullNameTxt));
        fullNameTxt.sendKeys(fullName);
        System.out.println("== Add value to Full Name field");

        wait.until(ExpectedConditions.visibilityOf(emailTxt));
        emailTxt.sendKeys(email);
        System.out.println("== Add value to Email field");

        this.selectRoleCompany(role);

        wait.until(ExpectedConditions.visibilityOf(chooseBtn));
        chooseBtn.click();
        System.out.println("== Add value to Email field");

        try {
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            System.out.println("The Browser could not open:" + e);
        }
    }
    

}