package com.hrms.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			features="src/test/sources/features/test.feature"
			,glue="com.hrms.steps"	
			,dryRun=false
			,monochrome=true
			,plugin= {"pretty"
					, "html:target/html/cucumber-default-report"
					, "json:target/cucumber.json"
					, "rerun:target/failed.txt"}
			,tags= {"@tag1"}
			)
public class ReviewRunnerClass {

}
