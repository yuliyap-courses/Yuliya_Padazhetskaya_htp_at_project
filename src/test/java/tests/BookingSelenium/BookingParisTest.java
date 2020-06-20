package tests.BookingSelenium;

import ApplicationItems.BaseSteps;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilites.DriverManager;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static org.openqa.selenium.By.xpath;

public class BookingParisTest{
    WebDriver driver;

@Test
public void ParisTest(){
        DriverManager driverManager = new DriverManager();
        driverManager.createLocalDriver();
        driverManager.getDriver();
        driver.get("https://www.booking.com/");

         BaseSteps.SendKeysToXpath(xpath("//*[@id='ss']"),"Paris", driver);
         BaseSteps.ClickToElement(xpath("//*[@id='//*class='sb-searchbox__button']"),driver);

        //Calendar testing
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 3);
        Date threeDays = calendar.getTime();
        calendar.add(Calendar.DAY_OF_YEAR, 7);
        Date tenDays = calendar.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String datePlusTreeDays = dateFormat.format(threeDays);
        String datePlusTenDays = dateFormat.format(tenDays);

        BaseSteps.FindElement(xpath(String.format("//*[contains(@data-date,'%s')]",datePlusTreeDays)),driver);
        BaseSteps.FindElement(xpath(String.format("//*[contains(@data-date,'%s')]", datePlusTenDays)),driver);
       //room selector
        BaseSteps.FindElement(xpath("//*[@id='frm']/div[1]/div[3]"), driver);
        BaseSteps.FindElement(xpath("//*[@id='xp__guests__inputs-container']/div/div/div[1]/div/div[2]/button[2]/span"),driver);
        BaseSteps.FindElement(xpath("//*[@id='xp__guests__inputs-container']/div/div/div[3]/div/div[2]/button[2]/span"),driver);
        BaseSteps.FindElement(xpath("//*[@id='frm']/div[1]/div[4]/div[2]/button/span[1]"), driver);
       //price testing
        WebElement price = driver.findElement(xpath("//*[@data-id='pri-5']"));
        price.click();
        String budgetFrom = price.getText().replaceAll("[^0-9]+", "");
        System.out.println("Budget per night from " + budgetFrom);
        int budgetPerNight = Integer.parseInt(budgetFrom);
        WebElement lowest = driver.findElement(xpath("//*[@class=' sort_category   sort_price ']"));
        lowest.click();
        WebElement MinFromMax = driver.findElement(xpath("//*[@data-hotelid][1]//div[contains(@class,'bui-price-display__value prco-inline-block-maker-helper')]"));
        String minPriceFromMax = MinFromMax.getText().replaceAll("[^0-9]+", "");
        int hotelPerNight = Integer.parseInt(minPriceFromMax) / 7;
        System.out.println("Minimum price per night from " + hotelPerNight);
        driverManager.closeDriver();
    }
}
