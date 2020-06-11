package Cucumber.SCFeatures.BasicSteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SilverSteps {

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

public  void EnterEmailToLoginField(String email){
    loginField.sendKeys(email);
}
public  void EnterPasswordToPasswordField(String password){
    passwordField.sendKeys(password);
}

public void SubmitByButton(boolean value){
    if(!value) loginButton.click();
    try { Thread.sleep(3000);}
    catch (InterruptedException e) {}
}

}

