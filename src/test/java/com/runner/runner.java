package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\java\\com\\feature" }, 
           glue = "com\\step", monochrome = true,  //dryRun=true,
           tags = { "@Login_test" })
public class runner {

}
