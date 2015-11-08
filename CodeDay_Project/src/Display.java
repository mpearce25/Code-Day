import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.*;

public class Display{
	
	private static boolean hero = false;
	private static boolean town = false;
	private static boolean hideout = false;
	
	private static JFrame frame;
	private static JPanel stats;
	private static JPanel map;
	private static JScrollPane scrollPane;
	private static JTextArea console;
	
	public static Town satbury;
	public static Town clacton;
	public static Town kelna;
	public static Town lockinge;
	public static Town bredon;
	public static Hideout ho1;
	public static Hideout ho2;
	public static Hideout ho3;
	public static Hideout ho4;
	public static Hideout ho5;
	
	//button pannels
	//private static JPanel buttonsPanel
	//button
	private static JButton exit;
	private static JButton save;
	private static JButton load;
	
	public static void main(String[] args) {
		/////
		//KeyListener listener = new MyKeyListener();
		//addKeyListener(listener);
		/////
		
		//initListeners(); //Keyboard shit
		
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
		
		console = new JTextArea("Console start");
		scrollPane.add(console);
		
		scrollPane.setSize(700, 165);
		scrollPane.setLocation(10, 10);
		
		console.setSize(700, 165);

		console.setEditable(false);
		console.setLineWrap(true);
		console.setColumns(1);
		console.setFocusable(true);
		console.setLayout(null);
		//console.setRows( );

		//exit button
		exit = new JButton();
		frame.add(exit);
		
		exit.setVisible(true);
		exit.setLocation(720, 620);
		exit.setText("exit");
		exit.setFocusable(true);
		exit.setSize(110,90);
		
		//save button
		save = new JButton();
		frame.add(save);
		
		save.setVisible(true);
		save.setLocation(840, 620);
		save.setText("save");
		save.setFocusable(true);
		save.setSize(110,90);
		
		//load button
		load = new JButton();
		frame.add(load);
		
		load.setVisible(true);
		load.setLocation(960, 620);
		load.setText("load");
		load.setFocusable(true);
		load.setSize(110,90);
		
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print("OK");
			}

		});
		
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print("OK");
			}
		});
		
		load.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print("OK");
			}
		});
		hero = true;
		
		satbury = new Town("Satubury",19,20,10,15,10,15,20,"Why, I know. Those bandits have a hideout in the east.");
		clacton = new Town("Clacton",18,63,15,30,15,20,22,"Those Bandits, they are northeast a bit aways.");
		kelna = new Town("Kelna",50,30,20,75,20,75,24,"You are tracking those bandits? Thank God. They have a hideout to the east.");
		lockinge = new Town("Lockinge",87,25,25,100,25,100,26,"Damn those bandits. They have a hideout to the south of here.");
		bredon = new Town("Bredon",78,56,30,150,30,150,28,"You have to take out their leader to get rid of the bandits. Go to the southeast.");

		ho1 = new Hideout(37,20,3,20,"You cannot defeat me. Someone in a town to the southwest might know where my brothern are.");
		ho2 = new Hideout(31,42,3,22,"My allies are near. That brat in the town to the northeast better not rat out their location.");
		ho3 = new Hideout(72,26,4,24,"Go east to the next town. Maybe someone there can stop you.");
		ho4 = new Hideout(82,45,5,26,"My boss will destroy you. In the town to the southeast someone will let you to him.");
		ho5 = new Hideout(95,70,1,28,"You have destoyed my entire life work. YOU....");

		Hero.intro1();
		output("Hey man");
	}


	public static void output(String s) {
		
		console.append(s);
		console.updateUI();
		
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
	

	
	
	
}
