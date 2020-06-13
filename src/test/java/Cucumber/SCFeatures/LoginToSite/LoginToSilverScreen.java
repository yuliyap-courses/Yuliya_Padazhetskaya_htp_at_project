package Cucumber.SCFeatures.LoginToSite;

import Cucumber.SCFeatures.BasicSteps.SilverSteps;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import settings.Config;
import utilites.Driver;

public class LoginToSilverScreen{


    WebDriver driver;
SilverSteps silverSteps = new SilverSteps();

    @Before

    public void beforeTest(){
        Driver.initDriver(Config.CHROME);

    }

    @Given("I Login To SilverScreen site")
    public void iLoginToSilverScreenSite() {
        driver.get("https://silverscreen.by/");

    }

    @When("I login with <login> and <password>")
    public void iLoginWithLoginAndPassword() {
        silverSteps.OpenLoginContainer();
        silverSteps.EnterEmailToLoginField(null);
        silverSteps.EnterPasswordToPasswordField(null);
        silverSteps.SubmitByButton();

    }

    @Then("I can see Red Carpet Club <level> in upper right corner")
    public void iCanSeeRedCarpetClubLevelInUpperRightCorner() {
     //   Assert.assertFalse(!new SilverSteps().AllertShows(silverSteps.AllertShows()));
    }

}
