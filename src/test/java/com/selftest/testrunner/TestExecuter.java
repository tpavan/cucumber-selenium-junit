package com.selftest.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"features_files"},
				 glue={"com.selftest.steps"},
				 tags={"@e2e"})
public class TestExecuter {

}
