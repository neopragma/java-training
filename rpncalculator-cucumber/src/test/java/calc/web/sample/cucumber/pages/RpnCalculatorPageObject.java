package calc.web.sample.cucumber.pages;

import com.neopragma.java.pageobject.Page;

public class RpnCalculatorPageObject extends Page {
	
	public String welcomeMessage() {
		return element("welcomeMessage").getText();
	}
	
	public void enterTokens(String tokens) {
        element("inputValues").clear();
        element("inputValues").sendKeys(tokens);
	}
	
	public void getResult() throws InterruptedException {
		element("submitButton").click();
	}
	
	public String returnedValue() {
		return element("result").getText();
		
	}

}
