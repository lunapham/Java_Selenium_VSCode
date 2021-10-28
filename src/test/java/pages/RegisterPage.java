package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
    WebDriver driver;
    Actions builder;
    WebDriverWait wait;

    public RegisterPage(WebDriver registerdriver) {
        this.driver = registerdriver;
    }

    @FindBy(name = "full_name")
    WebElement fullName;
    @FindBy(name = "preferred_name")
    WebElement preferred_name;
    @FindBy(name = "email")
    WebElement email;
    @FindBy(xpath = "//div[@class='no-outline']")
    WebElement countryNumber;
    @FindBy(xpath = "//div[text()='Viet Nam (+84)']")
    WebElement selectVietNamCountryNumber;
    @FindBy(xpath = "//input[@name='phone']")
    WebElement phone;
    @FindBy(xpath = "//input[@data-cy='register-person-heard-about']")
    WebElement followSocial;
    @FindBy(xpath = "//div[text()='LinkedIn']")
    WebElement selectLinkedInSocial;
    @FindBy(xpath = "//input[@data-cy='register-person-referral-code']")
    WebElement referralCode;
    @FindBy(xpath = "//div[@data-cy='register-person-privacy']")
    WebElement privacyCheckbox;
    @FindBy(xpath = "//span[text()='Continue']")
    WebElement continueButton;

    

}
