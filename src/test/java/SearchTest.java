import com.qaprosoft.carina.core.foundation.AbstractTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import tutby.HomePage;
import tutby.SearchResultsPage;
import tutby.components.SearchResult;
import tutby.utils.SearchResultValidation;

import java.util.List;

public class SearchTest extends AbstractTest {
    @Test(description = "Check that search on tut.by return results")
    public void testSearch() {

        System.setProperty("webdriver.chrome.driver", "d:/temp/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        final String searchText = "коронавирус";
        final Double expectedSearchIndex = 0.5;

        HomePage tutbyHomePage = new HomePage(driver);
        tutbyHomePage.open();
        Assert.assertTrue(tutbyHomePage.isPageOpened());
        tutbyHomePage.getSearchPanel().enterTextToSearchTextbox(searchText);
        tutbyHomePage.getSearchPanel().clickSearchButton();

        SearchResultsPage searchResultsPage = new SearchResultsPage(tutbyHomePage);
        Assert.assertTrue(searchResultsPage.isPageOpened());
        List<SearchResult> searchResultList = searchResultsPage.getSearchResults();

        SearchResultValidation searchResultValidation = new SearchResultValidation();
        Integer resultIndex = searchResultValidation.checkResults(searchResultList, searchText);

        Assert.assertTrue(resultIndex > expectedSearchIndex,
                "Search text not found in " + expectedSearchIndex*100 +  " % of results");
    }

}