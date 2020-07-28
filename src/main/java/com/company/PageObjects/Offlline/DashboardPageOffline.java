package com.company.PageObjects.Offlline;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPageOffline {
    private WebDriver driver;

    @FindBy (xpath = "//*[@class='md-raised md-primary md-button ng-scope' and contains(text(),'Click here to get started')]")
    public WebElement clickHereToGetStartedBtn;

    @FindBy (className = "dpd-shipping")
    public WebElement shippingBtn;

    @FindBy (xpath = "//*[@class='btn-logo' and contains(text(),'Help')]")
    public WebElement helpBtn;

    @FindBy (className = "dpd-settings")
    public WebElement settingsBtn;


    public DashboardPageOffline(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ShippingPageOffline dashboardCheck () throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(shippingBtn));
        shippingBtn.click();
        return new ShippingPageOffline(driver);
    }

    public ShippingPageOffline dashboardCheckAddBook () throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(shippingBtn));
        shippingBtn.click();
        return new ShippingPageOffline(driver);
    }
}