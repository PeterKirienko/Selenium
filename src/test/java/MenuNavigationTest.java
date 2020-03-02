import com.qaprosoft.carina.core.foundation.AbstractTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import tutby.HomePage;
import tutby.MailTutByPage;

public class MenuNavigationTest extends AbstractTest {
    @Test(description = "Check navigation menu")
    public void testNavigationMenu() {
        System.setProperty("webdriver.chrome.driver", "d:/temp/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        HomePage tutbyHomePage = new HomePage(driver);
        tutbyHomePage.open();
        Assert.assertTrue(tutbyHomePage.isPageOpened());

        tutbyHomePage.getMainMenu().clickCity();
        Assert.assertTrue(tutbyHomePage.isSelectCityMenuOpened());
        tutbyHomePage.getSelectCityMenu().closeMenu();

        tutbyHomePage.getMainMenu().clickMail();
        MailTutByPage mailTutByPage = new MailTutByPage(driver);
        Assert.assertTrue(mailTutByPage.isPageOpened());
        tutbyHomePage.open();
    }
}
