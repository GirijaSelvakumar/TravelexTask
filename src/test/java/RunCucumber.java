import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by girija on 29/09/2016.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = ".",dryRun = false, strict = false,tags = {"@1"}
        ,format = {"pretty", "html:target/travelexTestReports", "json:target/cucumber-report.json"})
public class RunCucumber {

}
