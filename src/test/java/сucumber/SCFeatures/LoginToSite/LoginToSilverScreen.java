package сucumber.SCFeatures.LoginToSite;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginToSilverScreen{

WebDriver driver;
SilverSteps silverSteps = new SilverSteps();


    @Given("I Login To SilverScreen site")
    public void iLoginToSilverScreenSite() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.get("https://silverscreen.by/");;

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
