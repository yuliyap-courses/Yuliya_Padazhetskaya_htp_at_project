package CoursesDirectories.Cucumber.SCFeatures.LoginToSite;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginToSiteWithBlankLogin {

    SilverSteps silverSteps = new SilverSteps();
    WebDriver driver;

    @Given("I am on login page on Silver Screen site")
    public void iAmOnLoginPageOnSilverScreenSite() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/CoursesDirectories/Cucumber/SCFeatures/chromedriver");
        WebDriver driver =  new ChromeDriver();
        driver.get("https://silverscreen.by/");
    }

    @When("I left blank <login> field")
    public void iLeftBlankLoginField() {
        WebElement LoginContainer = driver.findElement(By.xpath("//*[@id='root']/header/div/div/div/div[3]/div[2]/div[3]/div[1]/div[1]/div[1]/span/div[2]/span"));
        Actions actionProvider = new Actions(driver);
        actionProvider.moveToElement(LoginContainer);

        silverSteps.OpenLoginContainer();
        silverSteps.SubmitByButton();
    }

    @Then("I see correct  message ")
    public void iSeeMessage(String string) {
       silverSteps.AllertShows();
    }

}
