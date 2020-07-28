package com.company.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.ws.handler.LogicalHandler;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class DashboardPage {
    private WebDriver driver;

    @FindBy (xpath = "//*[@class='md-raised md-primary md-button ng-scope' and contains(text(),'Click here to get started')]")
    public WebElement clickHereToGetStartedBtn;

    @FindBy (xpath = "//html/body/form/div[3]/div[1]/div/div/div[1]/div/div/div/div[1]/nav/ul/li[2]/a[1]")
    public WebElement shippingBtn;

    @FindBy (xpath = "//*[@class='btn-logo' and contains(text(),'Help')]")
    public WebElement helpBtn;

    @FindBy (className = "dpd-settings")
    public WebElement settingsBtn;


    public DashboardPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ShippingPage dashboardCheck () throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(shippingBtn));
        shippingBtn.click();
        return new ShippingPage(driver);
    }

    public ShippingPage dashboardCheckAddBook () throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(shippingBtn));
        shippingBtn.click();
        return new ShippingPage(driver);
    }
}