package Cucumber.SCFeatures.BasicSteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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


public void OpenLoginContainer(){
    loginContainer.click();
}
public  void EnterEmailToLoginField(){
    loginField.sendKeys(property.getProperty("EMAIL"));
}
public  void EnterPasswordToPasswordField(){
    passwordField.sendKeys(property.getProperty("PASSWORD"));
}

public void SubmitByButton(){
    boolean value = false;
   loginButton.click();

}
}

