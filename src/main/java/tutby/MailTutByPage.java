package tutby;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class MailTutByPage extends AbstractPage {
    public MailTutByPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("https://mail.tut.by/");
    }
}
