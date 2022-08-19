package SetupClass;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "." }, plugin = { "pretty", "html:target/site/cucumber-pretty",
		"json:target/cucumber/cucumber.json", "usage:target/usage.jsonx", "junit:target/cucumber.xml" })

public class TestRunner {

	@BeforeClass
	public static void beforeClass() throws Exception {
		Setup.before_Class();
	}

	@AfterClass
	public static void afterClass() throws Exception {
		Setup.after_Class();
	}

}
