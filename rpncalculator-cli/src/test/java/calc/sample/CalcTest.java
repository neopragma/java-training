package calc.sample;

import static org.hamcrest.Matchers.equalTo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class CalcTest {
	
	private Calc calc;
	private static final double INTEGER_ERROR_TOLERANCE = 0.5;
	private static final double FLOATING_POINT_ERROR_TOLERANCE = 0.0005;
	private ByteArrayOutputStream systemOutData;
	private PrintStream systemOutRedirect;
	private PrintStream originalSystemOut;
	
	@Before
	public void before_each() {
		calc = new Calc();
	}

	@Test
	public void it_reports_wrong_number_of_arguments_when_fewer_than_2_values_are_entered() {
		recordSystemOut();
		calc.enter("2");
		calc.enter("+");
		resetSystemOut();
		assertThat(playbackSystemOutAsString(), equalTo("Wrong number of arguments for '+' operator"));
	}
	
	@Test
	public void it_reports_wrong_number_of_arguments_when_more_than_2_values_are_entered() {
		recordSystemOut();
		calc.enter("2");
		calc.enter("4");
		calc.enter("6");
		calc.enter("*");
		resetSystemOut();
		assertThat(playbackSystemOutAsString(), equalTo("Wrong number of arguments for '*' operator"));
	}
	
	@Test
	public void it_displays_welcome_message_when_it_starts_and_goodbye_when_it_ends() throws IOException {
		recordSystemOut();
		loadSystemIn(new String[] { "q" });
		calc.run();
		resetSystemOut();
		assertThat(playbackSystemOutAsString(), equalTo("Welcome to the Java RPN calculator\nGoodbye!"));

	}
	
	private void recordSystemOut() {
		originalSystemOut = System.out;
		systemOutData = new ByteArrayOutputStream();
		systemOutRedirect = new PrintStream(systemOutData);
		System.setOut(systemOutRedirect);
	}
	
	private String playbackSystemOutAsString() {
		ByteArrayInputStream inputStream = new ByteArrayInputStream(systemOutData.toByteArray());
		byte[] byteArray = new byte[8192];
		inputStream.read(byteArray,0,8192);
		systemOutData.reset();
		return new String(byteArray).trim();
	}

    private void resetSystemOut() {
    	System.setOut(originalSystemOut);
    }
    
    private void loadSystemIn(String[] linesToLoadInSystemIn) {
    	ByteArrayOutputStream fakeSystemIn = new ByteArrayOutputStream();
    	try {
    		for (String line : linesToLoadInSystemIn) {
    			fakeSystemIn.write(line.trim().getBytes());
    			fakeSystemIn.write(System.getProperty("line.separator").getBytes());
    		}
		} catch (IOException e) {
			e.printStackTrace();
		}
    	ByteArrayInputStream systemIn = new ByteArrayInputStream(fakeSystemIn.toByteArray());
    	System.setIn(systemIn);
    }


}
