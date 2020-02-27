package tutby;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import tutby.components.MainMenu;

public class HomePage extends AbstractPage {

    @FindBy(id = "mainmenu")
    private MainMenu mainMenu;

    public HomePage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("https://www.tut.by/");
    }

    public MainMenu getMainMenu() {
        return mainMenu;
    }

}
