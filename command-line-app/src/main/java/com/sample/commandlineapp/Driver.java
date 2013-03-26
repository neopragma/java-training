package com.sample.commandlineapp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

/**
 * Sample command-line application driver
 * 
 * @author Sample
 * @version 1.0.0
 */
public class Driver {
	
	private RuntimeOptions runtimeOptions = null;
	private Writer writer = null;

	/**
	 * Run the application.
	 * 
	 * The sample application can echo input from stdin to stdout or write the input to a file.
	 * 
	 * @param args - array of command-line arguments
	 * @throws Exception
	 */
	public void run(String[] args) throws Exception {
		try {
			runtimeOptions = new RuntimeOptions(args);
		} catch (InvalidRuntimeOptionException e) {
			System.err.println(e.getMessage());
			return;
		}
		StringBuilder pipedInput = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
        	pipedInput.append(sc.nextLine());
        }
        if (runtimeOptions.isSet(OptionName.OUTPUT_FILE)) {
        	writeToFile(pipedInput.toString());
        } else {
        	System.out.println(pipedInput.toString());
        }
	}
	
	/**
	 * Copy the input to the specified file.
	 * 
	 * @param filename
	 * @throws IOException
	 */
	private void writeToFile(String data) throws IOException {
		writer().write(data);
		writer().close();
		setWriter(null);
	}
	
	void setWriter(Writer writer) {
		this.writer = writer;
	}
	
	Writer writer() throws IOException {
		if (writer == null) {
			writer = new FileWriter((File) runtimeOptions.get(OptionName.OUTPUT_FILE).getValue());
		}
		return writer;
	}
	
}
