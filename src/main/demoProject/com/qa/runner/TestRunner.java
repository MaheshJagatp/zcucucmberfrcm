package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:\\java_test\\Z_Cucumber\\src\\main\\demoProject\\com\\qa\\features\\freecrm.feature"    ,
		glue= {"com.qa.stepDefination"}   ,
		
		dryRun=false
		
		
		)


public class TestRunner {
	
	

}
