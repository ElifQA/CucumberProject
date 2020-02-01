package com.hrms.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			features="src/test/sources/ReviewLog.feature"
			,glue="com.hrms.steps"	
			,dryRun=false
			,monochrome=true
			,plugin= {"pretty","html:target/html-reports"}
			,name= ""
					,strict=true
			)
public class ReviewRunnerClass {

}
