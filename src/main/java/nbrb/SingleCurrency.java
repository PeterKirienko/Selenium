package nbrb;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SingleCurrency extends AbstractUIObject {
    public SingleCurrency(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @FindBy(className = "curName")
    private ExtendedWebElement currencyName;

    @FindBy(className = "curAmount")
    private ExtendedWebElement currencyAmount;

    @FindBy(className = "curCours")
    private ExtendedWebElement currencyCours;

    public String getCurrencyName() {
        return currencyName.getText();
    }

    public String getCurrencyAmount() {
        return currencyAmount.getText();
    }

    public String getCurrencyCours() {
        return currencyCours.getText();
    }
}
