package com.davenicolette.i18n.demo.resources;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ListResourceBundle;

import javax.swing.KeyStroke;

/**
 * Tower of Babel resource bundle for the Aramaic language.
 * 
 * @author dave
 */
public class Babel_unicode_arc extends ListResourceBundle {
	
	static final Object[][] contents = {
		{ "english.name", "Aramaic" },
		      { "native.name", "לשנא ארמיא" },
		{ "mnemonic.key", new Integer(KeyEvent.VK_M) },
		{ "accelerator.key", KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK) },
		{ "flag.url", "flag_vatican.gif" },
		      { "genesis.11.7", " וַאֲמַר יְיָ, הָא עַמָּא חַד וְלִישָׁן חַד לְכֻלְּהוֹן, וְדֵין, דְּשָׁרִיאוּ לְמֶעֱבַד; וּכְעַן לָא יִתְמְנַע מִנְּהוֹן, כֹּל דְּחַשִּׁיבוּ לְמֶעֱבַד." },
		      { "genesis.11.8", "הַבוּ, נִתְגְּלֵי, וּנְבַלְבֵּיל תַּמָּן, לִישָׁנְהוֹן--דְּלָא יִשְׁמְעוּן, אֲנָשׁ לִישָׁן חַבְרֵיהּ." },
		      { "genesis.11.9", "עַל כֵּין קְרָא שְׁמַהּ, בָּבֶל, אֲרֵי תַּמָּן בַּלְבֵּיל יְיָ, לִישָׁן כָּל אַרְעָא; וּמִתַּמָּן בַּדַּרִנּוּן יְיָ, עַל אַפֵּי כָּל אַרְעָא. " }		 
	};

	@Override
	protected Object[][] getContents() {
		return contents;
	}

}
