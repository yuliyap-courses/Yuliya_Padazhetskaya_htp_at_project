package tests.BookingCucumber;

import MailImplementation.MailRegistration;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import utilites.DriverManager;

public class HeaderTest {

    MailRegistration mailRegistration = new MailRegistration();
    WebDriver driver;

    @FindBy(xpath = "//*[@id='top']/div/img")
    WebElement FirstElement;

    @FindBy(xpath = "//*[@id='user_form']/ul/li")
    WebElement SecondElement;

    @FindBy(xpath = "//*[@id='cross-product-bar']/div/a")
    WebElement ThirdElement;
    @FindBy(xpath = "//*[@id='cross-product-bar]/div/span")
    WebElement ForthElement;

    @Before
    public void beforeTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://account.booking.com/sign-in");
    }

    @Test

    public  void  checkElements() throws InterruptedException {
        mailRegistration.YandexMailRegistration();
        DriverManager driverManager = new DriverManager();

        FirstElement.isDisplayed();
        SecondElement.isDisplayed();
        ThirdElement.isDisplayed();
        ForthElement.isDisplayed();

        driverManager.closeDriver();
    }
}
