package utilites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    ConfigReader configReader = new ConfigReader();
    WebDriver driver = createLocalDriver();
    private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";

    private WebDriver createDriver() {

        driver = createLocalDriver();
        return driver;
    }

    public WebDriver createLocalDriver() {
        driver = new ChromeDriver();
        String property = System.setProperty(configReader.getDriverPath(),("webdriver.chrome.driver"));
        return this.driver;
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

