package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "K:\\EclipseAutomation\\CucmberDemo\\resources\\AppFeatures\\registration.feature" }, glue = {
		"stepdefination" }, plugin = { "pretty", "json:target/myreports/report.json",
				"junit:target/myreports/report.xml" }, monochrome = false, dryRun = false
// strict = true

)
public class UserRegTest {

}
