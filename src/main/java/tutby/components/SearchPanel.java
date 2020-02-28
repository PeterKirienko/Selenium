package tutby.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchPanel extends AbstractUIObject {

    @FindBy(xpath = ".//*[@href=\"https://finance.tut.by/kurs/\"]/span")
    private ExtendedWebElement searchButton;

    @FindBy(xpath = ".//*[@href=\"https://finance.tut.by/kurs/\"]/span")
    private ExtendedWebElement searchTextbox;

    public SearchPanel(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void enterTextToSearchTextbox(String text)
    {
        searchTextbox.type(text);
    }

    public void clickSearchButton()
    {
        searchButton.click();
    }

}