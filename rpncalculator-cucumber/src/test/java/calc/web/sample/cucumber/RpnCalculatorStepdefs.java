package calc.web.sample.cucumber;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;

import com.neopragma.java.pageobject.Page;

import calc.web.sample.cucumber.pages.RpnCalculatorPageObject;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@SuppressWarnings("unused")
public class RpnCalculatorStepdefs {

    private String hi;
    private RpnCalculatorPageObject page;
	
    @Before
    public void before_examples() throws Exception {
    	page = new RpnCalculatorPageObject();
    }
    
    @Given("^I am on the RPN Calculator page$")
    public void on_the_greetings_page() throws MalformedURLException {
    	page.navigateTo("http://localhost:8080");
    	assertEquals("RPN Calculator", page.title());
    }
    
    @Then("^the welcome message reads \"([^\"]*)\"$")
    public void the_welcome_message_reads(String expectedWelcomeMessage) throws Throwable {
        assertEquals(expectedWelcomeMessage, page.welcomeMessage());
    }
    
    @Given("^I enter \"([^\"]*)\"$")
    public void enter_tokens(String tokens) {
    	page.enterTokens(tokens);
    }
    
    @When("^I get the result$")
    public void get_result() throws InterruptedException {
    	page.getResult();
    }
    
    @Then("^the calculator returns \"([^\"]*)\"$")
    public void assert_returned_value(String expectedValue) {
    	assertEquals(expectedValue, page.returnedValue());
    }


}
