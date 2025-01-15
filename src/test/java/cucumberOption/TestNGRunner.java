package cucumberOption;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features", glue="stepDefinitions", monochrome=true, tags="@Smoke and @Regression",
plugin={"pretty", "html:target/cucumber.html"})
public class TestNGRunner extends AbstractTestNGCucumberTests{

}
