package Options;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions (
		features = "src/test/java/Features", //append a file name if only the single file is to be run
		glue = "StepDefinitions")

public class TestRunner {

}
