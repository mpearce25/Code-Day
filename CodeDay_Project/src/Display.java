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
	
	//button pannels
	//private static JPanel buttonsPanel
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
<<<<<<< HEAD
		console.setEditable(true);
=======
		console.setEditable(false);
		console.setLineWrap(true);
		console.setColumns(1);
		console.setFocusable(true);
		console.setLayout(null);
		//console.setRows( );
>>>>>>> origin/master
		

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
		
<<<<<<< HEAD
		output("hey");
=======
		output("sup");
>>>>>>> origin/master
		
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
