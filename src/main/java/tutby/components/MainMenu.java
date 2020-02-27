package tutby.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class MainMenu extends AbstractUIObject {
    @FindBy(xpath = ".//*[@href=\"https://finance.tut.by/kurs/\"]/span")
    private ExtendedWebElement exchangeRate;

    @FindBy(xpath = ".//*[@class=\"weather\"]")
    private ExtendedWebElement weatherElement;

    public MainMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }


    public String getExchangeRateFromMainMenu()
    {
        return exchangeRate.getText();
    }

    public ExtendedWebElement getWeatherElement()
    {
        return weatherElement;
    }
}
