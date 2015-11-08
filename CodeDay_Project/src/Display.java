import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Display {
	
	private static boolean hero = false;
	private static boolean town = false;
	private static boolean hideout = false;
	
	private static JFrame frame;
	private static JPanel stats;
	private static JLabel map;
	private static JScrollPane scrollPane;
	private static JTextArea console;
	
	//button pannels
	//private static JPanel buttonsPanel
	//button
	private static JButton exit;
	private static JButton save;
	private static JButton load;
	
	private static BufferedImage bufferedImage;
	
	public static void main(String[] args) {
		
		frame = new JFrame();
		// intiating the frame
		frame.setTitle("Game");
		frame.setLayout(null);
		frame.setLocation(0,0);
		frame.setSize(1080,750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		// Live Here
		drawImage("Home.png", 31,207,21,21);
		
		// Ranch
		drawImage("Town.png", 143,325,21,21);
		
		// town 2
		drawImage("Town.png", 136,626,21,21);
		
		// town 3
		drawImage("Town.png", 360,395,21,21);
		
		// town 4
		drawImage("Town.png", 619,360,21,21);
		
		// town 5
		drawImage("Town.png", 556,577,21,21);
		
		// Hideout 1
		drawImage("Rock.png", 269,332,21,21);
		
		// Hideout 2
		drawImage("Rock.png", 262,479,21,21);
		
		// Hideout 3
		drawImage("Rock.png", 514,367,21,21);
		
		// Hideout 4
		drawImage("Rock.png", 584,500,21,21);
		
		// MEGA BOSS
		drawImage("Rock.png", 651,655,21,21);
		
		/// drawing images
		drawImage("Map_Background.png", 10,185,700,525);
		
		//
		
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
		Rectangle rect = new Rectangle(10,165);
		scrollPane.scrollRectToVisible(rect);
		scrollPane.addMouseWheelListener(new MouseAdapter() {
			public void MouseWheelMoved(MouseWheelEvent e) {
				System.out.print(e.getScrollType());
			}

		});
		
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
		
		output("Hey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey manHey man");
	}

	
	public static void drawImage(String imagePath, int location_x, int location_y, int size_x, int size_y ){
		try {
			bufferedImage = ImageIO.read(new File(imagePath));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		JLabel image = new JLabel(new ImageIcon(bufferedImage));
		//image.setLayout(null);
		frame.add(image);
		
		image.setLocation(location_x, location_y);
		image.setSize(size_x, size_y);
		//image.setBorder(BorderFactory.createLineBorder(Color.black));

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
	public static Point getLocation(){
		int moo_x = Hero.getX();
		int moo_y = Hero.getY();
		
		Point location = new Point(moo_x * 7, moo_y * 7);
		
		
		return location;
	}
	

	public void keyPressed(KeyEvent e) {
		if(hero) {
			Hero.keyPressed(e);
		} else if (town) {
			Town.keyPressed(e);
		} else if (hideout) {
			Hideout.keyPressed(e);
		}
	}
}
