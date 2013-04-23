package calc.cli.sample;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.containsString;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;

public class CalcCliTest {
	
	private PrintStream originalSystemOut;
	private ByteArrayOutputStream systemOutData;
	private PrintStream systemOutRedirect;
	private InputStream originalSystemIn;

	@Test
	public void it_reports_wrong_number_of_arguments_when_fewer_than_2_values_are_entered() throws Exception {
		loadSystemIn(new String[] { "2", "+" });
		recordSystemOut();
		CalcCliDriver.main(new String[] { "test" });
		resetSystemOut();
		resetSystemIn();
		assertThat(playbackSystemOutAsString(), containsString("Wrong number of arguments for the '+' operator"));
	}

	@Test
	public void it_reports_wrong_number_of_arguments_when_more_than_2_values_are_entered() throws Exception {
		loadSystemIn(new String[] { "2", "4", "6", "*" });
		recordSystemOut();
		CalcCliDriver.main(new String[] { "test" });
		resetSystemOut();
		resetSystemIn();
		assertThat(playbackSystemOutAsString(), containsString("Wrong number of arguments for the '*' operator"));
	}

	@Test
	public void it_complains_about_invalid_non_numeric_input_values() throws Exception {
		loadSystemIn(new String[] { "2", "4", "X" });
		recordSystemOut();
		CalcCliDriver.main(new String[] { "test" });
		resetSystemOut();
		resetSystemIn();
		assertThat(playbackSystemOutAsString(), containsString("Unrecognized input 'X'"));
	}
	
	@Test
	public void it_displays_welcome_message_when_it_starts_and_goodbye_when_it_ends() throws Exception {
		recordSystemOut();
		loadSystemIn(new String[] { "q" });
		CalcCliDriver.main(new String[] { "test" });
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
    	originalSystemIn = System.in;
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
    
    private void resetSystemIn() {
    	System.setIn(originalSystemIn);
    }
}
