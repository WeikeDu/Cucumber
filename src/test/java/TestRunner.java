import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by wkdu on 16/3/28.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "json:target/json/output.json", "html:target/html/"},
        features = "src/test/java/feature",
        tags = {"@sign-in,@add-address,@buy"}
)
public class TestRunner {
}
