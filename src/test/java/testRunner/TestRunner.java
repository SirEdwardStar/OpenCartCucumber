package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {".//Features/Login.feature"},
		//features = {".//Features/"},	  //".//Features//"	-> To run all features in which they were created
		//features = {".//Features/LoginDDT.feature"},
		//features = {".//Features/LoginDDTExcel.feature"},
		//features = {"@target/rerun.txt"},	//Runs only failures
		glue = "stepDefinitions",
		plugin = {"pretty",
				"html:reports/myreport.html",
				"json:reports/myreport.json",
				"rerun:target/rerun.txt"},	//Mandatory to capture failures
		dryRun = false,	//If true, it will check the definition, but it won't be executed
		monochrome = true,
		tags = "@Sanity"	//Scenarios tagged with @Sanity
		//tags = "Regression"	//Scenarios tagged with @Regression
		//tags = @Sanity and @Regression	//Scenarios tagged with both @sanity and @regresison
		//tags = @Sanity or @Regression		//Scenarios tagged either @sanity or regression
		//tags = @Sanity and not @Regression	//Scenarios tagged with @Sanity but not with @Regression
		)

public class TestRunner {

}
