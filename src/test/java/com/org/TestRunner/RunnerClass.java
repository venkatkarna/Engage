package com.org.TestRunner; 

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( tags="@start", features = {"src\\test\\resources\\Sprint2.feature" }, glue = {
		"com.cpt.Engage.StepDefinition" }, plugin = { "pretty", "html:target/report/cucumber.html",
				"junit:target/report/cucumber.xml" }, dryRun = false, monochrome = true)

public class RunnerClass {

}		