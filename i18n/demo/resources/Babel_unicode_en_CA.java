package com.davenicolette.i18n.demo.resources;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ListResourceBundle;

import javax.swing.KeyStroke;

/**
 * Tower of Babel resource bundle for the English language, Canadian variant.
 * This example demonstrates inheritance of ResourceBundles. Verses 8 and 9 are picked up from the _en bundle.
 * 
 * @author dave
 */
public class Babel_unicode_en_CA extends ListResourceBundle {
	
	static final Object[][] contents = {
		{ "english.name", "Canadian" },
		{ "native.name", "English" },
		{ "mnemonic.key", new Integer(KeyEvent.VK_C) },
		{ "accelerator.key", KeyStroke.getKeyStroke(KeyEvent.VK_4, ActionEvent.ALT_MASK) },
		{ "flag.url", "flag_canada.gif" },
		{ "genesis.11.7", "Come, let us go down, and there confound their language, that they may not understand one another's speech, eh?" },
	};

	@Override
	protected Object[][] getContents() {
		return contents;
	}

}
