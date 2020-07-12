package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			
			
			//features = "Feature"
			features = "/Users/yemioluv/eclipse-workspace/PodPoint/src/test/java/Features"
			,glue={"StepDefinitions"},
					format={"pretty", "html:test-output", "json:json_output/cuccmber.json", "junit:junit_xml/cucumber.xml" ,"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:path/report.html"},
			monochrome = true,
			strict = true
			//		dryRun = true
			
			)

public class TestRunnerTest {

}

