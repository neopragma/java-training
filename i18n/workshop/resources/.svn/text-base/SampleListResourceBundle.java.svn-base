package com.davenicolette.i18n.workshop.resources;

import java.util.ListResourceBundle;

/**
 * Example of a ListResourceBundle source file.
 * 
 * @author dave
 */
public class SampleListResourceBundle extends ListResourceBundle {
	
	static final Object[][] contents = {
		{ "key_1", "value_1" },
		{ "key_2", "value_2" },
		{ "key_3", new Integer(500) },
		{ "contents.variable", "You must code the static final Object[][] array named 'contents' and populate it with the resource keys and values." },
		{ "getContents.method", "You must override the method 'getContents'. The simplest implementation is to return 'contents' as-is." },
		{ "key.type", "All keys must be of type java.lang.String." },
		{ "value.type", "Values may be instances of any Java class." }
	};

	@Override
	protected Object[][] getContents() {
		return contents;
	}

}
