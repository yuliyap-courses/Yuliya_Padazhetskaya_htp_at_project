package tests.BookingSelenium;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import utilites.DriverManager;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static org.openqa.selenium.By.xpath;

public class BookingMoscowActionTest {

    WebDriver driver;

    @Test
    public void MoscowTest(){
        DriverManager driverManager = new DriverManager();
        driverManager.createLocalDriver();
        driverManager.getDriver();
        driver.get("https://www.booking.com/");

        BaseSteps.SendKeysToXpath(xpath("[//*[@id='ss']"),"Moscow",driver);
        //BaseSteps.ClickToElement(xpath("//*[@id='//*class='sb-searchbox__button']"),driver);

        //Calendar testing
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 3);
        Date threeDays = calendar.getTime();
        calendar.add(Calendar.DAY_OF_YEAR, 10);
        Date tenDays = calendar.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String datePlusTreeDays = dateFormat.format(threeDays);
        String datePlusTenDays = dateFormat.format(tenDays);
        //BaseSteps.FindElement(xpath(String.format("//*[contains(@data-date,'%s')]", datePlusTreeDays)), driver);
        //BaseSteps.FindElement(xpath(String.format("//*[contains(@data-date,'%s')]", datePlusTenDays)), driver);


        //actions using
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

        driverManager.closeDriver();

    }

}