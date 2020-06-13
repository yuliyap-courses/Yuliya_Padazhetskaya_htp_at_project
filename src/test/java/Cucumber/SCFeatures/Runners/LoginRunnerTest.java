package Cucumber.SCFeatures.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Cucumber/SCFeatures/StepsDefinition",
        glue = "Cucumber.SCFeatures.LoginToSite",
        snippets = SnippetType.CAMELCASE
)
public class LoginRunnerTest {
}
