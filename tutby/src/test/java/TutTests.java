import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TutTests {

    @Test(description = "Tut by Search")
    public void seachTutBy() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "d:/temp/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://tut.by/");
        Thread.sleep(15000);
        WebElement searchBox = driver.findElement(By.id("search_from_str"));
        searchBox.sendKeys("Беларусь");

        driver.findElement(By.name("search")).click();

        Thread.sleep(5000);
        driver.quit();
    }
}
