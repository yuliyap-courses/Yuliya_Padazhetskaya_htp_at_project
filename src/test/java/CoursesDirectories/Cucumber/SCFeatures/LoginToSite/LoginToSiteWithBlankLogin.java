package Cucumber.SCFeatures.LoginToSite;

import Cucumber.SCFeatures.BasicSteps.SilverSteps;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import utilites.DriverManager;

public class LoginToSiteWithBlankLogin {
    WebDriver driver;
    SilverSteps silverSteps = new SilverSteps();

    @Before

    public void beforeTest(){
        DriverManager driverManager = new DriverManager();
        driverManager.createLocalDriver();
        driverManager.getDriver();
    }

    @Given("I am on login page on Silver Screen site")
    public void iAmOnLoginPageOnSilverScreenSite() {
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

    @Then("I see  message {string}")
    public void iSeeMessage(String string) {
//   Assert.assertFalse(!new SilverSteps().AllertShows(silverSteps.AllertShows()));

    }


}
