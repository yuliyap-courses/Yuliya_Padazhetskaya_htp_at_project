package CoursesDirectories.Cucumber.SCFeatures.LoginToSite;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToSiteWithBlankLogin {

    SilverSteps silverSteps = new SilverSteps();

    @Given("I am on login page on Silver Screen site")
    public void iAmOnLoginPageOnSilverScreenSite() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/CoursesDirectories/Cucumber/SCFeatures/chromedriver");
        WebDriver driver =  new ChromeDriver();
        driver.get("https://silverscreen.by/");
    }

    @When("I left blank <login> field")
    public void iLeftBlankLoginField() {
        silverSteps.OpenLoginContainer();
        silverSteps.EnterEmailToLoginField(null);
        silverSteps.EnterPasswordToPasswordField(null);
        if (silverSteps.EnterEmailToLoginField(null)){
            silverSteps.EnterPasswordToPasswordField(null);
        }
        else if(silverSteps.EnterPasswordToPasswordField(null)){
            System.exit(0);
        }
    }

    @Then("I see correct  message ")
    public void iSeeMessage(String string) {
       silverSteps.AllertShows();
    }

}
