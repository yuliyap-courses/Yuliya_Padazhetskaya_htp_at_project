package tests.BookingCucumber;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import utilites.DriverManager;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BookingMoscowActionTest {

    WebDriver driver;

    @Test
    public void MoscowTest(){
        DriverManager driverManager = new DriverManager();
        driverManager.createLocalDriver();
        driverManager.getDriver();
        driver.get("https://www.booking.com/");

        @Given("User open Booking page")
        public void userOpenBookingPage() {
            // Write code here that turns the phrase above into concrete actions
        }

        @When("User enter Moscow on search field")
        public void userEnterMoscowOnSearchField(){
            // Write code here that turns the phrase above into concrete actions

        }

        @When("User Select currenet date")
        public void userSelectCurrenetDate() {
            // Write code here that turns the phrase above into concrete actions
        }

        @When("User select one date after current date")
        public void userSelectOneDateAfterCurrentDate() {
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.DAY_OF_YEAR, 3);
            Date threeDays = calendar.getTime();
            calendar.add(Calendar.DAY_OF_YEAR, 10);
            Date tenDays = calendar.getTime();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String datePlusTreeDays = dateFormat.format(threeDays);
            String datePlusTenDays = dateFormat.format(tenDays);
            //BaseSteps.FindElement(xpath(String.format("//*[contains(@data-date,'%s')]", datePlusTreeDays)), driver);
            //BaseSteps.FindElement(xpath(String.format("//*[contains(@data-date,'%s')]", datePlusTenDays)), driver);
        }

        @When("User submit search field by button")
        public void userSubmitSearchFieldByButton() {
            // Write code here that turns the phrase above into concrete actions
        }

        @Then("User see list of all available cities")
        public void userSeeListOfAllAvailableCities() {
            // Write code here that turns the phrase above into concrete actions
        }




        //Calendar testing



        //actions using
        Actions builder = new Actions(driver);

    }

}