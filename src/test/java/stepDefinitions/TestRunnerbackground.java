package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/backgroundDemo/background.feature",glue={"backgroundPackage"}, monochrome=true,
plugin={"pretty","html:target/HTMLreports/report.html"}		
		)
public class TestRunnerbackground {

}
