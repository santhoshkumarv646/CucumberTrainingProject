package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\cucumber\\simple.feature",
glue= {"stepDefinitions"}
//format= {"pretty","html:test-output"},
//monochrome = true,
//dryRun = false,
//tags = {"@Tag9"
)


public class run   {

	
	
}
