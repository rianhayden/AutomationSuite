import static com.company.PageObjects.DataHelper.mapDataFromCSVToObject;
import static com.company.PageObjects.TestData.getCSVData;

import com.company.PageObjects.*;
import com.company.PageObjects.QTest.LoginPageQT;
import com.company.PageObjects.QTest.LoginPageQT;
import com.company.PageObjects.QTest.TestExecutionPageQT;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import com.company.PageObjects.TestData;
import org.testng.annotations.Test;
import org.testng.*;

@Test(groups = {"regCSVData"})

public class Create_Label_Test {

    @AfterMethod
    public void tearDown() throws Exception {
        try {

        } catch (Exception e) {

        }
    }

    String dpdsite = "https://cp.dpd.ie/CustomerPortal/logon";
    String qtestsite = "https://dpdireland.qtestnet.com/p/97972/portal/project#tab=testexecution";

    @Test(dataProvider = "regCSVData", dataProviderClass = TestData.class)
    public void createLabelAndValidate(TestData testData) throws Throwable {
        try {
//            ProfilesIni profile = new ProfilesIni();
//            FirefoxProfile myprofile = profile.getProfile("C:\\Users\\rian.hayden\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\kpe5reuv.Default User 2");
//            FirefoxOptions options = new FirefoxOptions();
//            options.setProfile(myprofile);
//            options.addArguments("-headless");
            WebDriver driver;
            System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get(dpdsite);
            LoginPage loginPage = new LoginPage(driver);
           // driver.get(qtestsite);
           // LoginPageQT loginPageQT = new LoginPageQT(driver);
           // TestExecutionPageQT testExecutionPageQT = loginPageQT.login();
           // testExecutionPageQT.executeTest();
            //loginPage.incorrectDetailsCheck(driver);
            DashboardPage dashboardPage = loginPage.loginCheck(driver,testData);
            ShippingPage shippingPage = dashboardPage.dashboardCheck();
            shippingPage.createLabel(testData);
            shippingPage.saveLabelPDF();
            shippingPage.exitAndValidate(testData);
            shippingPage.printNum();

            driver.close();
        } catch (Exception e) {
            throw e;
        }
    }
}