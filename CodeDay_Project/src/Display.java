import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class Display {
	
	private static JFrame frame;
	private static JPanel stats;
	private static JPanel map;
	private static JScrollPane scrollPane;
	private static JTextArea console;
	private static JToolBar toolBar;
	
	//button
	private static JButton exit;
	private static JButton save;
	private static JButton load;
	
	
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
		
		//exit button
		
		exit = new JButton();
		toolBar.add(exit);
		
		
		//Border line = new LineBorder(new Color(160, 160, 160));
		//Border margin = new EmptyBorder(5, 15, 5, 15);
		//Border compound = new CompoundBorder(line, margin);

		exit.setPreferredSize(new Dimension(116,90));
		exit.setFocusable(false);
		exit.setBackground(Color.WHITE);
		//exit.setBorder(compound);
		exit.setVisible(true);
		exit.setText("exit");
		exit.setSize(316,390);
		//exit.setPreferredSize(new Dimension(200,300));
	
		
		
		toolBar.setVisible(true);
		
		
		load = new JButton();
		save = new JButton();
	}


	public static void output(String s) {
		
		
		
	}
	
	public static void move(String move) {    // player move
		
		
		
	}
	
	public static void updateStats(String move) {
		
		
		
	}
	
	public static void updateMap(String move) {   // new towns
		
		
		
	}
	
	public static void newGun() {
		
		
		
	}
	
	public static void newHat() {
		
		
		
	}
	
	public abstract class listener implements ActionListener { 
		
		
		
	}
	
}
