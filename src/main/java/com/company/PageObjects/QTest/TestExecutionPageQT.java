package com.company.PageObjects.QTest;


import com.company.PageObjects.TestData;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.*;

import static org.junit.Assert.assertTrue;

public class TestExecutionPageQT {
    private WebDriver driver;
    public WebElement yesAdd;

    @FindBy(xpath = "//label[@for='Timed']")
    public WebElement timedCheckbox;

    public String clientCodeValidation;
    public String testVersion;
    public String consignNo;
    public String orgNameTest;
    public String countryText = "IRELAND";
    String currentURL;
    String NI = "NORTHERN IRELAND";


    public TestExecutionPageQT(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public TestExecutionPageQT createLabel (TestData testData) throws InterruptedException,AWTException {
        Thread.sleep(5000);
        return new TestExecutionPageQT(driver);
    }

    public TestExecutionPageQT executeTest() throws InterruptedException {
        int randomNum = (int) (Math.random() * 999999);
        String editaddressUpdated;
        Thread.sleep(8500);
        testVersion = "1.0.194";
        driver.findElement(By.xpath("//span[contains(text(),'" + testVersion + "')]")).click();
        Thread.sleep(4000);
        //driver.findElement(By.xpath("//td[contains(text(),'ROI to ROI')]/preceding::td[2]")).click();
//        driver.findElement(By.xpath("//td()[span[contains(text(),'Upload a Logo picture')]]/parent::td")).click();
        WebElement childElement = driver.findElement(By.xpath("//span[contains(text(),'ROI to ROI')]"));
        childElement.click();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement parentElement = (WebElement)js.executeScript("return arguments[0].parentNode;", childElement);
        WebElement grandparentElement = (WebElement)js.executeScript("return arguments[0].parentNode;", parentElement);
        //js.executeScript("arguments[0].click();", grandparentElement);
        grandparentElement.click();
        //driver.findElements(By.xpath("//h2[contains(text(),'A few of our most popular courses')]/parent::div//div[//a[text()='SELENIUM']]/following-sibling::div[@class='rt-grid-2 rt-omega']"));
        //following-sibling::text()[contains(., 'needle')];
        Thread.sleep(5000);
        return new TestExecutionPageQT(driver);
    }
}