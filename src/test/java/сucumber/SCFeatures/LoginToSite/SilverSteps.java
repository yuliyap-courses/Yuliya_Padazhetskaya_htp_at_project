package сucumber.SCFeatures.LoginToSite;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Properties;

public class SilverSteps {
    WebDriver driver;

    public final String Yandex_Path;
    Properties property;

    public SilverSteps() {
        Yandex_Path = "src/test/java/properties/YandexMail.properties";
    }

    @FindBy(xpath = "//*[contains(text(),'Вход и привилегии')]")
     WebElement enterLink;

    @FindBy(xpath = "//*[contains(text(),'Вход в личный кабинет')]")
    WebElement loginContainer;

    @FindBy(xpath = "//*[@type= /email/]")
    WebElement loginField;

    @FindBy(xpath = "//*[@type= /password/]")
    WebElement passwordField;

    @FindBy(xpath = "//*[text()= /Войти/]")
    WebElement loginButton;

    @FindBy(xpath = "//*[contains(text(),'%s')]")
    WebElement Allert;

    @FindBy(xpath = "//*[@class = '/sc-gzVnrw kpyERI/']")
    WebElement searchField;

    @FindBy(xpath = "//*class='sc-fhiYOA hTrPQB']")
    WebElement searchContainer;

    public  void MoveMouseToEnterElem(){
        enterLink.isSelected();
}
    public void OpenLoginContainer() {
        try {
            loginContainer.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loginContainer.isDisplayed();
    }

    public boolean EnterEmailToLoginField(Object o) {
        loginField.sendKeys(property.getProperty("EMAIL"));
        return false;
    }

    public boolean EnterPasswordToPasswordField(Object o) {
        passwordField.sendKeys(property.getProperty("PASSWORD"));
        return false;
    }

    public void SubmitByButton() {
        boolean value = false;
        loginButton.click();
    }

   public void AllertShows() {
       Allert.isDisplayed();

    }

    public void SearchFilms(String SearchWorld) {
        loginField.sendKeys();
    }

    public void SearchContainerShown() {
        searchContainer.findElement(By.xpath("//*class='sc-fhiYOA hTrPQB']")).sendKeys(Keys.RETURN);
    }

    public void CompareSearchWorld(String SearchWord){

    }

}