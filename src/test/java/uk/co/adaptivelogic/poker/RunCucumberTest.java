package uk.co.adaptivelogic.poker;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(format = {"html:target/cucumber-html-report", "json-pretty:target/cucumber-json-report.json"})
public class RunCucumberTest {
}
