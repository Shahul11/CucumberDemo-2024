package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "K:\\EclipseAutomation\\CucmberDemo\\resources\\AppFeatures\\Morgan.feature" }, glue = {
		"stepdefination" }, plugin = { "pretty", "json:target/myreports/report.json",
				"junit:target/myreports/junitreport.xml" },publish=true)

public class MorganTestRunner {

}
