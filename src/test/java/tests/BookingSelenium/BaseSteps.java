package tests.BookingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseSteps {

        public static void FindElement(By xpath, WebDriver driver){
            WebElement SomeElement = driver.findElement(By.xpath(String.valueOf(xpath)));
            SomeElement.click();}

        public static void ClickToElement(By xpath, WebDriver driver){
            WebElement  SomeElement = driver.findElement(By.xpath(String.valueOf(xpath)));
            SomeElement.click(); }

        public static void SendKeysToXpath(By xpath, String keys, WebDriver driver) {
            WebElement SomeElement = driver.findElement(By.xpath(String.valueOf(xpath)));
            SomeElement.sendKeys(keys); }
}








