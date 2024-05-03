package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "K:\\EclipseAutomation\\CucmberDemo\\resources\\AppFeatures\\Order.feature" }, glue = { "stepdefination" }, plugin = { "pretty" })


public class OrderTest {

}

