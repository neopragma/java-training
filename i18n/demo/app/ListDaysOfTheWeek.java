package com.davenicolette.i18n.demo.app;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

/**
 * How the days of the week appear in their conventional order in the languages that can be displayed on the system where this program is running.
 * 
 * @author Dave Nicolette
 */
public class ListDaysOfTheWeek implements ActionListener, Runnable {
    private JFrame frame;
    private Container contentPane;
    private JTextArea daysOfTheWeekBox;
    
    public void actionPerformed(ActionEvent e) {
    	if (e.getActionCommand().equals("exit")) {
    		frame.dispose();
    	}
    	Object eventSource = e.getSource();
    	if (eventSource instanceof AbstractButton) {
    		AbstractButton uiElement = (AbstractButton) eventSource;
    		buildList(uiElement.getLocale());
    	}
    }
    
    private void buildList(Locale locale) {
        frame.setTitle("Days of the week in " + locale.getDisplayName());
    	
    	daysOfTheWeekBox.setText("");
		DateFormatSymbols dfs = new DateFormatSymbols(locale);
		String weekdays[] = dfs.getWeekdays();
		Calendar calendar = Calendar.getInstance(locale);
		int firstDayOfWeek = calendar.getFirstDayOfWeek();
		int dayOfWeek;
		for (dayOfWeek = firstDayOfWeek ; dayOfWeek < weekdays.length ; dayOfWeek++) {
			daysOfTheWeekBox.append(weekdays[dayOfWeek] + "\n");
		}
		if ( firstDayOfWeek == 1 ) {
			daysOfTheWeekBox.setText(daysOfTheWeekBox.getText().trim());
		} else {
			daysOfTheWeekBox.append("(the next one is Sunday)");
		}
		for (dayOfWeek = 0 ; dayOfWeek < firstDayOfWeek ; dayOfWeek++) {
			daysOfTheWeekBox.append(weekdays[dayOfWeek] + "\n");
		}
    }
    	
	private void createAndShowGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        
        //Create and set up the window.
        frame = new JFrame("Days of the week");
        contentPane = frame.getContentPane();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

        // Menubar for the application
        JMenuBar menuBar = new JMenuBar();

        // Conventional File menu containing just one item - Exit
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        fileMenu.getAccessibleContext().setAccessibleDescription(
        	"File menu");
        menuBar.add(fileMenu);

        JMenuItem exitItem = new JMenuItem("Exit", KeyEvent.VK_X);
        exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.ALT_MASK));
        exitItem.getAccessibleContext().setAccessibleDescription("End the program");
        exitItem.setActionCommand("exit");
        exitItem.setToolTipText("End the program");
        exitItem.addActionListener(this);
        fileMenu.add(exitItem);

        // Language menu allows the user to choose a language
        JMenu languageMenu = new JMenu("Language");
        languageMenu.setMnemonic(KeyEvent.VK_L);
        languageMenu.getAccessibleContext().setAccessibleDescription(
                "Language selection menu");
        menuBar.add(languageMenu);
        
        // Locale.getLocales() returns every locale Java knows about, including those for which this platform doesn't have a font.
        // To narrow the list to just those locales we can actually display properly, we use DateFormat.getAvailableLocales().
        // To keep the drop-down list to a reasonable length, we then filter out those that are more specific than just "language".
        Locale[] locales = DateFormat.getAvailableLocales();
        for (Locale locale : locales) {
        	if (locale.getCountry().length() > 0) {
        		continue;
        	}
			JMenuItem languageItem = new JMenuItem();
			languageItem.setLocale(locale);
			languageItem.setActionCommand(locale.getLanguage());
			languageItem.setText(locale.getDisplayName());
			languageItem.addActionListener(this);
			languageMenu.add(languageItem);
		}
		
        JPanel textBoxPane = new JPanel();
        textBoxPane.setLayout(new BorderLayout());
        textBoxPane.setBackground(new Color(92,108,120));
        textBoxPane.setBorder(new CompoundBorder
        	(BorderFactory.createRaisedBevelBorder(),
        	 new EmptyBorder(10,10,10,10)));
        daysOfTheWeekBox = new JTextArea(10,60);
        daysOfTheWeekBox.setEditable(false);
        textBoxPane.add(daysOfTheWeekBox);

        frame.setJMenuBar(menuBar);
        contentPane.add(textBoxPane);

        // Start with English by default.
        buildList(Locale.ENGLISH);

        frame.pack();
        frame.setVisible(true);
    }
		
	public void run() {
		createAndShowGUI();
	}
	
    public static void main(String[] args) {
    	javax.swing.SwingUtilities.invokeLater(new ListDaysOfTheWeek());
    }
}