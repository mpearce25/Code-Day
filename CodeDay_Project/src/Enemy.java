import java.awt.Image;

public class Enemy{
	//stats of the enemy
	public static double health;
	public static double attack;
	public static double style;
	public static String label;
	public static Image image;
	public static boolean lost;
	public Enemy(double health, double attack, double style,String label){
		this.health = health;
		this.attack = attack;
		this.style = style;
		this.label = label;
	}
}
