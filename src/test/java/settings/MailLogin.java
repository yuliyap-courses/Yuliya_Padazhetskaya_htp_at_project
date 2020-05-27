package settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import otherStuff.MailRegistration;

import java.io.IOException;

public class MailLogin {

    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver",
                "src/test/java/webDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://account.booking.com/sign-in");

        MailRegistration mailRegistration = new  MailRegistration();
        PageFactory.initElements(driver, mailRegistration);
        mailRegistration.YandexMailRegistration("EMAIL", "PASSWORD");
    }
}