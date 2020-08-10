package com.company.PageObjects;


import net.sourceforge.lept4j.Sel;
import net.sourceforge.tess4j.TesseractException;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.junit.Assert;
import java.awt.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import javax.xml.ws.handler.LogicalHandler;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.lang.Math;
import static org.junit.Assert.assertTrue;
import java.io.*;
import org.openqa.selenium.support.ui.Select;
import  java.sql.Connection;
import  java.sql.Statement;
import  java.sql.ResultSet;
import  java.sql.DriverManager;
import  java.sql.SQLException;
import com.company.PageObjects.TestData;
//import org.bytedeco.javacpp.*;
//import org.junit.Test;
//import static org.bytedeco.javacpp.lept.*;
//import static org.bytedeco.javacpp.tesseract.*;
import net.sourceforge.tess4j.Tesseract;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShippingPage {
    private WebDriver driver;


    @FindBy (name = "ClientCode")
    public WebElement clientCode;

    @FindBy (name = "AddressName")
    public WebElement orgName;

    @FindBy (name = "addressName")
    public WebElement addBookSearchOrgName;

    @FindBy (xpath = "//*[@id='mat-input-1']")
    public WebElement country;

    @FindBy (name = "PostCode")
    public WebElement postCode;

    @FindBy (name = "FirstName")
    public WebElement contactName;

    @FindBy (name = "ContactTelephone")
    public WebElement contactNumber;

    @FindBy (name = "AddressLine1")
    public WebElement addressLine1;

    @FindBy (name = "AddressLine2")
    public WebElement addressLine2;

    @FindBy (name = "AddressLine3")
    public WebElement addressLine3;

    @FindBy (name = "AddressLine4")
    public WebElement addressLine4;

    @FindBy (name = "Mobile")
    public WebElement mobile;

    @FindBy (name = "ContactTelephone")
    public WebElement ContactTelephone;

    @FindBy (name = "Email")
    public WebElement email;

    @FindBy (name = "SafePlace")
    public WebElement safePlace;

    @FindBy (xpath = "//*[@class='strong' and contains(text(),'Create Label')]")
    public WebElement createLabelBtn;

    @FindBy (xpath = "//*[@class='dashboard-wrapper' and contains(text(),'Shipping')]")
    public WebElement shippingHeader;

    @FindBy (xpath = "//*[@class='strong' and contains(text(),'Address Book')]")
    public WebElement addressBookBtn;

    @FindBy (xpath = "//*[@class='md-primary md-button ng-star-inserted' and contains(text(),'Print')]")
    public WebElement printBtn;

    @FindBy (xpath = "//*[@class='md-button md-primary' and contains(text(),'Exit')]")
    public WebElement exitBtn;

    @FindBy (xpath = "//*[@class='pull-left' and contains(text(),'Advanced Search')]")
    public WebElement advancedSearchBtn;

    @FindBy (xpath = "//*[@id='app-root']/div/div/div[2]/app-home/div/div/div[3]/div[1]/div")
    public WebElement createdToday;

    @FindBy (name = "deliveryNameSimple")
    public WebElement clientCodeSearch;

    @FindBy (xpath = "//*[@id='app-root']/div/div/div[2]/app-home/div/div/div[5]/form/div[1]/div/div[3]/button[2]")
    public WebElement searchBtn;

    @FindBy (xpath = "//*[@id='mat-dialog-0']/address-save-dialog/div/button[1]")
    public WebElement noAddressBookBtn;

    @FindBy (xpath = "//*[@class='md-primary md-button' and contains(text(),'Yes')]")
    public WebElement yesExitBtn;

    @FindBy (xpath = "//*[text()[contains(.,'Version: 1.0.140')]]")
    public WebElement versionNo;

    @FindBy (xpath = "//a[contains(title(),'Logout')]")
    public WebElement logoutBtn;

    @FindBy (name = "txtUsername")
    public WebElement usernameTxtField;

    @FindBy(name = "txtPassword")
    public WebElement passwordTxtField;

    @FindBy(name = "addressName")
    public WebElement addBookClientCode;

    @FindBy(css = "#loginButton")
    public WebElement loginButton;

    @FindBy (xpath = "//html/body/app-root/div/div/div[2]/app-home/div[2]/div/div[9]/div/div/div/div[3]/p")
    public WebElement clickConsignment;

    @FindBy (xpath = "//*[@id='dnn_ctr382_ModuleContent']/div/div/div[1]/div[7]/div/div[3]/div/div/div/div/div/div[1]/p[2]")
    public WebElement consignmentNo;

    @FindBy(xpath = "//*[@class='ng-binding' and contains(text(),'Tracking detail error: No events found')]")
    public WebElement noEventsFound;

    @FindBy(xpath = "//html/body/form/div[3]/div[1]/div/div/div[1]/div/div/div/div[1]/div[7]/div/div/div[2]/div[2]/div[1]/div[1]/div/div/p[3]/a")
    public WebElement hideThis;

    @FindBy(xpath = "//*[@id=\"mat-dialog-0\"]/address-save-dialog/div/button[1]")
    public WebElement yesAdd;

    @FindBy(xpath = "//label[@for='Timed']")
    public WebElement timedCheckbox;

    @FindBy(id = "TimedTime")
    public WebElement timedField;

    @FindBy(xpath = "//label[@for='Saturday']")
    public WebElement satCheckbox;

    @FindBy(xpath = "//label[@for='Swappit']")
    public WebElement swappitCheckbox;

    @FindBy(xpath = "//label[@for='COD']")
    public WebElement codCheckbox;

    @FindBy(xpath = "//label[@for='ReturnReceipt']")
    public WebElement retReceiptCheckbox;

    @FindBy(xpath = "//a[contains(@title, 'Logout')]")
    public WebElement logOut;

    @FindBy(xpath = "//*[@id='app-root']/div/div/div[2]/app-address-book/div[2]/div/div/div/form/table/tbody/tr[1]")
    public WebElement addBookLine1;

    @FindBy(name = "ServiceAmount")
    public WebElement serviceAmount;

    @FindBy (xpath = "//*[@class='md-primary md-button pull-left' and contains(text(),'Add Address')]")
    public WebElement addAddressBtn;

    @FindBy (name = "companyName")
    public WebElement companyName;

    @FindBy (name = "companyName")
    public WebElement addBookCompanyName;

    @FindBy (name = "addLine1")
    public WebElement addLine1;

    @FindBy (name = "town")
    public WebElement town;

    @FindBy (name = "county")
    public WebElement county;

    @FindBy (name = "contact")
    public WebElement contactNameAddBook;

    @FindBy (name = "phone")
    public WebElement phoneAddBook;

    @FindBy (xpath = "//*[@class='md-primary md-button ng-star-inserted' and contains(text(),'Save Address')]")
    public WebElement saveAddress;

    @FindBy (xpath = "//*[@class='md-primary md-button ng-star-inserted' and contains(text(),'Remove Address')]")
    public WebElement removeAddress;

    @FindBy (xpath = "//*[@class='md-primary md-button ng-star-inserted' and contains(text(),'Edit Address')]")
    public WebElement editAddressBtn;

    @FindBy (xpath = "//*[@id='mat-dialog-0']/delete-dialog/div/button[2]")
    public WebElement areyousurAdd;

    @FindBy(name = "addressKey")
    public WebElement clientCodeSearchAddBook;

    @FindBy(xpath = "//*[@id='Customs']/div/div/div/div[2]/div[1]/div[1]/input")
    public WebElement comCode;

    @FindBy(xpath = "//*[@id='Customs']/div/div/div/div[2]/div[1]/div[4]/input")
    public WebElement ccQuantity;

    @FindBy(xpath = "//html/body/app-root/div/div/div[2]/app-home/div[2]/div/div/div[1]/div[1]/form/div[22]/div/div/div/div[2]/div[1]/div[5]/input")
    public WebElement ccQuantityROW;

    @FindBy(xpath = "//*[@id='Customs']/div/div/div/div[2]/div[1]/div[6]/input")
    public WebElement comCodeValue;

    @FindBy(xpath = "//html/body/app-root/div/div/div[2]/app-home/div[2]/div/div/div[1]/div[1]/form/div[22]/div/div/div/div[2]/div[1]/div[7]/input")
    public WebElement comCodeValueROW;

    @FindBy(xpath = "//*[@id='Customs']/div/div/div/div[2]/div[1]/div[8]/input")
    public WebElement comCodeDescription;

    @FindBy(xpath = "//html/body/app-root/div/div/div[2]/app-home/div[2]/div/div/div[1]/div[1]/form/div[22]/div/div/div/div[2]/div[1]/div[9]/input")
    public WebElement comCodeDescriptionROW;

    @FindBy(name = "BTAddressEntry")
    public WebElement BTAddressEntry;

    @FindBy (xpath = "//*[@class='md-primary md-button' and contains(text(),'Accept')]")
    public WebElement BTAccept;

    @FindBy (xpath = "//*[@class='mat-radio-label-content' and contains(text(),'Use Delivery Address as Billing Address')]")
    public WebElement delivAddRadio;

    @FindBy (xpath = "//*[@class='mat-radio-label-content' and contains(text(),'Provide an alternate Billing Address')]")
    public WebElement altAddRadio;

    @FindBy (xpath = "//div[label[contains(., 'Description')]]/input")
    public WebElement ccDescription;

    @FindBy (xpath = "//div[label[contains(., 'Parcel 1 Weight')]]/input")
    public WebElement parcelWeight;

    @FindBy (xpath = "//*[@id='mat-radio-9']/label")
    public WebElement noLicensing;

    @FindBy (xpath = "//*[@id='Customs']/div/div/div/div[2]/div[1]/div[11]/div[1]/select/option[4]")
    public WebElement box44code;

    @FindBy (className = "dpd-ParcelTracking")
    public WebElement parcelTrackingBtn;

    @FindBy (xpath = "//*[@class='ng-binding' and contains(text(),'Consignments Created Today')]")
    public WebElement consignmentsCreatedToday;

    @FindBy (xpath = "//*[@id='filter-text' and contains(text(),'Advanced Search')]")
    public WebElement ptAdvSearch;

    @FindBy (xpath = "//html/body/form/div[3]/div[1]/div/div/div[1]/div/div/div/div[1]/div[7]/div/div[2]/md-content/div[2]/div[2]/div/button[1]")
    public WebElement ptSearchBtn;

    @FindBy (xpath = "//input[@ng-model='ptc.CustomerSearch.TrackingNumber']")
    public WebElement ptValidTrackNo;

    @FindBy (xpath = "//input[@ng-model='ptc.CustomerSearch.Reference']")
    public WebElement ptValidCusRef;

    @FindBy (xpath = "//input[@ng-model='ptc.CustomerSearch.Postcode']")
    public WebElement ptValidPostcode;

    @FindBy (xpath = "//input[@ng-model='ptc.CustomerSearch.PhoneNo']")
    public WebElement ptValidPhone;

    @FindBy (xpath = "//input[@ng-model='ptc.CustomerSearch.DelAddress']")
    public WebElement ptValidDelAddress;

    @FindBy (xpath = "//input[@ng-model='ptc.CustomerSearch.DelName']")
    public WebElement ptValidDelName;

    @FindBy (xpath = "//input[@ng-model='ptc.CustomerSearch.Country']")
    public WebElement ptValidCountry;

    @FindBy (xpath = "//input[@ng-model='ptc.CustomerSearch.Email']")
    public WebElement ptValidEmail;

    @FindBy (xpath = "//input[@ng-model='ptc.CustomerSearch.CardNo']")
    public WebElement ptValidCardRef;

    @FindBy (name = "serviceType")
    public WebElement ptValidServiceType;

    @FindBy (xpath = "//html/body/app-root/div/div/div[2]/app-home/div[2]/div/div/div[1]/div[1]/form/div[25]/div/div/div/div[2]/div/div/div/div/div[1]/input")
    public WebElement customerReference;

    @FindBy (xpath = "//div[contains(text(),'No Consignments Found. Please widen your search criteria.')]")
    public WebElement ptNoConsFound;

    @FindBy (xpath = "//html/body/app-root/div/div/div[2]/app-home/div[2]/div/div/div[2]/div/div[1]/p[6]")
    public WebElement clickOff;

//
//    @FindBy (xpath = "")
//    public WebElement ptValidCusRef;
//
//    @FindBy (xpath = "")
//    public WebElement ptValidCusRef;
//
//    @FindBy (xpath = "")
//    public WebElement ptValidCusRef;
//
//    @FindBy (xpath = "")
//    public WebElement ptValidCusRef;


    public String clientCodeValidation;
    public String randomAddBook;
    public String consignNo;
    public String orgNameTest;
    public String countryText = "IRELAND";
    public String eirCodeText = "R35V274";
    public String ptCusRefValidation = "cus ref example";
    public String ptDelNameValidation = "John Doe";
    public String ptEircodeValidation = "R35V277";
    public String ptDelAddressValidation = "9 Furlong Grove";
    public String ptPhoneValidation = "0852151435";
    public String ptCountyValidation = "Offaly";
    public String ptCountryValidation = "IRELAND";
    public String ptEmailValidation = "dpd.olp@gmail.com";
    public String ptCardRefValidation = "card reference";


    String currentURL;
    String NI = "NORTHERN IRELAND";

    public ShippingPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ShippingPage createLabel (TestData testData) throws InterruptedException,AWTException {
        Thread.sleep(7000);
        driver.switchTo().frame("shippingmoduleiframe");
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(createLabelBtn));
        createLabelBtn.click();
        wait.until(ExpectedConditions.elementToBeClickable(clientCode));
        String winHandleBefore = driver.getWindowHandle();

        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }

        int randomNum = (int) (Math.random() * 999999);
        java.lang.String randomClientCode = Integer.toString(randomNum);
        //driver.switchTo().defaultContent();
        Thread.sleep(7000);
        Robot robot = new Robot();
        //robot.keyPress(KeyEvent.VK_ESCAPE);
        //robot.keyRelease(KeyEvent.VK_ESCAPE);
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);
//        driver.switchTo().defaultContent();
//        driver.switchTo().frame("shippingmoduleiframe");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        //js.executeScript("arguments[0].value='"+(testData.getOrgname())+"';", orgName);

        //driver.("document.getElementById('elementID').setAttribute('value', 'new value for element')");
        //orgName.sendKeys(testData.getOrgname());
        //orgName.sendKeys(randomClientCode);
        orgName.click();
        orgName.sendKeys(testData.getOrgname());
        orgName.sendKeys(randomClientCode);
        //js.executeScript("arguments[0].value='"+(randomClientCode)+"';", orgName);
        clientCodeValidation = orgName.getAttribute("value");

        country.click();
        //js.executeScript("arguments[0].value='"+(testData.getCountry())+"';", country);
        Thread.sleep(1000);
        country.click();
        Thread.sleep(1000);
        country.sendKeys(testData.getCountry());

        //js.executeScript("arguments[0].value='"+(testData.getPostcode())+"';", postCode);
        postCode.click();
        postCode.sendKeys(testData.getPostcode());


        if (testData.getCountry().equalsIgnoreCase("NORTHERN IRELAND")) {
            clientCode.click();
            wait.until(ExpectedConditions.elementToBeClickable(BTAccept));
            BTAddressEntry.sendKeys(testData.getAddLine1().substring(0,1));
            BTAccept.click();
        } else {
            addressLine1.click();
            addressLine1.sendKeys(testData.getAddLine1());
            //js.executeScript("arguments[0].value='"+(testData.getAddLine1())+"';", addressLine1);
            addressLine2.click();
            addressLine2.sendKeys(testData.getAddLine2());
          //  addressLine2.click();
            //addressLine2.sendKeys(testData.getAddLine2());

           // js.executeScript("arguments[0].value='"+(testData.getAddLine2())+"';", addressLine2);
            addressLine3.click();
            addressLine3.sendKeys(testData.getAddLine3());
          //  addressLine3.click();
            //addressLine3.sendKeys(testData.getAddLine3());

         //   js.executeScript("arguments[0].value='"+(testData.getAddLine3())+"';", addressLine3);
            addressLine4.click();
            addressLine4.sendKeys(testData.getAddLine4());
          //  addressLine4.click();
            //addressLine4.sendKeys(testData.getAddLine4());
          //  js.executeScript("arguments[0].value='"+(testData.getAddLine4())+"';", addressLine4);
        }

        contactName.click();
        js.executeScript("arguments[0].value='"+(testData.getContactName())+"';", contactName);
        contactName.sendKeys(testData.getContactName());
        //mobile.sendKeys(testData.getContactNum());
        mobile.click();
        mobile.sendKeys(testData.getContactNum());
        //js.executeScript("arguments[0].value='"+(testData.getContactNum())+"';", mobile);
        //ContactTelephone.sendKeys(testData.getContactNum());
        contactNumber.click();
        ContactTelephone.sendKeys(testData.getContactNum());
        //js.executeScript("arguments[0].value='"+(testData.getContactNum())+"';", contactNumber);
        //email.sendKeys(testData.getContactEmail());
        email.click();
        email.sendKeys(testData.getContactEmail());
        //js.executeScript("arguments[0].value='"+(testData.getContactEmail())+"';", email);
        email.click();

        //js.executeScript("arguments[0].click();", safePlace);


        if(testData.getDelOptions().equals("overnight")) {
            printBtn.click(); }
        else { System.out.println("no overnight"); }

        if (testData.getDelOptions().equals("timed")) {
            timedCheckbox.click();
            timedField.sendKeys("14:30");
            printBtn.click(); }
            else { System.out.println("not timed"); }

        if (testData.getDelOptions().equals("saturday")) {
            satCheckbox.click();
            printBtn.click(); }
            else { System.out.println("no saturday"); }

        if(testData.getDelOptions().equals("swappit")) {
            swappitCheckbox.click();
            printBtn.click(); }
            else { System.out.println("no swappit"); }

        if(testData.getDelOptions().equals("cod")) {
            codCheckbox.click();
            serviceAmount.click();
            serviceAmount.sendKeys("50");
            printBtn.click(); }
            else { System.out.println("no cod"); }

        if(testData.getDelOptions().equals("retrec")) {
            retReceiptCheckbox.click();
            printBtn.click(); }
            else { System.out.println("no ret rec"); }

        if(testData.getQuantity().equals("11")) {
            printBtn.click(); }
        else { System.out.println("no ret rec"); }

        if(testData.getDelOptions().equals("air")) {
            Select delMethod = new Select(driver.findElement(By.name("dMethod")));
            delMethod.selectByVisibleText("DPD Air");
            printBtn.click(); }
        else { System.out.println("no ret rec"); }

        if(testData.getDelOptions().equals("road")) {
            Select delMethod = new Select(driver.findElement(By.name("dMethod")));
            delMethod.selectByVisibleText("DPD Classic");
            printBtn.click(); }
        else { System.out.println("no ret rec"); }

        if(testData.getCustoms().equals("yes")) {
            customsFill(testData);

            if (testData.getCustoms().equals("brexit")) {
                customsFillBrexitOn(testData);
            }
        }
        else { System.out.println("no ret rec"); }

        Thread.sleep(1000);
        return new ShippingPage(driver);
    }

    public ShippingPage customsFill (TestData testData) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(printBtn));

        if(testData.getOrgname().equals("euspecair")) {
            comCode.click();
            comCode.sendKeys("6302100000");
            ccQuantity.click();
            ccQuantity.sendKeys("1");
            comCodeValue.click();
            comCodeValue.sendKeys("300");
            ccDescription.click();
            ccDescription.sendKeys("euspecair");
            Select delMethod = new Select(driver.findElement(By.name("dMethod")));
            delMethod.selectByVisibleText("DPD Air");
            parcelWeight.click();
            parcelWeight.sendKeys("8");
            printBtn.click();
        }
        else { System.out.println("no spec air"); }

        if(testData.getOrgname().equals("euspecclassic")) {
            comCode.click();
            comCode.sendKeys("6302100000");
            ccQuantity.click();
            ccQuantity.sendKeys("1");
            comCodeValue.click();
            comCodeValue.sendKeys("300");
            ccDescription.click();
            ccDescription.sendKeys("euspecair");
            Select delMethod = new Select(driver.findElement(By.name("dMethod")));
            delMethod.selectByVisibleText("DPD Classic");
            parcelWeight.click();
            parcelWeight.sendKeys("8");
            printBtn.click();
        }
        else { System.out.println("no spec air"); }

        if(testData.getOrgname().equals("euspecnotaccepted")) {
            comCode.click();
            comCode.sendKeys("01012100");
            altAddRadio.click();
            delivAddRadio.click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'These goods cannot be accepted and transported by DPD')]")));
            comCode.clear();
            comCode.click();
            comCode.sendKeys("6302100000");
            ccQuantity.click();
            ccQuantity.sendKeys("1");
            comCodeValue.click();
            comCodeValue.sendKeys("300");
            wait.until(ExpectedConditions.elementToBeClickable(ccDescription));
            ccDescription.click();
            ccDescription.sendKeys("euspecnotaccepted");
            parcelWeight.click();
            parcelWeight.sendKeys("8");
            printBtn.click();
        }
        else { System.out.println("no euspecnotaccepted"); }

        if(testData.getOrgname().equals("rownotaccepted")) {
            comCode.click();
            comCode.sendKeys("01012100");
            altAddRadio.click();
            delivAddRadio.click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'These goods cannot be accepted and transported by DPD')]")));
            comCode.clear();
            comCode.click();
            comCode.sendKeys("6302100000");
            ccQuantity.click();
            ccQuantity.sendKeys("1");
            comCodeValue.click();
            comCodeValue.sendKeys("300");
            wait.until(ExpectedConditions.elementToBeClickable(ccDescription));
            ccDescription.click();
            ccDescription.sendKeys("rownotaccepted");
            parcelWeight.click();
            parcelWeight.sendKeys("8");
            printBtn.click();
        }
        else { System.out.println("no rownotaccepted"); }

        if(testData.getOrgname().equals("rownormal")) {
            comCode.click();
            comCode.sendKeys("6302100000");
            comCodeDescription.click();
            comCode.click();
            ccQuantityROW.click();
            ccQuantityROW.sendKeys("1");
            comCodeValueROW.click();
            comCodeValueROW.sendKeys("300");
            ccDescription.click();
            ccDescription.sendKeys("rownormal");
            parcelWeight.sendKeys("8");
            printBtn.click();
        }
        else { System.out.println("no spec rownormal"); }

        if(testData.getOrgname().equals("rowyeslicensing")) {
            comCode.click();
            comCode.sendKeys("6302100000");
            comCodeDescription.click();
            comCode.click();
            ccQuantityROW.click();
            ccQuantityROW.sendKeys("1");
            comCodeValueROW.click();
            comCodeValueROW.sendKeys("300");
            Thread.sleep(3000);
            ccDescription.click();
            ccDescription.sendKeys("rowyeslicensing");
            parcelWeight.click();
            parcelWeight.sendKeys("8");
            parcelWeight.click();
            contactNumber.click();
            parcelWeight.click();
            printBtn.click();
        }
        else { System.out.println("no spec rowyeslicensing"); }

        if(testData.getOrgname().equals("rownolicensing")) {
            comCode.sendKeys("6302100000");
            comCodeDescription.click();
            comCode.click();
            ccQuantity.sendKeys("1");
            comCodeValue.sendKeys("300");
            wait.until(ExpectedConditions.elementToBeClickable(box44code));
            box44code.click();
            ccDescription.click();
            ccDescription.sendKeys("rownolicensing");
            parcelWeight .sendKeys("8");
            printBtn.click();
        }
        else { System.out.println("no spec rownolicensing"); }

        return new ShippingPage(driver);
    }

    public ShippingPage customsFillBrexitOn (TestData testData) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(printBtn));

        if(testData.getOrgname().contains("roitonibrexiton")) {
            comCode.sendKeys("6302100000");
            ccQuantity.sendKeys("1");
            comCodeValue.sendKeys("300");
            ccDescription.click();
            ccDescription.sendKeys(testData.getOrgname());
            Select delMethod = new Select(driver.findElement(By.name("dMethod")));
            delMethod.selectByVisibleText("DPD Air");
            parcelWeight.sendKeys("8");
            printBtn.click();
        }
        else { System.out.println("not"+testData.getOrgname()); }

        return new ShippingPage(driver);
    }

    public ShippingPage createLabelParcelTracking () throws InterruptedException,AWTException {
        Thread.sleep(8000);
        driver.switchTo().frame("shippingmoduleiframe");
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(createLabelBtn));
        createLabelBtn.click();
        wait.until(ExpectedConditions.elementToBeClickable(clientCode));
        String winHandleBefore = driver.getWindowHandle();
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        int randomNum = (int) (Math.random() * 999999);
        java.lang.String randomClientCode = Integer.toString(randomNum);
        orgName.click();
        orgName.sendKeys("orgname");
        orgName.sendKeys(randomClientCode);
        clientCodeValidation = orgName.getAttribute("value");
        country.click();
        country.sendKeys(ptCountryValidation);
        postCode.sendKeys(ptEircodeValidation);
        addressLine1.sendKeys(ptDelNameValidation);
        addressLine2.sendKeys("Puttaghaun");
        addressLine3.sendKeys("Tullamore");
        addressLine4.sendKeys(ptCountyValidation);
        contactName.click();
        contactName.sendKeys(ptDelNameValidation);
        mobile.sendKeys(ptPhoneValidation);
        email.sendKeys(ptEmailValidation);
        contactNumber.sendKeys(ptPhoneValidation);
//        clientCodeSearch.sendKeys(clientCodeValidation);
        clickOff.click();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", customerReference);
        js.executeScript("arguments[0].click();", customerReference);
        customerReference.sendKeys(ptCusRefValidation);
        printBtn.click();
        Thread.sleep(8000);
        return new ShippingPage(driver);
    }

    public ShippingPage exitAndValidate (TestData testData) throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(exitBtn));
        exitBtn.click();
        wait.until(ExpectedConditions.elementToBeClickable(yesExitBtn));
        yesExitBtn.click();
        driver.navigate().refresh();
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("shippingmoduleiframe"));
        wait.until(ExpectedConditions.elementToBeClickable(createLabelBtn));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        clientCodeSearch.sendKeys(clientCodeValidation);
        searchBtn.click();
        Thread.sleep(2000);
        if(!searchBtn.isDisplayed())
        {
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("shippingmoduleiframe"));
            usernameTxtField.click();
            usernameTxtField.sendKeys(testData.getLogin());
            passwordTxtField.click();
            passwordTxtField.sendKeys(testData.getPass());
            loginButton.click();
            wait.until(ExpectedConditions.elementToBeClickable(createLabelBtn));
            js.executeScript("arguments[0].scrollIntoView(true);", advancedSearchBtn);
            js.executeScript("arguments[0].click();", advancedSearchBtn);
            clientCodeSearch.sendKeys(clientCodeValidation);
            js.executeScript("arguments[0].scrollIntoView(true);", searchBtn);
            js.executeScript("arguments[0].click();", searchBtn);
        }
        else
        {
            System.out.println(clientCodeValidation);
        }

        int codeChecker = 0;
        while (codeChecker < 20) {
            if (!driver.findElements(By.xpath("//html/body/app-root/div/div/div[2]/app-home/div[2]/div/div[9]/div/div/div/div[4]/p[text()='" + clientCodeValidation + "']")).isEmpty()) {
                codeChecker = 20;
            } else {
                driver.findElements(By.xpath("iuohu"));
                codeChecker++;
            }
        }
        wait.until(ExpectedConditions.elementToBeClickable(clickConsignment));
        clickConsignment.click();
        Thread.sleep(2000);
        currentURL = driver.getCurrentUrl();
        String str = currentURL.substring(Math.max(currentURL.length() - 9, 0));
        consignNo = str;
        driver.switchTo().defaultContent();
        logOut.click();
        System.out.println(consignNo);
        return new ShippingPage(driver);
    }

    public ShippingPage ptExitAndValidate () throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(exitBtn));
        exitBtn.click();
        wait.until(ExpectedConditions.elementToBeClickable(yesExitBtn));
        yesExitBtn.click();
        driver.navigate().refresh();
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("shippingmoduleiframe"));
        wait.until(ExpectedConditions.elementToBeClickable(createLabelBtn));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        clientCodeSearch.sendKeys(clientCodeValidation);
        searchBtn.click();
        Thread.sleep(2000);
        if(!searchBtn.isDisplayed())
        {
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("shippingmoduleiframe"));
            usernameTxtField.click();
            usernameTxtField.sendKeys("TestAutomation");
            passwordTxtField.click();
            passwordTxtField.sendKeys("Passw0rd");
            loginButton.click();
            wait.until(ExpectedConditions.elementToBeClickable(createLabelBtn));
            js.executeScript("arguments[0].scrollIntoView(true);", advancedSearchBtn);
            js.executeScript("arguments[0].click();", advancedSearchBtn);
            clientCodeSearch.sendKeys(clientCodeValidation);
            js.executeScript("arguments[0].scrollIntoView(true);", searchBtn);
            js.executeScript("arguments[0].click();", searchBtn);
        }
        else
        {
            System.out.println(clientCodeValidation);
        }

        int codeChecker = 0;
        while (codeChecker < 20) {
            if (!driver.findElements(By.xpath("//html/body/app-root/div/div/div[2]/app-home/div[2]/div/div[9]/div/div/div/div[4]/p[text()='" + clientCodeValidation + "']")).isEmpty()) {
                codeChecker = 20;
            } else {
                driver.findElements(By.xpath("iuohu"));
                codeChecker++;
            }
        }
        wait.until(ExpectedConditions.elementToBeClickable(clickConsignment));
        clickConsignment.click();
        Thread.sleep(2000);
        currentURL = driver.getCurrentUrl();
        String str = currentURL.substring(Math.max(currentURL.length() - 9, 0));
        consignNo = str;
        driver.switchTo().defaultContent();
        System.out.println(consignNo);
        return new ShippingPage(driver);
    }


    public ShippingPage ptFieldCheck () throws InterruptedException {
        parcelTrackingBtn.click();
        consignmentsCreatedToday.click();
        ptAdvSearch.click();

        ptValidTrackNo.sendKeys(consignNo);
        ptSearchBtn.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//html/body/form/div[3]/div[1]/div/div/div[1]/div/div/div/div[1]/div[7]/div/div[2]/div[3]/div/div/div[1]/div[1]/a/p[text()='" + consignNo + "']"));

        ptValidCusRef.sendKeys(ptCusRefValidation);
        ptSearchBtn.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//html/body/form/div[3]/div[1]/div/div/div[1]/div/div/div/div[1]/div[7]/div/div[2]/div[3]/div/div/div[1]/div[1]/a/p[text()='" + consignNo + "']"));
        ptValidCusRef.clear();

        ptValidDelName.sendKeys(clientCodeValidation);
        ptSearchBtn.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//html/body/form/div[3]/div[1]/div/div/div[1]/div/div/div/div[1]/div[7]/div/div[2]/div[3]/div/div/div[1]/div[1]/a/p[text()='" + consignNo + "']"));
        ptValidDelName.clear();

        ptValidPostcode.sendKeys(ptEircodeValidation);
        ptSearchBtn.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//html/body/form/div[3]/div[1]/div/div/div[1]/div/div/div/div[1]/div[7]/div/div[2]/div[3]/div/div/div[1]/div[1]/a/p[text()='" + consignNo + "']"));
        ptValidPostcode.clear();

        ptValidDelAddress.sendKeys(ptDelAddressValidation);
        ptSearchBtn.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//html/body/form/div[3]/div[1]/div/div/div[1]/div/div/div/div[1]/div[7]/div/div[2]/div[3]/div/div/div[1]/div[1]/a/p[text()='" + consignNo + "']"));
        ptValidDelAddress.clear();

        ptValidPhone.sendKeys(ptPhoneValidation);
        ptSearchBtn.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//html/body/form/div[3]/div[1]/div/div/div[1]/div/div/div/div[1]/div[7]/div/div[2]/div[3]/div/div/div[1]/div[1]/a/p[text()='" + consignNo + "']"));
        ptValidPhone.clear();

//        ptValidCountry.sendKeys(ptCountryValidation);
//        ptSearchBtn.click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//html/body/form/div[3]/div[1]/div/div/div[1]/div/div/div/div[1]/div[7]/div/div[2]/div[3]/div/div/div[1]/div[1]/a/p[text()='" + consignNo + "']"));
//        ptValidCountry.clear();

        ptValidEmail.sendKeys(ptEmailValidation);
        ptSearchBtn.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//html/body/form/div[3]/div[1]/div/div/div[1]/div/div/div/div[1]/div[7]/div/div[2]/div[3]/div/div/div[1]/div[1]/a/p[text()='" + consignNo + "']"));
        ptValidEmail.clear();

        Select servType = new Select(driver.findElement(By.name("serviceType")));
        servType.selectByVisibleText("Overnight");
        ptSearchBtn.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//html/body/form/div[3]/div[1]/div/div/div[1]/div/div/div/div[1]/div[7]/div/div[2]/div[3]/div/div/div[1]/div[1]/a/p[text()='" + consignNo + "']"));


        return new ShippingPage(driver);
    }

    public ShippingPage ptFieldNegativeCheck () throws InterruptedException {
        int randomNum = (int) (Math.random() * 1000000);
        java.lang.String randomClientCode = Integer.toString(randomNum);

        parcelTrackingBtn.click();
        consignmentsCreatedToday.click();
        ptAdvSearch.click();

        ptValidTrackNo.sendKeys(randomClientCode);
        ptSearchBtn.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(text(),'No Consignments Found. Please widen your search criteria.')]"));
        ptValidTrackNo.clear();

        ptValidCusRef.sendKeys(randomClientCode);
        ptSearchBtn.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(text(),'No Consignments Found. Please widen your search criteria.')]"));
        ptValidCusRef.clear();

        ptValidDelName.sendKeys(randomClientCode);
        ptSearchBtn.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(text(),'No Consignments Found. Please widen your search criteria.')]"));
        ptValidDelName.clear();

        ptValidPostcode.sendKeys(randomClientCode);
        ptSearchBtn.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(text(),'No Consignments Found. Please widen your search criteria.')]"));
        ptValidPostcode.clear();

        ptValidDelAddress.sendKeys(randomClientCode);
        ptSearchBtn.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(text(),'No Consignments Found. Please widen your search criteria.')]"));
        ptValidDelAddress.clear();

        ptValidPhone.sendKeys(randomClientCode);
        ptSearchBtn.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(text(),'No Consignments Found. Please widen your search criteria.')]"));
        ptValidPhone.clear();

        ptValidCountry.sendKeys(randomClientCode);
        ptSearchBtn.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(text(),'No Consignments Found. Please widen your search criteria.')]"));
        ptValidCountry.clear();

        ptValidEmail.sendKeys(randomClientCode);
        ptSearchBtn.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(text(),'No Consignments Found. Please widen your search criteria.')]"));
        ptValidEmail.clear();

        Select servType = new Select(driver.findElement(By.name("serviceType")));
        servType.selectByVisibleText("Cancelled On Arrival");
        ptSearchBtn.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(text(),'No Consignments Found. Please widen your search criteria.')]"));


        return new ShippingPage(driver);
    }



    public ShippingPage ocrPDF () throws TesseractException {

        String inputFilePath = "C:/Users/rian.hayden/Documents/test.PDF";

        Tesseract tesseract = new Tesseract();

        String fullText = tesseract.doOCR(new File(inputFilePath));

        System.out.println(fullText);

        Assert.assertTrue(fullText.contains(consignNo));
        Assert.assertTrue(fullText.contains(countryText));

        return new ShippingPage(driver);
    }


    public ShippingPage saveLabelPDF () throws AWTException, InterruptedException {
        Thread.sleep(8000);
        String winHandleBefore = driver.getWindowHandle();

        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }

        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_SHIFT);
        //writing the folder name jars
        robot.keyPress(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_SHIFT);

        //Filename
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_LEFT);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
        return new ShippingPage(driver);
    }



    public ShippingPage createLabelAddAddressBook () throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,30);
        Thread.sleep(5000);
        driver.switchTo().frame("shippingmoduleiframe");
        assertTrue((createLabelBtn).isDisplayed());
        createLabelBtn.click();
        int randomNum = (int) (Math.random() * 1000000);
        java.lang.String randomClientCode = Integer.toString(randomNum);
        Thread.sleep(2500);
        clientCode.sendKeys(randomClientCode);
        clientCodeValidation = clientCode.getAttribute("value");
        orgName.sendKeys("test123");
        country.sendKeys("IRELAND");
        postCode.sendKeys("R35V274");
        addressLine1.sendKeys("128 ARDEN VALE");
        addressLine3.sendKeys("TULLAMORE");
        addressLine4.sendKeys("OFFALY");
        contactName.click();
        contactName.sendKeys("John Doe");
        contactNumber.sendKeys("0871234567");
        printBtn.click();
        wait.until(ExpectedConditions.elementToBeClickable(noAddressBookBtn));
        noAddressBookBtn.click();
        wait.until(ExpectedConditions.elementToBeClickable(exitBtn));
        exitBtn.click();
        wait.until(ExpectedConditions.elementToBeClickable(yesExitBtn));
        yesExitBtn.click();
        wait.until(ExpectedConditions.elementToBeClickable(advancedSearchBtn));
        advancedSearchBtn.click();
        clientCodeSearch.sendKeys(clientCodeValidation);
        searchBtn.click();
        Thread.sleep(2000);
        return new ShippingPage(driver);
    }

        public void printNum () {
        System.out.println("Client code is: "+clientCodeValidation+" Consignment no is: "+consignNo);
    }

    //public static void main(String[] args) throws ClassNotFoundException, SQLException {
      public ShippingPage validateConsignNo () throws ClassNotFoundException, SQLException {
        //Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"
        String dbUrl = "jdbc:mysql://10.1.2.70:3306/webdb";

        //Database Username
        String username = "root";

        //Database Password
        String password = "root";
        //SELECT wConsignmentRef.ConNo FROM wConsignmentRef WHERE wConsignment.ConNo = 900854050
        //Query to Execute
        String query = "SELECT mwConsignment.postcode FROM mwConsignment WHERE mwConsignment.ConsignmentNo = "+consignNo+";";

        //Load mysql jdbc driver
        Class.forName("com.mysql.jdbc.Driver");

        //Create Connection to DB
        Connection con = DriverManager.getConnection(dbUrl,username,password);

        //Create Statement Object
        Statement stmt = con.createStatement();

          /* Execute the SQL Query. Store results in ResultSet */
        ResultSet rs= stmt.executeQuery(query);

        // While Loop to iterate through all data and print results
        while (rs.next()){
            String myName = rs.getString(1);
            System. out.println(myName);
        }
        // closing DB Connection
        con.close();

        return new ShippingPage(driver);
    }

    public ShippingPage addressBookSaveAddress() throws InterruptedException {
        int randomNum = (int) (Math.random() * 999999);
        java.lang.String randomAddBook = Integer.toString(randomNum);
        Thread.sleep(2500);
        WebDriverWait wait = new WebDriverWait(driver,30);
        Thread.sleep(5000);
        driver.switchTo().frame("shippingmoduleiframe");
        wait.until(ExpectedConditions.elementToBeClickable(addressBookBtn));
        addressBookBtn.click();
        wait.until(ExpectedConditions.elementToBeClickable(addAddressBtn));
        //addAddressBtn.click();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", addAddressBtn);
        Thread.sleep(4000);
//        wait.until(ExpectedConditions.elementToBeClickable(saveAddress));
        //addBookSearchOrgName.click();
       // addBookSearchOrgName.sendKeys("test"+randomAddBook);
        addBookClientCode.click();
        addBookClientCode.sendKeys("test"+randomAddBook);
        country.click();
        country.sendKeys("IRELAND");
        companyName.click();
        companyName.sendKeys("company"+randomAddBook);
        addLine1.click();
        addLine1.sendKeys("122 Ardan");
        town.click();
        town.sendKeys("Tullamore");
        county.click();
        county.sendKeys("Offaly");
        contactNameAddBook.click();
        contactNameAddBook.sendKeys("RianTest");
        phoneAddBook.click();
        phoneAddBook.sendKeys("0838932198");
        saveAddress.click();

         /**
         * I will add address first with a random client code,
         * I can find this element and click it to be brought to the edit address page
         * I can then edit the address with a random org name and then search for this to ensure it their (visibility of?)
         * click into the edit address again and with the changed org name and delete the address
         * search for this again to ensure it is not there (for loop datalex?)
         * try all search field with address entered to ensure the search fields are working
         */

        return new ShippingPage(driver);
    }

    public ShippingPage addressBookOtherTests() throws InterruptedException {
        int randomNum = (int) (Math.random() * 999999);
        String editaddressUpdated;
        WebDriverWait wait = new WebDriverWait(driver,30);
        randomAddBook = addBookSearchOrgName.getAttribute("value");
        wait.until(ExpectedConditions.elementToBeClickable(clientCodeSearchAddBook));
        clientCodeSearchAddBook.sendKeys(randomAddBook);
        int codeChecker = 0;
        while (codeChecker < 20) {
            if (!driver.findElements(By.xpath("//td[contains(text(),'"+randomAddBook+"')]")).isEmpty()) {
                codeChecker = 20;
            } else {
                driver.findElements(By.xpath("iuohu"));
                codeChecker++;
            }
        }
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[contains(text(),'"+randomAddBook+"')]")));
        driver.findElement(By.xpath("//td[contains(text(),'"+randomAddBook+"')]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(editAddressBtn));
        editAddressBtn.click();
        companyName.click();
        companyName.sendKeys("company"+randomNum);
        editaddressUpdated = companyName.getAttribute("value");
        saveAddress.click();
        Thread.sleep(5000);
        addBookSearchOrgName.click();
        addBookSearchOrgName.sendKeys(editaddressUpdated);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[contains(text(),'"+editaddressUpdated+"')]")));
        driver.findElement(By.xpath("//td[contains(text(),'"+editaddressUpdated+"')]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(removeAddress));
        removeAddress.click();
        wait.until(ExpectedConditions.elementToBeClickable(areyousurAdd));
        areyousurAdd.click();

        /** now to check that the deleted address isnt there */
        Thread.sleep(5000);
        addBookSearchOrgName.sendKeys(editaddressUpdated);
        int codeChecker2 = 0;
        while (codeChecker2 < 20) {
            if (driver.findElements(By.xpath("//td[contains(text(),'"+editaddressUpdated+"')]")).isEmpty()) {
                codeChecker2 = 20;

            } else {
                driver.findElements(By.xpath("iuohu"));
                codeChecker2++;
            }
        }

        /**now to check that the deleted address isnt there
        //Then try all the search fields to make sure they work
         */

        //Then try all the search fields to make sure they work

        return new ShippingPage(driver);
    }

}
