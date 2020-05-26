
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BookingParisTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/java/webDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.booking.com/");


        WebElement city_enter;
        city_enter = driver.findElement(By.xpath("//*[@id='ss']"));
        city_enter.findElement(By.xpath("//*[@id='ss']")).sendKeys("Paris");


        driver.findElement(By.xpath
                ("//div[@data-calendar2-title='Приезжаю']")).click();

        driver.findElement(By.xpath("//div[@data-calendar2-title='Приезжаю']")).click();
        //Calendar testing
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 3);

        Date threeDays = calendar.getTime();
        calendar.add(Calendar.DAY_OF_YEAR, 7);
        Date tenDays = calendar.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String datePlusTreeDays = dateFormat.format(threeDays);
        String datePlusTenDays = dateFormat.format(tenDays);

        WebElement dateFrom=driver.findElement(By.xpath(String.format("//*[contains(@data-date,'%s')]",datePlusTreeDays)));
        dateFrom.click();
        WebElement dateTo=driver.findElement(By.xpath(String.format("//*[contains(@data-date,'%s')]", datePlusTenDays)));
        dateTo.click();

//room selector

        WebElement roomClicker=driver.findElement(By.xpath("//*[@id='frm']/div[1]/div[3]"));
        roomClicker.click();

        WebElement roomSelector=driver.findElement(By.xpath("//*[@id='xp__guests__inputs-container']/div/div/div[1]/div/div[2]/button[2]/span"));
        roomSelector.click();
        roomSelector.click();

        WebElement nightClicker =driver.findElement(By.xpath("//*[@id='xp__guests__inputs-container']/div/div/div[3]/div/div[2]/button[2]/span"));
        nightClicker.click();

        WebElement selectorSubmit=driver.findElement(By.xpath("//*[@id='frm']/div[1]/div[4]/div[2]/button/span[1]"));
        selectorSubmit.submit();

        WebElement checkboxClick = driver.findElement(By.xpath("//*[@id='filter_price']/div[2]/a[5]/label/div/span[1]"));
        checkboxClick.click();
        if (checkboxClick.isSelected()){
            System.out.print(true);
        }


        WebElement price = driver.findElement(By.xpath("//*[@data-id='pri-5']"));
        price.click();
        String budgetFrom = price.getText().replaceAll("[^0-9]+", "");
        System.out.println("Budget per night from " + budgetFrom);
        int budgetPerNight = Integer.parseInt(budgetFrom);
        Thread.sleep(5000);

        WebElement lowest = driver.findElement(By.xpath("//*[@class=' sort_category   sort_price ']"));
        lowest.click();
        Thread.sleep(5000);

        WebElement MinFromMax = driver.findElement(By.xpath("//*[@data-hotelid][1]//div[contains(@class,'bui-price-display__value prco-inline-block-maker-helper')]"));
        String minPriceFromMax = MinFromMax.getText().replaceAll("[^0-9]+", "");
        int hotelPerNight = Integer.parseInt(minPriceFromMax) / 7;
        System.out.println("Minimum price per night from " + hotelPerNight);

        driver.close();
    }
}
