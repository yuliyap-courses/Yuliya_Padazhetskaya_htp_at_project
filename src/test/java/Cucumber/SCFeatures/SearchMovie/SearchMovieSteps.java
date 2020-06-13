package Cucumber.SCFeatures.SearchMovie;

import Cucumber.SCFeatures.BasicSteps.SilverSteps;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import settings.Config;
import utilites.Driver;

public class SearchMovieSteps {
    WebDriver driver;
    SilverSteps silverSteps = new SilverSteps();


    @Before

    public void beforeTest() {
        Driver.initDriver(Config.CHROME);
    }

    @Given("I open an app")
    public void iOpenAnApp() {
        driver.get("https://silverscreen.by/");
    }

    @When("I search for <search word> word")
    public void iSearchForSearchWordWord() {
        String SearchWorld = "five";
        silverSteps.SearchFilms(SearchWorld);
        driver.findElement(By.xpath("//*[@class = /sc-gzVnrw kpyERI/]")).sendKeys(Keys.ENTER);
    }

    @Then("I see the list of movie items")
    public void iSeeTheListOfMovieItems() {
        silverSteps.SearchContainerShown();
    }

    @Then("each item name or description contains <search word>")
    public void eachItemNameOrDescriptionContainsSearchWord() {

    }
    @After
    public void AfterTest(){
        driver.close();
    }
}
