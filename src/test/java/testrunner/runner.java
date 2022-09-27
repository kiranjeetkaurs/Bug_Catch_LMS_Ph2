package testrunner;


import org.testng.annotations.Test;

//import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Test
//@RunWith(Cucumber.class)
@CucumberOptions(
	  plugin = {"pretty"},
	  monochrome=false, 
	  //tags = "@feature01",
	  features = {"src/test/resources/features/Batch/"}, 
	  glue= {"stepdefinition","AppHooks"})

public class runner extends AbstractTestNGCucumberTests{

}