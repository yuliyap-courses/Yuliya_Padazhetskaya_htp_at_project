package utilites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
    WebDriver driver = createLocalDriver();
    DriverType driverType;

    private WebDriver createDriver() {

        driver = createLocalDriver();
        return driver;
    }

    public WebDriver createLocalDriver() {
        switch (driverType) {
            case FIREFOX:
                driver = new FirefoxDriver();
                break;
            case CHROME:
                driver = new ChromeDriver();
                break; }
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

