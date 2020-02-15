package cucumber.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"de.monochromata.cucumber.report.PrettyReports:build/cucumber"},
        features = "classpath:features",
        glue = "cucumber.stepDefinitions")
public class RunCucumberTest {
}
