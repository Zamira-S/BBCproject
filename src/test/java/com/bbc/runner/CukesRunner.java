package com.bbc.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json"},
        features = "src/test/resources/features",
        glue = "com/bbc/Step_Definitions",
        dryRun = false,
        tags = "@automation1"   //if you want run Home feature file please put @automation2

)

public class CukesRunner {
}
