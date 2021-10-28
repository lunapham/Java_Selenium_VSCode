package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OTPPage {
    WebDriver driver;

    public OTPPage(WebDriver otpdriver) {
        this.driver = otpdriver;
    }

    // @FindAll(xpath = "//div[@class='digit-input__input flex flex-center text-weight-medium cursor-pointer']")
    // WebElement otp;
    @FindBy(xpath = "//button[@data-cy='verify-otp-request-new']")
    WebElement resendOTP;

    public void addOTPAspire(String usernameAspire, String passwordAspire) {
      
        // username.sendKeys(usernameAspire);
        
    }



}
