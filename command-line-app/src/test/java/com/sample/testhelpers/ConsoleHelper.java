package com.sample.testhelpers;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ConsoleHelper {
	
	private static PrintStream originalSystemOut;
	private static PrintStream originalSystemErr;
	private static ByteArrayOutputStream baos;
	
	public static void recordSystemOut() {
        baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        originalSystemOut = System.out;
        System.setOut(ps);		
	}
	
	public static String playbackSystemOut() {
		System.setOut(originalSystemOut);
		return new String(baos.toByteArray());
	}
	
	public static void recordSystemErr() {
        baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        originalSystemErr = System.err;
        System.setErr(ps);		
	}
	
	public static String playbackSystemErr() {
		System.setErr(originalSystemErr);
		return new String(baos.toByteArray());
	}

}
