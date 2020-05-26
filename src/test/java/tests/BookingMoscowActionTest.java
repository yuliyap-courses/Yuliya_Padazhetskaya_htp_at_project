package tests;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BookingMoscowActionTest {


    public static void main(MysqlxDatatypes.Scalar.String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/java/webDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.booking.com/");


        WebElement city_show = driver.findElement(By.xpath("//*[@id='ss']"));
        city_show.sendKeys("Moscow");

        driver.findElement(By.xpath("//div[@data-calendar2-title='Приезжаю']")).click();

        //Calendar testing

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 3);

        Date threeDays = calendar.getTime();
        calendar.add(Calendar.DAY_OF_YEAR, 10);
        Date tenDays = calendar.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String datePlusTreeDays = dateFormat.format(threeDays);
        String datePlusTenDays = dateFormat.format(tenDays);

        WebElement dateFrom = driver.findElement(By.xpath(String.format("//*[contains(@data-date,'%s')]", datePlusTreeDays)));
        dateFrom.click();
        WebElement dateTo = driver.findElement(By.xpath(String.format("//*[contains(@data-date,'%s')]", datePlusTenDays)));
        dateTo.click();

        //actions using
        Actions builder = new Actions(driver);
            builder.moveToElement(driver.findElement
                    (By.xpath("//*[@id='xp__guests__toggle']/span[2]/span[1]"))).click().build().perform();
        builder.moveToElement(driver.findElement
                (By.xpath("//*[@id='xp__guests__inputs-container']/div/div/div[1]/div/div[2]/button[2]/span")))
                .doubleClick().build().perform();
        builder.moveToElement(driver.findElement
                (By.xpath("//*[@id='frm']/div[1]/div[4]/div[2]/button/span[1]"))).click().build().perform();

        builder.moveToElement(driver.findElement(By.xpath("//*[@id='filter_price']/div[2]/a[1]/label/div/span[1]")))
                .click().build().perform();

        builder.moveToElement(driver.findElement(By.xpath("//*[@id='filter_price']/div[2]/a[1]/label/div/span[1]")))
                .click().build().perform();

        //tofix

        WebElement firstOnTheList = driver.findElement(By.xpath("//*[@data-hotelid][1]//div[contains(@class,'bui-price-display__value prco-inline-block-maker-helper')]"));
        String priceOfFirstOnTheList = firstOnTheList.getText().replaceAll("[^0-9]+", "");
        int hotelPerNight = Integer.parseInt(priceOfFirstOnTheList) / 5;
        System.out.println("Price per night of first on the list from " + hotelPerNight);
        driver.close();

    }
}