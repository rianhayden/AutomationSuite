import static com.company.PageObjects.DataHelper.mapDataFromCSVToObject;
import static com.company.PageObjects.TestData.getCSVData;

import com.company.PageObjects.*;
import com.company.PageObjects.ParcelWizard.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import com.company.PageObjects.TestData;
import org.testng.annotations.Test;
import org.testng.*;

@Test(groups = {"regCSVData"})

public class PW_Test {

    @AfterMethod
    public void tearDown() throws Exception {
        try {

        } catch (Exception e) {

        }
    }

    String pwsite = "http://dpdparcelwizard.ie/Welcome#/login";

    //@Test(dataProvider = "regCSVData", dataProviderClass = TestData.class)
    public void createLabelAndValidate() throws Throwable {
        try {
            WebDriver driver;
            System.setProperty("webdriver.gecko.driver", "c:\\users\\rian.hayden\\firefoxdriver\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get(pwsite);
            LoginPW loginPW = new LoginPW(driver);
            DashboardPW dashboardPW = loginPW.loginCheck(driver);
            //dashboardPW.addressBookTest;
            TopupPW topupPW = dashboardPW.topUp(driver);
            driver.close();
        } catch (Exception e) {
            throw e;
        }
    }
}