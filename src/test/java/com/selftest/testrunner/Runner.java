package com.selftest.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"features"},
				 glue={"step_definitions"},
				 plugin={"pretty","html:target/cucumber"},
				 tags={"@endtoend,@general"},
				 monochrome = true)
public class Runner{
		
}
