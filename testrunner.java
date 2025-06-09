package Stepdef;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(features="src/test/resources/Features",
glue={"Stepdef"},
monochrome=true,
plugin= {"pretty","junit:target/JUnitReports/report.xml"})
public class testrunner {

}
