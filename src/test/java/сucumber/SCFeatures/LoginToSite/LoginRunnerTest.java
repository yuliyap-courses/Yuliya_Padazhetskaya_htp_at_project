package сucumber.SCFeatures.LoginToSite;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        monochrome = true,
        features = "src/test/resources/LoginToSiteFeature.feature",
        snippets = SnippetType.CAMELCASE,
        glue = {"сucumber.SCFeatures.LoginToSite"}

)
public class LoginRunnerTest {

}
