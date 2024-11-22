package com.org.TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)

@CucumberOptions(tags="@start", features= {"src\\test\\resources\\BulkletterGeneration.feature"}, glue = {"com.cpt.Engage.StepDefinition"}, plugin = { "pretty", "html:target/cucumber/report.html",
"json:target/cucumber/report.json" },dryRun = false ,strict = false)


public class RunnerClass {
	
}
