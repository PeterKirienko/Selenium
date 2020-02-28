import com.qaprosoft.carina.core.foundation.AbstractTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import tutby.HomePage;
import tutby.SearchResultsPage;
import tutby.components.SearchResult;

import java.util.List;

public class SearchTest extends AbstractTest {
    @Test(description = "Check that search on tut.by return results")
    public void testSearch() {

        System.setProperty("webdriver.chrome.driver", "d:/temp/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        final String searchText = "коронавирус";

        HomePage tutbyHomePage = new HomePage(driver);
        tutbyHomePage.open();
        Assert.assertTrue(tutbyHomePage.isPageOpened());
        tutbyHomePage.getSearchPanel().enterTextToSearchTextbox(searchText);
        tutbyHomePage.getSearchPanel().clickSearchButton();

        SearchResultsPage searchResultsPage = new SearchResultsPage(tutbyHomePage);
        Assert.assertTrue(searchResultsPage.isPageOpened());
        List<SearchResult> searchResultList = searchResultsPage.getSearchResults();
        Integer allResults = 0;
        Integer matchingResults = 0;
        for (SearchResult searchResult : searchResultList) {
            if (searchResult.getTitle().contains(searchText)){
                matchingResults ++;
            }
            allResults++;
        }

        Assert.assertTrue(matchingResults > allResults/2, "Search text not found in 50% of results");
    }
}