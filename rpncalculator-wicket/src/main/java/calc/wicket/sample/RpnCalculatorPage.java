package calc.wicket.sample;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.PropertyModel;

import calc.sample.Calc;


public class RpnCalculatorPage extends WebPage {
	private static final long serialVersionUID = 1L;
	
	private String inputValues;
	private String result;
	private String welcomeMessage;
	private Calc calc;

	@SuppressWarnings({ "serial", "rawtypes", "unchecked" })
	public RpnCalculatorPage(final PageParameters parameters) {
		super(parameters);
		calc = new Calc();
		
        PropertyModel<String> messageModel = new PropertyModel<String>(this, "result");
        add(new Label("result", messageModel));

        add(new Label("welcomeMessage", new PropertyModel<String>(this, "welcomeMessage")));        
//        welcomeMessage = "get the welcome message here";
        welcomeMessage = calc.getWelcomeMessage();
         
        Form<?> calcForm = new Form<Void>("calcForm");
        calcForm.add(new TextField<String>("inputValues", new PropertyModel(this, "inputValues")));

        final Link button1 = new Link("1") {
            @Override
            public void onClick() {
            	inputValues += getId();
            }
        };
        calcForm.add(button1);

        final Link button2 = new Link("2") {
            @Override
            public void onClick() {
            	inputValues += getId();
            }
        };
        calcForm.add(button2);

        final Link button3 = new Link("3") {
            @Override
            public void onClick() {
            	inputValues += getId();
            }
        };
        calcForm.add(button3);

        final Link button4 = new Link("4") {
            @Override
            public void onClick() {
            	inputValues += getId();
            }
        };
        calcForm.add(button4);

        final Link button5 = new Link("5") {
            @Override
            public void onClick() {
            	inputValues += getId();
            }
        };
        calcForm.add(button5);

        final Link button6 = new Link("6") {
            @Override
            public void onClick() {
            	inputValues += getId();
            }
        };
        calcForm.add(button6);

        final Link button7 = new Link("7") {
            @Override
            public void onClick() {
            	inputValues += getId();
            }
        };
        calcForm.add(button7);

        final Link button8 = new Link("8") {
            @Override
            public void onClick() {
            	inputValues += getId();
            }
        };
        calcForm.add(button8);

        final Link button9 = new Link("9") {
            @Override
            public void onClick() {
            	inputValues += getId();
            }
        };
        calcForm.add(button9);

        final Link button0 = new Link("0") {
            @Override
            public void onClick() {
            	inputValues += getId();
            }
        };
        calcForm.add(button0);

        final Link buttonAddition = new Link("addition") {
            @Override
            public void onClick() {
            	inputValues += "+";
            }
        };
        calcForm.add(buttonAddition);

        final Link buttonSubtraction = new Link("subtraction") {
            @Override
            public void onClick() {
            	inputValues += "-";
            }
        };
        calcForm.add(buttonSubtraction);

        final Link buttonMultiplication = new Link("multiplication") {
            @Override
            public void onClick() {
            	inputValues += "* ";
            }
        };
        calcForm.add(buttonMultiplication);

        final Link buttonDivision = new Link("division") {
            @Override
            public void onClick() {
            	inputValues += "/ ";
            }
        };
        calcForm.add(buttonDivision);

        final Link buttonModulus = new Link("modulus") {
            @Override
            public void onClick() {
            	inputValues += "% ";
            }
        };
        calcForm.add(buttonModulus);

        final Link buttonExponentiation = new Link("exponentiation") {
            @Override
            public void onClick() {
            	inputValues += "^ ";
            }
        };
        calcForm.add(buttonExponentiation);

        final Link buttonPush = new Link("push") {
            @Override
            public void onClick() {
            	inputValues += " ";
            }
        };
        calcForm.add(buttonPush);

        final Link buttonClear = new Link("clear") {
            @Override
            public void onClick() {
            	inputValues = "";
            }
        };
        calcForm.add(buttonClear);

        final Link buttonPoint = new Link("point") {
            @Override
            public void onClick() {
            	inputValues += ".";
            }
        };
        calcForm.add(buttonPoint);
        
        calcForm.add(new Button("submitButton") { 
        	@Override
            public void onSubmit() {
            	result = "call the rpncalculator here";
        	}
         });
        
        add(calcForm);        
	}
	
    public String getInputValues() {
        if (inputValues == null) {
        	inputValues = "";
        }
    	return inputValues;
    }
    
    public void setInputValues(String inputValues) {
    	this.inputValues = inputValues;
    }
    
    public String getResult() {
    	return result;
    }
    
    public void setResult(String result) {
    	this.result = result;
    }
}


