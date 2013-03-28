package com.davenicolette.i18n.demo.app;

import java.io.PrintStream;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public final class Helpers {
	
	/**
	 * Consume checked exceptions when loading ResourceBundles
	 * 
	 * @param name - ResourceBundle name
	 * @param locale - The Locale to use for finding the ResourceBundle
	 */
	public static ResourceBundle getResourceBundle(String name, Locale locale) {
		try {
			name = "com.davenicolette.i18n.demo.resources." + name;
			ResourceBundle rb = (ResourceBundle) ResourceBundle.getBundle(name, locale);
			return rb;
		}
		catch (MissingResourceException mre) {
			print("Did not find bundle for name '" + name + "' and locale '" + locale + "'");
			return null;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Consume the MissingResourceException stack trace that is written to System.err whenever ResourceBundle searches
	 * up the hierarchy of ResourceBundles to find a matching resource key. Can't catch the exception because then
	 * ResourceBundle won't continue processing and won't find a default value in a parent ResourceBundle.
	 * 
	 * @param bundle
	 * @param resourceName
	 * @return
	 */
	public static String getStringResource(ResourceBundle bundle, String resourceName) {
		PrintStream stderr = System.err;
		System.setErr(null);
		String value = bundle.getString(resourceName);
		System.setErr(stderr);
		return value;
	}
	
	/**
	 * Convenience method for spewing text to the console.
	 * 
	 * @param message - Text to display on the console.
	 */
	public static void print(String message) {
		System.out.println(message);
	}
	
}
