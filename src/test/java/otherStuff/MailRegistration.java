package otherStuff;


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

    @FindBy(xpath = "//*[@id=/root/]/div/div[2]/div/div[1]/div[2]/div/div/div/form/div[3]/button")
    WebElement submitButton;

    public MailRegistration() {
        property = new Properties(Integer.parseInt(Yandex_Path));
    }

    public  void YandexMailRegistration () throws InterruptedException {

        mailField.sendKeys(property.getProperty("EMAIL"));
        passwordField.sendKeys(property.getProperty("PASSWORD"));
        TimeUnit.SECONDS.sleep(3);
        submitButton.click();
        TimeUnit.SECONDS.sleep(3);
    }
}

