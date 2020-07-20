package tests.BookingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BaseSteps {
@FindBy(xpath = "[//*[@id='ss']")
    WebElement citySearchField;
//enter city
// click perform

@FindBy(xpath = "//*[@id='xp__guests__toggle']/span[2]/span[1]")
    WebElement  satellitesSearchSelector;

@FindBy(xpath = "//*[@id='//*class='sb-searchbox__button']")
    WebElement submitSearchButton;

         public void CitySearchField(WebElement citySearchField) {
        citySearchField.sendKeys();




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








