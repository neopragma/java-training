package com.davenicolette.i18n.demo.resources;

import java.util.Enumeration;
import java.util.ListResourceBundle;

public class Whoopie_en_US_ValleyGirl extends ListResourceBundle {

	private Object[][] contents = {
			{ "hello", "OhMyGod, I'm all, like, 'Hi!' and she's all, like, 'Hi!' and, like, we're both, like, 'Hi!'" },
			{ "goodbye", "OhMyGod, I mean, like, lets go shopping!" }
	};
	
	@Override
	public Object[][] getContents() {
		return contents;
	}
}
