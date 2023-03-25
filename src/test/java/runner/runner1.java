package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty", "html:target/cucumber", "html:target/cucumber-html-report",
                "json:target/cucumber.json",
                "html:target/cucumber-reports.html",
                "json:target/cucumber-reports",
                "rerun:target/failed.txt",//Creates a text file with failed scenarios
                "timeline:test-output-thread/",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
features= "src/test/resources/API_Features",
glue = "src/test/java/stepdefinitions",
tags="",
dryRun = false






)


public class runner1 {
}
