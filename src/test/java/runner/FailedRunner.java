package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //monochrome = true, //denemek gerek buna gerek var mı??
        plugin = {"pretty", "html:target/cucumber-reports",
                "json:target/cucumber.json"},
                //"rerun:target/failed.txt"}, //Creates a text file with failed scenarios
        features = "@target/failed.txt",
        glue = "src/test/java/stepdefinitions",
        tags = "@mytag",
        dryRun = false
)


public class FailedRunner {
}
