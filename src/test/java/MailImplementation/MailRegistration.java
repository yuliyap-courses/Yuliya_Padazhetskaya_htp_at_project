package MailImplementation;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class MailRegistration {
    private final String Yandex_Path = "src/test/java/properties/YandexMail.properties";

    Properties property;

    @FindBy(xpath="//*[@id='username'")
    WebElement mailField;

    @FindBy (id="password")
    WebElement passwordField;

    @FindBy(xpath = "//*[@class='bui-button__text'")
    WebElement submitButton;

    @FindBy(xpath = "//*[contains(text(),'%noreply@booking.com')]")
    WebElement replyEmail;

    public  void YandexMailRegistration () throws InterruptedException{

        mailField.sendKeys(property.getProperty("EMAIL"));
        passwordField.sendKeys(property.getProperty("PASSWORD"));
        TimeUnit.SECONDS.sleep(3);
        submitButton.click();
        TimeUnit.SECONDS.sleep(3);
        replyEmail.isDisplayed();
    }

    public String getYandex_Path() {
        return Yandex_Path;
    }
}

