package tests.BookingCucumber.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/tests/BookingCucumber/StepDefinition/FeatureSteps.feature",
        glue = "bookingCucumber.stepDefinition",
        snippets = SnippetType.CAMELCASE
)
public class BookingRunnerTest {

}
