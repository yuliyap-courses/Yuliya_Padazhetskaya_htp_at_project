package сucumber.SCFeatures.LoginToSite;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class LoginToSilverScreen{

SilverSteps silverSteps = new SilverSteps();
WebDriver driver;

    @Given("I Login To SilverScreen site")
    public void iLoginToSilverScreenSite() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.get("https://silverscreen.by/");;

    }

    @When("I login with <login> and <password>")
    public void iLoginWithLoginAndPassword() {
        Actions actionProvider = new Actions(driver);
        actionProvider.moveToElement(silverSteps.enterLink);
        silverSteps.MoveMouseToEnterElem();
        silverSteps.OpenLoginContainer();
    }

    @Then("I can see Red Carpet Club <level> in upper right corner")
    public void iCanSeeRedCarpetClubLevelInUpperRightCorner() {
        silverSteps.AllertShows();
    }

}
