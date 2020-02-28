package tutby;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import tutby.components.MainMenu;
import tutby.components.SearchPanel;

public class HomePage extends AbstractPage {

    @FindBy(id = "mainmenu")
    private MainMenu mainMenu;

    @FindBy(id = "search")
    private SearchPanel searchPanel;

    public HomePage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("https://www.tut.by/");
    }

    public MainMenu getMainMenu() {
        return mainMenu;
    }

    public SearchPanel getSearchPanel() {
        return searchPanel;
    }

}
