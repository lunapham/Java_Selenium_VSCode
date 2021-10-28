package aspirepackage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.AccessRolePage;
import pages.HomePage;
import pages.LoginPage;
import pages.UsersPage;

public class AccessRoleTest extends WorldClass {

    //And Director with Admin
    @Test
    public void addUserDirectorWithAdminRole() {
        //Login Account
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.loginAspire("+84989677728", "135790");

        //Navigate to New User
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.navigateToNewUser();

        //Random account
        String email = loginPage.randomEmail("test.com");
        String fullName = loginPage.randomFullName("test");

        //Add info new user
        UsersPage usersPage = PageFactory.initElements(driver, UsersPage.class);
        usersPage.addInfoNewUser(fullName, email, "Director");

        // Add new user with Direct Role - Addmin access role
        AccessRolePage accessRolePage = PageFactory.initElements(driver, AccessRolePage.class);
        accessRolePage.inviteUserofAdmin();
    }

    //Add Director with FinanceRole
    @Test
    public void addUserDirectorWithFinanceRoleUseTranferMethodAndCard() {
        //Login Account
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.loginAspire("+84989677728", "135790");

        //Navigate to New User
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.navigateToNewUser();

        //Random account
        String email = loginPage.randomEmail("test.com");
        String fullName = loginPage.randomFullName("test");

        //Add info new user
        UsersPage usersPage = PageFactory.initElements(driver, UsersPage.class);
        usersPage.addInfoNewUser(fullName, email, "Director");

        // Add new user with Direct Role - Addmin access role
        AccessRolePage accessRolePage = PageFactory.initElements(driver, AccessRolePage.class);
        accessRolePage.inviteUserOfFinance("Tranfer", "Yes");
    }

    //Add Director with FinanceRole
    @Test
    public void addUserDirectorWithFinanceRoleUseTranferMethodAndNoCard() {
        //Login Account
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.loginAspire("+84989677728", "135790");

        //Navigate to New User
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.navigateToNewUser();

        //Random account
        String email = loginPage.randomEmail("test.com");
        String fullName = loginPage.randomFullName("test");

        //Add info new user
        UsersPage usersPage = PageFactory.initElements(driver, UsersPage.class);
        usersPage.addInfoNewUser(fullName, email, "Director");

        // Add new user with Direct Role - Addmin access role
        AccessRolePage accessRolePage = PageFactory.initElements(driver, AccessRolePage.class);
        accessRolePage.inviteUserOfFinance("Tranfer", "No");
    }

    //Add Director with FinanceRole
    @Test
    public void addUserDirectorWithFinanceRoleUseSubmitMethod() {
        //Login Account
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.loginAspire("+84989677728", "135790");

        //Navigate to New User
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.navigateToNewUser();

        //Random account
        String email = loginPage.randomEmail("test.com");
        String fullName = loginPage.randomFullName("test");

        //Add info new user
        UsersPage usersPage = PageFactory.initElements(driver, UsersPage.class);
        usersPage.addInfoNewUser(fullName, email, "Director");

        // Add new user with Direct Role - Addmin access role
        AccessRolePage accessRolePage = PageFactory.initElements(driver, AccessRolePage.class);
        accessRolePage.inviteUserOfFinance("Submit Only", "");
    }

    //Add Director with FinanceRole
    @Test
    public void addUserDirectorWithFinanceRoleUseNoTranferMethodAndCard() {
        //Login Account
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.loginAspire("+84989677728", "135790");

        //Navigate to New User
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.navigateToNewUser();

        //Random account
        String email = loginPage.randomEmail("test.com");
        String fullName = loginPage.randomFullName("test");

        //Add info new user
        UsersPage usersPage = PageFactory.initElements(driver, UsersPage.class);
        usersPage.addInfoNewUser(fullName, email, "Director");

        // Add new user with Direct Role - Addmin access role
        AccessRolePage accessRolePage = PageFactory.initElements(driver, AccessRolePage.class);
        accessRolePage.inviteUserOfFinance("No Tranfer", "Yes");
    }

    //Add Director with FinanceRole
    @Test
    public void addUserDirectorWithFinanceRoleUseNoTranferMethodAndNoCard() {
        //Login Account
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.loginAspire("+84989677728", "135790");

        //Navigate to New User
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.navigateToNewUser();

        //Random account
        String email = loginPage.randomEmail("test.com");
        String fullName = loginPage.randomFullName("test");

        //Add info new user
        UsersPage usersPage = PageFactory.initElements(driver, UsersPage.class);
        usersPage.addInfoNewUser(fullName, email, "Director");

        // Add new user with Direct Role - Addmin access role
        AccessRolePage accessRolePage = PageFactory.initElements(driver, AccessRolePage.class);
        accessRolePage.inviteUserOfFinance("No Tranfer", "No");
    }

    //Add Director with Employee
    @Test
    public void addUserDirectorWithEmployeeRole() {
        //Login Account
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.loginAspire("+84989677728", "135790");

        //Navigate to New User
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.navigateToNewUser();

        //Random account
        String email = loginPage.randomEmail("test.com");
        String fullName = loginPage.randomFullName("test");

        //Add info new user
        UsersPage usersPage = PageFactory.initElements(driver, UsersPage.class);
        usersPage.addInfoNewUser(fullName, email, "Director");

        // Add new user with Direct Role - Addmin access role
        AccessRolePage accessRolePage = PageFactory.initElements(driver, AccessRolePage.class);
        accessRolePage.inviteUserOfEmployee();
    }
   
    //Add Non Director with FinanceRole
    @Test
    public void addUserNonDirectorWithFinanceRoleUseTranferMethodAndCard() {
        //Login Account
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.loginAspire("+84989677728", "135790");

        //Navigate to New User
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.navigateToNewUser();

        //Random account
        String email = loginPage.randomEmail("test.com");
        String fullName = loginPage.randomFullName("test");

        //Add info new user
        UsersPage usersPage = PageFactory.initElements(driver, UsersPage.class);
        usersPage.addInfoNewUser(fullName, email, "Non Director");

        // Add new user with Direct Role - Addmin access role
        AccessRolePage accessRolePage = PageFactory.initElements(driver, AccessRolePage.class);
        accessRolePage.inviteUserOfFinance("Tranfer", "Yes");
    }

    //Add Non Director with FinanceRole
    @Test
    public void addUserNonDirectorWithFinanceRoleUseTranferMethodAndNoCard() {
        //Login Account
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.loginAspire("+84989677728", "135790");

        //Navigate to New User
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.navigateToNewUser();

        //Random account
        String email = loginPage.randomEmail("test.com");
        String fullName = loginPage.randomFullName("test");

        //Add info new user
        UsersPage usersPage = PageFactory.initElements(driver, UsersPage.class);
        usersPage.addInfoNewUser(fullName, email, "Non Director");

        // Add new user with Direct Role - Addmin access role
        AccessRolePage accessRolePage = PageFactory.initElements(driver, AccessRolePage.class);
        accessRolePage.inviteUserOfFinance("Tranfer", "No");
    }

    //Add Non Director with FinanceRole
    @Test
    public void addUserNonDirectorWithFinanceRoleUseSubmitMethod() {
        //Login Account
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.loginAspire("+84989677728", "135790");

        //Navigate to New User
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.navigateToNewUser();

        //Random account
        String email = loginPage.randomEmail("test.com");
        String fullName = loginPage.randomFullName("test");

        //Add info new user
        UsersPage usersPage = PageFactory.initElements(driver, UsersPage.class);
        usersPage.addInfoNewUser(fullName, email, "Non Director");

        // Add new user with Direct Role - Addmin access role
        AccessRolePage accessRolePage = PageFactory.initElements(driver, AccessRolePage.class);
        accessRolePage.inviteUserOfFinance("Submit Only", "");
    }

    //Add Non Director with FinanceRole
    @Test
    public void addUserNonDirectorWithFinanceRoleUseNoTranferMethodAndCard() {
        //Login Account
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.loginAspire("+84989677728", "135790");

        //Navigate to New User
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.navigateToNewUser();

        //Random account
        String email = loginPage.randomEmail("test.com");
        String fullName = loginPage.randomFullName("test");

        //Add info new user
        UsersPage usersPage = PageFactory.initElements(driver, UsersPage.class);
        usersPage.addInfoNewUser(fullName, email, "Non Director");

        // Add new user with Direct Role - Addmin access role
        AccessRolePage accessRolePage = PageFactory.initElements(driver, AccessRolePage.class);
        accessRolePage.inviteUserOfFinance("No Tranfer", "Yes");
    }

    //Add Non Director with FinanceRole
    @Test
    public void addUserNonDirectorWithFinanceRoleUseNoTranferMethodAndNoCard() {
        //Login Account
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.loginAspire("+84989677728", "135790");

        //Navigate to New User
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.navigateToNewUser();

        //Random account
        String email = loginPage.randomEmail("test.com");
        String fullName = loginPage.randomFullName("test");

        //Add info new user
        UsersPage usersPage = PageFactory.initElements(driver, UsersPage.class);
        usersPage.addInfoNewUser(fullName, email, "Non Director");

        // Add new user with Direct Role - Addmin access role
        AccessRolePage accessRolePage = PageFactory.initElements(driver, AccessRolePage.class);
        accessRolePage.inviteUserOfFinance("No Tranfer", "No");
    }

    //Add Non Director with Employee
    @Test
    public void addUserNonDirectorWithEmployeeRole() {
        //Login Account
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.loginAspire("+84989677728", "135790");

        //Navigate to New User
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.navigateToNewUser();

        //Random account
        String email = loginPage.randomEmail("test.com");
        String fullName = loginPage.randomFullName("test");

        //Add info new user
        UsersPage usersPage = PageFactory.initElements(driver, UsersPage.class);
        usersPage.addInfoNewUser(fullName, email, "Non Director");

        // Add new user with Direct Role - Addmin access role
        AccessRolePage accessRolePage = PageFactory.initElements(driver, AccessRolePage.class);
        accessRolePage.inviteUserOfEmployee();
    }
   
}