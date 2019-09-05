import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@CucumberOptions(
        features = {"src/csvDataResolver/java/features"},
        glue = {"com.csvDataResolver.guice.stepdef"},
        tags = "@smoke",
        monochrome = true
)

@RunWith(Cucumber.class)
public class TestRunnerSuite {
}
