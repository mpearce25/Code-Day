import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class Display implements Runnable {
	
	private static boolean hero = false;
	private static boolean town = false;
	private static boolean hideout = false;
	
	private static JFrame frame;
	private static JPanel stats;
	private static JPanel map;
	private static JScrollPane scrollPane;
	private static JTextArea console;
	
	//button
	private static JButton exit;
	private static JButton save;
	private static JButton load;
	
	static Thread thread = new Thread();
	
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
		
		console = new JTextArea("Console start");
		scrollPane.add(console);
		
		scrollPane.setSize(700, 165);
		scrollPane.setLocation(10, 10);
<<<<<<< HEAD
		
		console.setSize(700, 165);

=======
>>>>>>> origin/master
		console.setEditable(false);
		

		exit = new JButton();
		load = new JButton();
		save = new JButton();
		
		//toolBar charactristics
		/*toolBar = new JToolBar();
		frame.add(toolBar);
		
		toolBar.setLayout(null);
		toolBar.setLocation(720,620);
		toolBar.setSize(350, 90);
		toolBar.setFloatable(false);
		toolBar.setFocusable(false);
		toolBar.setBorder(BorderFactory.createLineBorder(Color.black));
		toolBar.setVisible(true);
		
		//exit button
		//toolBar.addSeparator(new Dimension(6,0));
		
		//exit.setFocusable(false);
		//exit.setBackground(Color.BLACK);
		exit.setVisible(true);
		exit.setText("exit");
		exit.setSize(110,90);
		exit.setLayout(null);
		
		
		toolBar.add(exit);
		
		//load button
		
		
		//load.setFocusable(false);
		//load.setBackground(Color.BLACK);
		load.setVisible(true);
		load.setText("load");
		load.setSize(110,90);
		//load.setPreferredSize(new Dimension(110,90));
		//load.setLabel();
		load.setLayout(null);
		
<<<<<<< HEAD
=======
		toolBar.add(load);
		
		*/
		
>>>>>>> origin/master
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
<<<<<<< HEAD
		
		output("Hey man");
		thread.start();
=======
		output("Hello world!");
>>>>>>> origin/master
	}

	public void initMap(){

		


	}
	
	public static void output(String s) {
		
		console.setText(console.getText() + s);
		
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
<<<<<<< HEAD
	
	public void go() {
		
		output("");
		
	}

	public void run(){
		while(true){
			//System.out.println("hi");
			go();
			//repaint();
			try {
				thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

=======
	public void keyPressed(KeyEvent e) {
		if(hero) {
			Hero.keyPressed(e);
		} else if (town) {
			Town.keyPressed(e);
		} else if (hideout) {
			Hideout.keyPressed(e);
		}
	}
>>>>>>> origin/master
}
