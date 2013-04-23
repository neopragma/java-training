package calc.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Sample RPN calculator.
 * @author Dave
 */
public class Calc {
	
	private Stack<BigDecimal> stack;
	
	private static String sep = System.getProperty("line.separator", "\n");
	private static final String helpText =
			"c clear calculator memory" + sep +
			"h display help text" + sep +
			"q quit" + sep +
			"r display current result" + sep +
			"+ add" + sep + 
			"- subract" + sep +
			"* multiply" + sep +
			"/ divide" + sep +
			"% modulo" + sep + 
			"^ exponentiation";
	
	public Calc() {
		stack = new Stack<BigDecimal>();
	}
	
	public void help() {
		System.out.println(helpText);
	}
	
	public void clear() {
		stack.clear();
	}
	
	public void enter(String token) {
		if (token == null || token.length() == 0) {
			return;
		}
		try {
			BigDecimal value = new BigDecimal(token);
			stack.push(value);
		} catch (NumberFormatException nonNumericValueWasEntered) {
			computeWith(token);
		}
	}
	
	public String result() {
		try {
			return stack.peek().toString();
		} catch (EmptyStackException e) {
			return "";
		}
	}
	
	private void computeWith(String token) {
		if (stack.size() != 2) {
			System.out.println("Wrong number of arguments for '" + token +"' operator");
			return;
		}
		BigDecimal divisor = null;
		switch (token.charAt(0)) {
			case '+': 
				stack.push(stack.pop().add(stack.pop()));
				break;
			case '-':
				BigDecimal subtrahend = stack.pop();
				stack.push(stack.pop().subtract(subtrahend));
				break;
			case '*': 
				stack.push(stack.pop().multiply(stack.pop()));
				break;
			case '/':
				divisor = stack.pop();
				stack.push(stack.pop().divide(divisor, 9, RoundingMode.UP));
				break;
			case '%':
				divisor = stack.pop();
				stack.push(stack.pop().remainder(divisor));
				break;
			case '^':
				Double exponent = stack.pop().doubleValue();
				stack.push(new BigDecimal(Math.pow(stack.pop().doubleValue(), exponent)));
				break;
		}
	}
	
	public void run() throws IOException {
	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    String s;
	    System.out.println("Welcome to the Java RPN calculator");
	    while ((s = in.readLine()) != null) {
	      if (s.length() == 0) {
	    	  continue; // ignore empty input
	      }
	      if (s.length() == 1) {
	    	  switch (s.charAt(0)) {
	    	      case 'q': 
	    		      System.out.println("Goodbye!");
	    		      return;
	    	      case 'r':
	    	    	  System.out.println(result());
	    	    	  continue;
	    	      case 'c':
	    	    	  clear();
	    	    	  continue;
	    	      case 'h':
	    	    	  help();
	    	    	  continue;
	    	  }
	      }
	      enter(s);
	  }

	}
	
	public static void main(String[] args) throws IOException {
		new Calc().run();
		System.exit(0);
	}
}
