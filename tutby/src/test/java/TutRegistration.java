import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TutRegistration {
    @Test(description = "Registration")
    public void testRegistration() throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "d:/temp/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://tut.by/");
        Thread.sleep(15000);
        driver.findElement(By.linkText("Войти")).click();
        driver.findElement(By.linkText("Зарегестрироваться")).click();
        WebElement pwd=driver.findElement(By.name("password"));
        pwd.click();
        pwd.sendKeys("admin");

        driver.findElement(By.name("search")).click();

        Thread.sleep(5000);
        driver.quit();
    }
}