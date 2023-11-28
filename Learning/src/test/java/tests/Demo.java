package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo
{
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
//        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        WebDriverManager.chromedriver().setup();
        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to the Salesforce login page
        driver.get("https://test.salesforce.com");
        driver.manage().window().maximize();



        // Find the username and password fields and enter your credentials
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        usernameField.sendKeys("");
        passwordField.sendKeys("Betaorg@2");

        // Find and click the login button
        WebElement loginButton = driver.findElement(By.id("Login"));
        loginButton.click();



        driver.quit();
    }



}
