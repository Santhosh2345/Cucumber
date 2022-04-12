package com.little;
import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
	
@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\java\\com\\feature\\aa\\Goole.feature", 
                    glue = "com\\stepDefinitions", monochrome = true
                     ,dryRun = false, plugin = "pretty")

public class Runer {

}
