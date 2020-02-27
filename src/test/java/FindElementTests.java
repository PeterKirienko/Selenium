import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import tutby.HomePage;

public class FindElementTests {
    @Test(description = "Check that weather displayed in menu")
    public void testSearch() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "d:/temp/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        HomePage tutbyHomePage = new HomePage(driver);
        tutbyHomePage.open();
        ExtendedWebElement weather = tutbyHomePage.getMainMenu().getWeatherElement();
        Assert.assertNotNull(weather, "Weather not found on main page");
    }
}