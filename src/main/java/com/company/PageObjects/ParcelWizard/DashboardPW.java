package com.company.PageObjects.ParcelWizard;

import com.company.PageObjects.ShippingPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;

import static org.junit.Assert.assertTrue;


public class DashboardPW {

    public WebDriver driver;

    @FindBy(css = "#loginButton")
    public WebElement loginButton;

    @FindBy(name = "txtUsername")
    public WebElement username;

    @FindBy(name = "txtPassword")
    public WebElement password;

    @FindBy(xpath = "//a[contains(@href, 'password-reset')]")
    public WebElement forgotPass;

    @FindBy(xpath = "//*[@id='ng-app']/div/div/section/div[1]/div/div/div/a")
    public WebElement topUp;

    @FindBy(xpath = "//*[@id='ng-app']/div/div/section/div[2]/div/div[1]/div[6]/div[1]/a")
    public WebElement nextBtn;

//    @FindBy(css = "#form-card_details\\.field-cvc")
//    public WebElement cvcNum;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/main/div/form/div/div[3]/div/div[1]/div/button")
    public WebElement confirmDetails;

    @FindBy(xpath = "//div[@class='hi-cookie-btn agree']")
    public WebElement cookiesAccept;

    @FindBy(id = "field_password")
    public WebElement visaPass;

    @FindBy(xpath = "//div[contains(text(), 'Payment Successful')]")
    public WebElement paymentSuccess;

    @FindBy(css = "#main > h1")
    public WebElement h1;

    @FindBy(name = "securitycode")
    public WebElement cvcNum;

    @FindBy(id = "submit-button")
    public WebElement submitBtn;

    @FindBy (xpath = "//span[@class='ng-binding' and contains(text(),'Dashboard')]")
    public WebElement dashboardBtn;

    @FindBy (xpath = "//span[@class='ng-binding' and contains(text(),'Address Book')]")
    public WebElement addressBookBtn;

    @FindBy (xpath = "//*[@id='ng-app']/div/div/section/div[1]/div/div/div/span/strong")
    public WebElement balance;

    @FindBy (xpath = "//*[@id='ng-app']/div/div/section/div[2]/div/div/div[1]/div[2]/div")
    public WebElement addAddress;

    @FindBy (name = "txtTitle")
    public WebElement addBookCompanyName;

    @FindBy (name = "txtName")
    public WebElement name;

    @FindBy (name = "txtSurame")
    public WebElement surname;

    @FindBy (name = "txtAddressLine1")
    public WebElement addressLine1;

    @FindBy (name = "txtAddressLine3")
    public WebElement addressLine3;

    @FindBy (xpath = "//*[@id='ng-app']/div/div/section/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[7]/div[2]/select/option[25]")
    public WebElement countyOff;

    @FindBy (name = "txtReference")
    public WebElement addressName;

    @FindBy (name = "chkMapLocationConfirm")
    public WebElement exactLocationCheckbox;

    public String addressNameValidation;


    public DashboardPW(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public TopupPW topUp(WebDriver driver) throws AWTException, InterruptedException {
        int checker = 1;
        WebDriverWait wait = new WebDriverWait(driver,30);
        driver.switchTo().defaultContent();
        wait.until(ExpectedConditions.elementToBeClickable(topUp));
        double topUpAmount = 3.85;
        String creditBalanceBefore = driver.findElement(By.xpath("//*[@id='ng-app']/div/div/section/div[1]/div/div/div/span/strong")).getText();
        String creditBalanceEuroBefore = creditBalanceBefore.replace("€", "");
        double creditBalanceAmountBefore = Double.valueOf(creditBalanceEuroBefore);
        System.out.println("Balance before"+creditBalanceAmountBefore);
        while (checker < 20) {
            if (!driver.findElements(By.xpath("./html/body/form/div[3]/div/div[2]/div/div[1]/div/div/div/div[1]/div/div/div[2]/div/div/section/div[2]/div/div[1]/div[6]/div[1]/a")).isEmpty()) {
                checker = 20;
            } else {
                topUp.click();
                checker++;
            }
        }
        wait.until(ExpectedConditions.elementToBeClickable(nextBtn));
        driver.switchTo().defaultContent();
        nextBtn.click();
        driver.switchTo().defaultContent();
        Thread.sleep(5000);
        driver.switchTo().frame(driver.findElement(By.cssSelector(".topup-frame")));
        cvcNum.sendKeys("123");
        confirmDetails.click();
        wait.until(ExpectedConditions.elementToBeClickable(visaPass));
        visaPass.click();
        visaPass.sendKeys("Passw0rd");
        submitBtn.click();
        Thread.sleep(5000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//html/body/form/div[3]/h1[text()='Payment Successful']")));
        driver.switchTo().parentFrame();
        dashboardBtn.click();
        Thread.sleep(60000);
        driver.navigate().refresh();
        wait.until(ExpectedConditions.visibilityOf(balance));
        String creditBalanceAfter = driver.findElement(By.xpath("//*[@id='ng-app']/div/div/section/div[1]/div/div/div/span/strong")).getText();
        String creditBalanceEuroAfter = creditBalanceAfter.replace("€", "");
        double creditBalanceAmountAfter = Double.valueOf(creditBalanceEuroAfter);
        double creditBalancetopup = creditBalanceAmountBefore + topUpAmount;

        if (creditBalanceAmountAfter == creditBalancetopup){
            System.out.println("Credit balance:"+creditBalanceAmountAfter);
        }
        else {
            driver.findElement(By.xpath("rthevhvyth"));
        }

        return new TopupPW(driver);
    }

    public DashboardPW addressBookTest() {
        int randomNum = (int) (Math.random() *  100000);
        java.lang.String randomNumber = Integer.toString(randomNum);
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(addressBookBtn));
        addressBookBtn.click();
        wait.until(ExpectedConditions.elementToBeClickable(addAddress));
        addAddress.click();
        wait.until(ExpectedConditions.elementToBeClickable(nextBtn));
        name.sendKeys("Test");
        surname.sendKeys("Automation");
        addressLine1.sendKeys("1");
        addressLine3.sendKeys("Tullamore");
        countyOff.click();
        addressName.sendKeys("test"+randomNumber);
        addressNameValidation = addressName.getAttribute("value");
        nextBtn.click();
        wait.until(ExpectedConditions.elementToBeClickable(exactLocationCheckbox));
        exactLocationCheckbox.click();

        wait.until(ExpectedConditions.elementToBeClickable(addAddress));
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'"+addressNameValidation+"')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

        return new DashboardPW(driver);
    }

}