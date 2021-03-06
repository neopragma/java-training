package com.davenicolette.i18n.demo.app;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.BreakIterator;
import java.text.Collator;
import java.text.RuleBasedCollator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * Demonstration of collation differences in Western languages.
 * 
 * @author Dave Nicolette
 */
public class CollationWestern implements ActionListener, Runnable {
    private List<String> words = new ArrayList<String>();
    private Locale locale = null;
    private JFrame frame;
    private Container pane;
    private JTextArea wordList;
    private JPanel splainerPane;
    private JTextArea splainerBox;
    
    private String englishSplainer = "English collation treats letters with diacritical marks such as \u00e4 and \u00f1 the same as the corresponding base letter." +
    		"\n\nEnglish collation in the sample program demonstrates how to make the collator ignore certain characters." +
    		"\nLook at the sortList() method in the source code of CollationWestern to see how to ignore the '-' (hyphen)" +
    		"\nwhen sorting. Observe the sort sequence of 'e-mail' and 'emaaa' with (English) and without" +
    		"\n(any other language selection) this code.";
    private String spanishSplainer = "Spanish collation treats the letters 'n' and '\u00f1' as different letters." +
    		"\n\nTraditional sort order has C < CH and L < LL. This is not supported by default in Java." +
    		"\nLook at the sortList() method in the source code of CollationWestern to see how it is done. "; 
    private String germanSplainer = "German collation treats letters with umlauts as the same as the corresponding base letter (e.g., 'a' and '\u00e4')." +
    		"\n\nDefault collation does not recognize character expansion correctly, e.g. '\u00fc' is equivalent to 'ue'." +
    		"\nLook at the sortList() method in the source code of CollationWestern to see how it is done. "; 
    private String swedishSplainer = "Swedish collation places the letters '\u00e5', '\u00e4', and '\u00f6' at the end of the alphabet.";

    private void initializeList() {
        words.clear();
        words.add("cadaver");
        words.add("lantano");
        words.add("chimichurri");
        words.add("e-mail");
        words.add("emaa");
        words.add("emaz");
        words.add("cold");
        words.add("llama");
        words.add("andra");
        words.add("\u00e4ndra");
        words.add("banan");
        words.add("lomo");
        words.add("Banana");
        words.add("\u00e4hnlich");
        words.add("aezu");
        words.add("a\u00f1adir");
        words.add("anillo");
        words.add("anarchy");    	
    }
    
    public void actionPerformed(ActionEvent e) {
    	if (e.getActionCommand().equals("none")) {
    		locale = null;
    	} else {
    		locale = new Locale(e.getActionCommand());
    	}
    	sortList();
    }
    
    private void sortList() {
    	String newTitle = "Collation: ";
    	if (locale == null) {
    		initializeList();
    		frame.setTitle("Collation: None (unsorted)");
    		splainerBox.setText("");
    	} else {
    		if (locale.getLanguage().equals("en") ) {
    			newTitle += "English";
    			splainerBox.setText(englishSplainer);
    		} else if (locale.getLanguage().equals("es")) {
    			newTitle += "Spanish";
    			splainerBox.setText(spanishSplainer);
    		} else if (locale.getLanguage().equals("de")) {
    			newTitle += "German";
    			splainerBox.setText(germanSplainer);
    		} else if (locale.getLanguage().equals("sv")) {
    			newTitle += "Swedish";
    			splainerBox.setText(swedishSplainer);
    		} else {
    			newTitle += "Unknown - error";
    			splainerBox.setText("");
    		}
        	frame.setTitle(newTitle);
    		Collator collator = Collator.getInstance(locale);
    		
    		// How to cause collation to ignore a character. In this example, for English sorting
    		// we want to ignore the hyphen character (for words like e-mail and e-business).
    		// To do this, prepend any ignorable characters to the rule string before the first "<".
    		if (locale.getLanguage().equals("en")) {
    			String collationRules = ((RuleBasedCollator) collator).getRules();
    			try {
    				String ignorables = " '-' < ";
    				collator = new RuleBasedCollator(ignorables + collationRules);
    			} catch (Exception e) {
    				throw new RuntimeException(e);
    			}    			
    		}
    		
    		// Special collation rules for traditional Spanish sort order
    		if (locale.getLanguage().equals("es")) {
    			String collationRules = ((RuleBasedCollator) collator).getRules();
    			try {
    				String traditionalRules = " & C < ch, cH, Ch, CH & L < ll, lL, Ll, LL";
    				collator = new RuleBasedCollator(collationRules + traditionalRules);
    			} catch (Exception e) {
    				throw new RuntimeException(e);
    			}
    		}
    		
    		// Special collation rules to handle ae, oe, and ue character expansion in German
    		if (locale.getLanguage().equals("de")) {
    			String collationRules = ((RuleBasedCollator) collator).getRules();
    			try {
    				String expansionRules = " & ae ; a\u0308 & oe ; o\u0308 & ue ; u\0308";
    				collator = new RuleBasedCollator(collationRules + expansionRules);
    			} catch (Exception e) {
    				throw new RuntimeException(e);
    			}
    		}
    		
    		Collections.sort(words, collator);
    	}
    	wordList.setText("");
    	for (String word : words) {
    		wordList.append(word);
    		wordList.append("\n");
    	}
    	pane.repaint();
    }
    	
	private void createAndShowGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        
        //Create and set up the window.
        frame = new JFrame("Collation differences in Western alphabets");
        pane = frame.getContentPane();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
                
        JPanel headerPane = new JPanel();
        JLabel header = new JLabel(" Choose a language to resort the list of words ");
        headerPane.add(header);
        
        JPanel buttonPane = new JPanel();
        buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.X_AXIS));
        
        JButton unsortedButton = new JButton("Unsorted");
        unsortedButton.setActionCommand("none");
        unsortedButton.addActionListener(this);
        buttonPane.add(unsortedButton);

        JButton englishButton = new JButton("English");
        englishButton.setActionCommand("en");
        englishButton.addActionListener(this);
        buttonPane.add(englishButton);

        JButton spanishButton = new JButton("Spanish");
        spanishButton.setActionCommand("es");
        spanishButton.addActionListener(this);
        buttonPane.add(spanishButton);

        JButton germanButton = new JButton("German");
        germanButton.setActionCommand("de");
        germanButton.addActionListener(this);
        buttonPane.add(germanButton);
        
        JButton swedishButton = new JButton("Swedish");
        swedishButton.setActionCommand("sv");
        swedishButton.addActionListener(this);
        buttonPane.add(swedishButton);
        
        JPanel textBoxPane = new JPanel();
        wordList = new JTextArea(words.size(),60);
        wordList.setEditable(false);
        textBoxPane.add(wordList);
        
        splainerPane = new JPanel();
        splainerBox = new JTextArea(6,60);
        splainerPane.add(splainerBox);
        
        splainerBox.setEditable(false);
        splainerBox.setText("");
        initializeList();
        sortList();
        
        pane.add(headerPane);
        pane.add(Box.createVerticalStrut(10));
        pane.add(buttonPane);
        pane.add(Box.createVerticalStrut(10));
        pane.add(textBoxPane);
        pane.add(Box.createVerticalStrut(10));
        pane.add(splainerPane);
        pane.add(Box.createVerticalStrut(10));
        
        frame.pack();
        frame.setVisible(true);
    }
		
	public void run() {
		createAndShowGUI();
	}
	
    public static void main(String[] args) {
    	javax.swing.SwingUtilities.invokeLater(new CollationWestern());
    }
}