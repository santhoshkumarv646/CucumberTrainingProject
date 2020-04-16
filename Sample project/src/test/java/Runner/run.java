package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="F:\\Eclipse-workspace\\Cucumber.project\\src\\test\\java\\cucumber\\sample.feature",
glue= {"stepDefinitions"},
format= {"pretty","html:test-output"},
monochrome = true,
dryRun = false
)


public class run   {

}
