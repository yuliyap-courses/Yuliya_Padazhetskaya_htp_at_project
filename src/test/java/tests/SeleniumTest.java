package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

      public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/java/webDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https:google.com");
        //System.out.println(driver.getTitle());
        //System.out.println(driver.getCurrentUrl());
        //driver.navigate().to("https://.yandex.ru");
        //driver.navigate().back();
        //driver.navigate().refresh();

        WebElement element_enter;
        WebElement element_click;
        WebElement Element_show;

        element_enter = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
        element_enter.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Погода Минск");
        element_enter.submit();


        element_click = driver.findElement(By.xpath("//*[@id=\"wob_dp\"]/div[2]/div[1]"));
        element_click.findElement(By.xpath("//*[@id=\"wob_dp\"]/div[2]/div[1]")).click();

        driver.close();

        Element_show = driver.findElement(By.cssSelector("#wob_gsvg > text:nth-child(37)"));
        Element_show.findElement(By.cssSelector("#wob_gsvg > text:nth-child(37)")).getAttribute("area-label");
        System.out.println(Element_show);
    }
}
