package tests.BookingSelenium;

import ApplicationItems.BaseSteps;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static org.openqa.selenium.By.xpath;


public class BookingOsloTest {

    WebDriver driver;


    public void getDriver() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.booking.com/");
    }

    @Test
    public void OsloTest(){

        BaseSteps.SendKeysToXpath(xpath("//*[@id='ss']"),"Oslo",driver);

        BaseSteps.ClickToElement(xpath("//*[@id='//*class='sb-searchbox__button']"),driver);

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 1);

        Date threeDays = calendar.getTime();
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        Date tenDays = calendar.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String datePlusTreeDays = dateFormat.format(threeDays);
        String datePlusTenDays = dateFormat.format(tenDays);

        BaseSteps.FindElement(xpath(String.format("//*[contains(@data-date,'%s')]", datePlusTreeDays)),driver);
        BaseSteps.FindElement(xpath(String.format("//*[contains(@data-date,'%s')]", datePlusTenDays)),driver);

        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement
                (xpath("//*[@id='xp__guests__toggle']/span[2]/span[1]"))).click().build().perform();
        builder.moveToElement(driver.findElement
                (xpath("//*[@id='xp__guests__inputs-container']/div/div/div[1]/div/div[2]/button[2]/span")))
                .doubleClick().build().perform();
        builder.moveToElement(driver.findElement
                (xpath("//*[@id='frm']/div[1]/div[4]/div[2]/button/span[1]"))).click().build().perform();
        builder.moveToElement(driver.findElement(xpath("//*[@id='filter_price']/div[2]/a[1]/label/div/span[1]")))
                .click().build().perform();
        builder.moveToElement(driver.findElement(xpath("//*[@id='filter_price']/div[2]/a[1]/label/div/span[1]")))
                .click().build().perform();

        BaseSteps.FindElement(xpath("//*[@data-id='class-3']"),driver);

        WebElement hotelFour = driver.findElement(xpath("//*[@data-id='class-4']"));
        hotelFour.click();

        Actions builder2 = new Actions(driver);

        WebElement goToTenthHotel = driver.findElement(xpath("//*[@data-hotelid][10]"));
        builder2.moveToElement(goToTenthHotel).perform();

        WebElement nameOfTenthHotel = driver.findElement(xpath("//*[@data-hotelid][10]//span[contains(@class,'sr-hotel__name')]"));
        builder2.moveToElement(nameOfTenthHotel).perform();

        WebElement highLightTenthHotel = driver.findElement(xpath("//*[@data-hotelid][10]"));
        builder2.moveToElement(highLightTenthHotel).perform();

        WebElement highLightNameOfTenthHotel = driver.findElement(xpath("//*[@data-hotelid][10]//span[contains(@class,'sr-hotel__name')]"));
        builder2.moveToElement(highLightNameOfTenthHotel).perform();

        //Assert.assertTrue("Something wrong", "color: red;", highLightNameOfTenthHotel.getAttribute("style"));

    }
}


