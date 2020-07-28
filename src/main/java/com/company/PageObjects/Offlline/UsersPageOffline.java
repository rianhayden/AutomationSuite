package com.company.PageObjects.Offlline;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPageOffline {
    private WebDriver driver;

    @FindBy(xpath = "//*[@class='md-raised md-primary md-button md-ink-ripple' and contains(text(),'Add User')]")
    public WebElement addUserBtn;

    @FindBy (xpath = "//*[@class='md-tab ng-scope ng-isolate-scope md-ink-ripple' and contains(text(),'Accounts')]")
    public WebElement accountsBtn;

    @FindBy (xpath = "//*[@class='md-tab ng-scope ng-isolate-scope md-ink-ripple' and contains(text(),'Shipping')]")
    public WebElement shippingBtn;

    @FindBy (id = "txtTitle")
    public WebElement title;

    @FindBy (id = "txtFirstName")
    public WebElement firstName;

    @FindBy (id = "txtSurname")
    public WebElement surname;

    @FindBy (id = "txtUserName")
    public WebElement username;

    @FindBy (id = "txtPassword")
    public WebElement password;

    @FindBy (id = "txtConfirmPassword")
    public WebElement confirmPassword;

    @FindBy (id = "txtEmail")
    public WebElement email;

    @FindBy (id = "chkIsSuperUser")
    public WebElement superUserCheckbox;

    @FindBy(xpath = "//*[@class='md-raised md-primary md-button md-ink-ripple' and contains(text(),'Save')]")
    public WebElement saveUserBtn;

    public UsersPageOffline(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
