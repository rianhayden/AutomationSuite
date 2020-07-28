package com.company.PageObjects.QTest;

import com.company.PageObjects.ShippingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageQT {
    private WebDriver driver;

    @FindBy (id = "userName")
    public WebElement user;

    @FindBy (id = "password")
    public WebElement password;

    @FindBy (id = "loginButton")
    public WebElement loginBtn;

    public String QTusername = "rian.hayden@dpdireland.ie";
    public String QTpassword = "Rh0yden123";

    public LoginPageQT(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public TestExecutionPageQT login () throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,30);
        driver.manage().window().maximize();
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
        user.sendKeys(QTusername);
        password.sendKeys(QTpassword);
        loginBtn.click();
        return new TestExecutionPageQT(driver);
    }

}