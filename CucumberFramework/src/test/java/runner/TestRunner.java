package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src\\test\\java\\Feature",
		dryRun = false,
		monochrome = true,
		glue = "steps",
		tags = {"@positivelogin , @adminpage"},
		plugin = {"pretty" , "html:Cucumberreports"}
		)
public class TestRunner extends AbstractTestNGCucumberTests {

}
