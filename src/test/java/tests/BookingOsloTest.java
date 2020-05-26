import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class BookingOsloTest {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "src/test/java/webDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.booking.com/");


        WebElement city_Oslo = driver.findElement(By.xpath("//*[@id='ss']"));
        city_Oslo.sendKeys("Oslo");

        driver.findElement(By.xpath("//div[@data-calendar2-title='Приезжаю']")).click();


        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 1);

        Date threeDays = calendar.getTime();
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        Date tenDays = calendar.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String datePlusTreeDays = dateFormat.format(threeDays);
        String datePlusTenDays = dateFormat.format(tenDays);

        WebElement dateFrom = driver.findElement(By.xpath(String.format("//*[contains(@data-date,'%s')]", datePlusTreeDays)));
        dateFrom.click();
        WebElement dateTo = driver.findElement(By.xpath(String.format("//*[contains(@data-date,'%s')]", datePlusTenDays)));
        dateTo.click();

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


        WebElement hotelThree = driver.findElement(By.xpath("//*[@data-id='class-3']"));
        hotelThree.click();
        Thread.sleep(3000);

        WebElement hotelFour = driver.findElement(By.xpath("//*[@data-id='class-4']"));
        hotelFour.click();
        Thread.sleep(3000);

        Actions builder2 = new Actions(driver);

        WebElement goToTenthHotel = driver.findElement(By.xpath("//*[@data-hotelid][10]"));
        builder2.moveToElement(goToTenthHotel).perform();
        Thread.sleep(3000);

        WebElement nameOfTenthHotel = driver.findElement(By.xpath("//*[@data-hotelid][10]//span[contains(@class,'sr-hotel__name')]"));
        builder2.moveToElement(nameOfTenthHotel).perform();
        Thread.sleep(3000);

        WebElement highLightTenthHotel = driver.findElement(By.xpath("//*[@data-hotelid][10]"));
        builder2.moveToElement(highLightTenthHotel).perform();
        Thread.sleep(3000);

        WebElement highLightNameOfTenthHotel = driver.findElement(By.xpath("//*[@data-hotelid][10]//span[contains(@class,'sr-hotel__name')]"));
        builder2.moveToElement(highLightNameOfTenthHotel).perform();
        Thread.sleep(3000);

        //Assert.assertTrue("Something wrong", "color: red;", highLightNameOfTenthHotel.getAttribute("style"));
driver.close();
    }
}
    /*8public static void highLightElementInGreen(WebElement element) {
        JavascriptExecutor js = new JavascriptExecutor;
        js.executeScript("arguments[0].setAttribute('style','background: green;');", element);
    }

    public static void highLightTextInRed(WebElement text) {
        JavascriptExecutor js = new JavascriptExecutor;
        js.executeScript("arguments[0].setAttribute('style','color: red;');", text);
    }*/



