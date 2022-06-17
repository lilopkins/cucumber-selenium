package uk.hpkns.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty" },
    features = "cucumber",
    glue = "uk.hpkns.cucumber")
public class CucumberTests {
}
