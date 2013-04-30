package calc.web.sample.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;


/**
 * Invokes JUnit Cucumber test runner for the RPN Calculator application.
 * @author Dave Nicolette
 */
@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "html:target/cucumber"})
public class RunTest {
}