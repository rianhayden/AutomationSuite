package com.company.PageObjects.ParcelWizard;

import com.company.PageObjects.DashboardPage;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;


public class TopupPW {

    public WebDriver driver;

    @FindBy(css = "#loginButton")
    public WebElement loginButton;

    @FindBy(name = "txtUsername")
    public WebElement username;

    @FindBy(name = "txtPassword")
    public WebElement password;

    @FindBy(xpath = "//a[contains(@href, 'password-reset'])")
    public WebElement forgotPass;

    @FindBy(xpath = "//a[contains(@ng-click, 'goToTopUp()'])")
    public WebElement topUp;


    public TopupPW(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

//    public TopupPW topupPW (WebDriver driver) {
//
//        return TopupPW();
//    }

}