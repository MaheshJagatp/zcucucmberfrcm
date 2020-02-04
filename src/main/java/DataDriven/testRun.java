package DataDriven;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:\\java_test\\Z_Cucumber\\src\\main\\java\\DataDriven\\log12.feature"    ,
		glue= {"DataDriven"}   ,
		format= {"junit:junit-report/junit_rep.xml"},
		dryRun=false
		
		
		)




public class testRun {

}
