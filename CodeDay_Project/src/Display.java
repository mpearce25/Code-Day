import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Display {
	
	private static JFrame frame;
	private static JPanel stats;
	private static JPanel map;
	private static JScrollPane scrollPane;
	private static JTextArea console;
	private static JToolBar toolBar;
	
	public static void main(String[] args) {
		
		frame = new JFrame();
		// intiating the frame
		frame.setTitle("Game");
		frame.setLayout(null);
		frame.setLocation(0,0);
		frame.setSize(1080,750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		///map
		map = new JPanel();
		map.setLayout(null);
		frame.add(map);
		
		map.setLocation(10, 185);
		map.setSize(700, 525);
		map.setBorder(BorderFactory.createLineBorder(Color.black));

		//stats
		stats = new JPanel();
		frame.add(stats);
		stats.setLayout(null);
		
		stats.setLocation(720, 10);
		stats.setSize(350,600);
		stats.setBorder(BorderFactory.createLineBorder(Color.black));
		
		
		//console
		scrollPane = new JScrollPane();
		frame.add(scrollPane);
		scrollPane.setLayout(null);
		
		console = new JTextArea();
		scrollPane.add(console);
		
		scrollPane.setSize(700, 165);
		scrollPane.setLocation(10, 10);
		
		
		//toolBar
		toolBar = new JToolBar();
		frame.add(toolBar);
		
		toolBar.setLocation(720,620);
		toolBar.setSize(350, 90);
		toolBar.setFloatable(false);
		toolBar.setFocusable(false);
		toolBar.setBorder(BorderFactory.createLineBorder(Color.black));
		
		//toolbar buttons
		
		
	}


	public static void output(String s) {
		
		
		
	}
	
	public static void move(String move) {    // player move
		
		
		
	}
	
	public static void updateStats(String move) {
		
		
		
	}
	
	public static void updateMap(String move) {   // new towns
		
		
		
	}
	
	public static void newGun(String s) {
		
		
		
	}
	
	public static void newHat(String s) {
		
		
		
	}
	
}
