package com.company.PageObjects.Offlline;


import com.company.PageObjects.TestData;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class LoginPageOffline {

    public WebDriver driver;

    @FindBy(css = "#loginButton")
    public WebElement loginButton;

    @FindBy(id = "loginBtn")
    public WebElement offlineLoginButton;

    @FindBy(name = "txtUsername")
    public WebElement username;

    @FindBy(name = "txtPassword")
    public WebElement password;

    @FindBy(id = "txtUsername")
    public WebElement offlineUsername;

    @FindBy(id = "txtPassword")
    public WebElement offlinePassword;

    @FindBy (xpath = "//html/body/form/div[3]/div[1]/div/div/div[1]/div/div/div/div/div[3]/div/div/md-card/div/div[2]/md-card-title/md-card-title-text/p")
    public WebElement incorrectDetailsBox;

    @FindBy (xpath = "//html/body/div/div[2]/div[1]")
    public WebElement cookiesAccept;

    String user = "rianhayden";
    String pass = "123Password";

    public LoginPageOffline(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public DashboardPageOffline loginCheckOffline (WebDriver driver, TestData testData) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(offlineUsername));
        driver.manage().window().maximize();
        driver.switchTo().defaultContent();
        offlineUsername.click();
        offlineUsername.sendKeys(testData.getLogin());
        offlinePassword.click();
        offlinePassword.sendKeys(testData.getPass());
        //cookiesAccept.click();
        offlineLoginButton.click();
        return new DashboardPageOffline(driver);
    }

    public DashboardPageOffline loginCheckAddBook (WebDriver driver) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(username));
        driver.manage().window().maximize();
        username.click();
        username.sendKeys("TestAutomation");
        password.click();
        password.sendKeys("Passw0rd");
        cookiesAccept.click();
        loginButton.click();
        return new DashboardPageOffline(driver);
    }


    public LoginPageOffline incorrectDetailsCheck (WebDriver driver) throws InterruptedException {
        Thread.sleep(2500);
        assertTrue((username.isDisplayed()));
        username.click();
        username.sendKeys("blahblah");
        password.sendKeys(pass);
        loginButton.click();
        Thread.sleep(1500);
        Assert.assertTrue((incorrectDetailsBox.isDisplayed()));
        username.clear();
        password.clear();
        username.click();
        username.sendKeys(user);
        password.sendKeys("blahhhh");
        loginButton.click();
        Thread.sleep(1500);
        Assert.assertTrue((incorrectDetailsBox.isDisplayed()));
        username.clear();
        password.clear();
        return new LoginPageOffline(driver);
    }
}