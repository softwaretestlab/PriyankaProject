package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src\\test\\java\\FeatureFiles"},
        glue = {"StepDefinations"},
        plugin={"pretty:STDOUT","html:target/cucumber-html-report",
                "json:target/cucumber.json",
                "junit:target/cucumber.xml",
                "rerun:target/rerun.txt"},
        // and,or combination can be used
        //if a tag is above feature file then all scenarios under it will run
        //if a tag is above scenario, only that scenario will run.
        tags ="@RegressionTest or @SanityTesting"


)
public class TestRunner {
}