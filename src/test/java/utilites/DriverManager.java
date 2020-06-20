package utilites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    WebDriver driver = createLocalDriver();
    private WebDriver createDriver() {

        driver = createLocalDriver();
        return driver;
    }

    public WebDriver createLocalDriver() {
        driver = new ChromeDriver();
        return null;
    }

    public WebDriver getDriver() {
        if(driver == null) driver = createDriver();
        return driver;
    }
    public void closeDriver() {
        driver.close();
        driver.quit();
    }
}

