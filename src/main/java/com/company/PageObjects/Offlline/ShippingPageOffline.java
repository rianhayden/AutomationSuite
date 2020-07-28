package com.company.PageObjects.Offlline;


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

//import org.bytedeco.javacpp.*;
//import org.junit.Test;
//import static org.bytedeco.javacpp.lept.*;
//import static org.bytedeco.javacpp.tesseract.*;

public class ShippingPageOffline {
    private WebDriver driver;


    @FindBy (name = "ClientCode")
    public WebElement clientCode;

    @FindBy (name = "AddressName")
    public WebElement orgName;

    @FindBy (name = "addressName")
    public WebElement addBookSearchOrgName;

    @FindBy (name = "Country")
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

    @FindBy (id = "mat-input-2")
    public WebElement addressLine3;

    @FindBy (id = "mat-input-3")
    public WebElement addressLine4;

    @FindBy (name = "Mobile")
    public WebElement mobile;

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

    @FindBy(xpath = "//*[@id='Customs']/div/div/div/div[2]/div[1]/div[6]/input")
    public WebElement comCodeValue;

    @FindBy(xpath = "//*[@id='Customs']/div/div/div/div[2]/div[1]/div[8]/input")
    public WebElement comCodeDescription;

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

    public String clientCodeValidation;
    public String randomAddBook;
    public String consignNo;
    public String orgNameTest;
    public String countryText = "IRELAND";
    public String eirCodeText = "R35V274";
    String currentURL;
    String NI = "NORTHERN IRELAND";

    public ShippingPageOffline(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ShippingPageOffline createLabel (TestData testData) throws InterruptedException,AWTException {
        Thread.sleep(2000);
        //driver.switchTo().frame("shippingmoduleiframe");
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(createLabelBtn));
        createLabelBtn.click();
        wait.until(ExpectedConditions.elementToBeClickable(clientCode));
        String winHandleBefore = driver.getWindowHandle();

        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }

        int randomNum = (int) (Math.random() * 999999);
        String randomClientCode = Integer.toString(randomNum);
        orgName.sendKeys(testData.getOrgname());
        orgName.sendKeys(randomClientCode);
        clientCodeValidation = orgName.getAttribute("value");
        country.sendKeys(testData.getCountry());
        postCode.sendKeys(testData.getPostcode());

//        if (testData.getCountry().equalsIgnoreCase("NORTHERN IRELAND")) {
////            clientCode.click();
////            wait.until(ExpectedConditions.elementToBeClickable(BTAccept));
////            BTAddressEntry.sendKeys(testData.getAddLine1().substring(0,1));
////            BTAccept.click();
//            System.out.println("ni");
//        } else {
            addressLine1.sendKeys(testData.getAddLine1());
            addressLine2.sendKeys(testData.getAddLine2());
            addressLine3.sendKeys(testData.getAddLine3());
            addressLine4.sendKeys(testData.getAddLine4());
            addressLine2.click();

        driver.switchTo().defaultContent();
        contactName.click();
        contactName.sendKeys(testData.getContactName());
        mobile.sendKeys(testData.getContactNum());
        email.sendKeys(testData.getContactEmail());
        contactNumber.sendKeys(testData.getContactNum());

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
        }
            else { System.out.println("no ret rec"); }

        if (testData.getCustoms().equals("brexit")) {
                customsFillBrexitOn(testData);
            }
        else { System.out.println("no ret rec"); }

        Thread.sleep(1000);
        return new ShippingPageOffline(driver);
    }

    public ShippingPageOffline customsFill (TestData testData) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(printBtn));

        if(testData.getOrgname().equals("euspecair")) {
            driver.switchTo().defaultContent();
            comCode.sendKeys("6302100000");
            ccQuantity.sendKeys("1");
            comCodeValue.sendKeys("300");
            ccDescription.click();
            ccDescription.sendKeys("euspecair");
            Select delMethod = new Select(driver.findElement(By.name("dMethod")));
            delMethod.selectByVisibleText("DPD Air");
            parcelWeight.sendKeys("8");
            printBtn.click();
        }
        else { System.out.println("no spec air"); }

        if(testData.getOrgname().equals("euspecclassic")) {
            driver.switchTo().defaultContent();
            comCode.sendKeys("6302100000");
            ccQuantity.sendKeys("1");
            comCodeValue.sendKeys("300");
            ccDescription.click();
            ccDescription.sendKeys("euspecclassic");
            Select delMethod = new Select(driver.findElement(By.name("dMethod")));
            delMethod.selectByVisibleText("DPD Classic");
            parcelWeight.sendKeys("8");
            printBtn.click();
        }
        else { System.out.println("no spec air"); }

        if(testData.getOrgname().equals("euspecnotaccepted")) {
            comCode.sendKeys("01012100");
            altAddRadio.click();
            delivAddRadio.click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'These goods cannot be accepted and transported by DPD')]")));
            comCode.clear();
            comCode.sendKeys("6302100000");
            ccQuantity.sendKeys("1");
            comCodeValue.sendKeys("300");
            wait.until(ExpectedConditions.elementToBeClickable(ccDescription));
            ccDescription.click();
            ccDescription.sendKeys("euspecnotaccepted");
            parcelWeight.sendKeys("8");
            printBtn.click();
        }
        else { System.out.println("no euspecnotaccepted"); }

        if(testData.getOrgname().equals("rownotaccepted")) {
            comCode.sendKeys("01012100");
            altAddRadio.click();
            delivAddRadio.click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'These goods cannot be accepted and transported by DPD')]")));
            comCode.clear();
            comCode.sendKeys("6302100000");
            ccQuantity.sendKeys("1");
            comCodeValue.sendKeys("300");
            wait.until(ExpectedConditions.elementToBeClickable(ccDescription));
            ccDescription.click();
            ccDescription.sendKeys("rownotaccepted");
            parcelWeight.sendKeys("8");
            printBtn.click();
        }
        else { System.out.println("no rownotaccepted"); }

        if(testData.getOrgname().equals("rownormal")) {
            comCode.sendKeys("26121010");
            comCodeDescription.click();
            comCode.click();
            ccQuantity.sendKeys("1");
            comCodeValue.sendKeys("300");
            ccDescription.click();
            ccDescription.sendKeys("rownormal");
            parcelWeight.sendKeys("8");
            printBtn.click();
        }
        else { System.out.println("no spec rownormal"); }

        if(testData.getOrgname().equals("rowyeslicensing")) {
            comCode.sendKeys("6801000000");
            comCodeDescription.click();
            comCode.click();
            ccQuantity.sendKeys("1");
            comCodeValue.sendKeys("300");
            Thread.sleep(3000);
          //  ccDescription.click();
           // ccDescription.sendKeys("rowyeslicensing");
            WebElement webl = driver.findElement(By.xpath("//div[label[contains(., 'Description')]]/input"));
            WebElement contact = driver.findElement((By.name("FirstName")));
            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("arguments[0].scrollIntoView(true);", webl);
            js.executeScript("arguments[0].value='rowyeslicensing';", webl);
//          box44code.click();
            parcelWeight.sendKeys("8");
            parcelWeight.click();
            js.executeScript("arguments[0].scrollIntoView(true);", contact);
            contactNumber.click();
            js.executeScript("arguments[0].value=' ';", webl);
            parcelWeight.click();
            printBtn.click();
        }
        else { System.out.println("no spec rowyeslicensing"); }

        if(testData.getOrgname().equals("rownolicensing")) {
            comCode.sendKeys("26121010");
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

        return new ShippingPageOffline(driver);
    }

    public ShippingPageOffline customsFillBrexitOn (TestData testData) throws InterruptedException {
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

        return new ShippingPageOffline(driver);
    }

    public ShippingPageOffline exitAndValidate (TestData testData) throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(exitBtn));
        exitBtn.click();
        wait.until(ExpectedConditions.elementToBeClickable(yesExitBtn));
        yesExitBtn.click();
        driver.navigate().refresh();
        //wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("shippingmoduleiframe"));
        wait.until(ExpectedConditions.elementToBeClickable(createLabelBtn));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        clientCodeSearch.sendKeys(clientCodeValidation);
        searchBtn.click();
        Thread.sleep(2000);
        if(!searchBtn.isDisplayed())
        {
            //wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("shippingmoduleiframe"));
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
        return new ShippingPageOffline(driver);
    }

    public ShippingPageOffline ocrPDF () throws TesseractException {

        String inputFilePath = "C:/Users/rian.hayden/Documents/test.PDF";

        Tesseract tesseract = new Tesseract();

        String fullText = tesseract.doOCR(new File(inputFilePath));

        System.out.println(fullText);

        Assert.assertTrue(fullText.contains(consignNo));
        Assert.assertTrue(fullText.contains(countryText));

        return new ShippingPageOffline(driver);
    }


    public ShippingPageOffline saveLabelPDF () throws AWTException, InterruptedException {
        Thread.sleep(5000);
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
        return new ShippingPageOffline(driver);
    }



    public ShippingPageOffline createLabelAddAddressBook () throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,30);
        Thread.sleep(5000);
        //driver.switchTo().frame("shippingmoduleiframe");
        assertTrue((createLabelBtn).isDisplayed());
        createLabelBtn.click();
        int randomNum = (int) (Math.random() * 1000000);
        String randomClientCode = Integer.toString(randomNum);
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
        return new ShippingPageOffline(driver);
    }

        public void printNum () {
        System.out.println("Client code is: "+clientCodeValidation+" Consignment no is: "+consignNo);
    }

    //public static void main(String[] args) throws ClassNotFoundException, SQLException {
      public ShippingPageOffline validateConsignNo () throws ClassNotFoundException, SQLException {
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

        return new ShippingPageOffline(driver);
    }

    public ShippingPageOffline addressBookSaveAddress() throws InterruptedException {
        int randomNum = (int) (Math.random() * 999999);
        String randomAddBook = Integer.toString(randomNum);
        Thread.sleep(2500);
        WebDriverWait wait = new WebDriverWait(driver,30);
        Thread.sleep(5000);
       //driver.switchTo().frame("shippingmoduleiframe");
        wait.until(ExpectedConditions.elementToBeClickable(addressBookBtn));
        addressBookBtn.click();
        wait.until(ExpectedConditions.elementToBeClickable(addAddressBtn));
        addAddressBtn.click();
        wait.until(ExpectedConditions.elementToBeClickable(saveAddress));
        addBookSearchOrgName.sendKeys("test"+randomAddBook);
        country.sendKeys("IRELAND");
        companyName.sendKeys(randomAddBook);
        addLine1.sendKeys("122 Ardan");
        town.sendKeys("Tullamore");
        county.sendKeys("Offaly");
        contactNameAddBook.sendKeys("RianTest");
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

        return new ShippingPageOffline(driver);
    }

    public ShippingPageOffline addressBookOtherTests() throws InterruptedException {
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
        companyName.sendKeys("company"+randomNum);
        editaddressUpdated = companyName.getAttribute("value");
        saveAddress.click();
        Thread.sleep(5000);
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

        return new ShippingPageOffline(driver);
    }
}
