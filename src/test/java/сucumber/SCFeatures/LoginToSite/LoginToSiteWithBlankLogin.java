package сucumber.SCFeatures.LoginToSite;

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
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.get("https://silverscreen.by/");;
    }

    @When("I left blank <login> field")
    public void iLeftBlankLoginField() throws InterruptedException {
        silverSteps.MoveMouseToEnterElem();

        silverSteps.OpenLoginContainer();
        silverSteps.SubmitByButton();
    }

    @Then("I see correct  message ")
    public void iSeeMessage(String string) {
       silverSteps.AllertShows();
    }

}
