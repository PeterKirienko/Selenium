import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.JsonOutput;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class FindElementTests {

    @Test(description = "Findelement")
    public void testSearch() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "d:/temp/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3).getSeconds());

        driver.get("https://tut.by");
        driver.findElement(By.id("search_from_str")).sendKeys("погода" + Keys.ENTER);


         WebElement pogoda = driver.findElement(By.xpath("//ol[@class='b-results-list']/li[1]/h3/a[2]"));
         System.out.println(pogoda.getText());
         Assert.assertTrue(pogoda.getText().contains("GISMETEO - погода в Минске"));
         Thread.sleep(5000);
         driver.quit();



    }
}