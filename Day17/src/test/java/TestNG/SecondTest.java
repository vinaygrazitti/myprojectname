package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecondTest {
    WebDriver driver;
    @Test(priority = 1)
    void openApp()
    {
       WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        }
    @Test(priority = 2)
        void loginApp() {
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[contains(@type, 'submit')]")).click();

    }
    @Test(priority = 3)
    void closeApp()
    {
driver.close();
    }

}
