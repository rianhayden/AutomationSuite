import com.company.PageObjects.DashboardPage;
import com.company.PageObjects.LoginPage;
import com.company.PageObjects.ShippingPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;


public class Parcel_Tracking_Test_IE {

    @FindBy(xpath = "//*[@id='loginButton']")
    public WebElement loginButton;

    String dpdsite = "https://cp-test.dpd.ie/";

    @Test
    public void parcelTrackingTest() throws Exception {
        WebDriver driver;
        System.setProperty("webdriver.ie.driver", "c:\\IEDriverServer.exe");
        DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
        caps.setCapability("ignoreZoomSetting", true);
        driver = new InternetExplorerDriver(caps);
        /* driver = new InternetExplorerDriver(); */
        driver.get(dpdsite);
        LoginPage loginPage = new LoginPage(driver);
        DashboardPage dashboardPage = loginPage.ptLoginCheck(driver);
        ShippingPage shippingPage = dashboardPage.dashboardCheck();
        shippingPage.createLabelParcelTracking();
        shippingPage.saveLabelPDF();
        shippingPage.ptExitAndValidate();
        shippingPage.printNum();
        shippingPage.ptFieldCheck();
        driver.close();
    }
}