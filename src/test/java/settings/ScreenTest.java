package settings;

import org.openqa.selenium.WebDriver;

    public class ScreenTest {

        public static void setScreenRatio(ScreenRatio mode, WebDriver driver) {
            switch (mode) {
                case FULL_SCREEN:
                    setWindowMode(driver);
                case MAXIMIZE:
                    setMaximizeMode(driver);
            }
        }

        private static void setMaximizeMode(WebDriver driver) {
            driver.manage().window().maximize();
        }

        private static void setWindowMode(WebDriver driver) {
            driver.manage().window().fullscreen();
        }
    }


