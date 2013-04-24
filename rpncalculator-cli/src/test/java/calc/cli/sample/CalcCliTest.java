package calc.cli.sample;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.Test;
    
public class CalcCliTest {
	
	private PrintStream originalSystemOut;
	private ByteArrayOutputStream systemOutData;
	private PrintStream systemOutRedirect;
	
	@Test
	public void it_displays_welcome_message_when_it_starts_and_goodbye_when_it_ends() throws Exception {
		recordSystemOut();
		loadSystemIn(new String[] { "q" });
		CalcCliDriver.main(new String[] { "test" });
		resetSystemOut();
		assertThat(playbackSystemOutAsString(), equalTo("Welcome to the Java RPN calculator\nGoodbye!"));
	}
	
	@Test
	public void it_displays_usage_help_when_user_enters_h() throws Exception {
		recordSystemOut();
		loadSystemIn(new String[] { "h" });
		CalcCliDriver.main(new String[] { "test" });
		resetSystemOut();
		assertThat(playbackSystemOutAsString(), equalTo("Welcome to the Java RPN calculator\nc clear calculator memory\nh display help text\nq quit\nr display current result\n+ add\n- subract\n* multiply\n/ divide\n% modulo\n^ exponentiation"));
	}
	
	@Test
	public void it_displays_the_result_of_the_calculation_when_user_enters_r() throws Exception {
		recordSystemOut();
		loadSystemIn(new String[] { "3", "2", "1", "+", "*", "r" });
		CalcCliDriver.main(new String[] { "test" });
		resetSystemOut();
		assertThat(playbackSystemOutAsString(), equalTo("Welcome to the Java RPN calculator\n9"));
	}
	
	@Test
	public void it_clears_its_memory_when_user_enters_c() throws Exception {
		recordSystemOut();
		loadSystemIn(new String[] { "3", "2", "1", "+", "*", "c", "18", "6", "-", "r" });
		CalcCliDriver.main(new String[] { "test" });
		resetSystemOut();
		assertThat(playbackSystemOutAsString(), equalTo("Welcome to the Java RPN calculator\n12"));
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
