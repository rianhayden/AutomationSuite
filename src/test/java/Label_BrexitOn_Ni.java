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

@Test(groups = {"regCSVDataBrexitOnNi"})

public class Label_BrexitOn_Ni {

    @AfterMethod
    public void tearDown() throws Exception {
        try {

        } catch (Exception e) {

        }
    }

    String dpdsite = "https://cp-test.dpd.ie/";

    @Test(dataProvider = "regCSVDataBrexitOnNi", dataProviderClass = TestData.class)
    public void createLabelAndValidate(TestData testData) throws Throwable {
        try {
            ProfilesIni profile = new ProfilesIni();
            FirefoxProfile myprofile = profile.getProfile("C:\\Users\\rian.hayden\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\6k43pipd.default");
            FirefoxOptions options = new FirefoxOptions();
            options.setProfile(myprofile);
            WebDriver driver;
            System.setProperty("webdriver.gecko.driver", "c:\\users\\rian.hayden\\firefoxdriver\\geckodriver.exe");
            driver = new FirefoxDriver(options);
            driver.get(dpdsite);
            LoginPage loginPage = new LoginPage(driver);
            //loginPage.incorrectDetailsCheck(driver);
            DashboardPage dashboardPage = loginPage.loginCheck(driver,testData);
            ShippingPage shippingPage = dashboardPage.dashboardCheck();
            shippingPage.createLabel(testData);
            shippingPage.saveLabelPDF();
            shippingPage.exitAndValidate(testData);
            shippingPage.printNum();
            //shippingPage.ocrPDF();
            driver.close();
        } catch (Exception e) {
            throw e;
        }
    }
}