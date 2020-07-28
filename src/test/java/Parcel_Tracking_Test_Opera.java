import com.company.PageObjects.DashboardPage;
import com.company.PageObjects.LoginPage;
import com.company.PageObjects.ShippingPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.FindBy;


public class Parcel_Tracking_Test_Opera {

    @FindBy(xpath = "//*[@id='loginButton']")
    public WebElement loginButton;

    String dpdsite = "https://cp-test.dpd.ie/";

    @Test
    public void parcelTrackingTest() throws Exception {
        WebDriver driver;
        System.setProperty("webdriver.opera.driver", "c:\\operadriver.exe");
        driver = new OperaDriver();
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