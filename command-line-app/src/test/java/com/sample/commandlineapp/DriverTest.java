package com.sample.commandlineapp;

import static com.sample.testhelpers.ConsoleHelper.playbackSystemErr;
import static com.sample.testhelpers.ConsoleHelper.recordSystemErr;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class DriverTest {
	
	private Driver driver;
	private static final String expectedHelpText = "programname [--echo (default) | --version | --help | --save filename]";
	
	@Before
	public void before_each_test_case() {
		driver = new Driver();
	}
	
	@Test
	public void it_displays_help_when_long_option_help_is_passed() throws Exception {
		recordSystemErr();
        driver.run(withArgs("--help"));
        assertThat(playbackSystemErr(), containsString(expectedHelpText));
	}
	
	@Test
	public void it_displays_help_when_short_option_h_is_passed() throws Exception {
		recordSystemErr();
        driver.run(withArgs("-h"));
        assertThat(playbackSystemErr(), containsString(expectedHelpText));
	}
	
	@Test
	public void it_displays_version_when_long_option_version_is_passed() throws Exception {
		recordSystemErr();
        driver.run(withArgs("--version"));
        assertThat(playbackSystemErr(), containsString("1.0.0"));
	}
	
	@Test
	public void it_displays_version_when_short_option_v_is_passed() throws Exception {
		recordSystemErr();
        driver.run(withArgs("-v"));
        assertThat(playbackSystemErr(), containsString("1.0.0"));
	}
	
	private String[] withArgs(String... args) {
		return args;		
	}
}
