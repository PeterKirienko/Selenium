package tutby.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchResult extends AbstractUIObject {


    @FindBy(xpath = ".//h3")
    private ExtendedWebElement resultTitle;

    @FindBy(className = "b-url__a")
    private ExtendedWebElement link;

    public SearchResult(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public String getTitle() {
        return resultTitle.getText();
    }

    public String getLink() {
        return link.getText();
    }

}
