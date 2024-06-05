package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = { "K:\\EclipseAutomation\\CucmberDemo\\resources\\AppFeatures\\Search.feature" }, glue = {
		"stepdefination", "myhooks" }, tags="@smoke", plugin = { "pretty" })



public class AmazonTest {

}
