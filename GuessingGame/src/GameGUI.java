import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GameGUI extends JFrame {
	private static final long serialVersionUID = 70625052682885262L;
	
	public GridBagConstraints c;
	public JMenuBar mainMenuBar;
	public JMenu menuNew;
	public JMenu subMenuNewGame;
	public JMenu menuStats;
	public JMenuItem newPlayer;
	public JMenuItem clear;
	public JMenuItem lvlOne;
	public JMenuItem lvlTwo;
	public JMenuItem lvlThree;
	public JMenuItem lvlFour;
	public JMenuItem lvlFive;
	public JCheckBoxMenuItem time;
	public JCheckBoxMenuItem numPlays;
	public JCheckBoxMenuItem topPlayer;
	public JCheckBoxMenuItem mostDifGame;
	public JPanel panelA;
	public JList<String> listGuesses;
	public JList<String> listClues;
	public JTextField textGuess;
	public JButton enter;
	
	public GameGUI(String title) {
		super(title);
		setLayout(new GridLayout());
		c = new GridBagConstraints();
		setSize(500, 500);
		setLocation(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mainMenuBar = new JMenuBar(); // Creates the menu bar which houses all menu options.
		
		menuNew = new JMenu("New"); // Creates the two sub menus that branch directly from the main menu bar.
		mainMenuBar.add(menuNew);
		menuStats = new JMenu("Statistics");
		mainMenuBar.add(menuStats);
		
		subMenuNewGame = new JMenu("New Game..."); // Creates and the menu and menu items within "New."
		menuNew.add(subMenuNewGame);
		newPlayer = new JMenuItem("New Player");
		menuNew.add(newPlayer);
		clear = new JMenuItem("Clear");
		menuNew.add(clear);
		lvlOne = new JMenuItem("Level 1");
		subMenuNewGame.add(lvlOne);
		lvlTwo = new JMenuItem("Level 2");
		subMenuNewGame.add(lvlTwo);
		lvlThree = new JMenuItem("Level 3");
		subMenuNewGame.add(lvlThree);
		lvlFour = new JMenuItem("Level 4");
		subMenuNewGame.add(lvlFour);
		lvlFive = new JMenuItem("Level 5");
		subMenuNewGame.add(lvlFive);
		
		time = new JCheckBoxMenuItem("Time"); // Creates the menu and menu items within "Statistics."
		menuStats.add(time);
		numPlays = new JCheckBoxMenuItem("# of Plays");
		menuStats.add(numPlays);
		topPlayer = new JCheckBoxMenuItem("Top Player");
		menuStats.add(topPlayer);
		mostDifGame = new JCheckBoxMenuItem("Most Difficult Game");
		menuStats.add(mostDifGame);
		
		panelA = new JPanel(); // Creates panelA and sets layout as GridBag, below sets constraints for formatting.
		panelA.setLayout(new GridBagLayout()); 
		listGuesses = new JList<String>(); 
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 300;
		c.gridx = 0;
		c.gridy = 0;
		panelA.add(listGuesses, c);
		
		listClues = new JList<String>();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 0;
		panelA.add(listClues, c);
		
		textGuess = new JTextField();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 0;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 1;
		panelA.add(textGuess, c);
		
		enter = new JButton("Enter");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 1;
		c.gridy = 1;
		panelA.add(enter, c); // End of GridBag formatting.
	
		add(panelA);
		setJMenuBar(mainMenuBar);
		setVisible(true);
	}
	
	public class EnterListener implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			JTextField textGuess = (JTextField) ae.getSource();
			String guess = textGuess.getText();
			
		}
	}
	
	public static void main(String[] args) {
		new GameGUI("Numbers Game");
	}	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

