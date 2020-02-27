package nbrb;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NbrbRatesPage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"ratesData\"]//tbody/tr")
    private List<SingleCurrency> nbrbCurrencyRows;

    public NbrbRatesPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("http://www.nbrb.by/statistics/rates/ratesdaily.asp");
    }

    public List<SingleCurrency> getNbrbCurrencyRows()
    {
        return nbrbCurrencyRows;
    }
}
