package CoursesDirectories.Cucumber.SCFeatures.LoginToSite;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        monochrome = true,
        features = "src/test/java/CoursesDirectories/Cucumber/SCFeatures/StepsDefinition/LoginToSiteFeature.feature",
        snippets = SnippetType.CAMELCASE,
        glue = {"CoursesDirectories.Cucumber.SCFeatures.LoginToSite"}

)
public class LoginRunnerTest {

}
