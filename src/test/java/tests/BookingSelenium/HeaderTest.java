package tests.BookingSelenium;

import ApplicationItems.BaseSteps;
import MailImplementation.MailRegistration;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class HeaderTest {

    MailRegistration mailRegistration = new MailRegistration();
    BaseSteps baseSteps = new BaseSteps();
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
        mailRegistration.getYandex_Path();
        mailRegistration.YandexMailRegistration();
        driver.getCurrentUrl("https://www.booking.com/index.ru.html?label=gen173nr");

        FirstElement.isDisplayed();
        SecondElement.isDisplayed();
        ThirdElement.isDisplayed();
        ForthElement.isDisplayed();

        BaseSteps.KillDriver(driver);
    }
}
