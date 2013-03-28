package com.davenicolette.i18n.demo.resources;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ListResourceBundle;

import javax.swing.KeyStroke;

/**
 * Tower of Babel resource bundle for the English language.
 * 
 * @author dave
 */
public class Babel_unicode_fi extends ListResourceBundle {
	
	static final Object[][] contents = {
		{ "english.name", "Finnish" },
		{ "native.name", "Suomi" },
		{ "mnemonic.key", new Integer(KeyEvent.VK_F) },
		{ "accelerator.key", KeyStroke.getKeyStroke(KeyEvent.VK_5, ActionEvent.ALT_MASK) },
		{ "flag.url", "flag_finland.gif" },
		{ "genesis.11.7", "Tulkaa, astukaamme alas ja sekoittakaamme siellä heidän kielensä, niin ettei toinen ymmärrä toisen kieltä." },
		{ "genesis.11.8", "Ja niin Herra hajotti heidät sieltä yli kaiken maan, niin että he lakkasivat kaupunkia rakentamasta." },
		{ "genesis.11.9", "Siitä tuli sen nimeksi Baabel, koska Herra siellä sekoitti kaiken maan kielen; ja sieltä Herra hajotti heidät yli kaiken maan." }		 
	};

	@Override
	protected Object[][] getContents() {
		return contents;
	}

}
