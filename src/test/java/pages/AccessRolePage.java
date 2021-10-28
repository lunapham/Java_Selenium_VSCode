package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccessRolePage {
    WebDriver driver;
    Actions builder;
    WebDriverWait wait;

    public AccessRolePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Select access role;
    @FindBy(xpath = "//div[@class='q-list']//div[1]//img[1]")
    WebElement adminOption;

    @FindBy(xpath = "//div[@class='q-list']//div[2]//img[1]")
    WebElement financeOption;

    @FindBy(xpath = "//div[@class='q-list']//div[3]//img[1]")
    WebElement employeeOption;

    @FindBy(css = ".users-access-invite-step-role__compare")
    WebElement compareBtn;

    //process of admin role

    @FindBy(xpath = "//table//tr[2]//td[2]//span")
    WebElement AdminBtn;

    @FindBy(xpath = "//table//tr[2]//td[3]//span")
    WebElement FinanceBtn;

    @FindBy(xpath = "//table//tr[2]//td[4]//span")
    WebElement EmployeeBtn;

    @FindBy(xpath = "//span[text()='Continue']")
    WebElement continueBtn;

    //send invite
    //span[text()='Sign to send invite']

    @FindBy(xpath = "//span[@class='block']")
    WebElement signToInviteBtn;

    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement agreeCheckbox;

    @FindBy(xpath = "//span[text()='Sign contract']")
    WebElement signBtn;

    //Process of Finance role
    @FindBy(xpath = "//*[contains(text(),'Transfer without restrictions')]")
    WebElement tranferBtn;
    @FindBy(xpath = "//*[contains(text(),'Submit only')]")
    WebElement submitBtn;
    @FindBy(xpath = "//*[contains(text(),'No transfer rights')]")
    WebElement noTranferBtn;

    @FindBy(xpath = "//*[contains(text(),'Yes, issue a debit card')]")
    WebElement yesBtn;

    @FindBy(xpath = "//*[contains(text(),'No, debit card not needed')]")
    WebElement noBtn;

    public void selectAccessRole(String accessRole) {
        try {
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            System.out.println("The Browser could not open:" + e);
        }
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        builder = new Actions(driver);

        switch (accessRole) {
        case "Admin": {
            wait.until(ExpectedConditions.visibilityOf(adminOption));
            adminOption.click();
            System.out.println("== Select Admin access role");
            break;
        }
        case "Finance": {
            wait.until(ExpectedConditions.visibilityOf(adminOption));
            adminOption.click();
            System.out.println("== Select Finance access role");
            break;
        }
        case "Employee": {
            wait.until(ExpectedConditions.visibilityOf(adminOption));
            adminOption.click();
            System.out.println("== Select Employee access role");
            break;
        }
        default:
            System.out.println("The accessRole" + accessRole + "could not found");
            break;
        }

    }

    public void signatureInviteUser() {
        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            System.out.println("The Browser could not open:" + e);
        }
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        builder = new Actions(driver);

        wait.until(ExpectedConditions.visibilityOf(continueBtn));
        continueBtn.click();
        System.out.println("== Click on Continue button");

        wait.until(ExpectedConditions.visibilityOf(agreeCheckbox));
        agreeCheckbox.click();
        System.out.println("== Click on Agree checkbox");

        wait.until(ExpectedConditions.visibilityOf(signBtn));
        signBtn.click();
        System.out.println("== Click on Sign button");
        
    }

    /**
     * 
     * @param tranfer: finance method and use param (Tranfer, Submit Only, No Tranfer)
     * @param agree: accept to use card and using param (Yes, No)
     */
    
    public void tranferMethod(String tranfer, String agree) {
        try {
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            System.out.println("The Browser could not open:" + e);
        }
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        builder = new Actions(driver);

        switch (tranfer) {
        case "Tranfer": {
            wait.until(ExpectedConditions.visibilityOf(tranferBtn));
            tranferBtn.click();
            System.out.println("== Select "+ tranfer +" method");

            if (agree.equals("Yes")) {
                wait.until(ExpectedConditions.visibilityOf(yesBtn));
                yesBtn.click();
                System.out.println("== Click on "+agree+" button");


                wait.until(ExpectedConditions.visibilityOf(continueBtn));
                continueBtn.click();
                System.out.println("== Click on " + continueBtn + " button");
                
            } else if(agree.equals("No")) {
                wait.until(ExpectedConditions.visibilityOf(noBtn));
                noBtn.click();
                System.out.println("== Click on "+agree+" button");
            } else {
                System.err.println("Only use (Yes) or (No) options. Please check again");
            }

            break;
        }
        case "Submit Only": {
            wait.until(ExpectedConditions.visibilityOf(submitBtn));
            submitBtn.click();
            System.out.println("== Select "+ tranfer +" method");
            break;
        }
        case "No Tranfer": {
            wait.until(ExpectedConditions.visibilityOf(noTranferBtn));
            noTranferBtn.click();
            System.out.println("== Select "+ tranfer +" method");

            if (agree.equals("Yes")) {
                wait.until(ExpectedConditions.visibilityOf(yesBtn));
                yesBtn.click();
                System.out.println("== Click on "+agree+" button");


                wait.until(ExpectedConditions.visibilityOf(continueBtn));
                continueBtn.click();
                System.out.println("== Click on " + continueBtn + " button");
                
            } else if (agree.equals("No")) {
                wait.until(ExpectedConditions.visibilityOf(noBtn));
                noBtn.click();
                System.out.println("== Click on " + agree + " button");
            } else {
                System.err.println("Only use (Yes) or (No) options. Please check again");
            }
            break;
        }
        default:
            System.err.println("The accessRole" + tranfer + "could not found");
            break;
        }
    }

    public void inviteUserofAdmin() {

        try {
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            System.out.println("The Browser could not open:" + e);
        }
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        builder = new Actions(driver);

        String accessRole = "Admin";
        this.selectAccessRole(accessRole);

        wait.until(ExpectedConditions.visibilityOf(continueBtn));
        continueBtn.click();
        System.out.println("== Click on Continue button");

        wait.until(ExpectedConditions.visibilityOf(agreeCheckbox));
        agreeCheckbox.click();
        System.out.println("== Click on Agree checkbox");

        wait.until(ExpectedConditions.visibilityOf(signBtn));
        signBtn.click();
        System.out.println("== Click on Sign button");

    }

    public void inviteUserOfFinance(String tranfer, String agree) {
        try {
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            System.out.println("The Browser could not open:" + e);
        }
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        builder = new Actions(driver);

        //select Role
        String accessRole = "Finance";
        this.selectAccessRole(accessRole);

        //select tranfer method
        this.tranferMethod(tranfer, agree);

        //signature to invite user
        this.signatureInviteUser();

    }

    /**
     * 
     * @param accessRole: 
     */
    public void inviteUserOfEmployee() {
        try {
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            System.out.println("The Browser could not open:" + e);
        }
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        builder = new Actions(driver);

        //select Role
        String accessRole = "Employee";
        this.selectAccessRole(accessRole);

        //Click on Continue of Card
        wait.until(ExpectedConditions.visibilityOf(continueBtn));
        continueBtn.click();
        System.out.println("== Click on Continue button");

        //signature to invite user
        this.signatureInviteUser();
        
    }
    

}
    

