package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = { "K:\\EclipseAutomation\\CucmberDemo\\resources\\AppFeatures\\Uber.feature" }, glue = {
		"stepdefination" }, plugin = { "pretty", "json:target/myreports/report.json",
				"junit:target/myreports/junitreport.xml" }, tags = "@Regression or @Smoke", publish=true)

public class UberTest {

}
