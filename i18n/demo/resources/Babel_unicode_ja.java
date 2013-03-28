package com.davenicolette.i18n.demo.resources;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ListResourceBundle;

import javax.swing.KeyStroke;

/**
 * Tower of Babel resource bundle for the Japanese language.
 * 
 * @author dave
 */
public class Babel_unicode_ja extends ListResourceBundle {
	
	static final Object[][] contents = {
		{ "english.name", "Japanese" },
		{ "native.name", "日本語" },
		{ "mnemonic.key", new Integer(KeyEvent.VK_J) },
		{ "accelerator.key", KeyStroke.getKeyStroke(KeyEvent.VK_6, ActionEvent.ALT_MASK) },
		{ "flag.url", "flag_japan.gif" },
		{ "genesis.11.7", "こうなったら地上へ降りて行って、彼らが違ったことばを話すようにしてしまおう。　そうすれば、互いに何を言っているかわからなくなる。」" },
		{ "genesis.11.8", "こうして、神様は人間を世界の各地に散らしました。　もう都市建設はできません。" },
		{ "genesis.11.9", "この都の名がバベル〔「混乱」の意〕と呼ばれたのは、このためです。　つまり、神様がたくさんの国語を与えて人間を混乱させ、各地に広く散らしたのが、このバベルの地だったのです。" }		 
	};

	@Override
	protected Object[][] getContents() {
		return contents;
	}

}
