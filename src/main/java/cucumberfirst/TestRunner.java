package cucumberfirst;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features="D:\\java_test\\Z_Cucumber\\src\\main\\java\\cucumberfirst"    ,
		features= {"@rerun-output\\failed_scanrio.txt"},
		glue= {"cucumberfirst"}   ,
	//	plugin= {"junit:junit-report/junit_rep.xml","rerun:rerun-output/failed_scanrio.txt"},
		dryRun=false
		
		
		)


public class TestRunner {

}
