import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"com.test.guice.stepdef"},
        tags = "@smoke",
        monochrome = true
)

@RunWith(Cucumber.class)
public class TestRunnerSuite {
}
