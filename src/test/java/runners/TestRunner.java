package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue= {"stepDefinitions"},
		tags= "@firsttest",
	    plugin = { "pretty", "html:target/cucumber-reports" },
		monochrome = true
		)
 

public class TestRunner {
	
}