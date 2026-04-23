package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"utility", "stepsdefinitions"},
        tags = "@e2e",
        plugin = {"pretty", "html:target/cucumber-e2e-report", "json:cucumber-e2e.json"}
)
public class E2ETestRunner {

}
