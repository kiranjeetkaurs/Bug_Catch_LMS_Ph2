package testrunner;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Test
//@RunWith(Cucumber.class)
@CucumberOptions(
	  monochrome=false, 
	  //tags = "@feature01",
	  features = {"src/test/resources/features/Batch/"}, 
	  glue= {"stepdefinition","AppHooks"},
	  plugin = { "pretty", "html:target/cucumber-reports.html", "json:target/cucumber-html-reports/cucumber.json","rerun:target/failed_scenarios.txt" })
		//	  plugin = { "pretty"})
public class runner extends AbstractTestNGCucumberTests{
	
	  @Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }

}