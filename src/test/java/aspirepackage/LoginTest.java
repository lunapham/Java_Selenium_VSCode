package aspirepackage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends WorldClass {

    @Test
    public void loginWebsite() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.loginAspire("+84989677728", "135790");
        loginPage.validateTitle("Home0 | Aspire");
    }
    
    //Add Director with Admin role
    
    
}