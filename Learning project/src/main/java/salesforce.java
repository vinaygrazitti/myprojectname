public class salesforce {
    public static void main(String[] args)
    {

        // Create a new instance of the Firefox driver
        WebDriver driver = new chromeDriver();

        // Navigate to Salesforce login page
        driver.get("https://login.salesforce.com/");

        // Enter username and password
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        username.sendKeys("betaorg2@gmail.com");
        password.sendKeys("Betaorg@2");

        // Click on login button
        WebElement loginButton = driver.findElement(By.id("Login"));
        loginButton.click();
    }
}
}
