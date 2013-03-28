package com.davenicolette.i18n.demo.resources;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ListResourceBundle;

import javax.swing.KeyStroke;

/**
 * Tower of Babel resource bundle for the Arabic language.
 * 
 * @author dave
 */
public class Babel_unicode_ar extends ListResourceBundle {
	
	static final Object[][] contents = {
		{ "english.name", "Arabic" },
		      { "native.name", "العربية" },
		{ "mnemonic.key", new Integer(KeyEvent.VK_A) },
		{ "accelerator.key", KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK) },
		{ "flag.url", "flag_saudi.gif" },
		      { "genesis.11.7", "هَيَّا نَنْزِلْ إِلَيْهِمْ وَنُبَلْبِلْ لِسَانَهُمْ، حَتَّى لاَ يَفْهَمَ بَعْضُهُمْ كَلامَ بَعْضٍ»." },
		      { "genesis.11.8", " وَهَكَذَا شَتَّتَهُمُ الرَّبُّ مِنْ هُنَاكَ عَلَى سَطْحِ الأَرْضِ كُلِّهَا، فَكَفُّوا عَنْ بِنَاءِ الْمَدِينَةِ،" },
		      { "genesis.11.9", " لِذَلِكَ سُمِّيَتِ الْمَدِينَةُ «بَابِلَ» لأَنَّ الرَّبَّ بَلْبَلَ لِسَانَ أَهْلِ كُلِّ الأَرْضِ، وَبِالتَّالِي شَتَّتَهُمْ مِنْ هُنَاكَ فِي أَرْجَاءِ الأَرْضِ كُلِّهَا" }		 
	};

	@Override
	protected Object[][] getContents() {
		return contents;
	}

}
