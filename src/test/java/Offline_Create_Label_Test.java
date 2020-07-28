import com.company.PageObjects.Offlline.DashboardPageOffline;
import com.company.PageObjects.Offlline.LoginPageOffline;
import com.company.PageObjects.Offlline.ShippingPageOffline;
import com.company.PageObjects.TestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

@Test(groups = {"regCSVData"})

public class Offline_Create_Label_Test {
    @AfterMethod
    public void tearDown() throws Exception {
        try {

        } catch (Exception e) {

        }
    }

    String dpdsite = "http://localhost:5000/login";

    @Test(dataProvider = "regCSVDataOffline", dataProviderClass = TestData.class)
    public void createLabelAndValidate(TestData testData) throws Throwable {
        try {
            ProfilesIni profile = new ProfilesIni();
            FirefoxProfile myprofile = profile.getProfile("C:\\Users\\rian.hayden\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\6k43pipd.default");
            FirefoxOptions options = new FirefoxOptions();
            options.setProfile(myprofile);
            options.addArguments("-headless");
            WebDriver driver;
            System.setProperty("webdriver.gecko.driver", "c:\\users\\rian.hayden\\firefoxdriver\\geckodriver.exe");
            driver = new FirefoxDriver(options);
            driver.get(dpdsite);
            LoginPageOffline loginPageOffline = new LoginPageOffline(driver);
            //loginPage.incorrectDetailsCheck(driver);
            DashboardPageOffline dashboardPageOffline = loginPageOffline.loginCheckOffline(driver,testData);
            ShippingPageOffline shippingPageOffline = dashboardPageOffline.dashboardCheck();
            shippingPageOffline.createLabel(testData);
            shippingPageOffline.saveLabelPDF();
            shippingPageOffline.exitAndValidate(testData);
            shippingPageOffline.printNum();
            //shippingPage.ocrPDF()+;
            driver.close();
        } catch (Exception e) {
            throw e;
        }
    }
}