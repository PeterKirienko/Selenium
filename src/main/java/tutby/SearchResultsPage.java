package tutby;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import tutby.components.SearchResult;

import java.util.List;

public class SearchResultsPage extends AbstractPage {

    @FindBy(xpath = "//*[@class=\"b-results-list\"]/li")
    private List<SearchResult> searchResults;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public SearchResultsPage(AbstractPage abstractPage) {
        super(abstractPage.getDriver());
    }

    public List<SearchResult> getSearchResults()
    {
        return searchResults;
    }

}
