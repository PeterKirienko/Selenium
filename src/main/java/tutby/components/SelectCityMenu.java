package tutby.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SelectCityMenu extends AbstractUIObject  {

    @FindBy(xpath = ".//*[@class=\"close\"]")
    private ExtendedWebElement closeIcon;

    public SelectCityMenu(WebDriver driver) {
        super(driver);
    }

    public void closeMenu() {
        closeIcon.click();
    }
}
