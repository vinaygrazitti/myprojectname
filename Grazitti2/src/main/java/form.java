import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class form {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        WebElement fullname = driver.findElement(By.id("userName"));
        WebElement email = driver.findElement(By.id("userEmail"));
        WebElement caddress = driver.findElement(By.id("currentAddress"));
        WebElement paddress = driver.findElement(By.id("permanentAddress"));
        WebElement submit = driver.findElement(By.id("submit"));
        fullname.sendKeys("Vinaykumar");
        email.sendKeys("vinayattri32@gmail.com");
        caddress.sendKeys("gopalpur");
        paddress.sendKeys("vill thana teh sarkaghat");
        submit.click();
       



    }
}
