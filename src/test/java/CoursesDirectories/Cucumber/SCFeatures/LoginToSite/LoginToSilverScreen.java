package CoursesDirectories.Cucumber.SCFeatures.LoginToSite;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;


public class LoginToSilverScreen{

WebDriver driver;
SilverSteps silverSteps = new SilverSteps();

    @Before

    public void beforeTest(){
       /* DriverManager driverManager = new DriverManager();
        driverManager.createLocalDriver();
        driverManager.getDriver();*/
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
        silverSteps.AllertShows();
    }

}
