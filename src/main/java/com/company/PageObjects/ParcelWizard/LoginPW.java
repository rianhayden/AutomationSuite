package com.company.PageObjects.ParcelWizard;

import com.company.PageObjects.DashboardPage;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;


public class LoginPW {

    public WebDriver driver;

    @FindBy(css = "#loginButton")
    public WebElement loginButton;

    @FindBy(name = "txtUsername")
    public WebElement username;

    @FindBy(name = "txtPassword")
    public WebElement password;

    @FindBy(xpath = "//a[contains(@href, 'password-reset'])")
    public WebElement forgotPass;

    String user = "rian.hayden@dpd.ie";
    String pass = "Rh0yden123";

    public LoginPW(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public DashboardPW loginCheck(WebDriver driver) throws InterruptedException {
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(username));
        assertTrue((username.isDisplayed()));
        username.click();
        username.sendKeys(user);
        password.click();
        password.sendKeys(pass);
        loginButton.click();
        return new DashboardPW(driver);
    }
}