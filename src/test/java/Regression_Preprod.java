import com.company.PageObjects.DashboardPage;
import com.company.PageObjects.LoginPage;
import com.company.PageObjects.ShippingPage;
import com.company.PageObjects.TestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

@Test(groups = {"regCSVData"})

public class Regression_Preprod {

    @AfterMethod
    public void tearDown() throws Exception {
        try {

        } catch (Exception e) {

        }
    }

    String dpdsite = "https://cp-test.dpd.ie/";

    @Test(dataProvider = "regCSVDataPreprod", dataProviderClass = TestData.class)
    public void createLabelAndValidate(TestData testData) throws Throwable {
        try {
            WebDriver driver;
            System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get(dpdsite);
            if (testData.getOrgname().equalsIgnoreCase("roitoroi")) {
                LoginPage loginPage = new LoginPage(driver);
                loginPage.loginCheck(driver,testData);
            }
            else {
                System.out.println("not first login");
            }
            DashboardPage dashboardPage = new DashboardPage(driver);
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