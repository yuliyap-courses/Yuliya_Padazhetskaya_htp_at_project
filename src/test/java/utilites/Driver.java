package utilites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import settings.Config;

public class Driver {
    private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();
    public static WebDriver getWebDriver(Config config) {
        if (webDriver.get() == null)
            webDriver.set(DriverManager.getDriver(config));
        return webDriver.get();
    }

    public static void initDriver(Config config)
    {
        Driver.initDriver(Config.CHROME);
    }

    public static void getWebDriver(By xpath) {
    }

    public static By getWebDriver() {
        return null;
    }
}

