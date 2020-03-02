package tutby.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class MainMenu extends AbstractUIObject {
    @FindBy(id = "geotarget_top_selector")
    private ExtendedWebElement selectCity;

    @FindBy(xpath = ".//*[@title=\"Почта\"]")
    private ExtendedWebElement mail;

    @FindBy(xpath = ".//*[@title=\"Финансы\"]")
    private ExtendedWebElement finance;

    @FindBy(xpath = "//*[@title=\"Афиша\"]")
    private ExtendedWebElement afisha;

    @FindBy(xpath = "//*[@title=\"Работа\"]")
    private ExtendedWebElement work;

    @FindBy(xpath = "//*[@title=\"Погода\"]")
    private ExtendedWebElement weather;

    @FindBy(xpath = "//*[@title=\"ТV-программа\"]")
    private ExtendedWebElement tvProgram;

    @FindBy(xpath = "//*[@title=\"Каталог цен\"]")
    private ExtendedWebElement catalog;

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

    public void clickCity()
    {
        selectCity.click();
    }

    public void clickMail()
    {
        mail.click();
    }

    public void clickFinance()
    {
        finance.click();
    }

    public void clickAfisha()
    {
        afisha.click();
    }

    public void clickWork()
    {
        work.click();
    }

    public void clickWeather()
    {
        weather.click();
    }

    public void clickTvprogram()
    {
        tvProgram.click();
    }

    public void clickCatalog()
    {
        catalog.click();
    }

    public void clickExchangeRate()
    {
        exchangeRate.click();
    }

}
