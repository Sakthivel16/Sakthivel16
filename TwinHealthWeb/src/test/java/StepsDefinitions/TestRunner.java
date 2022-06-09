package StepsDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
	 @CucumberOptions(features="src/test/resources/Features",glue={"StepsDefinitions"},
	 monochrome=true,
	 plugin = {"pretty","html:target/HtmlReports","json:target/JSONReports/report.json",
	 "junit:target/JUnitReports/reports.xml"})	
    
   	
public class TestRunner {

}
