package tests.Booking.MyNextTrip;

import MailImplementation.MailRegistration;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class MailTest {

    MailRegistration mailRegistration = new MailRegistration();

    @Before
    public void beforeTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://account.booking.com/sign-in");
    }

    @Test
    public void MailImplement() throws IOException, InterruptedException {
        mailRegistration.getYandex_Path();
        mailRegistration.YandexMailRegistration();

    }
}
