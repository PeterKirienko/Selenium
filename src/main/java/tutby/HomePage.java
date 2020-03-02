package tutby;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import tutby.components.MainMenu;
import tutby.components.SearchPanel;
import tutby.components.SelectCityMenu;

public class HomePage extends AbstractPage {

    @FindBy(id = "mainmenu")
    private MainMenu mainMenu;

    @FindBy(id = "search")
    private SearchPanel searchPanel;

    @FindBy(className = "modal-content")
    private SelectCityMenu selectCityMenu;

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

    public SelectCityMenu getSelectCityMenu() {
        return selectCityMenu;
    }

    public boolean isSelectCityMenuOpened() {
        return selectCityMenu.isUIObjectPresent();
    }

}
