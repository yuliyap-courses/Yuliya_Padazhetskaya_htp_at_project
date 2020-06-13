package Cucumber.SCFeatures.BasicSteps;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilites.Driver;

import java.util.Properties;

public class SilverSteps {

    public final String Yandex_Path;
    Properties property;
    public SilverSteps() {
        Yandex_Path = "src/test/java/properties/YandexMail.properties";
    }

    public void CheckPage (WebDriver driver){
    PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//*[@class=/sc-fyjhYU eVJmYW/]")
WebElement loginContainer;

@FindBy(xpath ="//*[@type= /email/]")
WebElement loginField;

@FindBy(xpath = "//*[@type= /password/]")
WebElement passwordField;

@FindBy(xpath = "//*[text()= /Войти/]")
WebElement loginButton;
@FindBy(xpath = "//*[contains(text(),'%s')]")
WebElement Allert;

@FindBy(xpath ="//*[@class = /sc-gzVnrw kpyERI/]" )
WebElement searchField;

@FindBy(xpath = "//*class='sc-fhiYOA hTrPQB']")
WebElement searchContainer;


public void OpenLoginContainer(){
    loginContainer.click();
}
public boolean EnterEmailToLoginField(Object o){
    loginField.sendKeys(property.getProperty("EMAIL"));
    return false;
}
public boolean EnterPasswordToPasswordField(Object o){
    passwordField.sendKeys(property.getProperty("PASSWORD"));
    return false;
}

public void SubmitByButton(){
    boolean value = false;
   loginButton.click();
}

public boolean AllertShows(String arg){
    return  Driver.getWebDriver().findElement((SearchContext) By.xpath(String.format(arg, Allert))).isDisplayed();
}

    public void SearchFilms(String searchWorld){
        loginField.sendKeys();
    }

    public void  SearchContainerShown(){
     searchContainer.findElement(By.xpath("//*class='sc-fhiYOA hTrPQB']")).sendKeys(Keys.RETURN);
}
}

