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
import sun.awt.windows.ThemeReader;
import java.time.Duration;


public class CurrencyTest {
    @Test(description = "Проверка курса доллара")
    public  void testUSDToBYNRate() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "d:/temp/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3).getSeconds());

        driver.get("https://tut.by");
        WebElement tutByCourseElement =null;
        tutByCourseElement=driver.findElement(By.xpath("//span[@class='green']"));
        System.out.println("TUT BY Rate: " +tutByCourseElement.getText());
        float  tutByCourse=Float.valueOf(tutByCourseElement.getText().substring(1,tutByCourseElement.getText().length()-1));
        driver.quit();

        driver=new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(3).getSeconds());
        driver.get("http://www.nbrb.by/");
         String  snbrbByCourseElement=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//td[@class='align-right'])[14]"))).getAttribute("innerHTML");
        snbrbByCourseElement = snbrbByCourseElement.replace(',', '.');
        float nbrbCourse = Float.parseFloat(snbrbByCourseElement);
        System.out.println("NB RB Rate:  " +snbrbByCourseElement);


        Assert.assertEquals(tutByCourse,nbrbCourse);
        driver.quit();
    }
}