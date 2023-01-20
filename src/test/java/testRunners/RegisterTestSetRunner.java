package testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/TA-76_Registration_test_set.feature"
        ,glue = {"steps"},
        plugin = { "pretty", "html:test-output", "json:target/cucumber-report/cucumber.json"},
        dryRun = false, monochrome = true
)

public class RegisterTestSetRunner {
}
