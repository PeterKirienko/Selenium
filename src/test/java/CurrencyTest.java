import com.qaprosoft.carina.core.foundation.AbstractTest;
import nbrb.NbrbRatesPage;
import nbrb.SingleCurrency;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import tutby.HomePage;
import java.util.List;

public class CurrencyTest extends AbstractTest {
    @Test(description = "Check that USD rate is valid")
    public void testUSDToBYNRate() {

        System.setProperty("webdriver.chrome.driver", "d:/temp/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        HomePage tutbyHomePage = new HomePage(driver);
        tutbyHomePage.open();
        Float tutByRate = Float.valueOf(tutbyHomePage.getMainMenu().getExchangeRateFromMainMenu());

        NbrbRatesPage nbrbRatesPage = new NbrbRatesPage(driver);
        List<SingleCurrency> nbrbRates =  nbrbRatesPage.getNbrbCurrencyRows();
        Float nbrbUsdRate = 0F;
        for (SingleCurrency singleCurrency : nbrbRates) {
            if (singleCurrency.getCurrencyName() == "Доллар США"){
                nbrbUsdRate = Float.valueOf(singleCurrency.getCurrencyCours());
            }
        }
        Assert.assertEquals(nbrbUsdRate, tutByRate,
                "Rate from tut.by main page is " + tutByRate + " is not equal nbrb.by rate");
    }
}