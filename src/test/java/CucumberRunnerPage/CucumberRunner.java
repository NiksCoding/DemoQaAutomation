package CucumberRunnerPage;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Features" , glue = "StepDefinations", tags= "@BrowserWindows" ,
plugin={"pretty", "html:target/c.html/cucumber-reports.html" , "json:target/Cucumber.json"} ,monochrome = true)
public class CucumberRunner extends AbstractTestNGCucumberTests{

	/*
	 * @Override
	 * 
	 * @DataProvider(parallel = true) public Object[][] scenarios() { return
	 * super.scenarios(); }
	 */
}
