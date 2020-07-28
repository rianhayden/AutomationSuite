package com.company.PageObjects.ParcelWizard;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AddressBookPW {

    public WebDriver driver;

    @FindBy(css = "#loginButton")
    public WebElement loginButton;


    public AddressBookPW(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
