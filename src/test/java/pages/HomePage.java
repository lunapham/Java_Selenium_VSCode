package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class HomePage {
    WebDriver driver;
    WebDriverWait wait;

    Actions builder;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='/sg/dashboard/settings/']")
    WebElement moreMenu;
    
    @FindBy(xpath = "//img[@src='img/common/labels/key.svg']")
    WebElement usersAndaccessItem;
    @FindBy(xpath = "//img[@src='img/common/plus-white.svg']")
    WebElement newUser;
    @FindBy(xpath = "//*[contains(text(),'Who do you want to invite?')]")
    WebElement titleNewUser;


    
    public void navigateToNewUser() {
        try {
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            System.out.println("Browser could not open:" + e);
        }

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        builder = new Actions(driver);

        String curr = driver.getWindowHandle();
        System.out.println("Get Windows: " + curr);

        wait.until(ExpectedConditions.visibilityOf(moreMenu));
        moreMenu.click();
        System.out.println("== Click on More Menu");

        //Click on User and Access Control
        wait.until(ExpectedConditions.visibilityOf(usersAndaccessItem));
        usersAndaccessItem.click();
        System.out.println("== Click on User And Access item");

        newUser.click();
        System.out.println("== Click on New User button");

    }


}