package com.davenicolette.i18n.workshop.app;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import com.davenicolette.i18n.demo.app.ResourceHelper;

/**
 * Java internationalization workshop Challenges 1, 2, 3, and 4 sample solution.
 * 
 * @author Dave Nicolette
 */
public class HelloWorldSolution1  implements Runnable {

	ResourceBundle greetingBundle;
	JLabel greetingLabel;
	
	public HelloWorldSolution1() {
		greetingLabel = new JLabel();
		setLocale(new Locale("de")); // default to German for demonstration purposes
//		setLocale(new Locale("")); // this will force the program to use the default bundle
	}

	/**
	 * Allow injection of different locales.
	 * @param locale
	 */
	public void setLocale(Locale locale) { 
		greetingBundle = ResourceHelper.getResourceBundle("HelloWorld", locale);
		populateGUI();
	}

	/**
	 * Populate UI elements with localized text.
	 */
	private void populateGUI() {
		if (greetingBundle == null) {
			setLocale(Locale.getDefault());
		}
		greetingLabel.setText(greetingBundle.getString("greeting"));
	}
	
	private void createAndShowGUI() {
        populateGUI();
        
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Greeter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container pane = frame.getContentPane();
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

        JPanel backgroundPanel = new JPanel();
        backgroundPanel.setLayout(new BorderLayout());
        backgroundPanel.setBorder(new EmptyBorder(10,30,10,30));
        backgroundPanel.setBackground(new Color(92,108,120));
        pane.add(backgroundPanel);
        
        JPanel greetingPanel = new JPanel();
        greetingPanel.setLayout(new BoxLayout(greetingPanel, BoxLayout.Y_AXIS));
        greetingPanel.add(Box.createVerticalStrut(10));
        greetingPanel.setBorder(new CompoundBorder
        	(BorderFactory.createRaisedBevelBorder(),
        	 new EmptyBorder(10,10,10,10)));
        backgroundPanel.add(greetingPanel, BorderLayout.CENTER);
        greetingPanel.add(greetingLabel);        
        greetingPanel.add(Box.createVerticalStrut(10));
        
        frame.pack();
        frame.setVisible(true);
    }
	
	public void run() {
		createAndShowGUI();
	}

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new HelloWorldSolution1());
    }
}
