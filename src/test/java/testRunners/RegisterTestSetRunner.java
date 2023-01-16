package testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/TA-76_Registration_test_set.feature"
        ,glue = {"steps"}
)

public class RegisterTestSetRunner {
}
